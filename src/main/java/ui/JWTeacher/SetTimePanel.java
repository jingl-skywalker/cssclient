/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.JWTeacher;

/**
 *
 * @author zili chen
 */
public class SetTimePanel extends javax.swing.JPanel {

    /**
     * Creates new form SetTimePanel
     */
    public SetTimePanel() {
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

        titelPanel1 = new javax.swing.JPanel();
        peopleLogo1 = new javax.swing.JLabel();
        nameLogo1 = new javax.swing.JLabel();
        arrowLogo1 = new javax.swing.JLabel();
        currentLogo1 = new javax.swing.JLabel();
        backLogo1 = new javax.swing.JLabel();
        backLabel1 = new javax.swing.JLabel();
        homeLogo1 = new javax.swing.JLabel();
        homeLabel1 = new javax.swing.JLabel();
        exitLogo1 = new javax.swing.JLabel();
        exitLabel1 = new javax.swing.JLabel();
        sendedPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sendedList = new javax.swing.JList();
        addmsgButton = new javax.swing.JButton();
        eventPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        eventList = new javax.swing.JList();
        timePanel = new javax.swing.JPanel();
        startLabel = new javax.swing.JLabel();
        endLabel = new javax.swing.JLabel();
        yearComboBox = new javax.swing.JComboBox();
        monthComboBox = new javax.swing.JComboBox();
        dayComboBox = new javax.swing.JComboBox();
        SureButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        yearComboBox1 = new javax.swing.JComboBox();
        monthComboBox1 = new javax.swing.JComboBox();
        dayComboBox1 = new javax.swing.JComboBox();
        SureButton1 = new javax.swing.JButton();
        cancelButton1 = new javax.swing.JButton();

        titelPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        titelPanel1.setPreferredSize(new java.awt.Dimension(365, 37));

        peopleLogo1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        peopleLogo1.setText("Logo");

        nameLogo1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        nameLogo1.setText("name");

        arrowLogo1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        arrowLogo1.setText("->");

        currentLogo1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        currentLogo1.setText("current");

        backLogo1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        backLogo1.setText("Logo");

        backLabel1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        backLabel1.setText("back");

        homeLogo1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        homeLogo1.setText("Logo");

        homeLabel1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        homeLabel1.setText("home");

        exitLogo1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        exitLogo1.setText("Logo");

        exitLabel1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        exitLabel1.setText("exit");

        javax.swing.GroupLayout titelPanel1Layout = new javax.swing.GroupLayout(titelPanel1);
        titelPanel1.setLayout(titelPanel1Layout);
        titelPanel1Layout.setHorizontalGroup(
            titelPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titelPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(peopleLogo1)
                .addGap(18, 18, 18)
                .addComponent(nameLogo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(arrowLogo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(currentLogo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 443, Short.MAX_VALUE)
                .addComponent(backLogo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backLabel1)
                .addGap(18, 18, 18)
                .addComponent(homeLogo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeLabel1)
                .addGap(18, 18, 18)
                .addComponent(exitLogo1)
                .addGap(5, 5, 5)
                .addComponent(exitLabel1)
                .addContainerGap())
        );
        titelPanel1Layout.setVerticalGroup(
            titelPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titelPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titelPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peopleLogo1)
                    .addComponent(nameLogo1)
                    .addComponent(arrowLogo1)
                    .addComponent(currentLogo1)
                    .addComponent(backLogo1)
                    .addComponent(backLabel1)
                    .addComponent(homeLogo1)
                    .addComponent(homeLabel1)
                    .addComponent(exitLogo1)
                    .addComponent(exitLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sendedPanel.setBackground(new java.awt.Color(0, 0, 0));
        sendedPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "已发送通知", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("微软雅黑", 0, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        sendedList.setBackground(new java.awt.Color(240, 240, 240));
        sendedList.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        sendedList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(sendedList);

        addmsgButton.setFont(new java.awt.Font("微软雅黑", 1, 14)); // NOI18N
        addmsgButton.setText("+");

        javax.swing.GroupLayout sendedPanelLayout = new javax.swing.GroupLayout(sendedPanel);
        sendedPanel.setLayout(sendedPanelLayout);
        sendedPanelLayout.setHorizontalGroup(
            sendedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sendedPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(sendedPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(addmsgButton)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        sendedPanelLayout.setVerticalGroup(
            sendedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sendedPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addmsgButton)
                .addGap(12, 12, 12))
        );

        setBackground(new java.awt.Color(0, 0, 0));

        eventPanel.setBackground(new java.awt.Color(0, 0, 0));
        eventPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "事件列表", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("微软雅黑", 0, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        eventList.setBackground(new java.awt.Color(240, 240, 240));
        eventList.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        eventList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "· 框架发布", "· 教学计划上传", "· 课程发布", "· 公共课程选课", "· 退补选课程", "· 课程确认", "· 成绩发布" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(eventList);

        javax.swing.GroupLayout eventPanelLayout = new javax.swing.GroupLayout(eventPanel);
        eventPanel.setLayout(eventPanelLayout);
        eventPanelLayout.setHorizontalGroup(
            eventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eventPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addContainerGap())
        );
        eventPanelLayout.setVerticalGroup(
            eventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eventPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        timePanel.setBackground(new java.awt.Color(0, 0, 0));
        timePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "时间设置", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("微软雅黑", 0, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        startLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        startLabel.setForeground(new java.awt.Color(204, 204, 204));
        startLabel.setText("开始时间");

        endLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        endLabel.setForeground(new java.awt.Color(204, 204, 204));
        endLabel.setText("截止时间");

        yearComboBox.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2014", "2013", "2012", " " }));
        yearComboBox.setName(""); // NOI18N

        monthComboBox.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));

        dayComboBox.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        dayComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        SureButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        SureButton.setText("确认");
        SureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SureButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        cancelButton.setText("取消");

        yearComboBox1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        yearComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2014", "2013", "2012", " " }));
        yearComboBox1.setName(""); // NOI18N

        monthComboBox1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        monthComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));

        dayComboBox1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        dayComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        SureButton1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        SureButton1.setText("确认");
        SureButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SureButton1ActionPerformed(evt);
            }
        });

        cancelButton1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        cancelButton1.setText("取消");

        javax.swing.GroupLayout timePanelLayout = new javax.swing.GroupLayout(timePanel);
        timePanel.setLayout(timePanelLayout);
        timePanelLayout.setHorizontalGroup(
            timePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timePanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(timePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(timePanelLayout.createSequentialGroup()
                        .addGroup(timePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(endLabel)
                            .addComponent(startLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timePanelLayout.createSequentialGroup()
                        .addGroup(timePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(timePanelLayout.createSequentialGroup()
                                .addGroup(timePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(timePanelLayout.createSequentialGroup()
                                        .addComponent(yearComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                        .addComponent(monthComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(timePanelLayout.createSequentialGroup()
                                        .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(59, 59, 59)
                                .addGroup(timePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dayComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addGroup(timePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SureButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SureButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cancelButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(timePanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(75, 75, 75))))
        );
        timePanelLayout.setVerticalGroup(
            timePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timePanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(startLabel)
                .addGap(18, 18, 18)
                .addGroup(timePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SureButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelButton)
                .addGap(35, 35, 35)
                .addComponent(endLabel)
                .addGap(20, 20, 20)
                .addGroup(timePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SureButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelButton1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(eventPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(timePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(eventPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SureButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SureButtonActionPerformed

    private void SureButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SureButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SureButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SureButton;
    private javax.swing.JButton SureButton1;
    private javax.swing.JButton addmsgButton;
    private javax.swing.JLabel arrowLogo1;
    private javax.swing.JLabel backLabel1;
    private javax.swing.JLabel backLogo1;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton cancelButton1;
    private javax.swing.JLabel currentLogo1;
    private javax.swing.JComboBox dayComboBox;
    private javax.swing.JComboBox dayComboBox1;
    private javax.swing.JLabel endLabel;
    private javax.swing.JList eventList;
    private javax.swing.JPanel eventPanel;
    private javax.swing.JLabel exitLabel1;
    private javax.swing.JLabel exitLogo1;
    private javax.swing.JLabel homeLabel1;
    private javax.swing.JLabel homeLogo1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox monthComboBox;
    private javax.swing.JComboBox monthComboBox1;
    private javax.swing.JLabel nameLogo1;
    private javax.swing.JLabel peopleLogo1;
    private javax.swing.JList sendedList;
    private javax.swing.JPanel sendedPanel;
    private javax.swing.JLabel startLabel;
    private javax.swing.JPanel timePanel;
    private javax.swing.JPanel titelPanel1;
    private javax.swing.JComboBox yearComboBox;
    private javax.swing.JComboBox yearComboBox1;
    // End of variables declaration//GEN-END:variables
}
