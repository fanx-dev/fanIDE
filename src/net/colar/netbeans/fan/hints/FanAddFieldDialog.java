/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FanAddFieldDialog.java
 *
 * Created on 9-Dec-2010, 2:31:34 PM
 */
package net.colar.netbeans.fan.hints;

import java.io.File;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import net.colar.netbeans.fan.FanParserTask;
import net.colar.netbeans.fan.FanUtilities;
import net.colar.netbeans.fan.NBFanParser;
import net.colar.netbeans.fan.editor.FantomIndentUtils;
import net.colar.netbeans.fan.indexer.model.FanDocument;
import net.colar.netbeans.fan.parboiled.AstKind;
import net.colar.netbeans.fan.parboiled.AstNode;
import net.colar.netbeans.fan.parboiled.FanLexAstUtils;
import net.colar.netbeans.fan.parboiled.pred.NodeKindPredicate;
import net.colar.netbeans.fan.scope.FanTypeScopeVar;
import net.colar.netbeans.fan.types.FanResolvedType;
import org.netbeans.modules.csl.api.UiUtils;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Source;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;

/**
 *
 * @author thibautc
 */
public class FanAddFieldDialog extends javax.swing.JDialog
{

    private final FanResolvedType targetType;

    /** Creates new form FanAddFieldDialog */
    public FanAddFieldDialog(java.awt.Frame parent, String varName, FanResolvedType targetType, FanResolvedType assignedFromType)
    {
        super(parent, true);
        initComponents();
        nameField.setText(varName);
        this.targetType = targetType;
        if (assignedFromType != null && assignedFromType.isResolved())
        {
            typeField.setText(assignedFromType.getDbType().getSimpleName());
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLbl = new javax.swing.JLabel();
        typeLbl = new javax.swing.JLabel();
        valueLbl = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        typeField = new javax.swing.JTextField();
        valueField = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        modifsField = new javax.swing.JTextField();
        modifsLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        nameLbl.setText(org.openide.util.NbBundle.getMessage(FanAddFieldDialog.class, "FanAddFieldDialog.nameLbl.text")); // NOI18N

        typeLbl.setText(org.openide.util.NbBundle.getMessage(FanAddFieldDialog.class, "FanAddFieldDialog.typeLbl.text")); // NOI18N

        valueLbl.setText(org.openide.util.NbBundle.getMessage(FanAddFieldDialog.class, "FanAddFieldDialog.valueLbl.text")); // NOI18N

        nameField.setText(org.openide.util.NbBundle.getMessage(FanAddFieldDialog.class, "FanAddFieldDialog.nameField.text")); // NOI18N

        typeField.setText(org.openide.util.NbBundle.getMessage(FanAddFieldDialog.class, "FanAddFieldDialog.typeField.text")); // NOI18N
        typeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeFieldActionPerformed(evt);
            }
        });

        valueField.setText(org.openide.util.NbBundle.getMessage(FanAddFieldDialog.class, "FanAddFieldDialog.valueField.text")); // NOI18N

        cancelButton.setText(org.openide.util.NbBundle.getMessage(FanAddFieldDialog.class, "FanAddFieldDialog.cancelButton.text")); // NOI18N
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        submitButton.setText(org.openide.util.NbBundle.getMessage(FanAddFieldDialog.class, "FanAddFieldDialog.submitButton.text")); // NOI18N
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        modifsField.setText(org.openide.util.NbBundle.getMessage(FanAddFieldDialog.class, "FanAddFieldDialog.modifsField.text")); // NOI18N

        modifsLbl.setText(org.openide.util.NbBundle.getMessage(FanAddFieldDialog.class, "FanAddFieldDialog.modifsLbl.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLbl)
                            .addComponent(typeLbl)
                            .addComponent(valueLbl)
                            .addComponent(modifsLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(valueField)
                            .addComponent(typeField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                            .addComponent(modifsField)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                        .addComponent(submitButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeLbl)
                    .addComponent(typeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLbl)
                    .addComponent(valueField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifsLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(submitButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void typeFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_typeFieldActionPerformed
    {//GEN-HEADEREND:event_typeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeFieldActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cancelButtonActionPerformed
    {//GEN-HEADEREND:event_cancelButtonActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_submitButtonActionPerformed
    {//GEN-HEADEREND:event_submitButtonActionPerformed
        setVisible(false);
        dispose();

        Long docId = targetType.getDbType().getSrcDocId();
        FanDocument doc = FanDocument.findById(docId);
        if (doc != null)
        {
            FileObject fo = FileUtil.toFileObject(FileUtil.normalizeFile(new File(doc.getPath())));
            Source source = Source.create(fo);
            Snapshot snapshot = source.createSnapshot();
            // Parse the snaphot
            NBFanParser parser = new NBFanParser();
            try
            {
                parser.parse(snapshot, true);
            } catch (Throwable e)
            {
                return;
            }

            FanParserTask fanResult = (FanParserTask) parser.getResult();
            AstNode rootScope = fanResult.getRootScope();

            FanTypeScopeVar typeVar = FanLexAstUtils.findTypeVar(rootScope, targetType.getDbType().getSimpleName());
            try
            {
                if (typeVar != null)
                {
                    // Otherwise add at top of type block (after bracket)
                    AstNode blockNode = FanLexAstUtils.getFirstChildRecursive(typeVar.getNode(), new NodeKindPredicate(AstKind.AST_BLOCK));
                    if (blockNode != null)
                    {

                        String str = (modifsField.getText().isEmpty() ? "" : modifsField.getText() + " ")
                                + typeField.getText() + " "
                                + nameField.getText()
                                + (valueField.getText().isEmpty() ? "" : " := " + valueField.getText());


                        Document baseDoc = source.getDocument(true);

                        AstNode fieldNode = FanLexAstUtils.getFirstChildRecursive(blockNode, new NodeKindPredicate(AstKind.AST_FIELD_DEF));
                        // (should always be 1*indentSize)
                        String indentStr = FantomIndentUtils.createIndentString(baseDoc, FantomIndentUtils.getIndentSize(baseDoc));
                        // If other field present, add just before it

                        if (fieldNode != null)
                        {
                            baseDoc.insertString(fieldNode.getStartIndex(), str + "\n" + indentStr, null);
                            UiUtils.open(fo, fieldNode.getStartIndex());
                            return;
                        }
                        // Otherwise add at top of type block (after bracket)
                        baseDoc.insertString(blockNode.getStartIndex() + 1, "\n" + indentStr + str + "\n", null);
                        // Put the cursor there (open the file if necessary)
                        UiUtils.open(fo, blockNode.getStartIndex() + 1);
                    }
                }
            } catch (BadLocationException e)
            {
                FanUtilities.GENERIC_LOGGER.exception("BadLocation", e);
            }
        }

        /*Document doc = node.getRoot().getParserTask().getDocument();

        AstNode typeNode = FanLexAstUtils.findParentNode(node, AstKind.AST_TYPE_DEF);
        if (typeNode != null)
        {
        AstNode fieldNode = FanLexAstUtils.getFirstChildRecursive(typeNode, new NodeKindPredicate(AstKind.AST_FIELD_DEF));
        String str = (modifsField.getText().isEmpty() ? "" : modifsField.getText() + " ")
        + typeField.getText() + " "
        + nameField.getText()
        + (valueField.getText().isEmpty() ? "" : " := " + valueField.getText());

        try
        {
        // If other field present, add just before it
        if (fieldNode != null)
        {
        // (should always be 1*indentSize)
        String indentStr = FantomIndentUtils.createIndentString(baseDoc, FantomIndentUtils.getIndentSize(baseDoc));;
        doc.insertString(fieldNode.getStartLocation().getIndex(), str+"\n"+indentStr, null);
        return;
        }

        // Otherwise add at top of type block (after bracket)
        AstNode blockNode = FanLexAstUtils.getFirstChildRecursive(typeNode, new NodeKindPredicate(AstKind.AST_BLOCK));
        if(blockNode != null)
        {
        // ident of line before line with closing bracket (should always be 1*indentSize)
        String indentStr = FantomIndentUtils.createIndentString(baseDoc, FantomIndentUtils.getIndentSize(baseDoc));
        doc.insertString(blockNode.getStartLocation().getIndex()+1, "\n"+indentStr+str, null);
        }
        } catch (BadLocationException e)
        {
        FanUtilities.GENERIC_LOGGER.exception("BadLocation", e);
        }
        }*/
    }//GEN-LAST:event_submitButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField modifsField;
    private javax.swing.JLabel modifsLbl;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField typeField;
    private javax.swing.JLabel typeLbl;
    private javax.swing.JTextField valueField;
    private javax.swing.JLabel valueLbl;
    // End of variables declaration//GEN-END:variables
}
