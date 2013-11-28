/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.ui.Administrator;

/**
 *
 * @author zili chen
 */
public class ADMINmain extends javax.swing.JFrame {

    /**
     * Creates new form ADMINmain
     */
    public ADMINmain() {
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

        backPanel = new javax.swing.JPanel();
        CSSLabel = new javax.swing.JLabel();
        NJWUPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        adminMainPanel = new javax.swing.JPanel();
        viewInfoButton = new javax.swing.JButton();
        viewInfoLabel = new javax.swing.JLabel();
        modifyInfoButton = new javax.swing.JButton();
        modifyInfoLabel = new javax.swing.JLabel();
        addUserButton = new javax.swing.JButton();
        addUserLabel = new javax.swing.JLabel();
        deleteUserButton = new javax.swing.JButton();
        deleteUserLabel = new javax.swing.JLabel();
        keywordButton = new javax.swing.JButton();
        keyLabel = new javax.swing.JLabel();
        perInfoButton = new javax.swing.JButton();
        perInfoLabel = new javax.swing.JLabel();
        notePanel = new javax.swing.JPanel();
        titelPanel2 = new javax.swing.JPanel();
        peopleLogo2 = new javax.swing.JLabel();
        nameLogo2 = new javax.swing.JLabel();
        arrowLogo2 = new javax.swing.JLabel();
        currentLogo2 = new javax.swing.JLabel();
        backLogo2 = new javax.swing.JLabel();
        backLabel2 = new javax.swing.JLabel();
        homeLogo2 = new javax.swing.JLabel();
        homeLabel2 = new javax.swing.JLabel();
        exitLogo2 = new javax.swing.JLabel();
        exitLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backPanel.setBackground(new java.awt.Color(0, 0, 0));

        CSSLabel.setFont(new java.awt.Font("微软雅黑", 1, 24)); // NOI18N
        CSSLabel.setForeground(new java.awt.Color(255, 255, 255));
        CSSLabel.setText("CSS");

        NJWUPanel.setBackground(new java.awt.Color(233, 233, 237));
        NJWUPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("微软雅黑", 1, 48)); // NOI18N
        jLabel1.setText("NJWU选课系统");

