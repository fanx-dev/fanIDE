/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.wizard;

/*
 * Panel for Fan options.
 * Generated using panel maker / wizard in netbeans.
 *
 * @author thibautc
 */
public class FanFormattingSettingsPanel extends javax.swing.JPanel {

    private final FanFormattingSettingsController controller;

    /**
     * Creates new form FanGlobalSettingsPanel
     */
    public FanFormattingSettingsPanel(FanFormattingSettingsController ctrl) {
        controller = ctrl;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        indentSizeLbl = new javax.swing.JLabel();
        indentSize = new javax.swing.JTextField();

        indentSizeLbl.setText(org.openide.util.NbBundle.getMessage(FanFormattingSettingsPanel.class, "FanFormattingSettingsPanel.indentSizeLbl.text")); // NOI18N

        indentSize.setText(org.openide.util.NbBundle.getMessage(FanFormattingSettingsPanel.class, "FanFormattingSettingsPanel.indentSize.text")); // NOI18N
        indentSize.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                indentSizeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(indentSizeLbl)
                .addGap(18, 18, 18)
                .addComponent(indentSize, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(280, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indentSizeLbl)
                    .addComponent(indentSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(249, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void indentSizeKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_indentSizeKeyPressed
    {//GEN-HEADEREND:event_indentSizeKeyPressed
        controller.changed();
    }//GEN-LAST:event_indentSizeKeyPressed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField indentSize;
    private javax.swing.JLabel indentSizeLbl;
    // End of variables declaration//GEN-END:variables

    public boolean valid() {
        return true;
    }

    void setIdentSize(Integer integer) {
        indentSize.setText(integer.toString());
    }

    int getIndentSize() {
        return new Integer(indentSize.getText()).intValue();
    }

}
