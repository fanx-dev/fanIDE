/*
 * Thibaut Colar Aug 24, 2010
 */

/*
 * NewTestVisualPanel1.java
 *
 * Created on Aug 24, 2010, 10:10:52 AM
 */
package net.colar.netbeans.fan.wizard;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author thibautc
 */
public class NewTestVisualPanel1 extends javax.swing.JPanel
{

    private NewTestWizardPanel1 parentWizard;
    private JFileChooser chooser;

    /** Creates new form NewTestVisualPanel1 */
    public NewTestVisualPanel1(NewTestWizardPanel1 parent, String dir)
    {
        super();
        this.parentWizard = parent;
        initComponents();
        nameField.setText("");
        folderField.setText(dir);
        String loc = dir + (dir.endsWith(File.separator) ? "" : File.separator);
        fileField.setText(loc);
        chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(false);
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setApproveButtonText("Select");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileField = new javax.swing.JTextField();
        fileLabel = new javax.swing.JLabel();
        extField = new javax.swing.JTextField();
        browseButton = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        folderLabel = new javax.swing.JLabel();
        folderField = new javax.swing.JTextField();
        errorLabel = new javax.swing.JLabel();

        fileField.setEditable(false);
        fileField.setText(org.openide.util.NbBundle.getMessage(NewTestVisualPanel1.class, "NewTestVisualPanel1.fileField.text")); // NOI18N

        fileLabel.setText(org.openide.util.NbBundle.getMessage(NewTestVisualPanel1.class, "NewTestVisualPanel1.fileLabel.text")); // NOI18N

        extField.setText(org.openide.util.NbBundle.getMessage(NewTestVisualPanel1.class, "NewTestVisualPanel1.extField.text")); // NOI18N
        extField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                extFieldKeyReleased(evt);
            }
        });

        browseButton.setText(org.openide.util.NbBundle.getMessage(NewTestVisualPanel1.class, "NewTestVisualPanel1.browseButton.text")); // NOI18N
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        nameField.setText(org.openide.util.NbBundle.getMessage(NewTestVisualPanel1.class, "NewTestVisualPanel1.nameField.text")); // NOI18N
        nameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameFieldKeyReleased(evt);
            }
        });

        nameLabel.setText(org.openide.util.NbBundle.getMessage(NewTestVisualPanel1.class, "NewTestVisualPanel1.nameLabel.text")); // NOI18N

        folderLabel.setText(org.openide.util.NbBundle.getMessage(NewTestVisualPanel1.class, "NewTestVisualPanel1.folderLabel.text")); // NOI18N

        folderField.setText(org.openide.util.NbBundle.getMessage(NewTestVisualPanel1.class, "NewTestVisualPanel1.folderField.text")); // NOI18N
        folderField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                folderFieldKeyReleased(evt);
            }
        });

        errorLabel.setForeground(new java.awt.Color(255, 0, 6));
        errorLabel.setText(org.openide.util.NbBundle.getMessage(NewTestVisualPanel1.class, "NewTestVisualPanel1.errorLabel.text")); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(errorLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(nameLabel)
                            .add(folderLabel)
                            .add(fileLabel))
                        .add(29, 29, 29)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, fileField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, folderField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                    .add(nameField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                                .add(25, 25, 25)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(extField, 0, 0, Short.MAX_VALUE)
                                    .add(browseButton))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(nameLabel)
                    .add(nameField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(extField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(folderLabel)
                    .add(folderField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(browseButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(fileField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(fileLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 152, Short.MAX_VALUE)
                .add(errorLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

	private void extFieldKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_extFieldKeyReleased
	{//GEN-HEADEREND:event_extFieldKeyReleased
            updateFile();
}//GEN-LAST:event_extFieldKeyReleased

	private void browseButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_browseButtonActionPerformed
	{//GEN-HEADEREND:event_browseButtonActionPerformed
            int val = chooser.showDialog(this, "Select");
            if (val == JFileChooser.APPROVE_OPTION)
            {
                folderField.setText(chooser.getSelectedFile().getPath());
                updateFile();
            }
}//GEN-LAST:event_browseButtonActionPerformed

	private void nameFieldKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_nameFieldKeyReleased
	{//GEN-HEADEREND:event_nameFieldKeyReleased
            updateFile();
}//GEN-LAST:event_nameFieldKeyReleased

	private void folderFieldKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_folderFieldKeyReleased
	{//GEN-HEADEREND:event_folderFieldKeyReleased
            updateFile();
}//GEN-LAST:event_folderFieldKeyReleased

    @Override
    public boolean isValid()
    {
        if (errorLabel == null)
        {
            return false;
        }
        
        String loc = folderField.getText();
        String file = fileField.getText();
        String name = nameField.getText();

        if (loc == null || loc.length() < 1)
        {
            errorLabel.setText("Please choose a location.");
            return false;
        }
        File locF = new File(loc);
        
        if (name.isEmpty())
        {
            errorLabel.setText("Please enter a project name.");
            return false;
        }
        if (name.indexOf(".") != -1)
        {
            errorLabel.setText("Invalid characters in the project name.");
            return false;
        }
        if (extField.getText().indexOf(".") != 0)
        {
            errorLabel.setText("File extension missing.");
            return false;
        }
        if (!locF.exists() || !locF.isDirectory() || !locF.canWrite())
        {
            errorLabel.setText("Folder must be an existing, writable directory.");
            return false;
        }
        if (!checkName(name))
        {
            errorLabel.setText("Please enter a valid name.");
            return false;
        }
        if (new File(file).exists())
        {
            errorLabel.setText("This file already exists.");
            return false;
        }

        errorLabel.setText("");
        return true;
    }

    private void updateFile()
    {
        String dir = folderField.getText();
        dir += (dir.endsWith(File.separator) ? "" : File.separator) + nameField.getText() + extField.getText();
        fileField.setText(dir);
        // will recheck that it's valid
        parentWizard.fireChangeEvent();
    }

    private boolean checkName(String text)
    {
        return FanPodPanel1.VALID_NAME.matcher(text).matches();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JTextField extField;
    private javax.swing.JTextField fileField;
    private javax.swing.JLabel fileLabel;
    private javax.swing.JTextField folderField;
    private javax.swing.JLabel folderLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration//GEN-END:variables

    String getFile()
    {
        return fileField.getText();
    }

    String getFileName()
    {
        return nameField.getText();
    }
}