        javax.swing.GroupLayout NJWUPanelLayout = new javax.swing.GroupLayout(NJWUPanel);
        NJWUPanel.setLayout(NJWUPanelLayout);
        NJWUPanelLayout.setHorizontalGroup(
            NJWUPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NJWUPanelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addContainerGap(477, Short.MAX_VALUE))
        );
        NJWUPanelLayout.setVerticalGroup(
            NJWUPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NJWUPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        ExitButton.setBackground(new java.awt.Color(0, 0, 0));
        ExitButton.setFont(new java.awt.Font("微软雅黑", 1, 24)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setText("X");
        ExitButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        adminMainPanel.setBackground(new java.awt.Color(0, 0, 0));

        viewInfoButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        viewInfoButton.setText("viewInfo");
        viewInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInfoButtonActionPerformed(evt);
            }
        });

        viewInfoLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        viewInfoLabel.setForeground(new java.awt.Color(240, 240, 240));
        viewInfoLabel.setText("查看用户信息");

        modifyInfoButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        modifyInfoButton.setText("modifyInfo");
        modifyInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyInfoButtonActionPerformed(evt);
            }
        });

        modifyInfoLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        modifyInfoLabel.setForeground(new java.awt.Color(240, 240, 240));
        modifyInfoLabel.setText("修改用户信息");

        addUserButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        addUserButton.setText("add");
        addUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButtonActionPerformed(evt);
            }
        });

        addUserLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        addUserLabel.setForeground(new java.awt.Color(240, 240, 240));
        addUserLabel.setText("增添用户");

        deleteUserButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        deleteUserButton.setText("delete");
        deleteUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserButtonActionPerformed(evt);
            }
        });

        deleteUserLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        deleteUserLabel.setForeground(new java.awt.Color(240, 240, 240));
        deleteUserLabel.setText("删除用户");

        keywordButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        keywordButton.setText("keyword");
        keywordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keywordButtonActionPerformed(evt);
            }
        });

        keyLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        keyLabel.setForeground(new java.awt.Color(240, 240, 240));
        keyLabel.setText("密码重置");

        perInfoButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        perInfoButton.setText("perInfo");
        perInfoButton.setToolTipText("");
        perInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perInfoButtonActionPerformed(evt);
            }
        });

        perInfoLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        perInfoLabel.setForeground(new java.awt.Color(240, 240, 240));
        perInfoLabel.setText("个人信息");

        notePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        notePanel.setToolTipText("");

        javax.swing.GroupLayout notePanelLayout = new javax.swing.GroupLayout(notePanel);
        notePanel.setLayout(notePanelLayout);
        notePanelLayout.setHorizontalGroup(
            notePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );
        notePanelLayout.setVerticalGroup(
            notePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 173, Short.MAX_VALUE)
        );

        titelPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        titelPanel2.setPreferredSize(new java.awt.Dimension(365, 37));

        peopleLogo2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        peopleLogo2.setText("Logo");

        nameLogo2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        nameLogo2.setText("name");

        arrowLogo2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        arrowLogo2.setText("->");

        currentLogo2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        currentLogo2.setText("current");

        backLogo2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        backLogo2.setText("Logo");

        backLabel2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        backLabel2.setText("back");

        homeLogo2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        homeLogo2.setText("Logo");

        homeLabel2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        homeLabel2.setText("home");

        exitLogo2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        exitLogo2.setText("Logo");

        exitLabel2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        exitLabel2.setText("exit");

        javax.swing.GroupLayout titelPanel2Layout = new javax.swing.GroupLayout(titelPanel2);
        titelPanel2.setLayout(titelPanel2Layout);
        titelPanel2Layout.setHorizontalGroup(
            titelPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titelPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(peopleLogo2)
                .addGap(18, 18, 18)
                .addComponent(nameLogo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(arrowLogo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(currentLogo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 443, Short.MAX_VALUE)
                .addComponent(backLogo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backLabel2)
                .addGap(18, 18, 18)
                .addComponent(homeLogo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeLabel2)
                .addGap(18, 18, 18)
                .addComponent(exitLogo2)
                .addGap(5, 5, 5)
                .addComponent(exitLabel2)
                .addContainerGap())
        );
        titelPanel2Layout.setVerticalGroup(
            titelPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titelPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titelPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peopleLogo2)
                    .addComponent(nameLogo2)
                    .addComponent(arrowLogo2)
                    .addComponent(currentLogo2)
                    .addComponent(backLogo2)
                    .addComponent(backLabel2)
                    .addComponent(homeLogo2)
                    .addComponent(homeLabel2)
                    .addComponent(exitLogo2)
                    .addComponent(exitLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout adminMainPanelLayout = new javax.swing.GroupLayout(adminMainPanel);
        adminMainPanel.setLayout(adminMainPanelLayout);
        adminMainPanelLayout.setHorizontalGroup(
            adminMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titelPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE)
            .addGroup(adminMainPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(adminMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(adminMainPanelLayout.createSequentialGroup()
                        .addGroup(adminMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewInfoLabel)
                            .addComponent(viewInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(adminMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modifyInfoLabel)
                            .addComponent(modifyInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(adminMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(adminMainPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(addUserLabel)))
                        .addGap(40, 40, 40)
                        .addGroup(adminMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(adminMainPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(deleteUserLabel)))
                        .addGap(42, 42, 42)
                        .addGroup(adminMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(keywordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(adminMainPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(keyLabel)))
                        .addGap(47, 47, 47)
                        .addGroup(adminMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(adminMainPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(perInfoLabel))
                            .addComponent(perInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        adminMainPanelLayout.setVerticalGroup(
            adminMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminMainPanelLayout.createSequentialGroup()
                .addComponent(titelPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(adminMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(adminMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(adminMainPanelLayout.createSequentialGroup()
                            .addGroup(adminMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(viewInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addUserButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(viewInfoLabel))
                        .addGroup(adminMainPanelLayout.createSequentialGroup()
                            .addComponent(modifyInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(adminMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(modifyInfoLabel)
                                .addComponent(addUserLabel)
                                .addComponent(deleteUserLabel))))
                    .addComponent(keyLabel)
                    .addGroup(adminMainPanelLayout.createSequentialGroup()
                        .addGroup(adminMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(keywordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(perInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(perInfoLabel)))
                .addGap(18, 18, 18)
                .addComponent(notePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backPanelLayout = new javax.swing.GroupLayout(backPanel);
        backPanel.setLayout(backPanelLayout);
        backPanelLayout.setHorizontalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(CSSLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExitButton)
                .addGap(21, 21, 21))
            .addComponent(NJWUPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(adminMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backPanelLayout.setVerticalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backPanelLayout.createSequentialGroup()
                .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CSSLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(NJWUPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void viewInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInfoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewInfoButtonActionPerformed

    private void modifyInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyInfoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifyInfoButtonActionPerformed

    private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addUserButtonActionPerformed

    private void deleteUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteUserButtonActionPerformed

    private void keywordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keywordButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keywordButtonActionPerformed

    private void perInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perInfoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perInfoButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ADMINmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADMINmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADMINmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADMINmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADMINmain().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CSSLabel;
    private javax.swing.JButton ExitButton;
    private javax.swing.JPanel NJWUPanel;
    private javax.swing.JButton addUserButton;
    private javax.swing.JLabel addUserLabel;
    private javax.swing.JPanel adminMainPanel;
    private javax.swing.JLabel arrowLogo2;
    private javax.swing.JLabel backLabel2;
    private javax.swing.JLabel backLogo2;
    private javax.swing.JPanel backPanel;
    private javax.swing.JLabel currentLogo2;
    private javax.swing.JButton deleteUserButton;
    private javax.swing.JLabel deleteUserLabel;
    private javax.swing.JLabel exitLabel2;
    private javax.swing.JLabel exitLogo2;
    private javax.swing.JLabel homeLabel2;
    private javax.swing.JLabel homeLogo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel keyLabel;
    private javax.swing.JButton keywordButton;
    private javax.swing.JButton modifyInfoButton;
    private javax.swing.JLabel modifyInfoLabel;
    private javax.swing.JLabel nameLogo2;
    private javax.swing.JPanel notePanel;
    private javax.swing.JLabel peopleLogo2;
    private javax.swing.JButton perInfoButton;
    private javax.swing.JLabel perInfoLabel;
    private javax.swing.JPanel titelPanel2;
    private javax.swing.JButton viewInfoButton;
    private javax.swing.JLabel viewInfoLabel;
    // End of variables declaration//GEN-END:variables
}
