/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.EmployeeList;
import model.EmployeeProfile;

/**
 *
 * @author rohit
 */
public class AddEmployee extends javax.swing.JPanel {

    /**
     * Creates new form AddEmployee
     */
    
    EmployeeList employeelist;
    public boolean flagName = true;
    public boolean flagEmpID = true;
    public boolean flagEmpAge = true;
    public boolean flagEmpGen = true;
    public boolean flagEmail = true;
    public boolean flagPhoneNumber = true;
    public boolean flagImage = true;
            
    public AddEmployee(EmployeeList employeelist) {
        initComponents();
        this.employeelist = employeelist;
        lblPicPath.setVisible(false);
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
        btnSave = new javax.swing.JButton();
        btnBrowse = new javax.swing.JButton();
        lblpic = new javax.swing.JLabel();
        lblPicPath = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 800));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Add Employee");

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

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoneNumber)
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmpAge, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmpGen, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblEmpEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtEmpPos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(96, 96, 96)
                                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEmpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblpic, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(lblPicPath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblTitle)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpID)
                    .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpAge)
                    .addComponent(txtEmpAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpGen)
                    .addComponent(txtEmpGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStartDate)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLevel)
                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTeamInfo)
                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpPos)
                    .addComponent(txtEmpPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(lblContactInfo)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNumber)
                    .addComponent(lblEmpEmail)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhoto)
                            .addComponent(btnBrowse))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblpic, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPicPath, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(105, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
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
                boolean nameMatches = str.matches("[a-zA-Z ]+");
                if(!nameMatches){
                    JOptionPane.showMessageDialog(this, "Employee Name should be character only");
                    flagName = false;
                }
            }
            
            if(txtEmpID.getText().length() > 0){
                flagEmpID = true;
                for(EmployeeProfile ep : employeelist.getEmployeelist()){
                    Object[] row = new Object[1];
                    row[0] = ep.getEmpID();
                    if(row[0].equals(txtEmpID.getText())){
                        JOptionPane.showMessageDialog(this, "Employee ID already exists in record");
                        flagEmpID = false;
                    }
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
                boolean nameMatches = str.matches("[a-zA-Z]+");
                if(!nameMatches){
                    JOptionPane.showMessageDialog(this, "Employee Gender should be character only");
                    flagName = false;
                }
            }
            
            if(txtEmpEmail.getText().length() > 0){
                flagEmail = true;
                String regex = "^[a-z0-9+_.-]+@(.+)$";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(txtEmpEmail.getText());
                if(!matcher.matches()){
                    JOptionPane.showMessageDialog(this, "Employee Email is incorrect");
                    txtEmpEmail.setText("");
                    flagEmail = false;
                }
                else{
                    for(EmployeeProfile ep : employeelist.getEmployeelist()){
                        Object[] row = new Object[3];
                        row[0] = ep.getEmpEmail();
                        if(row[0].equals(txtEmpEmail.getText())){
                            JOptionPane.showMessageDialog(this, "Employee Email already exists in record");
                            flagEmail = false;
                        }
                    }
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
                    for(EmployeeProfile ep : employeelist.getEmployeelist()){
                        Object[] row = new Object[1];
                        row[0] = ep.getPhoneNumber();
                        if(row[0].equals(txtPhoneNumber.getText())){
                            JOptionPane.showMessageDialog(this, "Employee Phone number already present in the table");
                            flagPhoneNumber = false;
                        }
                    }
                }
            }
            
            if(lblPicPath.getText().length() == 0){
                JOptionPane.showMessageDialog(this, "Please select Employee photo");
                flagImage = false;
            }else{
                flagImage = true;
            }
            if(flagName && flagEmpID && flagEmpAge && flagEmpGen && flagEmail && flagPhoneNumber && flagImage){
                String Name = txtName.getText();
                String EmpID = txtEmpID.getText();
                int EmpAge = Integer.parseInt(txtEmpAge.getText());
                String EmpGen = txtEmpGen.getText();
                String StartDate = txtStartDate.getText();
                String level = txtLevel.getText();
                String TeamInfo = txtTeamInfo.getText();
                String EmpPos = txtEmpPos.getText();
                String PhoneNumber = txtPhoneNumber.getText();
                String EmpEmail = txtEmpEmail.getText();
                String photo = lblPicPath.getText();

                EmployeeProfile ep = employeelist.addNewEmp();

                ep.setEmpName(Name);
                ep.setEmpID(EmpID);
                ep.setEmpAge(EmpAge);
                ep.setEmpGen(EmpGen);
                ep.setStartDate(StartDate);
                ep.setLevel(level);
                ep.setTeamInfo(TeamInfo);
                ep.setEmpPos(EmpPos);
                ep.setPhoneNumber(PhoneNumber);
                ep.setEmpEmail(EmpEmail);
                ep.setPhoto(photo);

                JOptionPane.showMessageDialog(this, "New Employee added.");

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
            }
        }    
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        // TODO add your handling code here:
        JFileChooser browsePhoto = new JFileChooser();
        FileNameExtensionFilter ext = new FileNameExtensionFilter("IMAGES","png","jpg","jpeg");
        browsePhoto.setFileFilter(ext);
        
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
    }//GEN-LAST:event_btnBrowseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnSave;
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
}
