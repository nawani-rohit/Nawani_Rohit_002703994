/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import model.EmployeeList;
import model.EmployeeProfile;

/**
 *
 * @author rohit
 */
public class UpdateDetails extends javax.swing.JPanel {

    /**
     * Creates new form UpdateDetails
     */
    
    EmployeeList employeelist;
    public boolean flagName = true;
    public boolean flagEmpID = true;
    public boolean flagEmpAge = true;
    public boolean flagEmpGen = true;
    public boolean flagEmail = true;
    public boolean flagPhoneNumber = true;
    
    public UpdateDetails(EmployeeList employeelist) {
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

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDetails = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
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
        txtName = new javax.swing.JTextField();
        txtEmpID = new javax.swing.JTextField();
        txtEmpAge = new javax.swing.JTextField();
        txtEmpGen = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        txtTeamInfo = new javax.swing.JTextField();
        txtEmpPos = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtEmpEmail = new javax.swing.JTextField();
        lblPhoto = new javax.swing.JLabel();
        lblpic = new javax.swing.JLabel();
        lblPicPath = new javax.swing.JLabel();
        btnUpdatePhoto = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1000, 800));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Update Employee Details");

        tbDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Emp ID", "Age", "Gender", "Start Date", "Level", "Team Info", "Position", "Phone", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDetails);

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Name:");

        lblEmpID.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblEmpID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmpID.setText("EmployeeID:");

        lblEmpAge.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblEmpAge.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmpAge.setText("Age:");

        lblEmpGen.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblEmpGen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmpGen.setText("Gender:");

        lblStartDate.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblStartDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStartDate.setText("Start Date:");

        lblLevel.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblLevel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLevel.setText("Level:");

        lblTeamInfo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblTeamInfo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTeamInfo.setText("Team Info:");

        lblEmpPos.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblEmpPos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmpPos.setText("Position Title:");

        lblContactInfo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblContactInfo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblContactInfo.setText(" Contact Info");

        lblEmpEmail.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblEmpEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEmpEmail.setText("Email Address:");

        lblPhoneNumber.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPhoneNumber.setText("Contact Phone Number:");

        lblPhoto.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblPhoto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPhoto.setText("Photo:");

        btnUpdatePhoto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdatePhoto.setText("Update Photo");
        btnUpdatePhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePhotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblEmpAge, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblEmpGen, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblEmpPos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblContactInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lblEmpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPhoneNumber))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmpID)
                                    .addComponent(txtName)
                                    .addComponent(txtEmpAge)
                                    .addComponent(txtStartDate)
                                    .addComponent(txtEmpGen)
                                    .addComponent(txtLevel)
                                    .addComponent(txtTeamInfo)
                                    .addComponent(txtEmpPos)
                                    .addComponent(txtPhoneNumber)
                                    .addComponent(txtEmpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPicPath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblpic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(44, 44, 44)
                        .addComponent(btnUpdatePhoto)
                        .addGap(98, 98, 98))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(365, 365, 365))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpAge)
                    .addComponent(txtEmpAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmpGen)
                    .addComponent(txtEmpGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStartDate)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLevel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTeamInfo)
                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmpPos)
                    .addComponent(txtEmpPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblContactInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNumber)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhoto)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblpic, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btnUpdatePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPicPath, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDetailsMouseClicked
        // TODO add your handling code here:
        
        int  selectedIndex = tbDetails.getSelectedRow();
        
        if(selectedIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to view details.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tbDetails.getModel();
        EmployeeProfile selectedEmp = (EmployeeProfile) model.getValueAt(selectedIndex, 0);
        
        txtName.setText(selectedEmp.getEmpName());
        txtEmpID.setText(String.valueOf(selectedEmp.getEmpID()));
        txtEmpAge.setText(String.valueOf(selectedEmp.getEmpAge()));
        txtEmpGen.setText(selectedEmp.getEmpGen());
        txtStartDate.setText(selectedEmp.getStartDate());
        txtLevel.setText(String.valueOf(selectedEmp.getLevel()));
        txtTeamInfo.setText(selectedEmp.getTeamInfo());
        txtEmpPos.setText(selectedEmp.getEmpPos());
        txtPhoneNumber.setText(String.valueOf(selectedEmp.getPhoneNumber()));
        txtEmpEmail.setText(selectedEmp.getEmpEmail());
        
        
        lblPicPath.setText(selectedEmp.getPhoto());
        ImageIcon i = new ImageIcon(lblPicPath.getText());
        lblpic.setIcon(i);
        
        lblPicPath.setVisible(false);
        
    }//GEN-LAST:event_tbDetailsMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int rowSelectedIndex = tbDetails.getSelectedRow();
        
        if(txtName.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this, "Please fill the Name");
        }else if(txtEmpID.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this, "Please fill the Employee ID");
        }else if(txtEmpAge.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this, "Please fill the Age");
        }else if(txtEmpGen.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this, "Please fill the Employee Gender");
        }else if(txtStartDate.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this, "Please fill the Start Date");
        }else if(txtLevel.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this, "Please fill the Level");
        }else if(txtTeamInfo.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this, "Please fill the Team Info");
        }else if(txtEmpPos.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this, "Please fill the Employee's Position Title");
        }else if(txtPhoneNumber.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this, "Please fill the Phone Number");
        }else if(txtEmpEmail.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this, "Please fill the Email");
        }
        else{
            if(txtName.getText().length() > 0){
                flagName = true;
                String str = txtName.getText();
                boolean flagAns = str.matches("[a-zA-Z ]+");
                if(!flagAns){
                    JOptionPane.showMessageDialog(this, "Employee Name should be character only");
                    flagName = false;
                }
            }
            
            if(txtEmpID.getText().length() > 0){
                flagEmpID = true;
                int rowPos = 0;
                for(EmployeeProfile ep : employeelist.getEmployeelist()){
                    Object[] row = new Object[1];
                    row[0] = ep.getEmpID();
                    if(rowPos != rowSelectedIndex){
                        if(row[0].equals(txtEmpID.getText())){
                            JOptionPane.showMessageDialog(this, "Employee ID already exists in record");
                            flagEmpID = false;
                        }
                    }
                    rowPos++;
                }
            }
            
            if(txtEmpAge.getText().length() > 0){
                try{
                    flagEmpAge = true;
                    if(Integer.parseInt(txtEmpAge.getText())<=0){
                        JOptionPane.showMessageDialog(this, "Employee Age is not correct");
                        flagEmpAge = false;
                    }
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(this, "Employee Age is not correct");
                    flagEmpAge = false;
                }
            }
            
            if(txtEmpGen.getText().length() > 0){
                flagEmpGen = true;
                String str = txtEmpGen.getText();
                boolean flagAns = str.matches("[a-zA-Z]+");
                if(!flagAns){
                    JOptionPane.showMessageDialog(this, "Employee Gender should be character only");
                    flagName = false;
                }
            }
            
            if(txtPhoneNumber.getText().length() > 0){
                flagPhoneNumber = true;
                String regex = "^\\d{10}$";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(txtPhoneNumber.getText());
                if(!matcher.matches()){
                    JOptionPane.showMessageDialog(this, "Employee Phone number must be 10 digit only");
                    flagPhoneNumber = false;
                }
                else{
                    int rowPos = 0;
                    for(EmployeeProfile ep : employeelist.getEmployeelist()){
                        Object[] row = new Object[1];
                        row[0] = ep.getPhoneNumber();
                        if(rowPos != rowSelectedIndex){
                        if(row[0].equals(txtPhoneNumber.getText())){
                            JOptionPane.showMessageDialog(this, "Employee Phone number already present in the table");
                            flagPhoneNumber = false;
                            }
                        }
                        rowPos++;
                    }
                }
            }
            
             if(txtEmpEmail.getText().length() > 0){
                flagEmail = true;
                String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(txtEmpEmail.getText());
                if(!matcher.matches()){
                    JOptionPane.showMessageDialog(this, "Employee Email is incorrect");
                    txtEmpEmail.setText("");
                    flagEmail = false;
                }
                else{
                    
                    int rowPos = 0;
                    for(EmployeeProfile ep : employeelist.getEmployeelist()){
                        Object[] row = new Object[3];
                        row[0] = ep.getEmpEmail();
                        
                        if(rowPos != rowSelectedIndex){
                            if(row[0].equals(txtEmpEmail.getText())){
                                JOptionPane.showMessageDialog(this, "Employee Email already exists in record");
                                flagEmail = false;
                            }
                        }
                        rowPos++;
                    }
                }
            }
            
            if(flagName && flagEmpID && flagEmpAge && flagEmpGen && flagEmail && flagPhoneNumber){
                

            String updatedName = txtName.getText();
            String updatedEmpID = txtEmpID.getText();
            int updatedEmpAge = Integer.parseInt(txtEmpAge.getText());
            String updatedEmpGen = txtEmpGen.getText();
            String updatedStartDate = txtStartDate.getText();
            String updatedLevel = txtLevel.getText();
            String updatedTeamInfo = txtTeamInfo.getText();
            String updatedEmpPos = txtEmpPos.getText();
            String updatedPhoneNumber = txtPhoneNumber.getText();
            String updatedEmpEmail = txtEmpEmail.getText();
            String updatedPhoto = lblPicPath.getText();
            
            

            int  selectedIndex = tbDetails.getSelectedRow();

            if(selectedIndex < 0){
                JOptionPane.showMessageDialog(this, "Please select a row to view details.");
                return;
            }
            DefaultTableModel model = (DefaultTableModel) tbDetails.getModel();
            EmployeeProfile selectedEmp = (EmployeeProfile) model.getValueAt(selectedIndex, 0);

            selectedEmp.setEmpName(updatedName);
            selectedEmp.setEmpID(updatedEmpID);
            selectedEmp.setEmpAge(updatedEmpAge);
            selectedEmp.setEmpGen(updatedEmpGen);
            selectedEmp.setStartDate(updatedStartDate);
            selectedEmp.setLevel(updatedLevel);
            selectedEmp.setTeamInfo(updatedTeamInfo);
            selectedEmp.setEmpPos(updatedEmpPos);
            selectedEmp.setPhoneNumber(updatedPhoneNumber);
            selectedEmp.setEmpEmail(updatedEmpEmail);
            selectedEmp.setPhoto(updatedPhoto);
            System.out.println(updatedPhoto);


            ArrayList<EmployeeProfile>empArrayList = employeelist.getEmployeelist();

            empArrayList.set(selectedIndex,selectedEmp);
            populateTable();

            txtName.setText("");
            txtEmpID.setText("");
            txtEmpAge.setText("");
            txtEmpGen.setText("");
            txtStartDate.setText("");
            txtLevel.setText("");
            txtTeamInfo.setText("");
            txtEmpPos.setText("");
            txtPhoneNumber.setText("");
            txtEmpEmail.setText("");
            lblpic.setIcon(null);
            lblPicPath.setVisible(false);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnUpdatePhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePhotoActionPerformed
        // TODO add your handling code here:
        JFileChooser browsePhoto = new JFileChooser();
        FileNameExtensionFilter ext = new FileNameExtensionFilter("IMAGES", "png","jpg","jpeg");
        browsePhoto.addChoosableFileFilter(ext);
        
        int showOpenDialog = browsePhoto.showOpenDialog(null);
        
        if(showOpenDialog == JFileChooser.APPROVE_OPTION){
            File photoFile = browsePhoto.getSelectedFile();
            String photoPath = photoFile.getAbsolutePath();
            lblPicPath.setText(photoPath);
//            JOptionPane.showMessageDialog(this,photoPath);
            
            ImageIcon iPic = new ImageIcon(photoPath);
            Image ii = iPic.getImage().getScaledInstance(lblpic.getWidth(), lblpic.getHeight(), Image.SCALE_SMOOTH);
            lblpic.setIcon(new ImageIcon(ii));
        }
    }//GEN-LAST:event_btnUpdatePhotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdatePhoto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblContactInfo;
    private javax.swing.JLabel lblEmpAge;
    private javax.swing.JLabel lblEmpEmail;
    private javax.swing.JLabel lblEmpGen;
    private javax.swing.JLabel lblEmpID;
    private javax.swing.JLabel lblEmpPos;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPicPath;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblpic;
    private javax.swing.JTable tbDetails;
    private javax.swing.JTextField txtEmpAge;
    private javax.swing.JTextField txtEmpEmail;
    private javax.swing.JTextField txtEmpGen;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtEmpPos;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tbDetails.getModel();
        model.setRowCount(0);
        
        for(EmployeeProfile ep : employeelist.getEmployeelist()){
            
            Object[] row = new Object[10];
            row[0] = ep;
            row[1] = ep.getEmpID();
            row[2] = ep.getEmpAge();
            row[3] = ep.getEmpGen();
            row[4] = ep.getStartDate();
            row[5] = ep.getLevel();
            row[6] = ep.getTeamInfo();
            row[7] = ep.getEmpPos();
            row[8] = ep.getPhoneNumber();
            row[9] = ep.getEmpEmail();
            
            model.addRow(row);
        }
    }
}
