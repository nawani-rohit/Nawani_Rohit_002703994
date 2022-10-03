/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.EmployeeList;
import model.EmployeeProfile;

/**
 *
 * @author rohit
 */
public class ViewDetails extends javax.swing.JPanel {

    /**
     * Creates new form ViewDetails
     */
    
    EmployeeList employeelist;
    
    public ViewDetails(EmployeeList employeelist) {
        initComponents();
        this.employeelist = employeelist;
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDetails = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblEmpID = new javax.swing.JLabel();
        lblEmpAge = new javax.swing.JLabel();
        lblEmpGen = new javax.swing.JLabel();
        lblStartDate = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        lblTeamInfo = new javax.swing.JLabel();
        lblEmpPos = new javax.swing.JLabel();
        lblContactInfo = new javax.swing.JLabel();
        lblEmpEmail = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        lblpic = new javax.swing.JLabel();
        lblPicPath = new javax.swing.JLabel();
        lblNameValue = new javax.swing.JLabel();
        lblLevelValue = new javax.swing.JLabel();
        lblEmpGenValue = new javax.swing.JLabel();
        lblEmpAgeValue = new javax.swing.JLabel();
        lblStartDateValue = new javax.swing.JLabel();
        lblTeamInfoValue = new javax.swing.JLabel();
        lblEmpPosValue = new javax.swing.JLabel();
        lblPhoneValue = new javax.swing.JLabel();
        lblEmailValue = new javax.swing.JLabel();
        lblEmpIDvalue = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setPreferredSize(new java.awt.Dimension(1000, 800));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Employee Details");

        tbDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Emp ID", "Phone", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
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
        tbDetails.setGridColor(new java.awt.Color(0, 0, 0));
        tbDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDetails);

        btnView.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(null);
        btnDelete.setMaximumSize(new java.awt.Dimension(90, 33));
        btnDelete.setMinimumSize(new java.awt.Dimension(90, 33));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblName.setText("Name:");

        lblEmpID.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblEmpID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEmpID.setText("EmployeeID:");

        lblEmpAge.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblEmpAge.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEmpAge.setText("Age:");

        lblEmpGen.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblEmpGen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEmpGen.setText("Gender:");

        lblStartDate.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblStartDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblStartDate.setText("Start Date:");

        lblLevel.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblLevel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLevel.setText("Level:");

        lblTeamInfo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblTeamInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTeamInfo.setText("Team Info:");

        lblEmpPos.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblEmpPos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEmpPos.setText("Position Title:");

        lblContactInfo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblContactInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblContactInfo.setText("Contact Info:");
        lblContactInfo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblEmpEmail.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblEmpEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEmpEmail.setText("Email Address:");

        lblPhoneNumber.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPhoneNumber.setText("Phone Number:");
        lblPhoneNumber.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblPhoto.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblPhoto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPhoto.setText("Photo:");

        lblNameValue.setBackground(new java.awt.Color(255, 255, 255));
        lblNameValue.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblLevelValue.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblEmpGenValue.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblEmpAgeValue.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblStartDateValue.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblTeamInfoValue.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblEmpPosValue.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblPhoneValue.setDisplayedMnemonic('P');
        lblPhoneValue.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblEmailValue.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblEmpIDvalue.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblEmpID, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addComponent(lblEmpIDvalue, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblEmpAge, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblEmpGen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblStartDateValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblLevelValue, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
                                .addComponent(lblEmpGenValue, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(170, 170, 170)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblNameValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEmpAgeValue, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)))))
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEmpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContactInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpPos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblEmailValue, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpPosValue, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTeamInfoValue, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoneValue, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpic, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPicPath, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(12, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(266, 266, 266))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTitle)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTeamInfoValue, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmpIDvalue, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmpPos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmpPosValue, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEmpAge, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(lblEmpGen, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblContactInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEmpAgeValue, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEmpGenValue, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblPhoneValue, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStartDateValue, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailValue, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLevelValue, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpic, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblPicPath, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int  selectedIndex = tbDetails.getSelectedRow();
        
        if(selectedIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to view details.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tbDetails.getModel();
        EmployeeProfile selectedEmp = (EmployeeProfile) model.getValueAt(selectedIndex, 0);
        
        employeelist.deleteEmp(selectedEmp);
        JOptionPane.showMessageDialog(this,"Deleted");
        populateTable();
        
        lblNameValue.setText("");
        lblEmpIDvalue.setText("");
        lblEmpAgeValue.setText("");
        lblEmpGenValue.setText("");
        lblStartDateValue.setText("");
        lblLevelValue.setText("");
        lblTeamInfoValue.setText("");
        lblEmpPosValue.setText("");
        lblPhoneValue.setText("");
        lblEmailValue.setText("");
        lblpic.setIcon(null);
        lblPicPath.setVisible(false);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
        int  selectedIndex = tbDetails.getSelectedRow();
        
        if(selectedIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to view details.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tbDetails.getModel();
        EmployeeProfile selectedEmp = (EmployeeProfile) model.getValueAt(selectedIndex, 0);
        
        lblNameValue.setText(selectedEmp.getEmpName());
        lblEmpIDvalue.setText(String.valueOf(selectedEmp.getEmpID()));
        lblEmpAgeValue.setText(String.valueOf(selectedEmp.getEmpAge()));
        lblEmpGenValue.setText(selectedEmp.getEmpGen());
        lblStartDateValue.setText(selectedEmp.getStartDate());
        lblLevelValue.setText(String.valueOf(selectedEmp.getLevel()));
        lblTeamInfoValue.setText(selectedEmp.getTeamInfo());
        lblEmpPosValue.setText(selectedEmp.getEmpPos());
        lblPhoneValue.setText(String.valueOf(selectedEmp.getPhoneNumber()));
        lblEmailValue.setText(selectedEmp.getEmpEmail());
        
        lblPicPath.setText(selectedEmp.getPhoto());
        ImageIcon i = new ImageIcon(lblPicPath.getText());
        lblpic.setIcon(i);
        
        
        lblPicPath.setVisible(false);
    }//GEN-LAST:event_btnViewActionPerformed

    private void tbDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDetailsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbDetailsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnView;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblContactInfo;
    private javax.swing.JLabel lblEmailValue;
    private javax.swing.JLabel lblEmpAge;
    private javax.swing.JLabel lblEmpAgeValue;
    private javax.swing.JLabel lblEmpEmail;
    private javax.swing.JLabel lblEmpGen;
    private javax.swing.JLabel lblEmpGenValue;
    private javax.swing.JLabel lblEmpID;
    private javax.swing.JLabel lblEmpIDvalue;
    private javax.swing.JLabel lblEmpPos;
    private javax.swing.JLabel lblEmpPosValue;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblLevelValue;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNameValue;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblPhoneValue;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPicPath;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblStartDateValue;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JLabel lblTeamInfoValue;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblpic;
    private javax.swing.JTable tbDetails;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tbDetails.getModel();
        model.setRowCount(0);
        
        for(EmployeeProfile ep : employeelist.getEmployeelist()){
            
            Object[] row = new Object[4];
            row[0] = ep;
            row[1] = ep.getEmpID();
            row[2] = ep.getPhoneNumber();
            row[3] = ep.getEmpEmail();
            
            model.addRow(row);
        }
    }
}
