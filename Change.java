/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fmsl_1.pkg0;

import java.awt.Window;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
/**
 *
 * @author gaonkarm
 */
public class Change extends javax.swing.JFrame {
    String user ="gaonkarm";
    String pwd="Welcome0799647";
    String connectionUrl = "jdbc:sqlserver://shucsd\\sql2012\\CS670_FA17_gaonkarm:1433;" +
                            "databaseName=CS670_FA17_gaonkarm;user="+user+";password="+pwd+";";
    String barNumber,regularPassword,uniquePassword,first_Name,last_Name,dateOfBirth,emailAddress,phoneNumber,houseNumber,streetAddress,
            cityAddress,stateAddress,zipAddress,sQ1,sQ2,sA1,sA2,designation;
    JButton tabClick;
    //int sQ1,sQ2;
    int contactID,secqid1,secqid2;
    public Change(int id,String barNum,String regPass,String uniqPass,String firstName,String lastName,String dateOfB,String emaiL,
            String phonE,String housE,String streeT,String citY,String statE,String ziP,String secQ1,String secA1,String secQ2,String secA2, String desig,JButton dbUpdateBtn) {
        initComponents();
        contactID=id;
        barNumber=barNum;
        barN.setText(barNum);
        regularPassword=regPass;
        regP.setText(regPass);
        uniquePassword=uniqPass;
        first_Name=firstName;
        fName.setText(firstName);
        last_Name=lastName;
        lName.setText(lastName);
        dateOfBirth=dateOfB;
        dob.setText(dateOfB);
        emailAddress=emaiL;
        email.setText(emaiL);
        phoneNumber=phonE;
        phone.setText(phonE);
        houseNumber=housE;
        house.setText(housE);
        streetAddress=streeT;
        street.setText(streeT);
        cityAddress=citY;
        city.setText(citY);
        stateAddress=statE;
        state.setText(statE);
        zipAddress=ziP;
        zip.setText(ziP);
        sQ1=secQ1;
        sA1=secA1;
        sQ2=secQ2;
        sA2=secA2;
        designation=desig;
        tabClick=dbUpdateBtn;
        
    }
    
//     public Change() {
//        try{
//         
//        }catch(NullPointerException e){}
//        
//        
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        barN = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        regP = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        fName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dob = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        house = new javax.swing.JTextField();
        street = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        state = new javax.swing.JTextField();
        zip = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Change");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Bar Number :");

        barN.setEditable(false);
        barN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barNActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Password :");

        jLabel3.setText("First Name :");

        fName.setEditable(false);

        jLabel4.setText("Last Name :");

        jLabel5.setText("DOB :");

        dob.setEditable(false);

        jLabel6.setText("Email :");

        jLabel7.setText("Phone :");

        jLabel8.setText("Address :");

        jLabel9.setText("House/Apt");

        jLabel10.setText("Street");

        jLabel11.setText("City");

        jLabel12.setText("State");

        jLabel13.setText("Zip");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(6, 6, 6)))
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(barN, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(regP)
                                    .addComponent(fName)
                                    .addComponent(lName)
                                    .addComponent(dob)
                                    .addComponent(email)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13))))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(zip, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(state)
                                    .addComponent(city)
                                    .addComponent(street)
                                    .addComponent(phone)
                                    .addComponent(house)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(577, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(barN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(regP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(house, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(street, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(31, 31, 31)
                .addComponent(updateButton)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barNActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        
        
        int reply =JOptionPane.showConfirmDialog(null, "Confirm values to Update?", "Update Case", JOptionPane.YES_NO_OPTION);
            if(reply==JOptionPane.YES_OPTION){
                
                Connection con = null;
                ResultSet rs = null;
                
                try {
                    
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    con=DriverManager.getConnection(connectionUrl);
                    
                    String querySecQ1_ID= "Select Security_Question_ID from SecurityQuestion1 where Security_Question=?;";
                    PreparedStatement qSQ1 = con.prepareStatement(querySecQ1_ID);
                    qSQ1.setString(1,sQ1);
                    ResultSet qsid1 = qSQ1.executeQuery();
                    if(qsid1.next()){
                        secqid1 = qsid1.getInt("Security_Question_ID");
                    }else{
                        System.out.println("Failed to get Security Question ID-1!");
                    }
                    
                    String querySecQ2_ID= "Select Security_Question_ID from SecurityQuestion2 where Security_Question=?;";
                    PreparedStatement qSQ2 = con.prepareStatement(querySecQ2_ID);
                    qSQ2.setString(1,sQ2);
                    ResultSet qsid2 = qSQ2.executeQuery();
                    if(qsid2.next()){
                        secqid2 = qsid2.getInt("Security_Question_ID");
                    }else{
                        System.out.println("Failed to get Security Question ID-2!");
                    }
                    
                    String query1 = "Update Contact Set Status = 'Delete' where Contact_ID=?;";
                    PreparedStatement ps1 = con.prepareStatement(query1);
                    ps1.setInt(1, contactID);
                    if( ps1.executeUpdate()!=0){
                        String query2 = "Update Employee Set ActiveBit = 0 where Contact_ID=?;";
                        PreparedStatement ps2 = con.prepareStatement(query2);
                        ps2.setInt(1, contactID);
                        if( ps2.executeUpdate()!=0){
                            String query3 = "Insert into Contact(Status,FirstName, LastName, DOB, Email, Phone, House, Street, City, State, Zip) values (?,?,?,?,?,?,?,?,?,?,?);";
                            PreparedStatement ps3 = con.prepareStatement(query3);
                            ps3.setString(1,"Change");
                            ps3.setString(2, first_Name);
                            ps3.setString(3, lName.getText());
                            ps3.setString(4, dateOfBirth);
                            ps3.setString(5, email.getText());
                            ps3.setString(6, phone.getText());
                            ps3.setString(7, house.getText());
                            ps3.setString(8, street.getText());
                            ps3.setString(9, city.getText());
                            ps3.setString(10, state.getText());
                            ps3.setString(11, zip.getText());
                            
                            
                            
                            if( ps3.executeUpdate()!=0){
                                char[] regtxtpassword=regP.getPassword();
                                String regpasswd=new String(regtxtpassword);
                                String query4="Insert into Employee(Contact_ID,BarNumber,Password,UniquePassword,Security_Question_ID1,Security_Answer1,Security_Question_ID2,Security_Answer2, Designation,ActiveBit) values((select max(Contact_ID) from Contact),?,?,?,?,?,?,?,?,?);";
                                PreparedStatement ps4 = con.prepareStatement(query4);
                                ps4.setString(1, barNumber);
                                ps4.setString(2, regpasswd);
                                ps4.setString(3,uniquePassword);
                                ps4.setInt(4, secqid1);
                                ps4.setString(5, sA1);
                                ps4.setInt(6, secqid1);
                                ps4.setString(7, sA2);
                                ps4.setString(8, designation);
                                ps4.setInt(9, 1);
                                
                                if( ps4.executeUpdate()!=0){
                                    JOptionPane.showMessageDialog(null, "Data updated successfully!");
                                    tabClick.doClick();
                                    dispose();
                                }else{
                                    System.out.println("Failed to insert changed Employee details!");
                                }
                            }else{
                                System.out.println("Failed to insert changed Contact details!");
                            }
                        }else{
                            System.out.println("Failed to set Employee ActiveBit to 0!");
                        }
                                                
                    }else{
                        System.out.println("Failed to set Contact Status to Delete!");
                    }
                    
                    }catch(SQLException | ClassNotFoundException ex){
                }
                
                
                
                
            }
            else{}
            
        
    }//GEN-LAST:event_updateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barN;
    private javax.swing.JTextField city;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fName;
    private javax.swing.JTextField house;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lName;
    private javax.swing.JTextField phone;
    private javax.swing.JPasswordField regP;
    private javax.swing.JTextField state;
    private javax.swing.JTextField street;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField zip;
    // End of variables declaration//GEN-END:variables
}
