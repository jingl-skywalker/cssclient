/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.ui.YJWTeacher;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import javax.swing.JLabel;

/**
 *
 * @author zili chen
 */
public class YJWmain extends javax.swing.JFrame {

    /**
     * Creates new form YJWmain
     */
    public YJWmain() {
        initComponents();
        planPanel = new PlanPanel();
        coursePanel = new CoursePanel();
        font = new Font("微软雅黑",Font.PLAIN,14);
        arrowLabel = new JLabel("->");
        arrowLabel.setFont(font);
        titelPanel2.add(arrowLabel,0,0);
        arrowLabel.setBounds(175,7,16,19);
        arrowLabel.setVisible(false);
        nowLabel = new JLabel();
        nowLabel.setFont(font);
        titelPanel2.add(nowLabel,0,0);
        nowLabel.setBounds(201,7,84,19);
        nowLabel.setVisible(false);
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
        yjwMainPanel = new javax.swing.JPanel();
        planButton = new javax.swing.JButton();
        planLabel = new javax.swing.JLabel();
        courseButton = new javax.swing.JButton();
        courseLabel = new javax.swing.JLabel();
        perInfoButton = new javax.swing.JButton();
        perInfoLabel = new javax.swing.JLabel();
        notePanel = new javax.swing.JPanel();
        titelPanel2 = new javax.swing.JPanel();
        peopleLogo = new javax.swing.JLabel();
        nameLogo = new javax.swing.JLabel();
        arrowLogo = new javax.swing.JLabel();
        currentLogo = new javax.swing.JLabel();
        backLogo = new javax.swing.JLabel();
        backLabel = new javax.swing.JLabel();
        homeLogo = new javax.swing.JLabel();
        homeLabel = new javax.swing.JLabel();
        exitLogo = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        yjwMainPanel.setBackground(new java.awt.Color(0, 0, 0));

        planButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        planButton.setText("plan");
        planButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planButtonActionPerformed(evt);
            }
        });

        planLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        planLabel.setForeground(new java.awt.Color(240, 240, 240));
        planLabel.setText("录入教学计划");

        courseButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        courseButton.setText("course");
        courseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseButtonActionPerformed(evt);
            }
        });

        courseLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        courseLabel.setForeground(new java.awt.Color(240, 240, 240));
        courseLabel.setText("课程信息");

        perInfoButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        perInfoButton.setText("perInfo");

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

        javax.swing.GroupLayout yjwMainPanelLayout = new javax.swing.GroupLayout(yjwMainPanel);
        yjwMainPanel.setLayout(yjwMainPanelLayout);
        yjwMainPanelLayout.setHorizontalGroup(
            yjwMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yjwMainPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(yjwMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(yjwMainPanelLayout.createSequentialGroup()
                        .addGroup(yjwMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(planLabel)
                            .addComponent(planButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(yjwMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(courseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(yjwMainPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(courseLabel)))
                        .addGap(51, 51, 51)
                        .addGroup(yjwMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(perInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(yjwMainPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(perInfoLabel)))))
                .addContainerGap(253, Short.MAX_VALUE))
        );
        yjwMainPanelLayout.setVerticalGroup(
            yjwMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yjwMainPanelLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(yjwMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(yjwMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(yjwMainPanelLayout.createSequentialGroup()
                            .addComponent(planButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(planLabel))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, yjwMainPanelLayout.createSequentialGroup()
                            .addComponent(courseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(courseLabel)))
                    .addGroup(yjwMainPanelLayout.createSequentialGroup()
                        .addComponent(perInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(perInfoLabel)))
                .addGap(18, 18, 18)
                .addComponent(notePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        titelPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        titelPanel2.setPreferredSize(new java.awt.Dimension(365, 37));

        peopleLogo.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        peopleLogo.setText("Logo");

        nameLogo.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        nameLogo.setText("name");

        arrowLogo.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        arrowLogo.setText("->");

        currentLogo.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        currentLogo.setText("首页");

        backLogo.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        backLogo.setText("Logo");

        backLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        backLabel.setText("back");
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backLabelMouseExited(evt);
            }
        });
        backLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                backLabelMouseMoved(evt);
            }
        });

        homeLogo.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        homeLogo.setText("Logo");

        homeLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        homeLabel.setText("home");
        homeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeLabelMouseExited(evt);
            }
        });
        homeLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                homeLabelMouseMoved(evt);
            }
        });

        exitLogo.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        exitLogo.setText("Logo");

        exitLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        exitLabel.setText("exit");
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitLabelMouseExited(evt);
            }
        });
        exitLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                exitLabelMouseMoved(evt);
            }
        });

        javax.swing.GroupLayout titelPanel2Layout = new javax.swing.GroupLayout(titelPanel2);
        titelPanel2.setLayout(titelPanel2Layout);
        titelPanel2Layout.setHorizontalGroup(
            titelPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titelPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(peopleLogo)
                .addGap(18, 18, 18)
                .addComponent(nameLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(arrowLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(currentLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backLabel)
                .addGap(18, 18, 18)
                .addComponent(homeLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeLabel)
                .addGap(18, 18, 18)
                .addComponent(exitLogo)
                .addGap(5, 5, 5)
                .addComponent(exitLabel)
                .addContainerGap())
        );
        titelPanel2Layout.setVerticalGroup(
            titelPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titelPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titelPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peopleLogo)
                    .addComponent(nameLogo)
                    .addComponent(arrowLogo)
                    .addComponent(currentLogo)
                    .addComponent(backLogo)
                    .addComponent(backLabel)
                    .addComponent(homeLogo)
                    .addComponent(homeLabel)
                    .addComponent(exitLogo)
                    .addComponent(exitLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(backPanelLayout.createSequentialGroup()
                .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(yjwMainPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titelPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addComponent(titelPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yjwMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void planButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planButtonActionPerformed
        // TODO add your handling code here:
        yjwMainPanel.setVisible(false);
        coursePanel.setVisible(false);
        backPanel.add(planPanel,0,0);
        planPanel.setBounds(0,570-349,889,349);
        planPanel.setVisible(true);
        arrowLabel.setVisible(true);
        nowLabel.setText("录入教学计划");
        nowLabel.setVisible(true);
    }//GEN-LAST:event_planButtonActionPerformed

    private void courseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseButtonActionPerformed
        // TODO add your handling code here:
        yjwMainPanel.setVisible(false);
        planPanel.setVisible(false);
        backPanel.add(coursePanel,0,0);
        coursePanel.setBounds(0,570-349,889,349);
        coursePanel.setVisible(true);
        arrowLabel.setVisible(true);
        nowLabel.setText("课程信息");
        nowLabel.setVisible(true);
        
    }//GEN-LAST:event_courseButtonActionPerformed

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        // TODO add your handling code here:
        yjwMainPanel.setVisible(true);
        planPanel.setVisible(false);
        coursePanel.setVisible(false);
        arrowLabel.setVisible(false);
        nowLabel.setVisible(false);
    }//GEN-LAST:event_backLabelMouseClicked

    private void backLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseMoved
        // TODO add your handling code here:
        backLabel.setForeground(Color.BLUE);
    }//GEN-LAST:event_backLabelMouseMoved

    private void backLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseExited
        // TODO add your handling code here:
        backLabel.setForeground(Color.BLACK);
    }//GEN-LAST:event_backLabelMouseExited

    private void homeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseClicked
        // TODO add your handling code here:
        yjwMainPanel.setVisible(true);
        planPanel.setVisible(false);
        coursePanel.setVisible(false);
        arrowLabel.setVisible(false);
        nowLabel.setVisible(false);
    }//GEN-LAST:event_homeLabelMouseClicked

    private void homeLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseMoved
        // TODO add your handling code here:
        homeLabel.setForeground(Color.BLUE);
    }//GEN-LAST:event_homeLabelMouseMoved

    private void homeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseExited
        // TODO add your handling code here:
        homeLabel.setForeground(Color.BLACK);
    }//GEN-LAST:event_homeLabelMouseExited

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_exitLabelMouseClicked

    private void exitLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseMoved
        // TODO add your handling code here:
        exitLabel.setForeground(Color.BLUE);
    }//GEN-LAST:event_exitLabelMouseMoved

    private void exitLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseExited
        // TODO add your handling code here:
        exitLabel.setForeground(Color.BLACK);
    }//GEN-LAST:event_exitLabelMouseExited

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
            java.util.logging.Logger.getLogger(YJWmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YJWmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YJWmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YJWmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YJWmain().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CSSLabel;
    private javax.swing.JButton ExitButton;
    private javax.swing.JPanel NJWUPanel;
    private javax.swing.JLabel arrowLogo;
    private javax.swing.JLabel backLabel;
    private javax.swing.JLabel backLogo;
    private javax.swing.JPanel backPanel;
    private javax.swing.JButton courseButton;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JLabel currentLogo;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JLabel exitLogo;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JLabel homeLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nameLogo;
    private javax.swing.JPanel notePanel;
    private javax.swing.JLabel peopleLogo;
    private javax.swing.JButton perInfoButton;
    private javax.swing.JLabel perInfoLabel;
    private javax.swing.JButton planButton;
    private javax.swing.JLabel planLabel;
    private javax.swing.JPanel titelPanel2;
    private javax.swing.JPanel yjwMainPanel;
    // End of variables declaration//GEN-END:variables
    private PlanPanel planPanel;
    private CoursePanel coursePanel;
    private JLabel arrowLabel;
    private JLabel nowLabel;
    private Font font;
  //------------------------------------------------------------------getter和setter
    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public JLabel getNowLabel() {
        return nowLabel;
    }

    public void setNowLabel(String text) {
        this.nowLabel.setText(text);
    }

    public JLabel getArrowLabel() {
        return arrowLabel;
    }

    public void setArrowLabel(JLabel arrowLabel) {
        this.arrowLabel = arrowLabel;
    }

    public CoursePanel getCoursePanel() {
        return coursePanel;
    }

    public void setCoursePanel(CoursePanel coursePanel) {
        this.coursePanel = coursePanel;
    }

    public PlanPanel getPlanPanel() {
        return planPanel;
    }

    public void setPlanPanel(PlanPanel planPanel) {
        this.planPanel = planPanel;
    }
}
