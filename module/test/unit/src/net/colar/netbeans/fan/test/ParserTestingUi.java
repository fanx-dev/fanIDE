/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.test;

import fanx.util.FileUtil;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.swing.*;
import net.colar.netbeans.fan.FanModuleInstall;
import net.colar.netbeans.fan.FanParserTask;
import net.jot.prefs.JOTPropertiesPreferences;
import org.netbeans.modules.csl.api.Error;
import org.netbeans.modules.parsing.api.Snapshot;
import org.openide.util.Exceptions;

/**
 * Very basic UI to load fan files to test the parser and get the status and errors
 * Useful for finding parser issues.
 * Also allows for a lightweight environment to test with a profiler instead of having the full NB stack.
 * @author tcolar
 */
public class ParserTestingUi extends JFrame implements ActionListener{
    
    JTextArea textArea;
    JFileChooser fc;
    JButton openButton;
    File curFile;
    private final JButton parseButton;
    private final JTextArea errorArea;
    private File file = createDummyFanFile();
    
    public ParserTestingUi()
    {
        super("Parser testing tool");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);  
        
        setLayout(new FlowLayout());
        fc = new JFileChooser(new File("/tmp/fantom_tst/broken/src/"));
        openButton = new JButton("Open File");
        openButton.addActionListener(this);
        textArea = new JTextArea(40, 80);
        JScrollPane scrollPane = new JScrollPane(textArea); 
        parseButton = new JButton("Parse !");
        parseButton.addActionListener(this);
        errorArea = new JTextArea(15, 80);
        JScrollPane errorPane = new JScrollPane(errorArea); 
        add(openButton);
        add(scrollPane);
        add(parseButton);
        add(errorPane);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
 
        //Handle open button action.
        if (e.getSource() == openButton) {
            int returnVal = fc.showOpenDialog(ParserTestingUi.this);
 
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                curFile = fc.getSelectedFile();
                try{ 
                    textArea.setText(new String(FileUtil.read(curFile)));
                } catch (IOException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }
        }
        else if (e.getSource() == parseButton) {
            try {
                errorArea.setText("");
                PrintWriter p = new PrintWriter(file);
                p.print(textArea.getText());
                p.flush();
                p.close();
                Snapshot snapshot = NBTestUtilities.fileToSnapshot(file);
                long start = new Date().getTime();
                FanParserTask result = new FanParserTask(snapshot);
                long start2 = new Date().getTime();
                result.parse(true, 10000);
                long start3 = new Date().getTime();
                if(!result.getDiagnostics().isEmpty())
                {
                    errorArea.setText("!! Parsing errors:\n");
                    for(Error diag : result.getDiagnostics())
                    {
                        errorArea.append(diag.toString());
                    }
                    return;
                }
                if(result.getAstTree() == null )
                {
                    errorArea.setText("!! Null AST tree");
                    return;
                }
                if(result.getRootScope() == null )
                {
                    errorArea.setText("!! No root scope ");
                    return;
                }
                result.parseGlobalScope();
                long start4 = new Date().getTime();
                result.parseLocalScopes();
                if(!result.getDiagnostics().isEmpty())
                {
                    errorArea.setText("!! Parsing errors:\n");
                    for(Error diag : result.getDiagnostics())
                    {
                        errorArea.append(diag.toString());
                    }
                    return;
                }
                long end = new Date().getTime();
                errorArea.setText("Parsed good in "+(end - start)+"(init:"+(start2-start)
                        +" / parsing:"+(start3-start2)+" / globals: "+(start4-start3)
                        +" / locals: "+(end-start4)+") ms !");
            } catch (Exception err) {
                errorArea.setText("Failed parsing !: \n");
                errorArea.append(err.getMessage());
                for(StackTraceElement trace : err.getStackTrace())
                {
                    errorArea.append(trace.toString()+"\n");
                }
                return;
            }
        }
    }
    
    /**
     * Create a dummy source file with a Dummy pod for testing temp compile
     */
    public static File createDummyFanFile()
    {
        File f = new File("/tmp/fantom_tst/dummypod/");
        f.mkdirs();
        try {
            new File(f,"build.fan").createNewFile();
            File fan = new File(f,"fan/");
            fan.mkdirs();
            return new File(fan, "Test.fan");
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
        return null;
    }
    
    public static void main(String[] args) throws Exception
    {
        FanModuleInstall mi = NBTestUtilities.initNb(true, new JOTPropertiesPreferences());
        // "warmup" parser
        NBTestUtilities.warmupParser();
        try
        {
            new ParserTestingUi();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally{
            mi.closing();
        }
    }
    
}
