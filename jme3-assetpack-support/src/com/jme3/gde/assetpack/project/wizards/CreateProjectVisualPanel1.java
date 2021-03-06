/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jme3.gde.assetpack.project.wizards;

import com.jme3.gde.assetpack.Installer;
import java.io.File;
import javax.swing.JPanel;
import org.openide.WizardDescriptor;
import org.openide.filesystems.FileChooserBuilder;
import org.openide.util.NbPreferences;

public final class CreateProjectVisualPanel1 extends JPanel {

    String projectPath = NbPreferences.forModule(Installer.class).get("assetpack_path", null);
//    String projectPath = ProjectChooser.getProjectsFolder().getPath();

    /** Creates new form CreateProjectVisualPanel1 */
    public CreateProjectVisualPanel1() {
        initComponents();
        jTextField1.setText(projectPath + File.separator + jTextField2.getText());
    }

    @Override
    public String getName() {
        return "AssetPack Details";
    }

    public void applySettings(WizardDescriptor wiz) {
        wiz.putProperty("name", jTextField2.getText());
        wiz.putProperty("version", jTextField4.getText());
        wiz.putProperty("distributor", jTextField5.getText());
        wiz.putProperty("folder", jTextField1.getText());
        wiz.putProperty("description", jTextArea1.getText());
        wiz.putProperty("name", jTextField2.getText());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();

        jTextField1.setText(org.openide.util.NbBundle.getMessage(CreateProjectVisualPanel1.class, "CreateProjectVisualPanel1.jTextField1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(CreateProjectVisualPanel1.class, "CreateProjectVisualPanel1.jLabel1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jButton1, org.openide.util.NbBundle.getMessage(CreateProjectVisualPanel1.class, "CreateProjectVisualPanel1.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(CreateProjectVisualPanel1.class, "CreateProjectVisualPanel1.jLabel2.text")); // NOI18N

        jTextField2.setText(org.openide.util.NbBundle.getMessage(CreateProjectVisualPanel1.class, "CreateProjectVisualPanel1.jTextField2.text")); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                updateProjectFolder(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(CreateProjectVisualPanel1.class, "CreateProjectVisualPanel1.jLabel4.text")); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText(org.openide.util.NbBundle.getMessage(CreateProjectVisualPanel1.class, "CreateProjectVisualPanel1.jTextArea1.text")); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(CreateProjectVisualPanel1.class, "CreateProjectVisualPanel1.jLabel5.text")); // NOI18N

        jTextField4.setText(org.openide.util.NbBundle.getMessage(CreateProjectVisualPanel1.class, "CreateProjectVisualPanel1.jTextField4.text")); // NOI18N

        jTextField5.setText(org.openide.util.NbBundle.getMessage(CreateProjectVisualPanel1.class, "CreateProjectVisualPanel1.jTextField5.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(8, 8, 8))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        File path = new File(jTextField1.getText());
//        if (path.isDirectory()) {

        FileChooserBuilder builder = new FileChooserBuilder(this.getClass());
        builder.setDirectoriesOnly(true);
        builder.setTitle("Select Project Folder");
        File file = builder.showOpenDialog();
        if (file != null) {
            try {
                jTextField1.setText(file.getAbsolutePath() + File.separator + jTextField2.getText());
            } catch (Exception e) {
            }
        }
//        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void updateProjectFolder(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_updateProjectFolder
        jTextField1.setText(projectPath + jTextField2.getText());
    }//GEN-LAST:event_updateProjectFolder

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
