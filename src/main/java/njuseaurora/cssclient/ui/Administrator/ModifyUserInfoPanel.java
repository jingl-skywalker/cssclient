/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrator;

/**
 *
 * @author zili chen
 */
public class ModifyUserInfoPanel extends javax.swing.JPanel {

    /**
     * Creates new form ModifyUserInfoPanel
     */
    public ModifyUserInfoPanel() {
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
        userListPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        userListTable = new javax.swing.JTable();
        idComboBox = new javax.swing.JComboBox();
        nameComboBox = new javax.swing.JComboBox();
        typeComboBox = new javax.swing.JComboBox();
        insComboBox = new javax.swing.JComboBox();
        fromTextField = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        modifyButton = new javax.swing.JButton();
        fromeLabel = new javax.swing.JLabel();
        toLabel = new javax.swing.JLabel();
        toTextField = new javax.swing.JTextField();
        replacePanel = new javax.swing.JPanel();
        replaceLabel = new javax.swing.JLabel();
        replaceComboBox = new javax.swing.JComboBox();
        replaceToLabel = new javax.swing.JLabel();
        replaceToTextField = new javax.swing.JTextField();
        replaceAllButton = new javax.swing.JButton();
        infoPanel = new javax.swing.JPanel();
        idLabel1 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        typeLabel = new javax.swing.JLabel();
        insLabel = new javax.swing.JLabel();
        birthLabel = new javax.swing.JLabel();
        identityLabel = new javax.swing.JLabel();
        sexLabel = new javax.swing.JLabel();
        replaceToTextField1 = new javax.swing.JTextField();
        replaceToTextField2 = new javax.swing.JTextField();
        replaceToTextField3 = new javax.swing.JTextField();
        replaceToTextField4 = new javax.swing.JTextField();
        replaceToTextField5 = new javax.swing.JTextField();
        replaceToTextField6 = new javax.swing.JTextField();
        replaceToTextField7 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 0));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        userListPanel.setBackground(new java.awt.Color(0, 0, 0));
        userListPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "用户列表", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("微软雅黑", 0, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        userListTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        userListTable.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        userListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "姓名", "类型", "院系"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userListTable.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(userListTable);

        idComboBox.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        idComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "13-", "12-", "11-" }));

        nameComboBox.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        nameComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));

        typeComboBox.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "教务处老师", "院教务员", "任课老师", "学生" }));

        insComboBox.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        insComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "法学院", "商学院", "软件学院", "政府管理学院" }));

        javax.swing.GroupLayout userListPanelLayout = new javax.swing.GroupLayout(userListPanel);
        userListPanel.setLayout(userListPanelLayout);
        userListPanelLayout.setHorizontalGroup(
            userListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userListPanelLayout.createSequentialGroup()
                        .addComponent(idComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(insComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        userListPanelLayout.setVerticalGroup(
            userListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fromTextField.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        fromTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        idLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        idLabel.setForeground(new java.awt.Color(204, 204, 204));
        idLabel.setText("ID：");

        modifyButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        modifyButton.setText("批量修改");

        fromeLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        fromeLabel.setForeground(new java.awt.Color(204, 204, 204));
        fromeLabel.setText("from");

        toLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        toLabel.setForeground(new java.awt.Color(204, 204, 204));
        toLabel.setText("to");

        toTextField.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        toTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        replacePanel.setBackground(new java.awt.Color(0, 0, 0));
        replacePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "替换", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("微软雅黑", 0, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        replaceLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        replaceLabel.setForeground(new java.awt.Color(204, 204, 204));
        replaceLabel.setText("替换对象");

        replaceComboBox.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        replaceComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "type" }));

        replaceToLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        replaceToLabel.setForeground(new java.awt.Color(204, 204, 204));
        replaceToLabel.setText("替换为");

        replaceToTextField.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        replaceToTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        replaceAllButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        replaceAllButton.setText("全部替换");

        javax.swing.GroupLayout replacePanelLayout = new javax.swing.GroupLayout(replacePanel);
        replacePanel.setLayout(replacePanelLayout);
        replacePanelLayout.setHorizontalGroup(
            replacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(replacePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(replacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(replaceLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(replaceToLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(replaceComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 135, Short.MAX_VALUE)
                    .addComponent(replaceToTextField, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, replacePanelLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(replaceAllButton)
                .addGap(31, 31, 31))
        );
        replacePanelLayout.setVerticalGroup(
            replacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(replacePanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(replaceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(replaceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(replaceToLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(replaceToTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(replaceAllButton)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        infoPanel.setBackground(new java.awt.Color(0, 0, 0));
        infoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "具体信息", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("微软雅黑", 0, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        idLabel1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        idLabel1.setForeground(new java.awt.Color(204, 204, 204));
        idLabel1.setText("学(工)号");

        nameLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(204, 204, 204));
        nameLabel.setText("姓名");

        nextButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        nextButton.setText("下一个");

        typeLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        typeLabel.setForeground(new java.awt.Color(204, 204, 204));
        typeLabel.setText("类型");

        insLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        insLabel.setForeground(new java.awt.Color(204, 204, 204));
        insLabel.setText("院系");

        birthLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        birthLabel.setForeground(new java.awt.Color(204, 204, 204));
        birthLabel.setText("出生日期");

        identityLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        identityLabel.setForeground(new java.awt.Color(204, 204, 204));
        identityLabel.setText("身份证号");

        sexLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        sexLabel.setForeground(new java.awt.Color(204, 204, 204));
        sexLabel.setText("性别");

        replaceToTextField1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        replaceToTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        replaceToTextField2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        replaceToTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        replaceToTextField3.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        replaceToTextField3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        replaceToTextField4.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        replaceToTextField4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        replaceToTextField5.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        replaceToTextField5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        replaceToTextField6.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        replaceToTextField6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        replaceToTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replaceToTextField6ActionPerformed(evt);
            }
        });

        replaceToTextField7.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        replaceToTextField7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        replaceToTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replaceToTextField7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(birthLabel)
                            .addComponent(typeLabel)
                            .addComponent(insLabel)
                            .addComponent(identityLabel))
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(infoPanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(replaceToTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(replaceToTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(replaceToTextField7)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(replaceToTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idLabel1)
                            .addComponent(nameLabel))
                        .addGap(18, 18, 18)
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(replaceToTextField2)
                            .addComponent(replaceToTextField1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(nextButton))
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(sexLabel)
                        .addGap(42, 42, 42)
                        .addComponent(replaceToTextField3)))
                .addContainerGap())
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel1)
                    .addComponent(replaceToTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(replaceToTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(replaceToTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexLabel))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(replaceToTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeLabel))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(replaceToTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insLabel))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(replaceToTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthLabel))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(replaceToTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(identityLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nextButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titelPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idLabel)
                        .addGap(18, 18, 18)
                        .addComponent(fromeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fromTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(modifyButton))
                    .addComponent(userListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(replacePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titelPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idLabel)
                            .addComponent(fromTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fromeLabel)
                            .addComponent(toLabel)
                            .addComponent(toTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modifyButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(replacePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void replaceToTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replaceToTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_replaceToTextField6ActionPerformed

    private void replaceToTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replaceToTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_replaceToTextField7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrowLogo2;
    private javax.swing.JLabel backLabel2;
    private javax.swing.JLabel backLogo2;
    private javax.swing.JLabel birthLabel;
    private javax.swing.JLabel currentLogo2;
    private javax.swing.JLabel exitLabel2;
    private javax.swing.JLabel exitLogo2;
    private javax.swing.JTextField fromTextField;
    private javax.swing.JLabel fromeLabel;
    private javax.swing.JLabel homeLabel2;
    private javax.swing.JLabel homeLogo2;
    private javax.swing.JComboBox idComboBox;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idLabel1;
    private javax.swing.JLabel identityLabel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JComboBox insComboBox;
    private javax.swing.JLabel insLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modifyButton;
    private javax.swing.JComboBox nameComboBox;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLogo2;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel peopleLogo2;
    private javax.swing.JButton replaceAllButton;
    private javax.swing.JComboBox replaceComboBox;
    private javax.swing.JLabel replaceLabel;
    private javax.swing.JPanel replacePanel;
    private javax.swing.JLabel replaceToLabel;
    private javax.swing.JTextField replaceToTextField;
    private javax.swing.JTextField replaceToTextField1;
    private javax.swing.JTextField replaceToTextField2;
    private javax.swing.JTextField replaceToTextField3;
    private javax.swing.JTextField replaceToTextField4;
    private javax.swing.JTextField replaceToTextField5;
    private javax.swing.JTextField replaceToTextField6;
    private javax.swing.JTextField replaceToTextField7;
    private javax.swing.JLabel sexLabel;
    private javax.swing.JPanel titelPanel2;
    private javax.swing.JLabel toLabel;
    private javax.swing.JTextField toTextField;
    private javax.swing.JComboBox typeComboBox;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JPanel userListPanel;
    private javax.swing.JTable userListTable;
    // End of variables declaration//GEN-END:variables
}
