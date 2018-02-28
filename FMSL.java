
package fmsl_1.pkg0;


import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.EventObject;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFCellUtil;


/**
 *
 * @author meghagaonkar
 */
public class FMSL extends javax.swing.JFrame {
    public static int roww=-1;
    public static String choice="";
    public static JTable table;
    public static String tuser,tpass,tupass,tfname,tlname,tphone,tstr,tsta,tzip;
    int lawyer_id,caseid,secQ1,contact_id,secQ2;
    String desig="";
    //regex
    String regexName="(\\b[a-zA-Z]+\\b)|(\\b[a-zA-Z]+\\b)(\\b\\s[a-zA-Z]+\\b)";
    String regexPhone = "[2-9][0-9]{9}";   
    String regexZip = "0[1-9][0-9]{3}|[1-9][0-9]{4}";
    String regexEmail = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
    
    static JButton dbUpdateBtn;
    static JFrame tableframe;
    String docket;
    String uname, passwd, fname, lname, dob, phone,email,house, stAddr, ctAddr, state, zip, secAns1,secAns2;
    final String eusername = "fmslshucs2017@gmail.com";
    final String epassword = "fmsl_2017";
    Properties props = new Properties();
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    ResultSet rs1 = null;
    ResultSet rs2 = null;
    ResultSet rs3 = null;
    String user ="gaonkarm";
    String pwd="Welcome0799647";
    String connectionUrl = "jdbc:sqlserver://shucsd\\sql2012\\CS670_FA17_gaonkarm:1433;" +
                            "databaseName=CS670_FA17_gaonkarm;user="+user+";password="+pwd+";";
    static String connectionUrl1 = "jdbc:sqlserver://shucsd\\sql2012\\CS670_FA17_gaonkarm:1433;" +
	                            "databaseName=CS670_FA17_gaonkarm;user=gaonkarm;password=Welcome0799647;";
    Panel p1=new Panel(new GridLayout());
    Label l1=new Label();
    Label l2=new Label();
    Label l3=new Label();
    Label l4=new Label();
    Label l5=new Label();
    Label l6=new Label();
    Label l7=new Label();
    Label l8=new Label();
    Label l9=new Label();
    Label l10=new Label();
    Label l11=new Label();
    Label l12=new Label();
    Label l13=new Label();
    Label l14=new Label();
    Label l15=new Label();
    Label l16=new Label();
    Label l17=new Label();
    Label l18=new Label();
    Label l19=new Label();
    Label l20=new Label();
    static boolean logPri=false; 
    static boolean regFlag=false; 
    static boolean admin=false;
    
    public FMSL() {
        initComponents();
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();
        nextbutton = new javax.swing.JButton();
        aboutUs_button = new javax.swing.JButton();
        homebutton = new javax.swing.JButton();
        loggedUser = new javax.swing.JLabel();
        luser = new javax.swing.JLabel();
        contactUs_button = new javax.swing.JButton();
        logoutbutton = new javax.swing.JButton();
        hometext = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        caseButton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        retainerButton = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        billButton = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        queryrequestButton = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        reportButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        infoPanel = new javax.swing.JPanel();
        info1 = new javax.swing.JLabel();
        info2 = new javax.swing.JLabel();
        info3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fmsl_1/pkg0/Logo.JPG"))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Serif", 0, 48)); // NOI18N
        jLabel1.setText("Lawyer's Financial Management System ");

        Exit.setBackground(new java.awt.Color(255, 255, 255));
        Exit.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        backbutton.setBackground(new java.awt.Color(255, 255, 255));
        backbutton.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        backbutton.setText("Back ");
        backbutton.setEnabled(false);
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        nextbutton.setBackground(new java.awt.Color(255, 255, 255));
        nextbutton.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        nextbutton.setText("Next");
        nextbutton.setEnabled(false);
        nextbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbuttonActionPerformed(evt);
            }
        });

        aboutUs_button.setBackground(new java.awt.Color(255, 255, 255));
        aboutUs_button.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        aboutUs_button.setText("About Us");
        aboutUs_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutUs_buttonActionPerformed(evt);
            }
        });

        homebutton.setBackground(new java.awt.Color(255, 255, 255));
        homebutton.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        homebutton.setText("Home");
        homebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebuttonActionPerformed(evt);
            }
        });

        loggedUser.setBackground(new java.awt.Color(255, 255, 255));
        loggedUser.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        luser.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        contactUs_button.setBackground(new java.awt.Color(255, 255, 255));
        contactUs_button.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        contactUs_button.setText("Contact Us");
        contactUs_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactUs_buttonActionPerformed(evt);
            }
        });

        logoutbutton.setBackground(new java.awt.Color(255, 255, 255));
        logoutbutton.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        logoutbutton.setText("Logout");
        logoutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbuttonActionPerformed(evt);
            }
        });

        hometext.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel2.setText("Login");

        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fmsl_1/pkg0/down.png"))); // NOI18N
        loginButton.setBorderPainted(false);
        loginButton.setContentAreaFilled(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel3.setText("Register");

        registerButton.setBackground(new java.awt.Color(255, 255, 255));
        registerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fmsl_1/pkg0/down.png"))); // NOI18N
        registerButton.setBorderPainted(false);
        registerButton.setContentAreaFilled(false);
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel4.setText("Client's Case");

        caseButton.setBackground(new java.awt.Color(255, 255, 255));
        caseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fmsl_1/pkg0/down.png"))); // NOI18N
        caseButton.setBorderPainted(false);
        caseButton.setContentAreaFilled(false);
        caseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caseButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(caseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel6.setText("Lawyer's Retainer");

        retainerButton.setBackground(new java.awt.Color(255, 255, 255));
        retainerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fmsl_1/pkg0/down.png"))); // NOI18N
        retainerButton.setBorderPainted(false);
        retainerButton.setContentAreaFilled(false);
        retainerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retainerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(retainerButton)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(retainerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel7.setText("Hourly Bill");

        billButton.setBackground(new java.awt.Color(255, 255, 255));
        billButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fmsl_1/pkg0/down.png"))); // NOI18N
        billButton.setBorderPainted(false);
        billButton.setContentAreaFilled(false);
        billButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(billButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(billButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel8.setText("Query Request");

        queryrequestButton.setBackground(new java.awt.Color(255, 255, 255));
        queryrequestButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fmsl_1/pkg0/down.png"))); // NOI18N
        queryrequestButton.setBorderPainted(false);
        queryrequestButton.setContentAreaFilled(false);
        queryrequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryrequestButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(queryrequestButton)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(queryrequestButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel9.setText("System Report");

        reportButton.setBackground(new java.awt.Color(255, 255, 255));
        reportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fmsl_1/pkg0/down.png"))); // NOI18N
        reportButton.setBorderPainted(false);
        reportButton.setContentAreaFilled(false);
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reportButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jButton2.setText("FAQ's");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        infoPanel.setBackground(new java.awt.Color(255, 255, 255));

        info1.setFont(new java.awt.Font("Serif", 1, 28)); // NOI18N
        info1.setText("Welcome to Lawyer's Financial Mangement System!");

        info2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        info2.setText(" If you are a new user, click on Register");

        info3.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        info3.setText("If you are an existing user, click on Login ");

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(info1)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(info3)
                            .addComponent(info2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(info1)
                .addGap(18, 18, 18)
                .addComponent(info2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(info3)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(homebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hometext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(logo)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(aboutUs_button, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(contactUs_button)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(luser, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2152, 2152, 2152)
                                .addComponent(loggedUser, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(636, 636, 636)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logoutbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addComponent(logo))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aboutUs_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contactUs_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(homebutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(luser, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loggedUser)
                .addGap(301, 301, 301)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(205, 205, 205)
                .addComponent(hometext)
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aboutUs_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutUs_buttonActionPerformed
        // TODO add your handling code here:
        backbutton.setEnabled(true);
        nextbutton.setEnabled(true);
        infoPanel.removeAll();
        this.remove(infoPanel);
        p1.removeAll();
        this.remove(p1);      
        l1.setText("About Us:");
        l1.setBounds(205,102,300,40);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Serif", Font.BOLD, 24));
        l1.setVisible(true);
        p1.add(l1);
 
       
        l2.setText("What is Financial management system "+Character.UnicodeBlock.of('\u003F'));
        l2.setBounds(205,170,300,30);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Serif", Font.PLAIN, 24));
        l2.setVisible(true);
        p1.add(l2);
        l3.setText("Lawyer maintains details of clients and decides the fee charged per hour based on the complexity of the case. It is tedious to maintain ");
        l3.setBounds(205,200,1500,30);
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Serif", Font.PLAIN, 24));
        l3.setVisible(true);
        p1.add(l3);
        l4.setText("day to day work and the fee charged per client. Client pays certain advance that is stored in IOLTA trust account of the Lawyer. As and ");
        l4.setBounds(205,230,1500,30);
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Serif", Font.PLAIN, 24));
        l4.setVisible(true);
        p1.add(l4);
         
        l6.setText("when the lawyer works for the case, the fee is deducted from this account. ");
        l6.setBounds(205,260,1500,30);
        l6.setForeground(Color.BLACK);
        l6.setFont(new Font("Serif", Font.PLAIN, 24));
        l6.setVisible(true);
        p1.add(l6);
        
        
        l12.setText("Lawyer’s Financial Management System (LFMS) is a system that will provide Lawyers to store and update client information, retainer, ");
        l12.setBounds(205,300,1500,30);
        l12.setForeground(Color.BLACK);
        l12.setFont(new Font("Serif", Font.PLAIN, 24));
        l12.setVisible(true);
        p1.add(l12);
        l13.setText("client case and hours spent by Lawyer on each case to calculate and deduct fee from lawyer’s retainer. It also generates financial reports ");
        l13.setBounds(205,330,1500,30);
        l13.setForeground(Color.BLACK);
        l13.setFont(new Font("Serif", Font.PLAIN, 24));
        l13.setVisible(true);
        p1.add(l13);
        l14.setText("by centralizing client data and lawyer fee transactions to analyze retainer thus by reducing the time spent on evaluation of transactions ");
        l14.setBounds(205,360,1500,30);
        l14.setForeground(Color.BLACK);
        l14.setFont(new Font("Serif", Font.PLAIN, 24));
        l14.setVisible(true);
        p1.add(l14);

        l15.setText("by the Lawyer. ");
        l15.setBounds(205,390,300,30);
        l15.setForeground(Color.BLACK);
        l15.setFont(new Font("Serif", Font.PLAIN, 24));
        l15.setVisible(true);
        p1.add(l15);

    
        p1.setBackground(Color.WHITE);
        p1.setBounds(20, 145, 1600, 700);
        p1.setVisible(true);
        this.add(p1);
        
        
        
    }//GEN-LAST:event_aboutUs_buttonActionPerformed

    private void homebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebuttonActionPerformed
        // TODO add your handling code here:
        infoPanel.removeAll();
        this.remove(infoPanel);
        backbutton.setEnabled(true);
        nextbutton.setEnabled(true);
        p1.removeAll();
        this.remove(p1); 
    }//GEN-LAST:event_homebuttonActionPerformed

    private void contactUs_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactUs_buttonActionPerformed
         //TODO add your handling code here:
        p1.removeAll();
        backbutton.setEnabled(true);
        nextbutton.setEnabled(true);
        infoPanel.removeAll();
        this.remove(infoPanel);
        l1.setText("Contact Us:");
        l1.setBounds(205,102,300,40);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Serif", Font.BOLD, 24));
        l1.setVisible(true);
        p1.add(l1);
        
        l2.setText("Megha Vivek Gaonkar");
        l2.setBounds(205,170,300,30);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Serif", Font.PLAIN, 24));
        l2.setVisible(true);
        p1.add(l2);
        l3.setText("Phone: 475-449-7021");
        l3.setBounds(205,200,300,30);
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Serif", Font.PLAIN, 24));
        l3.setVisible(true);
        p1.add(l3);
        l4.setText("Email: gaonkarm@mail.sacredheart.edu");
        l4.setBounds(205,230,400,30);
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Serif", Font.PLAIN, 24));
        l4.setVisible(true);
        p1.add(l4);

        l5.setText("Sneha Krishna Ahiwale");
        l5.setBounds(905,170,300,30);
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("Serif", Font.PLAIN, 24));
        l5.setVisible(true);
        p1.add(l5);
        l6.setText("Phone: 203-908-1507");
        l6.setBounds(905,200,300,30);
        l6.setForeground(Color.BLACK);
        l6.setFont(new Font("Serif", Font.PLAIN, 24));
        l6.setVisible(true);
        p1.add(l6);
        l7.setText("Email: ahiwales@mail.sacredheart.edu");
        l7.setBounds(905,230,400,30);
        l7.setForeground(Color.BLACK);
        l7.setFont(new Font("Serif", Font.PLAIN, 24));
        l7.setVisible(true);
        p1.add(l7);
        
    
        
        l12.setText("Priyank J. Patel");
        l12.setBounds(205,300,300,30);
        l12.setForeground(Color.BLACK);
        l12.setFont(new Font("Serif", Font.PLAIN, 24));
        l12.setVisible(true);
        p1.add(l12);
        l13.setText("Phone: 860-841-7377");
        l13.setBounds(205,330,300,30);
        l13.setForeground(Color.BLACK);
        l13.setFont(new Font("Serif", Font.PLAIN, 24));
        l13.setVisible(true);
        p1.add(l13);
        l14.setText("Email: patelp8@mail.sacredheart.edu");
        l14.setBounds(205,360,400,30);
        l14.setForeground(Color.BLACK);
        l14.setFont(new Font("Serif", Font.PLAIN, 24));
        l14.setVisible(true);
        p1.add(l14);

        l15.setText("Mohit Kumar Jaiswal");
        l15.setBounds(905,300,300,30);
        l15.setForeground(Color.BLACK);
        l15.setFont(new Font("Serif", Font.PLAIN, 24));
        l15.setVisible(true);
        p1.add(l15);
        l16.setText("Phone: 203-909-2941");
        l16.setBounds(905,330,300,30);
        l16.setForeground(Color.BLACK);
        l16.setFont(new Font("Serif", Font.PLAIN, 24));
        l16.setVisible(true);
        p1.add(l16);
        l17.setText("Email: jaiswalm@mail.sacredheart.edu");
        l17.setBounds(905,360,400,30);
        l17.setForeground(Color.BLACK);
        l17.setFont(new Font("Serif", Font.PLAIN, 24));
        l17.setVisible(true);
        p1.add(l17);
    
    
        p1.setBackground(Color.WHITE);
        p1.setBounds(50, 145, 1600, 700);
        p1.setVisible(true);
        this.add(p1);
    }//GEN-LAST:event_contactUs_buttonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        homebutton.doClick();
        infoPanel.removeAll();
        this.remove(infoPanel);
        Button b1=new Button("Lawyer");
        b1.setBackground(Color.WHITE);
        b1.setBounds(4,4,130,30);
        b1.setFont(new Font("Serif", Font.PLAIN, 16));
        b1.setForeground(Color.BLACK);
        b1.setVisible(true);
        p1.add(b1);
        Button b2=new Button("Data Admin");
        b2.setBounds(4,32,130,30);
        b2.setBackground(Color.WHITE);
        b2.setFont(new Font("Serif", Font.PLAIN, 16));
        b2.setForeground(Color.BLACK);
        b2.setVisible(true);
        p1.add(b2);
        p1.setBackground(Color.WHITE);
        p1.setBounds(110, 145, 140, 80);
        p1.setVisible(true);
        this.add(p1);
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            p1.removeAll();
            
            l1.setText("Lawyer Login");
            l1.setBounds(205,102,300,40);
            l1.setForeground(Color.BLACK);
            l1.setFont(new Font("Serif", Font.BOLD, 24));
            l1.setVisible(true);
            p1.add(l1);
            p1.setBounds(50,200,1100,600);
            p1.setBackground(Color.WHITE);
            p1.setVisible(true);
       

            l2.setText("Bar Number :");
            l2.setBounds(205,170,140,20);
            l2.setForeground(Color.BLACK);
            l2.setFont(new Font("Serif", Font.PLAIN, 18));
            l2.setVisible(true);
            p1.add(l2);
            TextField tb_uname=new TextField();
            tb_uname.setBounds(360, 165,220,30);
            tb_uname.setForeground(Color.BLACK);
            tb_uname.setFont(new Font("Serif", Font.PLAIN, 18));
            tb_uname.setVisible(true);
            p1.add(tb_uname);

            l3.setText("Password :");
            l3.setBounds(205,210,140,20);
            l3.setForeground(Color.BLACK);
            l3.setFont(new Font("Serif", Font.PLAIN, 18));
            l3.setVisible(true);
            p1.add(l3);
            JPasswordField login_pwd=new JPasswordField();
            login_pwd.setVisible(true);
            login_pwd.setBounds(360,205,220,30);
            p1.add(login_pwd);

            Button bLogin=new Button("Submit");
            bLogin.setBounds(360,265,100,30);
            bLogin.setForeground(Color.BLACK);
            bLogin.setBackground(Color.WHITE);
            bLogin.setVisible(true);
            p1.add(bLogin);
            Button bForgotPass=new Button("Forgot Password");
            bForgotPass.setBounds(460,265,130,30);
            bForgotPass.setBackground(Color.WHITE);
            bForgotPass.setForeground(Color.BLACK);
            bForgotPass.setVisible(true);
            p1.add(bForgotPass);
            
            
            //Navigation Bar 
            Button home=new Button("Home");
            home.setBounds(600,565,100,30);
            home.setForeground(Color.BLACK);
            home.setBackground(Color.WHITE);
            home.setVisible(true);
            p1.add(home);
             home.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                homebutton.doClick();
                }});
            Button back=new Button("Back");
            back.setBounds(700,565,100,30);
            back.setForeground(Color.BLACK);
            back.setBackground(Color.WHITE);
            back.setVisible(true);
            p1.add(back);
            back.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                homebutton.doClick();
                }});
            
            Button next=new Button("Next");
            next.setBounds(800,565,100,30);
            next.setForeground(Color.BLACK);
            next.setBackground(Color.WHITE);
            next.setVisible(true);
            p1.add(next);
            next.setEnabled(false);
            
            Button logout=new Button("Logout");
            logout.setBounds(900,565,100,30);
            logout.setForeground(Color.BLACK);
            logout.setBackground(Color.WHITE);
            logout.setVisible(true);
            p1.add(logout);
            logout.setEnabled(false);
            
            Button exit=new Button("Exit");
            exit.setBounds(1000,565,100,30);
            exit.setForeground(Color.BLACK);
            exit.setBackground(Color.WHITE);
            exit.setVisible(true);
            p1.add(exit);
            exit.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                System.exit(0);
                }});
            //end of Navigation


          bLogin.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                String txtusername= tb_uname.getText();
                char[] txtpassword=login_pwd.getPassword();
                String pass=new String(txtpassword); 
                    
                        
                    
                try {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    con=DriverManager.getConnection(connectionUrl);
                    String query = "Select Employee_ID,Password from Employee where BarNumber=?";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, txtusername);
                    rs=ps.executeQuery();
                    if(rs.next()){
                        if(pass.equals(rs.getString("Password"))){
                            luser.setSize(80,20);
                            luser.setFont(new Font("Serif", Font.BOLD, 24));
                            luser.setText("Welcome :"+txtusername+"!");
                            logPri=true;
                            lawyer_id=rs.getInt("Employee_ID");
                            registerButton.setEnabled(false);
                            loginButton.setEnabled(false);
                            admin=false;
                            
                        }else{
                            JOptionPane.showMessageDialog(null,"Login Failed! Invalid password!");
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"User does not exist! Enter valid Bar Number!");
                    }
                    
                } catch (SQLException ex) {
                    Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                        Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
                }
                

                }
          });
        bForgotPass.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            String txtusername= tb_uname.getText();
            try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con=DriverManager.getConnection(connectionUrl);
            String query = "Select S1.Security_Question as question1,E.Security_Answer1 as answer1,S2.Security_Question as question2,Security_Answer2 as answer2, E.Contact_ID as cid,E.Employee_ID as eid, C.Email as email From Employee E, SecurityQuestion1 S1,SecurityQuestion2 S2 ,Contact C where E.ActiveBit=1 and E.BarNumber=? and E.Contact_ID=C.Contact_ID and E.Security_Question_ID1=S1.Security_Question_ID and E.Security_Question_ID2=S2.Security_Question_ID;";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, txtusername);
            rs=ps.executeQuery();
            if(rs.next()){
               String ans= JOptionPane.showInputDialog(rs.getString("question1"));
               String ans1= JOptionPane.showInputDialog(rs.getString("question2"));
               if(ans.equals(rs.getString("answer1"))&&ans1.equals(rs.getString("answer2")))
               {
                    String toEmail=rs.getString("email");
                    System.out.println("To email"+toEmail);
                    JOptionPane.showMessageDialog(null, "Sucessfull!");
                    p1.removeAll();
                    int len=6;
                    String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                    String Small_chars = "abcdefghijklmnopqrstuvwxyz";
                    String numbers = "0123456789";
                    String values = Capital_chars + Small_chars +numbers;
                    Random random = new Random();
                    char[] tempP = new char[len];
                    for (int i = 0; i < len; i++)
                    {
                        tempP[i] =values.charAt(random.nextInt(values.length()));

                    }
                    String pass=new String(tempP);
                    int eid=rs.getInt("eid");
                    int cid=rs.getInt("cid");
                    String select1="Select * from Contact where Contact_ID=?";
                    String select2="Select * from Employee where Employee_ID=?";
                    PreparedStatement psS1 = con.prepareStatement(select1);
                    PreparedStatement psS2 = con.prepareStatement(select2);
                    psS1.setInt(1, cid);
                    psS2.setInt(1, eid);
                    ResultSet rsS1 ,rsS2;
                    rsS1=psS1.executeQuery();
                    rsS2=psS2.executeQuery();
                    if(rsS1.next()&&rsS2.next())
                    {
                        try{
                            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                            con=DriverManager.getConnection(connectionUrl);   
                            String query1 = "Update Contact Set Status = 'Delete' where Contact_ID=?;";
                            PreparedStatement ps1 = con.prepareStatement(query1);
                            ps1.setInt(1, cid);
                            if( ps1.executeUpdate()!=0){
                                String query2 = "Update Employee Set ActiveBit = 0,Password=? where Employee_ID=?;";
                                PreparedStatement ps2 = con.prepareStatement(query2);
                                ps2.setString(1, pass);
                                ps2.setInt(2, eid);
                                if( ps2.executeUpdate()!=0){
                                    String query3 = "Insert into Contact(Status,FirstName, LastName, DOB, Email, Phone, House, Street, City, State, Zip) values (?,?,?,?,?,?,?,?,?,?,?);";
                                    PreparedStatement ps3 = con.prepareStatement(query3);
                                    ps3.setString(1,"Change");
                                    ps3.setString(2, rsS1.getString("FirstName"));
                                    ps3.setString(3, rsS1.getString("LastName"));
                                    ps3.setString(4, rsS1.getString("DOB"));
                                    ps3.setString(5, rsS1.getString("Email"));
                                    ps3.setString(6, rsS1.getString("Phone"));
                                    ps3.setString(7, rsS1.getString("House"));
                                    ps3.setString(8, rsS1.getString("Street"));
                                    ps3.setString(9, rsS1.getString("City"));
                                    ps3.setString(10,rsS1.getString("State"));
                                    ps3.setString(11,rsS1.getString("Zip"));
                                    if( ps3.executeUpdate()!=0){
                                        String query4="Insert into Employee(Contact_ID,BarNumber,Password,UniquePassword,Security_Question_ID1,Security_Answer1,Security_Question_ID2,Security_Answer2, Designation,ActiveBit) values((select max(Contact_ID) from Contact),?,?,?,?,?,?,?,?,?);";
                                        PreparedStatement ps4 = con.prepareStatement(query4);
                                        ps4.setString(1, rsS2.getString("BarNumber"));
                                        ps4.setString(2, rsS2.getString("Password"));
                                        ps4.setString(3,rsS2.getString("UniquePassword"));
                                        ps4.setInt(4, rsS2.getInt("Security_Question_ID1"));
                                        ps4.setString(5, rsS2.getString("Security_Answer1"));
                                        ps4.setInt(6, rsS2.getInt("Security_Question_ID2"));
                                        ps4.setString(7, rsS2.getString("Security_Answer1"));
                                        ps4.setString(8, rsS2.getString("Designation"));
                                        ps4.setInt(9, 1);

                                        if( ps4.executeUpdate()!=0){
                                            JOptionPane.showMessageDialog(null, "An email has been sent with Temporary Password! Please login using it");
                                            
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
                    else{
                        
                    }
                    props.put("mail.smtp.starttls.enable", "true");
                    props.put("mail.smtp.auth", "true");
                    props.put("mail.smtp.host", "smtp.gmail.com");
                    props.put("mail.smtp.port", "587");
                    Session session = Session.getInstance(props, new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(eusername, epassword);
                    }
                  });
                try {
                    Message message = new MimeMessage(session);
                    message.setFrom(new InternetAddress("fmslshu2017@gmail.com"));
                    message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(toEmail));
                    message.setSubject("Temporary Reset Password for Financial Management System");
                    message.setText("Reset Password:"+pass);
                    Transport.send(message);
                    System.out.println("Done");
                }
                catch(MessagingException ex) {
                    throw new RuntimeException(ex);
                }
//                    l1.setText("Reset Password");
//                    l1.setBounds(5,2,300,40);
//                    l1.setForeground(Color.BLACK);
//                    l1.setFont(new Font("Serif", Font.BOLD, 24));
//                    l1.setVisible(true);
//                    p1.add(l1);
//                    p1.setBounds(420,300,480,200);
//                    p1.setBackground(Color.WHITE);
//                    p1.setVisible(true);
//                    l2.setText("Change Password :");
//                    l2.setBounds(5,70,140,20);
//                    l2.setForeground(Color.BLACK);
//                    l2.setFont(new Font("Serif", Font.PLAIN, 18));
//                    l2.setVisible(true);
//                    p1.add(l2);
//                    JPasswordField login_pwd=new JPasswordField();
//                    login_pwd.setVisible(true);
//                    login_pwd.setBounds(160, 65,220,30);
//                    p1.add(login_pwd);
//
//                    l3.setText("Re-enter Password :");
//                    l3.setBounds(5,110,150,20);
//                    l3.setForeground(Color.BLACK);
//                    l3.setFont(new Font("Serif", Font.PLAIN, 18));
//                    l3.setVisible(true);
//                    p1.add(l3);
//
//                    JPasswordField login_pwd1=new JPasswordField();
//                    login_pwd1.setVisible(true);
//                    login_pwd1.setBounds(160,105,220,30);
//                    p1.add(login_pwd1);
//
//                    Button bSave=new Button("Save");
//                    bSave.setBounds(160,165,100,30);
//                    bSave.setForeground(Color.BLACK);
//                    bSave.setBackground(Color.WHITE);
//                    bSave.setVisible(true);
//                    p1.add(bSave);
//
//                    bSave.addActionListener(new ActionListener(){
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//
//                    char[] txtpassword=login_pwd.getPassword();
//                    String pass=new String(txtpassword);
//                    char[] txtpassword1=login_pwd1.getPassword();
//                    String pass1=new String(txtpassword1);
//                    if(pass.equals(pass1)){
//
//                        try {
//                            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//                            con=DriverManager.getConnection(connectionUrl);
//                            String query = "Select Employee_ID from Employee E, Contact C where E.Username=? and C.Phone=? and E.Contact_ID=C.Contact_ID";
//                            String query1="Update Employee set Password=? where  Username=? and Employee_ID=?";
//                            PreparedStatement ps = con.prepareStatement(query);
//                            ps.setString(1, txtusername);
//                            ps.setString(2, phone);
//                            rs=ps.executeQuery();
//                            if(rs.next()){
//                                int empID=rs.getInt("Employee_ID");
//                                PreparedStatement ps1 = con.prepareStatement(query1);
//                                ps1.setString(1, pass);
//                                ps1.setString(2,txtusername );
//                                ps1.setInt(3,empID );
//                                if(ps1.executeUpdate()!=0){
//                                    JOptionPane.showMessageDialog(null,"Password updated! Now you can Login!");
//                                    homebutton.doClick();
//                                }
//                                else
//                                    JOptionPane.showMessageDialog(null,"Password update failed!!");
//                            }
//                            else{
//                                JOptionPane.showMessageDialog(null,"User does not exist! Enter valid username!");
//                            }
//                            }
//                            catch (SQLException ex) {
//                                Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//                            catch (ClassNotFoundException ex) {
//                                Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//
//                            }
//                    }});
                   
                    
                    
                    
                    
//                    l1.setText("Reset Password");
//                    l1.setBounds(5,2,300,40);
//                    l1.setForeground(Color.BLACK);
//                    l1.setFont(new Font("Serif", Font.BOLD, 24));
//                    l1.setVisible(true);
//                    p1.add(l1);
//                    p1.setBounds(420,300,480,200);
//                    p1.setBackground(Color.WHITE);
//                    p1.setVisible(true);
//                    l2.setText("Change Password :");
//                    l2.setBounds(5,70,140,20);
//                    l2.setForeground(Color.BLACK);
//                    l2.setFont(new Font("Serif", Font.PLAIN, 18));
//                    l2.setVisible(true);
//                    p1.add(l2);
//                    JPasswordField login_pwd=new JPasswordField();
//                    login_pwd.setVisible(true);
//                    login_pwd.setBounds(160, 65,220,30);
//                    p1.add(login_pwd);
//
//                    l3.setText("Re-enter Password :");
//                    l3.setBounds(5,110,150,20);
//                    l3.setForeground(Color.BLACK);
//                    l3.setFont(new Font("Serif", Font.PLAIN, 18));
//                    l3.setVisible(true);
//                    p1.add(l3);
//
//                    JPasswordField login_pwd1=new JPasswordField();
//                    login_pwd1.setVisible(true);
//                    login_pwd1.setBounds(160,105,220,30);
//                    p1.add(login_pwd1);
//
//                    Button bSave=new Button("Save");
//                    bSave.setBounds(160,165,100,30);
//                    bSave.setForeground(Color.BLACK);
//                    bSave.setBackground(Color.WHITE);
//                    bSave.setVisible(true);
//                    p1.add(bSave);
//
//                    bSave.addActionListener(new ActionListener(){
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//
//                    char[] txtpassword=login_pwd.getPassword();
//                    String pass=new String(txtpassword);
//                    char[] txtpassword1=login_pwd1.getPassword();
//                    String pass1=new String(txtpassword1);
//                    if(pass.equals(pass1)){
//
//                        try {
//                            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//                            con=DriverManager.getConnection(connectionUrl);
//                            String query = "Select Employee_ID from Employee E, Contact C where E.Username=? and C.Phone=? and E.Contact_ID=C.Contact_ID";
//                            String query1="Update Employee set Password=? where  Username=? and Employee_ID=?";
//                            PreparedStatement ps = con.prepareStatement(query);
//                            ps.setString(1, txtusername);
//                            ps.setString(2, phone);
//                            rs=ps.executeQuery();
//                            if(rs.next()){
//                                int empID=rs.getInt("Employee_ID");
//                                PreparedStatement ps1 = con.prepareStatement(query1);
//                                ps1.setString(1, pass);
//                                ps1.setString(2,txtusername );
//                                ps1.setInt(3,empID );
//                                if(ps1.executeUpdate()!=0){
//                                    JOptionPane.showMessageDialog(null,"Password updated! Now you can Login!");
//                                    homebutton.doClick();
//                                }
//                                else
//                                    JOptionPane.showMessageDialog(null,"Password update failed!!");
//                            }
//                            else{
//                                JOptionPane.showMessageDialog(null,"User does not exist! Enter valid username!");
//                            }
//                            }
//                            catch (SQLException ex) {
//                                Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
//                            } 
//                            catch (ClassNotFoundException ex) {
//                                Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//
//                            }
//                    }});    
              
               }
               else 
               {
                    JOptionPane.showMessageDialog(null, "Answers Failed!");
               } 
            }
            else{
                JOptionPane.showMessageDialog(null,"Record not found!");

            }
            } 
            catch (SQLException ex) {
                Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                        Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        });
            }});
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            p1.removeAll();
            
            l1.setText("Admin Login");
            l1.setBounds(205,102,300,40);
            l1.setForeground(Color.BLACK);
            l1.setFont(new Font("Serif", Font.BOLD, 24));
            l1.setVisible(true);
            p1.add(l1);
            p1.setBounds(50,200,1200,600);
            p1.setBackground(Color.WHITE);
            p1.setVisible(true);
       

            l2.setText("User ID :");
            l2.setBounds(205,170,140,20);
            l2.setForeground(Color.BLACK);
            l2.setFont(new Font("Serif", Font.PLAIN, 18));
            l2.setVisible(true);
            p1.add(l2);
            TextField tb_uname=new TextField();
            tb_uname.setBounds(360, 165,220,30);
            tb_uname.setForeground(Color.BLACK);
            tb_uname.setFont(new Font("Serif", Font.PLAIN, 18));
            tb_uname.setVisible(true);
            p1.add(tb_uname);

            l3.setText("Password :");
            l3.setBounds(205,210,140,20);
            l3.setForeground(Color.BLACK);
            l3.setFont(new Font("Serif", Font.PLAIN, 18));
            l3.setVisible(true);
            p1.add(l3);
            JPasswordField login_pwd=new JPasswordField();
            login_pwd.setVisible(true);
            login_pwd.setBounds(360,205,220,30);
            p1.add(login_pwd);
            
            l4.setText("Unique Password :");
            l4.setBounds(205,250,140,20);
            l4.setForeground(Color.BLACK);
            l4.setFont(new Font("Serif", Font.PLAIN, 18));
            l4.setVisible(true);
            p1.add(l4);
            JPasswordField ad_pwd=new JPasswordField();
            ad_pwd.setVisible(true);
            ad_pwd.setBounds(360,245,220,30);
            p1.add(ad_pwd);

            Button bLogin=new Button("Login");
            bLogin.setBounds(360,300,100,30);
            bLogin.setForeground(Color.BLACK);
            bLogin.setBackground(Color.WHITE);
            bLogin.setVisible(true);
            p1.add(bLogin);
            Button bForgotPass=new Button("Forgot Password");
            bForgotPass.setBounds(460,300,130,30);
            bForgotPass.setForeground(Color.BLACK);
            bForgotPass.setBackground(Color.WHITE);
            bForgotPass.setVisible(true);
            p1.add(bForgotPass);

            
            
            //Navigation Bar 
            Button home=new Button("Home");
            home.setBounds(600,565,100,30);
            home.setForeground(Color.BLACK);
            home.setBackground(Color.WHITE);
            home.setVisible(true);
            p1.add(home);
             home.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                homebutton.doClick();
                }});
            Button back=new Button("Back");
            back.setBounds(700,565,100,30);
            back.setForeground(Color.BLACK);
            back.setBackground(Color.WHITE);
            back.setVisible(true);
            p1.add(back);
            back.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                homebutton.doClick();
                }});
            Button next=new Button("Next");
            next.setBounds(800,565,100,30);
            next.setForeground(Color.BLACK);
            next.setBackground(Color.WHITE);
            next.setVisible(true);
            p1.add(next);
            next.setEnabled(false);
            
            Button logout=new Button("Logout");
            logout.setBounds(900,565,100,30);
            logout.setForeground(Color.BLACK);
            logout.setBackground(Color.WHITE);
            logout.setVisible(true);
            p1.add(logout);
            logout.setEnabled(false);
            
            Button exit=new Button("Exit");
            exit.setBounds(1000,565,100,30);
            exit.setForeground(Color.BLACK);
            exit.setBackground(Color.WHITE);
            exit.setVisible(true);
            p1.add(exit);
            exit.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                System.exit(0);
                }});
            //end of Navigation



          bLogin.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {

            // Connect to Database and check if the userid and passwords match

                String txtusername= tb_uname.getText();
                char[] txtpassword=login_pwd.getPassword();
                String pass=new String(txtpassword);
                char[] ap=ad_pwd.getPassword();
                String adminpass=new String(ap);

                try {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    con=DriverManager.getConnection(connectionUrl);
                    String query = "Select Employee_ID,Password,UniquePassword from Employee where BarNumber=? and Password=?";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, txtusername);
                    ps.setString(2, pass);
                    rs=ps.executeQuery();
                    if(rs.next()){
                        if(pass.equals(rs.getString("Password"))){
                            if(adminpass.equals(rs.getString("UniquePassword")))
                            {
                            //set user name and give access
                            luser.setSize(80,20);
                            luser.setFont(new Font("Serif", Font.BOLD, 24));
                            luser.setText("Welcome :"+txtusername+"!");
                            logPri=true;
                            lawyer_id=rs.getInt("Employee_ID");
                            registerButton.setEnabled(false);
                            loginButton.setEnabled(false);
                            admin=true;
                           
                            }
                            else{
                                 JOptionPane.showMessageDialog(null,"Invalid admin password!");
                            }
                            
                        }else{
                            JOptionPane.showMessageDialog(null,"Login Fail! Invalid password!");
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"User does not exist! Enter valid username!");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
                }

                }
          });
        bForgotPass.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            String txtusername= tb_uname.getText();
            String phone= JOptionPane.showInputDialog("Enter your phone number:");
            boolean flag;
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection(connectionUrl);
                String query = "Select S1.Security_Question as question1,E.Security_Answer1 as answer1,S2.Security_Question as question2,Security_Answer2 as answer2, E.Contact_ID From Employee E, SecurityQuestion1 S1,SecurityQuestion2 S2 ,Contact C where E.Username=? and C.Phone=? and E.Contact_ID=C.Contact_ID and E.Security_Question_ID1=S1.Security_Question_ID and E.Security_Question_ID2=S2.Security_Question_ID;";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1, txtusername);
                ps.setString(2, phone);
                rs=ps.executeQuery();
                if(rs.next()){
                   String ans= JOptionPane.showInputDialog(rs.getString("question1"));
                   if(ans.equals(rs.getString("answer1")))

                       flag=true;

                   else 
                   {
                        String ans1= JOptionPane.showInputDialog(rs.getString("question2"));
                        if(ans1.equals(rs.getString("answer2")))
                        {
                            flag=true;
                        }
                        else{
                            flag=false;
                        }


                   }
                   if(flag==true){
                        JOptionPane.showMessageDialog(null, "Sucessfull!");
                        p1.removeAll();
                        l1.setText("Reset Password");
                        l1.setBounds(5,2,300,40);
                        l1.setForeground(Color.BLACK);
                        l1.setFont(new Font("Serif", Font.BOLD, 24));
                        l1.setVisible(true);
                        p1.add(l1);
                        p1.setBounds(420,300,480,200);
                        p1.setBackground(Color.WHITE);
                        p1.setVisible(true);
                        l2.setText("Change Password :");
                        l2.setBounds(5,70,140,20);
                        l2.setForeground(Color.BLACK);
                        l2.setFont(new Font("Serif", Font.PLAIN, 18));
                        l2.setVisible(true);
                        p1.add(l2);
                        JPasswordField login_pwd=new JPasswordField();
                        login_pwd.setVisible(true);
                        login_pwd.setBounds(160, 65,220,30);
                        p1.add(login_pwd);

                        l3.setText("Re-enter Password :");
                        l3.setBounds(5,110,150,20);
                        l3.setForeground(Color.BLACK);
                        l3.setFont(new Font("Serif", Font.PLAIN, 18));
                        l3.setVisible(true);
                        p1.add(l3);

                        JPasswordField login_pwd1=new JPasswordField();
                        login_pwd1.setVisible(true);
                        login_pwd1.setBounds(160,105,220,30);
                        p1.add(login_pwd1);

                        Button bSave=new Button("Save");
                        bSave.setBounds(160,165,100,30);
                        bSave.setBackground(Color.WHITE);
                        bSave.setForeground(Color.BLACK);
                        bSave.setVisible(true);
                        p1.add(bSave);

                        bSave.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent e) {

                        char[] txtpassword=login_pwd.getPassword();
                        String pass=new String(txtpassword);
                        char[] txtpassword1=login_pwd1.getPassword();
                        String pass1=new String(txtpassword1);
                        if(pass.equals(pass1)){

                            try {
                                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                                con=DriverManager.getConnection(connectionUrl);
                                String query = "Select Employee_ID from Employee E, Contact C where E.Username=? and C.Phone=? and E.Contact_ID=C.Contact_ID";
                                String query1="Update Employee set Password=? where  Username=? and Employee_ID=?";
                                PreparedStatement ps = con.prepareStatement(query);
                                ps.setString(1, txtusername);
                                ps.setString(2, phone);
                                rs=ps.executeQuery();
                                if(rs.next()){
                                    int empID=rs.getInt("Employee_ID");
                                    PreparedStatement ps1 = con.prepareStatement(query1);
                                    ps1.setString(1, pass);
                                    ps1.setString(2,txtusername );
                                    ps1.setInt(3,empID );
                                    if(ps1.executeUpdate()!=0){
                                        JOptionPane.showMessageDialog(null,"Password updated! Now you can Login!");
                                        homebutton.doClick();
                                    }
                                    else
                                        JOptionPane.showMessageDialog(null,"Password update failed!!");
                                }
                                else{
                                    JOptionPane.showMessageDialog(null,"User does not exist! Enter valid username!");
                                }
                                }
                                catch (SQLException ex) {
                                    Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (ClassNotFoundException ex) {
                                    Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
                                }

                                }
                        }});
                   }
                   else{
                       JOptionPane.showMessageDialog(null, "Answers Failed!");

                   }

                    }
                else{
                    JOptionPane.showMessageDialog(null,"Access Denied!Contact admin!");

                }
            } catch (SQLException ex) {
                Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        });
    }});
        
   
        
    this.add(p1);

    }//GEN-LAST:event_loginButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        infoPanel.removeAll();
        this.remove(infoPanel);
        p1.removeAll();
        this.remove(p1);
        if(logPri==false){
            Button b1=new Button("Lawyer");
            b1.setBounds(4,4,130,30);
            b1.setBackground(Color.WHITE);
            b1.setFont(new Font("Serif", Font.PLAIN, 16));
            b1.setForeground(Color.BLACK);
            b1.setVisible(true);
            p1.add(b1);
            Button b2=new Button("Data Admin");
            b2.setBounds(4,32,130,30);
            b2.setBackground(Color.WHITE);
            b2.setFont(new Font("Serif", Font.PLAIN, 16));
            b2.setForeground(Color.BLACK);
            b2.setVisible(true);
            p1.add(b2);
            p1.setBackground(Color.WHITE);
            p1.setBounds(259, 145, 140, 80);
            p1.setVisible(true);
            this.add(p1);
        
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) { 
                p1.removeAll();
                desig="Lawyer";
                backbutton.setEnabled(false);
                nextbutton.setEnabled(false);
                l1.setText("Register");
                l1.setBounds(5,2,100,40);
                l1.setForeground(Color.BLACK);
                l1.setFont(new Font("Serif", Font.BOLD, 24));
                l1.setVisible(true);
                p1.add(l1);
                p1.setBounds(20,165,1300,840);
                p1.setBackground(Color.WHITE);
                p1.setVisible(true);
                Label l20=new Label();
                l20.setText("all fields are mandatory");
                l20.setBounds(105,2,300,40);
                l20.setForeground(Color.BLACK);
                l20.setFont(new Font("Serif", Font.BOLD, 14));
                l20.setVisible(true);
                p1.add(l20);
                l2.setText("Bar Number :");
                l2.setBounds(5,50,140,20);
                l2.setForeground(Color.BLACK);
                l2.setFont(new Font("Serif", Font.PLAIN, 18));
                l2.setVisible(true);
                p1.add(l2);
                TextField tb_uname=new TextField();
                tb_uname.setBounds(180, 45,210,30);
                tb_uname.setForeground(Color.BLACK);
                tb_uname.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_uname.setName("login_uname");
                tb_uname.setVisible(true);
                p1.add(tb_uname);

                l3.setText("Password :");
                l3.setBounds(5,90,140,20);
                l3.setForeground(Color.BLACK);
                l3.setFont(new Font("Serif", Font.PLAIN, 18));
                l3.setVisible(true);
                p1.add(l3);
                JPasswordField login_pwd=new JPasswordField();
                login_pwd.setVisible(true);
                login_pwd.setBounds(180,85,210,30);
                p1.add(login_pwd);

                l4.setText("Confirm Password :");
                l4.setBounds(575,90,160,20);
                l4.setForeground(Color.BLACK);
                l4.setFont(new Font("Serif", Font.PLAIN, 18));
                l4.setVisible(true);
                p1.add(l4);
                JPasswordField conf_pwd=new JPasswordField();
                conf_pwd.setVisible(true);
                conf_pwd.setBounds(750,85,210,30);
                p1.add(conf_pwd);

                l5.setText("First Name :");
                l5.setBounds(5,130,160,20);
                l5.setForeground(Color.BLACK);
                l5.setFont(new Font("Serif", Font.PLAIN, 18));
                l5.setVisible(true);
                p1.add(l5);
                TextField tb_fname=new TextField();
                tb_fname.setBounds(180,125,210,30);
                tb_fname.setForeground(Color.BLACK);
                tb_fname.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_fname.setVisible(true);
                p1.add(tb_fname);

                l6.setText("Last Name :");
                l6.setBounds(575,130,160,20);
                l6.setForeground(Color.BLACK);
                l6.setFont(new Font("Serif", Font.PLAIN, 18));
                l6.setVisible(true);
                p1.add(l6);
                TextField tb_lname=new TextField();
                tb_lname.setBounds(750,125,210,30);
                tb_lname.setForeground(Color.BLACK);
                tb_lname.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_lname.setName("fname");
                tb_lname.setVisible(true);
                p1.add(tb_lname);

                l7.setText("Date of Birth :");
                l7.setBounds(5,173,160,20);
                l7.setForeground(Color.BLACK);
                l7.setFont(new Font("Serif", Font.PLAIN, 18));
                l7.setVisible(true);
                p1.add(l7);
                TextField tb_dob=new TextField("yyyy-mm-dd");
                tb_dob.setBounds(180,168,210,30);
                tb_dob.setForeground(Color.LIGHT_GRAY);
                tb_dob.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_dob.setVisible(true);
                p1.add(tb_dob);
                tb_dob.addFocusListener(new FocusListener(){
                    public void focusGained(FocusEvent e){
                        tb_dob.setText("");
                        tb_dob.setForeground(Color.BLACK);
                        tb_dob.setFont(new Font("Serif", Font.PLAIN, 18));
                    }
                    public void focusLost(FocusEvent e){

                    }
                });
                Label el=new Label();
                el.setText("Email :");
                el.setBounds(5,216,160,20);
                el.setForeground(Color.BLACK);
                el.setFont(new Font("Serif", Font.PLAIN, 18));
                el.setVisible(true);
                p1.add(el);
                TextField tb_email=new TextField();
                tb_email.setBounds(180,211,210,30);
                tb_email.setForeground(Color.BLACK);
                tb_email.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_email.setVisible(true);
                p1.add(tb_email);


                l9.setText("Phone :");
                l9.setBounds(5,259,160,20);
                l9.setForeground(Color.BLACK);
                l9.setFont(new Font("Serif", Font.PLAIN, 18));
                l9.setVisible(true);
                p1.add(l9);
                TextField tb_phone=new TextField("9999999999");
                tb_phone.setBounds(180,254,210,30);
                tb_phone.setForeground(Color.LIGHT_GRAY);
                tb_phone.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_phone.setVisible(true);
                p1.add(tb_phone);
                tb_phone.addFocusListener(new FocusListener(){
                    public void focusGained(FocusEvent e){
                        tb_phone.setText("");
                        tb_phone.setForeground(Color.BLACK);
                        tb_phone.setFont(new Font("Serif", Font.PLAIN, 18));
                    }
                    public void focusLost(FocusEvent e){

                    }
                });
        
        
                l8.setText("Address :");
                l8.setBounds(5,302,160,20);
                l8.setForeground(Color.BLACK);
                l8.setFont(new Font("Serif", Font.PLAIN, 18));
                l8.setVisible(true);
                p1.add(l8);
                TextField tb_house=new TextField("House or Apartment No.");
                tb_house.setBounds(180,297,210,30);
                tb_house.setForeground(Color.LIGHT_GRAY);
                tb_house.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_house.setName("street");
                tb_house.setVisible(true);
                tb_house.addFocusListener(new FocusListener(){
                    public void focusGained(FocusEvent e){
                        tb_house.setText("");
                        tb_house.setForeground(Color.BLACK);
                        tb_house.setFont(new Font("Serif", Font.PLAIN, 18));
                    }
                    public void focusLost(FocusEvent e){

                    }
                });
                p1.add(tb_house);
                TextField tb_street=new TextField("Street");
                tb_street.setBounds(180,340,210,30);
                tb_street.setForeground(Color.LIGHT_GRAY);
                tb_street.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_street.setName("street");
                tb_street.setVisible(true);
                tb_street.addFocusListener(new FocusListener(){
                    public void focusGained(FocusEvent e){
                        tb_street.setText("");
                        tb_street.setForeground(Color.BLACK);
                        tb_street.setFont(new Font("Serif", Font.PLAIN, 18));
                    }
                    public void focusLost(FocusEvent e){

                    }
                });
                p1.add(tb_street);

                TextField tb_city=new TextField("City");
                tb_city.setBounds(180, 383,210,30);
                tb_city.setForeground(Color.LIGHT_GRAY);
                tb_city.setFont(new Font("Serif", Font.ITALIC, 18));
                tb_city.setName("Address_tb4");
                tb_city.setVisible(true);

                tb_city.addFocusListener(new FocusListener(){
                    public void focusGained(FocusEvent e){
                        tb_city.setText("");
                        tb_city.setForeground(Color.BLACK);
                        tb_city.setFont(new Font("Serif", Font.PLAIN, 18));
                    }
                    public void focusLost(FocusEvent e){

                    }
                });
                p1.add(tb_city);
        
                TextField tb_state=new TextField("State");
                tb_state.setBounds(180, 426,210,30);
                tb_state.setForeground(Color.LIGHT_GRAY);
                tb_state.setFont(new Font("Serif", Font.ITALIC, 18));
                tb_state.setName("Address_tb4");
                tb_state.setVisible(true);

                tb_state.addFocusListener(new FocusListener(){
                    public void focusGained(FocusEvent e){
                        tb_state.setText("");
                        tb_state.setForeground(Color.BLACK);
                        tb_state.setFont(new Font("Serif", Font.PLAIN, 18));
                    }
                    public void focusLost(FocusEvent e){

                    }
                });
                p1.add(tb_state);
        
                TextField tb_zip=new TextField("Zip");
                tb_zip.setBounds(180, 470,210,30);
                tb_zip.setForeground(Color.LIGHT_GRAY);
                tb_zip.setFont(new Font("Serif", Font.ITALIC, 18));
                tb_zip.setName("Address_tb4");
                tb_zip.setVisible(true);

                tb_zip.addFocusListener(new FocusListener(){
                    public void focusGained(FocusEvent e){
                        tb_zip.setText("");
                        tb_zip.setForeground(Color.BLACK);
                        tb_zip.setFont(new Font("Serif", Font.PLAIN, 18));
                    }
                    public void focusLost(FocusEvent e){

                    }
                });
                p1.add(tb_zip);
                l10.setText("Security Question1 :");
                l10.setBounds(5,516,160,20);
                l10.setForeground(Color.BLACK);
                l10.setFont(new Font("Serif", Font.PLAIN, 18));
                l10.setVisible(true);
                p1.add(l10);
                String[] selections = { "What was your childhood nick name?", "What is the name of your favorite childhood friend?", "In what city did your mother and father meet?", "What is your favorite team?","What is your favorite movie?" };
                JList list = new JList(selections);
                list.setFont(new Font("Serif", Font.ITALIC, 14));
                list.setSelectedIndex(0);
                JScrollPane js=new JScrollPane(list);
                js.setBounds(180, 514, 350, 40);
                js.setVisible(true);
                p1.add(js);

        
                l11.setText("Answer1 :");
                l11.setBounds(575,516,160,20);
                l11.setForeground(Color.BLACK);
                l11.setFont(new Font("Serif", Font.PLAIN, 18));
                l11.setVisible(true);
                p1.add(l11);
                TextField tb_ans=new TextField();
                tb_ans.setBounds(750,514,210,30);
                tb_ans.setForeground(Color.BLACK);
                tb_ans.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_ans.setName("phone");
                tb_ans.setVisible(true);
                p1.add(tb_ans);

                Label sq2=new Label();
                sq2.setText("Security Question2 :");
                sq2.setBounds(5,577,160,20);
                sq2.setForeground(Color.BLACK);
                sq2.setFont(new Font("Serif", Font.PLAIN, 18));
                sq2.setVisible(true);
                p1.add(sq2);
                String[] selections2 = { "What was your favorite food as a child?","What was the make of your first car?","What school did you attend for sixth grade?","In what town was your first job?","Who was your first employer?" };
                JList list1 = new JList(selections2);
                list1.setFont(new Font("Serif", Font.ITALIC, 14));
                list1.setSelectedIndex(0);
                JScrollPane js1=new JScrollPane(list1);
                js1.setBounds(180, 562, 350, 40);
                js1.setVisible(true);
                p1.add(js1);
       
                Label an1=new Label();
                an1.setText("Answer2 :");
                an1.setBounds(575,577,160,20);
                an1.setForeground(Color.BLACK);
                an1.setFont(new Font("Serif", Font.PLAIN, 18));
                an1.setVisible(true);
                p1.add(an1);
                TextField tb_ans1=new TextField();
                tb_ans1.setBounds(750,572,210,30);
                tb_ans1.setForeground(Color.BLACK);
                tb_ans1.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_ans1.setName("phone");
                tb_ans1.setVisible(true);
                p1.add(tb_ans1);
                Button bReg=new Button("Submit");
                bReg.setFont(new Font("Serif", Font.PLAIN, 18));
                bReg.setBounds(750,670,210,40);
                bReg.setForeground(Color.BLACK);
                bReg.setBackground(Color.WHITE);
                bReg.setVisible(true);
                p1.add(bReg);
                
                
            //Navigation Bar 
            Button home=new Button("Home");
            home.setBounds(600,730,100,30);
            home.setForeground(Color.BLACK);
            home.setBackground(Color.WHITE);
            home.setVisible(true);
            p1.add(home);
             home.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                homebutton.doClick();
                }});
            Button back=new Button("Back");
            back.setBounds(700,730,100,30);
            back.setForeground(Color.BLACK);
            back.setBackground(Color.WHITE);
            back.setVisible(true);
            p1.add(back);
            back.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                homebutton.doClick();
                }});
            
            Button next=new Button("Next");
            next.setBounds(800,730,100,30);
            next.setForeground(Color.BLACK);
            next.setBackground(Color.WHITE);
            next.setVisible(true);
            p1.add(next);
            next.setEnabled(false);
            
            Button logout=new Button("Logout");
            logout.setBounds(900,730,100,30);
            logout.setForeground(Color.BLACK);
            logout.setBackground(Color.WHITE);
            logout.setVisible(true);
            p1.add(logout);
            logout.setEnabled(false);
            
            Button exit=new Button("Exit");
            exit.setBounds(1000,730,100,30);
            exit.setForeground(Color.BLACK);
            exit.setBackground(Color.WHITE);
            exit.setVisible(true);
            p1.add(exit);
            exit.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                System.exit(0);
                }});
            //end of Navigation


                
            bReg.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) { 
            char[] pass1=login_pwd.getPassword();
            String p11=new String(pass1);
            char[] pass2=conf_pwd.getPassword();
            String p21=new String(pass2);
            String secA=tb_ans.getText();
            //validations start
            if(tb_uname.getText().length()>1)
            {
                p1.remove(l12);
                if(tb_fname.getText().matches(regexName))
                {
                    p1.remove(l12);
                    if(tb_lname.getText().matches(regexName))
                    {   p1.remove(l12);
                    if(tb_email.getText().matches(regexEmail))
                    {
                        p1.remove(l12);
                        if(tb_phone.getText().matches(regexPhone)||tb_phone.getText().equals("9999999999"))
                        {
                            p1.remove(l12);
                            if(tb_house.getText().length()>1&& tb_street.getText().length()>1&& tb_city.getText().length()>1&&tb_state.getText().length()>1&& tb_city.getText().matches(regexName)&&tb_state.getText().matches(regexName))
                            { p1.remove(l12);
                                if(tb_zip.getText().matches(regexZip))
                                {
                                    p1.remove(l12);
                                    if(p11.equals(p21))
                                    {
                                        p1.remove(l12);
                                        
                                            if(secA.length()>1)
                                            {
                                                regFlag=true;
                                                
                                            } //end of if for Security Question1 
                                            else
                                            {
                                               regFlag=false;

                                                l12.setText("Answer required!");
                                                l12.setBounds(970,516,140,30);
                                                l12.setForeground(Color.RED);
                                                l12.setFont(new Font("Serif", Font.PLAIN, 14));
                                                l12.setVisible(true);
                                                p1.add(l12);

                                            }  //end of else for Security Question1
                                    
                                    }//end of if for Passwords
                                    else{
                                        regFlag=false;
                                        l12.setText("Passwords mismatch");
                                        l12.setBounds(970,80,140,30);
                                        l12.setForeground(Color.RED);
                                        l12.setFont(new Font("Serif", Font.PLAIN, 14));
                                        l12.setVisible(true);
                                        p1.add(l12);
                                    }//end of else for Passwords
                                }//end of if for Zip
                                else{
                                    regFlag=false;
                                    l12.setText("Invalid Zip");
                                    l12.setBounds(400,470,140,30);
                                    l12.setForeground(Color.RED);
                                    l12.setFont(new Font("Serif", Font.PLAIN, 14));
                                    l12.setVisible(true);
                                    p1.add(l12);
                                }//end of else for Zip
                            } //end of if for Address
                            else{
                                regFlag=false;
                                    l12.setText("Address");
                                    l12.setBounds(400,302,140,30);
                                    l12.setForeground(Color.RED);
                                    l12.setFont(new Font("Serif", Font.PLAIN, 14));
                                    l12.setVisible(true);
                                    p1.add(l12);
                            }//end of else for Address
                            
                            }//end of if for Phone
                            else{ 
                                regFlag=false; 
                                l12.setText("Invalid Phone number");
                                l12.setBounds(400,259,140,30);
                                l12.setForeground(Color.RED);
                                l12.setFont(new Font("Serif", Font.PLAIN, 14));
                                l12.setVisible(true);
                                p1.add(l12);
                            }//end of else for Phone
                            }//end of if for Email
                            else{
                                l12.setText("Invaild Email!");
                                l12.setBounds(400,216,140,30);
                                l12.setForeground(Color.RED);
                                l12.setFont(new Font("Serif", Font.PLAIN, 14));
                                l12.setVisible(true);
                                p1.add(l12);
                            }//end of else for Email
                        }//end of if for Last Name
                        else{
                            regFlag=false; 
                            l12.setText("Invalid Last name");
                            l12.setBounds(970,120,140,30);
                            l12.setForeground(Color.RED);
                            l12.setFont(new Font("Serif", Font.PLAIN, 14));
                            l12.setVisible(true);
                            p1.add(l12);
                         }//end of else for Last Name
                    }//end of if for First Name
                    else{
                    regFlag=false; 
                    l12.setText("Invalid First name");
                    l12.setBounds(970,120,140,30);
                    l12.setForeground(Color.RED);
                    l12.setFont(new Font("Serif", Font.PLAIN, 14));
                    l12.setVisible(true);
                    p1.add(l12);
                    } //end of else for First Name
                }
                else{
                    regFlag=false; 
                    l12.setText("Invalid Bar Number");
                    l12.setBounds(400,50,140,30);
                    l12.setForeground(Color.RED);
                    l12.setFont(new Font("Serif", Font.PLAIN, 14));
                    l12.setVisible(true);
                    p1.add(l12);
                }
                
                
            if(regFlag==true){
                //fetch textbox values for query
                uname=tb_uname.getText();
                char[] txtpassword=login_pwd.getPassword();
                passwd=new String(txtpassword);
                fname=tb_fname.getText();
                lname=tb_lname.getText();
                dob=tb_dob.getText();
                phone=tb_phone.getText();
                stAddr=tb_street.getText();
                ctAddr=tb_city.getText();
                state=tb_state.getText();
                zip=tb_zip.getText();
                secQ1=1+list.getSelectedIndex();
                secAns1=tb_ans.getText();
                secQ2=1+list1.getSelectedIndex();
                secAns2=tb_ans1.getText();
                email=tb_email.getText();
                house=tb_house.getText();
            //database connection and query   
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection(connectionUrl);
                String sqlQ = "Select count(*) as cnt from Employee where BarNumber=? and ActiveBit=1";
                String sqlInsertContact, sqlInsertEmp;
                PreparedStatement ps = con.prepareStatement(sqlQ);
                ps.setString(1, uname);
               
                rs=ps.executeQuery();
                if(rs.next()){
                    
                    
                    if("0".equals(rs.getString("cnt"))){
                        
                        //Inserting in Contact table
                        sqlInsertContact="Insert into Contact(Status,FirstName, LastName, DOB, Email, Phone, House, Street, City, State, Zip) values (?,?,?,?,?,?,?,?,?,?,?);";
                        PreparedStatement psIC = con.prepareStatement(sqlInsertContact);
                        psIC.setString(1,"New");
                        psIC.setString(2, fname);
                        psIC.setString(3, lname);
                        psIC.setString(4, dob);
                        psIC.setString(5, email);
                        psIC.setString(6, phone);
                        psIC.setString(7, house);
                        psIC.setString(8, stAddr);
                        psIC.setString(9, ctAddr);
                        psIC.setString(10, state);
                        psIC.setString(11, zip);
                     
                       if( psIC.executeUpdate()!=0)
                       {
                        sqlInsertEmp="Insert into Employee(Contact_ID,BarNumber,Password,UniquePassword,Security_Question_ID1,Security_Answer1,Security_Question_ID2,Security_Answer2, Designation,ActiveBit) values((select max(Contact_ID) from Contact),?,?,?,?,?,?,?,?,?);";
                        PreparedStatement psIE = con.prepareStatement(sqlInsertEmp);
                        psIE.setString(1, uname);
                        psIE.setString(2, passwd);
                        psIE.setString(3,passwd);
                        psIE.setInt(4, secQ1);
                        psIE.setString(5, secAns1);
                        psIE.setInt(6, secQ2);
                        psIE.setString(7, secAns2);
                        psIE.setString(8, desig);
                        psIE.setInt(9, 1);
                        
                        if(psIE.executeUpdate()!=0)
                       {
                        JOptionPane.showMessageDialog(null,"User Registered!");
                        p1.removeAll();
                    
                        loginButton.setEnabled(false);
                        registerButton.setEnabled(false);
                        luser.setSize(80,20);
                        luser.setFont(new Font("Serif", Font.BOLD, 24));
                        luser.setText("Welcome :"+uname+"!");
                        logPri=true;
                        admin=false;
                        }
                       else
                        {
                           JOptionPane.showMessageDialog(null,"Unable to Register!");
                           String sqlDelete="Delete from Contact where Contact_ID=(Select max(Contact_ID) from Contact);";
                           PreparedStatement psDE = con.prepareStatement(sqlDelete);
                           psDE.execute();
                        }
                        
                       }
                       else{
                          JOptionPane.showMessageDialog(null,"Unable to Register!");
                       }
                    }
                    else{
                       JOptionPane.showMessageDialog(null,"User exists! Cannot register again!");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"Error !");
                }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
                else{
                    
                }
            }
         });
     
 
            }});
        
        
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) { 
                p1.removeAll();
                desig="Admin";
                backbutton.setEnabled(false);
                nextbutton.setEnabled(false);
                l1.setText("Register");
                l1.setBounds(5,2,100,40);
                l1.setForeground(Color.BLACK);
                l1.setFont(new Font("Serif", Font.BOLD, 24));
                l1.setVisible(true);
                p1.add(l1);
                p1.setBounds(20,165,1300,840);
                p1.setBackground(Color.WHITE);
                p1.setVisible(true);
                Label l20=new Label();
                l20.setText("all fields are mandatory");
                l20.setBounds(105,2,300,40);
                l20.setForeground(Color.BLACK);
                l20.setFont(new Font("Serif", Font.BOLD, 14));
                l20.setVisible(true);
                p1.add(l20);
                l2.setText("User ID :");
                l2.setBounds(5,50,140,20);
                l2.setForeground(Color.BLACK);
                l2.setFont(new Font("Serif", Font.PLAIN, 18));
                l2.setVisible(true);
                p1.add(l2);
                TextField tb_uname=new TextField();
                tb_uname.setBounds(180, 45,210,30);
                tb_uname.setForeground(Color.BLACK);
                tb_uname.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_uname.setName("login_uname");
                tb_uname.setVisible(true);
                p1.add(tb_uname);

                l3.setText("Password :");
                l3.setBounds(5,90,140,20);
                l3.setForeground(Color.BLACK);
                l3.setFont(new Font("Serif", Font.PLAIN, 18));
                l3.setVisible(true);
                p1.add(l3);
                JPasswordField login_pwd=new JPasswordField();
                login_pwd.setVisible(true);
                login_pwd.setBounds(180,85,213,30);
                p1.add(login_pwd);

                l4.setText("Confirm Password :");
                l4.setBounds(595,90,160,20);
                l4.setForeground(Color.BLACK);
                l4.setFont(new Font("Serif", Font.PLAIN, 18));
                l4.setVisible(true);
                p1.add(l4);
                JPasswordField conf_pwd=new JPasswordField();
                conf_pwd.setVisible(true);
                conf_pwd.setBounds(760,85,213,30);
                p1.add(conf_pwd);

                Label adPass=new Label();
                adPass.setText("Admin Password :");
                adPass.setBounds(5,130,160,20);
                adPass.setForeground(Color.BLACK);
                adPass.setFont(new Font("Serif", Font.PLAIN, 18));
                adPass.setVisible(true);
                p1.add(adPass);
                JPasswordField ad_pwd=new JPasswordField();
                ad_pwd.setVisible(true);
                ad_pwd.setBounds(180,125,213,30);
                p1.add(ad_pwd);

                l5.setText("First Name :");
                l5.setBounds(5,173,160,20);
                l5.setForeground(Color.BLACK);
                l5.setFont(new Font("Serif", Font.PLAIN, 18));
                l5.setVisible(true);
                p1.add(l5);
                TextField tb_fname=new TextField();
                tb_fname.setBounds(180,168,210,30);
                tb_fname.setForeground(Color.BLACK);
                tb_fname.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_fname.setVisible(true);
                p1.add(tb_fname);



                l6.setText("Last Name :");
                l6.setBounds(595,173,160,20);
                l6.setForeground(Color.BLACK);
                l6.setFont(new Font("Serif", Font.PLAIN, 18));
                l6.setVisible(true);
                p1.add(l6);
                TextField tb_lname=new TextField();
                tb_lname.setBounds(760,168,210,30);
                tb_lname.setForeground(Color.BLACK);
                tb_lname.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_lname.setName("fname");
                tb_lname.setVisible(true);
                p1.add(tb_lname);

                l7.setText("Date of Birth :");
                l7.setBounds(5,216,160,20);
                l7.setForeground(Color.BLACK);
                l7.setFont(new Font("Serif", Font.PLAIN, 18));
                l7.setVisible(true);
                p1.add(l7);
                TextField tb_dob=new TextField("yyyy-mm-dd");
                tb_dob.setBounds(180,211,210,30);
                tb_dob.setForeground(Color.LIGHT_GRAY);
                tb_dob.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_dob.setVisible(true);
                p1.add(tb_dob);
                tb_dob.addFocusListener(new FocusListener(){
                            public void focusGained(FocusEvent e){
                                tb_dob.setText("");
                                tb_dob.setForeground(Color.BLACK);
                                tb_dob.setFont(new Font("Serif", Font.PLAIN, 18));
                            }
                            public void focusLost(FocusEvent e){

                            }
                        });
                Label el=new Label();
                el.setText("Email :");
                el.setBounds(5,259,160,20);
                el.setForeground(Color.BLACK);
                el.setFont(new Font("Serif", Font.PLAIN, 18));
                el.setVisible(true);
                p1.add(el);
                TextField tb_email=new TextField();
                tb_email.setBounds(180,254,210,30);
                tb_email.setForeground(Color.BLACK);
                tb_email.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_email.setVisible(true);
                p1.add(tb_email);


                l9.setText("Phone :");
                l9.setBounds(5,302,160,20);
                l9.setForeground(Color.BLACK);
                l9.setFont(new Font("Serif", Font.PLAIN, 18));
                l9.setVisible(true);
                p1.add(l9);
                TextField tb_phone=new TextField("10 Digit");
                tb_phone.setBounds(180,297,210,30);
                tb_phone.setForeground(Color.LIGHT_GRAY);
                tb_phone.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_phone.setVisible(true);
                p1.add(tb_phone);
                tb_phone.addFocusListener(new FocusListener(){
                            public void focusGained(FocusEvent e){
                                tb_phone.setText("");
                                tb_phone.setForeground(Color.BLACK);
                                tb_phone.setFont(new Font("Serif", Font.PLAIN, 18));
                            }
                            public void focusLost(FocusEvent e){

                            }
                        });


                l8.setText("Address :");
                l8.setBounds(5,345,160,20);
                l8.setForeground(Color.BLACK);
                l8.setFont(new Font("Serif", Font.PLAIN, 18));
                l8.setVisible(true);
                p1.add(l8);
                TextField tb_house=new TextField("House or Apartment No.");
                tb_house.setBounds(180,340,210,30);
                tb_house.setForeground(Color.LIGHT_GRAY);
                tb_house.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_house.setName("street");
                tb_house.setVisible(true);
                tb_house.addFocusListener(new FocusListener(){
                    public void focusGained(FocusEvent e){
                        tb_house.setText("");
                        tb_house.setForeground(Color.BLACK);
                        tb_house.setFont(new Font("Serif", Font.PLAIN, 18));
                    }
                    public void focusLost(FocusEvent e){

                    }
                });
                p1.add(tb_house);
                TextField tb_street=new TextField("Street");
                tb_street.setBounds(180,383,210,30);
                tb_street.setForeground(Color.LIGHT_GRAY);
                tb_street.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_street.setName("street");
                tb_street.setVisible(true);
                tb_street.addFocusListener(new FocusListener(){
                            public void focusGained(FocusEvent e){
                                tb_street.setText("");
                                tb_street.setForeground(Color.BLACK);
                                tb_street.setFont(new Font("Serif", Font.PLAIN, 18));
                            }
                            public void focusLost(FocusEvent e){

                            }
                        });
                p1.add(tb_street);

                TextField tb_city=new TextField("City");
                        tb_city.setBounds(180, 426,210,30);
                        tb_city.setForeground(Color.LIGHT_GRAY);
                        tb_city.setFont(new Font("Serif", Font.ITALIC, 18));
                        tb_city.setName("Address_tb4");
                        tb_city.setVisible(true);

                        tb_city.addFocusListener(new FocusListener(){
                            public void focusGained(FocusEvent e){
                                tb_city.setText("");
                                tb_city.setForeground(Color.BLACK);
                                tb_city.setFont(new Font("Serif", Font.PLAIN, 18));
                            }
                            public void focusLost(FocusEvent e){

                            }
                        });
                p1.add(tb_city);

                TextField tb_state=new TextField("State");
                        tb_state.setBounds(180, 470,210,30);
                        tb_state.setForeground(Color.LIGHT_GRAY);
                        tb_state.setFont(new Font("Serif", Font.ITALIC, 18));
                        tb_state.setName("Address_tb4");
                        tb_state.setVisible(true);

                        tb_state.addFocusListener(new FocusListener(){
                            public void focusGained(FocusEvent e){
                                tb_state.setText("");
                                tb_state.setForeground(Color.BLACK);
                                tb_state.setFont(new Font("Serif", Font.PLAIN, 18));
                            }
                            public void focusLost(FocusEvent e){

                            }
                        });
                p1.add(tb_state);

                TextField tb_zip=new TextField("Zip");
                        tb_zip.setBounds(180, 514,210,30);
                        tb_zip.setForeground(Color.LIGHT_GRAY);
                        tb_zip.setFont(new Font("Serif", Font.ITALIC, 18));
                        tb_zip.setName("Address_tb4");
                        tb_zip.setVisible(true);

                        tb_zip.addFocusListener(new FocusListener(){
                            public void focusGained(FocusEvent e){
                                tb_zip.setText("");
                                tb_zip.setForeground(Color.BLACK);
                                tb_zip.setFont(new Font("Serif", Font.PLAIN, 18));
                            }
                            public void focusLost(FocusEvent e){

                            }
                        });
                        p1.add(tb_zip);
                l10.setText("Security Question1 :");
                l10.setBounds(5,567,160,20);
                l10.setForeground(Color.BLACK);
                l10.setFont(new Font("Serif", Font.PLAIN, 18));
                l10.setVisible(true);
                p1.add(l10);
                String[] selections = { "What was your childhood nick name?", "What is the name of your favorite childhood friend?", "In what city did your mother and father meet?", "What is your favorite team?","What is your favorite movie?","What was your favorite food as a child?","What was the make of your first car?","What school did you attend for sixth grade?","In what town was your first job?","Who was your first employer?" };
                JList list = new JList(selections);
                list.setFont(new Font("Serif", Font.ITALIC, 14));
                list.setSelectedIndex(1);
                JScrollPane js=new JScrollPane(list);
                js.setBounds(178, 562, 350, 40);
                js.setVisible(true);
                p1.add(js);


                l11.setText("Answer :");
                l11.setBounds(595,567,160,20);
                l11.setForeground(Color.BLACK);
                l11.setFont(new Font("Serif", Font.PLAIN, 18));
                l11.setVisible(true);
                p1.add(l11);
                TextField tb_ans=new TextField();
                tb_ans.setBounds(760,562,210,30);
                tb_ans.setForeground(Color.BLACK);
                tb_ans.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_ans.setName("phone");
                tb_ans.setVisible(true);
                p1.add(tb_ans);

                Label sq2=new Label();
                sq2.setText("Security Question2 :");
                sq2.setBounds(5,615,160,20);
                sq2.setForeground(Color.BLACK);
                sq2.setFont(new Font("Serif", Font.PLAIN, 18));
                sq2.setVisible(true);
                p1.add(sq2);
                String[] selections2 = { "What was your favorite food as a child?","What was the make of your first car?","What school did you attend for sixth grade?","In what town was your first job?","Who was your first employer?" };
                JList list1 = new JList(selections2);
                list1.setFont(new Font("Serif", Font.ITALIC, 14));
                list1.setSelectedIndex(1);
                JScrollPane js1=new JScrollPane(list1);
                js1.setBounds(180, 610, 350, 40);
                js1.setVisible(true);
                p1.add(js1);

                Label an1=new Label();
                an1.setText("Answer :");
                an1.setBounds(595,615,160,20);
                an1.setForeground(Color.BLACK);
                an1.setFont(new Font("Serif", Font.PLAIN, 18));
                an1.setVisible(true);
                p1.add(an1);
                TextField tb_ans1=new TextField();
                tb_ans1.setBounds(760,610,210,30);
                tb_ans1.setForeground(Color.BLACK);
                tb_ans1.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_ans1.setName("phone");
                tb_ans1.setVisible(true);
                p1.add(tb_ans1);

                Button bReg=new Button("Submit");
                bReg.setBounds(760,670,210,40);
                bReg.setFont(new Font("Serif", Font.PLAIN, 20));
                bReg.setForeground(Color.BLACK);
                bReg.setVisible(true);
                bReg.setBackground(Color.WHITE);
                p1.add(bReg);
                
                //Navigation Bar 
            Button home=new Button("Home");
            home.setBounds(600,730,100,30);
            home.setForeground(Color.BLACK);
            home.setBackground(Color.WHITE);
            home.setVisible(true);
            p1.add(home);
             home.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                homebutton.doClick();
                }});
            Button back=new Button("Back");
            back.setBounds(700,730,100,30);
            back.setForeground(Color.BLACK);
            back.setBackground(Color.WHITE);
            back.setVisible(true);
            p1.add(back);
            back.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                homebutton.doClick();
                }});
            
            Button next=new Button("Next");
            next.setBounds(800,730,100,30);
            next.setForeground(Color.BLACK);
            next.setBackground(Color.WHITE);
            next.setVisible(true);
            p1.add(next);
            next.setEnabled(false);
            
            Button logout=new Button("Logout");
            logout.setBounds(900,730,100,30);
            logout.setForeground(Color.BLACK);
            logout.setBackground(Color.WHITE);
            logout.setVisible(true);
            p1.add(logout);
            logout.setEnabled(false);
            
            Button exit=new Button("Exit");
            exit.setBounds(1000,730,100,30);
            exit.setForeground(Color.BLACK);
            exit.setBackground(Color.WHITE);
            exit.setVisible(true);
            p1.add(exit);
            exit.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                System.exit(0);
                }});
            //end of Navigation

                 bReg.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) { 
                        char[] pass1=login_pwd.getPassword();
                        String p11=new String(pass1);
                        char[] pass2=conf_pwd.getPassword();
                        String p21=new String(pass2);
                        String secA=tb_ans.getText();
                        char[] upass=ad_pwd.getPassword();
                        String upas=new String(upass);
                        if(tb_fname.getText().matches(regexName)){
                            p1.remove(l12);
                            if(tb_lname.getText().matches(regexName)){
                                p1.remove(l13);
                                if(tb_phone.getText().matches(regexPhone)){
                                    p1.remove(l14);
                                    if(tb_zip.getText().matches(regexZip)){
                                        p1.remove(l15);
                                        if(p11.equals(p21)){
                                            p1.remove(l16);
                                                regFlag=true; 
                                                if(upas.equals("adminpass"))
                                                    {
                                                        regFlag=true;
                                                    if(secA.length()<1)
                                                    {

                                                        regFlag=false;
                                                        Label l17=new Label();
                                                        l17.setText("Answer required!");
                                                        l17.setBounds(400,440,140,30);
                                                        l17.setForeground(Color.RED);
                                                        l17.setFont(new Font("Serif", Font.PLAIN, 14));
                                                        l17.setVisible(true);
                                                        p1.add(l17);

                                                    }  
                                                    else
                                                    {
                                                        regFlag=true;

                                                    }
                                                }
                                                else{
                                                        regFlag=false;
                                                        JOptionPane.showMessageDialog(null, "Invalid admin password!");
                                                    }
                                        }
                                        else{
                                            regFlag=false;
                                            l16.setText("Passwords mismatch");
                                            l16.setBounds(400,130,140,30);
                                            l16.setForeground(Color.RED);
                                            l16.setFont(new Font("Serif", Font.PLAIN, 14));
                                            l16.setVisible(true);
                                            p1.add(l16);
                                        }
                                    }
                                    else{
                                        regFlag=false;
                                        l15.setText("Invalid Zip");
                                        l15.setBounds(400,360,140,30);
                                        l15.setForeground(Color.RED);
                                        l15.setFont(new Font("Serif", Font.PLAIN, 14));
                                        l15.setVisible(true);
                                        p1.add(l15);
                                    }
                                }
                                else{ 
                                    regFlag=false; 
                                    l14.setText("Invalid Phone number");
                                    l14.setBounds(400,250,140,30);
                                    l14.setForeground(Color.RED);
                                    l14.setFont(new Font("Serif", Font.PLAIN, 14));
                                    l14.setVisible(true);
                                    p1.add(l14);
                                }
                            }
                            else{
                                regFlag=false; 
                                l13.setText("Invalid Last name");
                                l13.setBounds(400,185,140,30);
                                l13.setForeground(Color.RED);
                                l13.setFont(new Font("Serif", Font.PLAIN, 14));
                                l13.setVisible(true);
                                p1.add(l13);
                             }
                        }
                        else{
                        regFlag=false; 
                        l12.setText("Invalid First name");
                        l12.setBounds(400,155,140,30);
                        l12.setForeground(Color.RED);
                        l12.setFont(new Font("Serif", Font.PLAIN, 14));
                        l12.setVisible(true);
                        p1.add(l12);
                        } //validations end


                    if(regFlag==true){
                        //fetch textbox values for query
                        uname=tb_uname.getText();
                        char[] txtpassword=login_pwd.getPassword();
                        passwd=new String(txtpassword);
                        fname=tb_fname.getText();
                        lname=tb_lname.getText();
                        dob=tb_dob.getText();
                        email=tb_email.getText();
                        phone=tb_phone.getText();
                        stAddr=tb_street.getText();
                        ctAddr=tb_city.getText();
                        house=tb_house.getText();
                        state=tb_state.getText();
                        zip=tb_zip.getText();
                        secQ1=1+list.getSelectedIndex();
                        secAns1=tb_ans.getText();
                        secQ2=1+list1.getSelectedIndex();
                        secAns2=tb_ans1.getText();
                    //database connection and query   
                    try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        con=DriverManager.getConnection(connectionUrl);

                        String sqlQ = "Select count(*) as cnt from Employee where BarNumber=? and Password=? and ActiveBit=1";
                        String sqlInsertContact, sqlInsertEmp,sqlSelect;
                        PreparedStatement ps = con.prepareStatement(sqlQ);
                        ps.setString(1, uname);
                        ps.setString(2, passwd);
                        rs=ps.executeQuery();
                        if(rs.next()){


                            if("0".equals(rs.getString("cnt"))){

                                //Inserting in Contact table
                                sqlInsertContact="Insert into Contact(Status,FirstName, LastName, DOB, Email, Phone,House, Street, City, State, Zip) values (?,?,?,?,?,?,?,?,?,?,?);";
                                PreparedStatement psIC = con.prepareStatement(sqlInsertContact);
                                psIC.setString(1,"New");
                                psIC.setString(2, fname);
                                psIC.setString(3, lname);
                                psIC.setString(4, dob);
                                psIC.setString(5, email);
                                psIC.setString(6, phone);
                                psIC.setString(7, house);
                                psIC.setString(8, stAddr);
                                psIC.setString(9, ctAddr);
                                psIC.setString(10, state);
                                psIC.setString(11, zip);

                               if( psIC.executeUpdate()!=0)
                               {
                                sqlInsertEmp="Insert into Employee(Contact_ID,BarNumber,Password,UniquePassword,Security_Question_ID1,Security_Answer1,Security_Question_ID2,Security_Answer2, Designation,ActiveBit) values((select max(Contact_ID) from Contact),?,?,?,?,?,?,?,?,?);";
                                PreparedStatement psIE = con.prepareStatement(sqlInsertEmp);
                                psIE.setString(1, uname);
                                psIE.setString(2, passwd);
                                psIE.setString(3, upas);
                                psIE.setInt(4, secQ1);
                                psIE.setString(5, secAns1);
                                psIE.setInt(6, secQ2);
                                psIE.setString(7, secAns2);
                                psIE.setString(8, desig);
                                psIE.setInt(9, 1);

                                if(psIE.executeUpdate()!=0)
                               {
                                sqlSelect="Select max(Employee_ID) as EmpID from Employee;";
                                PreparedStatement ps2 = con.prepareStatement(sqlSelect);
                                rs1=ps2.executeQuery();
                                if(rs1.next()){
                                         lawyer_id=rs1.getInt("EmpID");
                                }
                                JOptionPane.showMessageDialog(null,"User Registered!");
                                p1.removeAll();
                                loginButton.setEnabled(false);
                                registerButton.setEnabled(false);
                                luser.setSize(80,20);
                                luser.setFont(new Font("Serif", Font.BOLD, 24));
                                luser.setText("Welcome :"+uname+"!");
                                logPri=true;
                                admin=true;


                               }
                               else
                                {
                                   System.out.println("Insert into Employee table failed");
                                  // JOptionPane.showMessageDialog(null,"Unable to insert Employee!");
                                }

                               }
                               else{
                                   System.out.println("Insert into contact table failed");
                                   JOptionPane.showMessageDialog(null,"Unable to insert!");
                               }
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"User already exists!!");
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Unable to connect to database!");
                        }
                    } catch (SQLException | ClassNotFoundException ex) {
                        Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        }
                        else{

                        }
                    }
                 });



            }});

            }
   
    else{
        JOptionPane.showMessageDialog(null,"You have already Logged In!");
        p1.removeAll();
    }
 this.add(p1);        
    }//GEN-LAST:event_registerButtonActionPerformed
    
    private void caseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caseButtonActionPerformed
    // TODO add your handling code here:
    backbutton.setEnabled(true);
    nextbutton.setEnabled(true);
    infoPanel.removeAll();
    this.remove(infoPanel);
    if(logPri==true){ 
        p1.removeAll();
        //Buttons for creating new case and changing existing values
        Button b1=new Button("New Case");
        b1.setBounds(4,4,185,30);
        b1.setBackground(Color.WHITE);
        b1.setFont(new Font("Serif", Font.PLAIN, 16));
        b1.setForeground(Color.BLACK);
        p1.add(b1);
        Button b2=new Button("Edit Case");
        b2.setBounds(4,32,185,30);
        b2.setBackground(Color.WHITE);
        b2.setFont(new Font("Serif", Font.PLAIN, 16));
        b2.setForeground(Color.BLACK);
        p1.add(b2);
        //Button to search case details
        Button b3=new Button("Search Case");
        b2.setForeground(Color.BLACK);
        b3.setBounds(4,60,185,30);
        b3.setBackground(Color.WHITE);
        b3.setFont(new Font("Serif", Font.PLAIN, 16));
        p1.add(b3);
        //Panel visibility and size
        p1.setBackground(Color.WHITE);
        p1.setBounds(405, 145, 195, 100);
        p1.setVisible(true);
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                p1.removeAll();
                p1.setBounds(50,200,1200,800);
                p1.setBackground(Color.WHITE);
                p1.setVisible(true);
                l1.setText("Enter New Case Details");
                l1.setBounds(5,2,300,40);
                //l1.setBackground(Color.gray);
                l1.setForeground(Color.BLACK);
                l1.setFont(new Font("Serif", Font.BOLD, 24));
                l1.setVisible(true);
                p1.add(l1);

                l2.setText("Docket Number :");
                l2.setBounds(5,70,140,20);
                l2.setForeground(Color.BLACK);
                //l2.setBackground(Color.gray);
                l2.setFont(new Font("Serif", Font.PLAIN, 18));
                l2.setVisible(true);
                p1.add(l2);
                TextField tb_docket=new TextField();
                tb_docket.setBounds(160, 65,210,30);
                tb_docket.setForeground(Color.BLACK);
                tb_docket.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_docket.setVisible(true);
                p1.add(tb_docket);

                l3.setText("Per Hour Charges :");
                l3.setBounds(5,100,140,20);
                l3.setForeground(Color.BLACK);
                //l3.setBackground(Color.gray);
                l3.setFont(new Font("Serif", Font.PLAIN, 18));
                l3.setVisible(true);
                p1.add(l3);
                TextField tb_hrCharges=new TextField();
                tb_hrCharges.setBounds(160, 95,210,30);
                tb_hrCharges.setForeground(Color.BLACK);
                tb_hrCharges.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_hrCharges.setVisible(true);
                p1.add(tb_hrCharges);

                l4.setText("Case Status :");
                l4.setBounds(5,130,140,20);
                l4.setForeground(Color.BLACK);
                //l4.setBackground(Color.gray);
                l4.setFont(new Font("Serif", Font.PLAIN, 18));
                l4.setVisible(true);
                p1.add(l4);
                TextField tb_Status=new TextField("Open");
                tb_Status.setBounds(160, 125,210,30);
                tb_Status.setForeground(Color.BLACK);
                tb_Status.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_Status.setVisible(true);
                tb_Status.setEditable(false);
                p1.add(tb_Status);
//                
//                l17.setText("Existing Client:");
//                l17.setBounds(405,125,140,20);
//                l17.setForeground(Color.BLACK);
//                //l3.setBackground(Color.gray);
//                l17.setFont(new Font("Serif", Font.PLAIN, 18));
//                l17.setVisible(true);
//                p1.add(l17);
//                TextField tb_ph1=new TextField();
//                tb_ph1.setBounds(560, 125,210,30);
//                tb_ph1.setForeground(Color.BLACK);
//                tb_ph1.setFont(new Font("Serif", Font.PLAIN, 18));
//                tb_ph1.setName("LastName_tb");
//                tb_ph1.setVisible(true);
//                p1.add(tb_ph1);
//                Button bSearchClient=new Button("Search");
//                bSearchClient.setBounds(780,125,100,30);
//                bSearchClient.setForeground(Color.BLACK);
//                bSearchClient.setBackground(Color.WHITE);
//                p1.add(bSearchClient);
//                 bSearchClient.addActionListener(new ActionListener(){
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                   
//                   String searchKey=tb_ph1.getText();
//                   tb_ph1.setEditable(false);
//                   try {
//                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//                        con=DriverManager.getConnection(connectionUrl);
//
//                        String query = "Select Contact_ID,FirstName,LastName,DOB,Email,Street,City,State,Zip from Contact where Phone=?";
//                        PreparedStatement ps = con.prepareStatement(query);
//                        ps.setString(1, searchKey);
//                        rs=ps.executeQuery();
//                        if(rs.next()){
//                            contact_id = rs.getInt("Contact_ID");
//                            String fn=(rs1.getString("FirstName"));
//                            String ln=(rs1.getString("LastName"));
//                            JOptionPane.showMessageDialog(null,"Is the client"+fn+" "+ln+"!\n ");
//                            
//                        }
//                        else{
//                            JOptionPane.showMessageDialog(null,"Case does not exist! Enter valid Docket Number!");
//                        }
//            } catch (SQLException | ClassNotFoundException ex) {
//                Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
//            }
//                
//        }});
                
                l5.setText("Enter Client Details");
                l5.setBounds(5,160,300,40);
                //l1.setBackground(Color.gray);
                l5.setForeground(Color.BLACK);
                l5.setFont(new Font("Serif", Font.BOLD, 20));
                l5.setVisible(true);
                p1.add(l5);
                l6.setText("First Name :");
                l6.setBounds(5,200,140,20);
                l6.setForeground(Color.BLACK);
                //l5.setBackground(Color.gray);
                l6.setFont(new Font("Serif", Font.PLAIN, 18));
                l6.setVisible(true);
                p1.add(l6);
                TextField tb_cFname=new TextField();
                tb_cFname.setBounds(160, 200,210,30);
                tb_cFname.setForeground(Color.BLACK);
                tb_cFname.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_cFname.setName("b_CaseTyp");
                tb_cFname.setVisible(true);
                p1.add(tb_cFname);
                
                l7.setText("Last Name:");
                l7.setBounds(405,200,140,20);
                l7.setForeground(Color.BLACK);
                //l3.setBackground(Color.gray);
                l7.setFont(new Font("Serif", Font.PLAIN, 18));
                l7.setVisible(true);
                p1.add(l7);
                TextField tb_LName=new TextField();
                tb_LName.setBounds(560, 200,210,30);
                tb_LName.setForeground(Color.BLACK);
                tb_LName.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_LName.setName("LastName_tb");
                tb_LName.setVisible(true);
                p1.add(tb_LName);
                
                l13.setText("Email:");
                l13.setBounds(5,230,140,20);
                l13.setForeground(Color.BLACK);
                //l3.setBackground(Color.gray);
                l13.setFont(new Font("Serif", Font.PLAIN, 18));
                l13.setVisible(true);
                p1.add(l13);
                TextField tb_Email=new TextField();
                tb_Email.setBounds(160, 230,210,30);
                tb_Email.setForeground(Color.BLACK);
                tb_Email.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_Email.setVisible(true);
                p1.add(tb_Email);

                l8.setText("Date of Birth:");
                l8.setBounds(5,260,140,20);
                l8.setForeground(Color.BLACK);
                //l4.setBackground(Color.gray);
                l8.setFont(new Font("Serif", Font.PLAIN, 18));
                l8.setVisible(true);
                p1.add(l8);
                TextField tb_DOB=new TextField("yyyy-mm-dd");
                tb_DOB.setBounds(160, 260,210,30);
                tb_DOB.setForeground(Color.LIGHT_GRAY);
                tb_DOB.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_DOB.setName("DOB_tb");
                tb_DOB.setVisible(true);
                p1.add(tb_DOB);
                tb_DOB.addFocusListener(new FocusListener(){
                    public void focusGained(FocusEvent e){
                        tb_DOB.setText("");
                        tb_DOB.setForeground(Color.BLACK);
                        tb_DOB.setFont(new Font("Serif", Font.PLAIN, 18));
                    }public void focusLost(FocusEvent e){

                    }
                });

                l9.setText("Phone:");
                l9.setBounds(5,290,125,20);
                l9.setForeground(Color.BLACK);
                //l5.setBackground(Color.gray);
                l9.setFont(new Font("Serif", Font.PLAIN, 18));
                l9.setVisible(true);
                p1.add(l9);
                TextField tb_ph=new TextField("9999999999");
                tb_ph.setBounds(160, 290,210,30);
                tb_ph.setForeground(Color.LIGHT_GRAY);
                tb_ph.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_ph.addFocusListener(new FocusListener(){
                    public void focusGained(FocusEvent e){
                        tb_ph.setText("");
                        tb_ph.setForeground(Color.BLACK);
                        tb_ph.setFont(new Font("Serif", Font.PLAIN, 18));
                    }public void focusLost(FocusEvent e){

                    }
                });
                tb_ph.setVisible(true);
                p1.add(tb_ph);

                l10.setText("Address:");
                l10.setBounds(5,320,125,20);
                l10.setForeground(Color.BLACK);
                //l6.setBackground(Color.gray);
                l10.setFont(new Font("Serif", Font.PLAIN, 18));
                l10.setVisible(true);
                p1.add(l10);
                TextField tb_add1=new TextField("Street");
                tb_add1.setBounds(160, 320,210,30);
                tb_add1.setForeground(Color.LIGHT_GRAY);
                tb_add1.setFont(new Font("Serif", Font.ITALIC, 18));
                tb_add1.setName("Address_tb1");
                tb_add1.setVisible(true);

                tb_add1.addFocusListener(new FocusListener(){
                    public void focusGained(FocusEvent e){
                        tb_add1.setText("");
                        tb_add1.setForeground(Color.BLACK);
                        tb_add1.setFont(new Font("Serif", Font.PLAIN, 18));
                    }
                    public void focusLost(FocusEvent e){

                    }
                });
                p1.add(tb_add1);

                TextField tb_add2=new TextField("City");
                tb_add2.setBounds(160, 350,210,30);
                tb_add2.setForeground(Color.LIGHT_GRAY);
                tb_add2.setFont(new Font("Serif", Font.ITALIC, 18));
                tb_add2.setName("Address_tb2");
                tb_add2.setVisible(true);

                tb_add2.addFocusListener(new FocusListener(){
                    public void focusGained(FocusEvent e){
                        tb_add2.setText("");
                        tb_add2.setForeground(Color.BLACK);
                        tb_add2.setFont(new Font("Serif", Font.PLAIN, 18));
                    }
                    public void focusLost(FocusEvent e){

                    }
                });

                p1.add(tb_add2);
                TextField tb_add3=new TextField("State");
                tb_add3.setBounds(160, 380,210,30);
                tb_add3.setForeground(Color.LIGHT_GRAY);
                tb_add3.setFont(new Font("Serif", Font.ITALIC, 18));
                tb_add3.setName("Address_tb3");
                tb_add3.setVisible(true);

                tb_add3.addFocusListener(new FocusListener(){
                    public void focusGained(FocusEvent e){
                        tb_add3.setText("");
                        tb_add3.setForeground(Color.BLACK);
                        tb_add3.setFont(new Font("Serif", Font.PLAIN, 18));
                    }
                    public void focusLost(FocusEvent e){

                    }
                });

                p1.add(tb_add3);
                TextField tb_add4=new TextField("Zip");
                tb_add4.setBounds(160, 410,210,30);
                tb_add4.setForeground(Color.LIGHT_GRAY);
                tb_add4.setFont(new Font("Serif", Font.ITALIC, 18));
                tb_add4.setName("Address_tb4");
                tb_add4.setVisible(true);

                tb_add4.addFocusListener(new FocusListener(){
                    public void focusGained(FocusEvent e){
                        tb_add4.setText("");
                        tb_add4.setForeground(Color.BLACK);
                        tb_add4.setFont(new Font("Serif", Font.PLAIN, 18));
                    }
                    public void focusLost(FocusEvent e){

                    }
                });

                p1.add(tb_add4);

                Button bResetClient=new Button("Reset");
                bResetClient.setBounds(165,450,100,30);
                bResetClient.setForeground(Color.BLACK);
                bResetClient.setBackground(Color.WHITE);
                p1.add(bResetClient);
                //Navigation Bar 
            Button home=new Button("Home");
            home.setBounds(600,520,100,30);
            home.setForeground(Color.BLACK);
            home.setBackground(Color.WHITE);
            home.setVisible(true);
            p1.add(home);
             home.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                homebutton.doClick();
                }});
            Button back=new Button("Back");
            back.setBounds(700,520,100,30);
            back.setForeground(Color.BLACK);
            back.setBackground(Color.WHITE);
            back.setVisible(true);
            p1.add(back);
            back.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                homebutton.doClick();
                }});
            
            Button next=new Button("Next");
            next.setBounds(800,520,100,30);
            next.setForeground(Color.BLACK);
            next.setBackground(Color.WHITE);
            next.setVisible(true);
            p1.add(next);
            next.setEnabled(false);
            
            Button logout=new Button("Logout");
            logout.setBounds(900,520,100,30);
            logout.setForeground(Color.BLACK);
            logout.setBackground(Color.WHITE);
            logout.setVisible(true);
            p1.add(logout);
            logout.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                logoutbutton.doClick();
                }});
            
            Button exit=new Button("Exit");
            exit.setBounds(1000,520,100,30);
            exit.setForeground(Color.BLACK);
            exit.setBackground(Color.WHITE);
            exit.setVisible(true);
            p1.add(exit);
            exit.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                System.exit(0);
                }});
            //end of Navigation


                bResetClient.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                tb_docket.setText(" ");
                tb_hrCharges.setText(" ");
                tb_Status.setText("Open/Close");
                tb_Status.setForeground(Color.LIGHT_GRAY);
                tb_Status.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_Status.setVisible(true);
                tb_Status.addFocusListener(new FocusListener(){
                    public void focusGained(FocusEvent e){
                        tb_Status.setText("");
                        tb_Status.setForeground(Color.BLACK);
                        tb_Status.setFont(new Font("Serif", Font.PLAIN, 18));
                    }
                    public void focusLost(FocusEvent e){

                    }
                });
                tb_cFname.setText(" ");
                tb_LName.setText(" ");
                tb_DOB.setForeground(Color.LIGHT_GRAY);
                tb_DOB.setText("yyyy-mm-dd");
                tb_DOB.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_DOB.addFocusListener(new FocusListener(){
                    public void focusGained(FocusEvent e){
                        tb_DOB.setText("");
                        tb_DOB.setForeground(Color.BLACK);
                        tb_DOB.setFont(new Font("Serif", Font.PLAIN, 18));
                    }public void focusLost(FocusEvent e){

                    }
                });
                tb_ph.setForeground(Color.LIGHT_GRAY);
                tb_ph.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_ph.setVisible(true);
                tb_ph.setText("10 Digit");
                tb_ph.addFocusListener(new FocusListener(){
                    public void focusGained(FocusEvent e){
                        tb_ph.setText("");
                        tb_ph.setForeground(Color.BLACK);
                        tb_ph.setFont(new Font("Serif", Font.PLAIN, 18));
                    }public void focusLost(FocusEvent e){

                    }
                });
                tb_add1.setForeground(Color.LIGHT_GRAY);
                tb_add1.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_add1.setVisible(true);
                tb_add1.setText("Street");
                tb_add1.addFocusListener(new FocusListener(){
                    public void focusGained(FocusEvent e){
                        tb_add1.setText("");
                        tb_add1.setForeground(Color.BLACK);
                        tb_add1.setFont(new Font("Serif", Font.PLAIN, 18));
                    }public void focusLost(FocusEvent e){

                    }
                });
                tb_add2.setForeground(Color.LIGHT_GRAY);
                tb_add2.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_add2.setVisible(true);
                tb_add2.setText("City");
                tb_add2.addFocusListener(new FocusListener(){
                    public void focusGained(FocusEvent e){
                        tb_add2.setText("");
                        tb_add2.setForeground(Color.BLACK);
                        tb_add2.setFont(new Font("Serif", Font.PLAIN, 18));
                    }public void focusLost(FocusEvent e){

                    }
                });
                tb_add3.setForeground(Color.LIGHT_GRAY);
                tb_add3.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_add3.setVisible(true);
                tb_add3.setText("State");
                tb_add3.addFocusListener(new FocusListener(){
                    public void focusGained(FocusEvent e){
                        tb_add3.setText("");
                        tb_add3.setForeground(Color.BLACK);
                        tb_add3.setFont(new Font("Serif", Font.PLAIN, 18));
                    }public void focusLost(FocusEvent e){

                    }
                });
                tb_add4.setForeground(Color.LIGHT_GRAY);
                tb_add4.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_add4.setVisible(true);
                tb_add4.setText("Zip");
                tb_add4.addFocusListener(new FocusListener(){
                    public void focusGained(FocusEvent e){
                        tb_add4.setText("");
                        tb_add4.setForeground(Color.BLACK);
                        tb_add4.setFont(new Font("Serif", Font.PLAIN, 18));
                    }public void focusLost(FocusEvent e){

                    }
                });
                }});

                Button bSaveClient=new Button("Submit");
                bSaveClient.setBounds(265,450,100,30);
                bSaveClient.setBackground(Color.WHITE);
                bSaveClient.setForeground(Color.BLACK);
                p1.add(bSaveClient);
                bSaveClient.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                     
                     p1.removeAll();
                    if(tb_cFname.getText().matches(regexName)){
                        p1.remove(l11);
                        if(tb_LName.getText().matches(regexName)){
                            p1.remove(l12);
                            if(tb_ph.getText().matches(regexPhone)){
                                p1.remove(l13);
                                if(tb_add4.getText().matches(regexZip)){
                                    regFlag=true;
                                    p1.remove(l14);
                                }
                                else{
                                    regFlag=false; 
                                    l14.setText("Invalid Zip");
                                    l14.setBounds(400,410,140,30);
                                    l14.setForeground(Color.RED);
                                    l14.setFont(new Font("Serif", Font.PLAIN, 14));
                                    l14.setVisible(true);
                                    p1.add(l14);
                                }
                            }
                            else{
                                regFlag=false; 
                                l13.setText("Invalid Phone");
                                l13.setBounds(400,290,140,30);
                                l13.setForeground(Color.RED);
                                l13.setFont(new Font("Serif", Font.PLAIN, 14));
                                l13.setVisible(true);
                                p1.add(l13);
                            }
                        }
                        else{
                            regFlag=false; 
                            l12.setText("Invalid Last name");
                            l12.setBounds(400,230,140,30);
                            l12.setForeground(Color.RED);
                            l12.setFont(new Font("Serif", Font.PLAIN, 14));
                            l12.setVisible(true);
                            p1.add(l12);
                            }
                    }
                    else{
                        regFlag=false; 
                        l11.setText("Invalid First name");
                        l11.setBounds(400,195,140,30);
                        l11.setForeground(Color.RED);
                        l11.setFont(new Font("Serif", Font.PLAIN, 14));
                        l11.setVisible(true);
                        p1.add(l11);
                    }
                if(regFlag==true){
                    fname=tb_cFname.getText();
                    lname=tb_LName.getText();
                    dob=tb_DOB.getText();
                    email=tb_Email.getText();
                    phone=tb_ph.getText();
                    stAddr=tb_add1.getText();
                    ctAddr=tb_add2.getText();
                    state=tb_add3.getText();
                    zip=tb_add4.getText();
                    String s1=tb_docket.getText();
                    String s2=tb_hrCharges.getText();
                    String s3=tb_Status.getText();
                    try {
                        
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        con=DriverManager.getConnection(connectionUrl);

                        String sqlQ = "Select count(*) as cnt from Contact where Phone=?"; 
                        PreparedStatement ps = con.prepareStatement(sqlQ);
                        ps.setString(1, phone);
                        rs=ps.executeQuery();
                        if(rs.next())
                        {
                            if("0".equals(rs.getString("cnt")))
                            {
                                String sqlInsertContact;
                                sqlInsertContact="Insert into Contact(FirstName, LastName, DOB,Email, Phone, Street, City, State, Zip) values (?,?,?,?,?,?,?,?,?);";
                                PreparedStatement ps1 = con.prepareStatement(sqlInsertContact);
                                ps1.setString(1,fname);
                                ps1.setString(2,lname);
                                ps1.setString(3,dob);
                                ps1.setString(4,email);
                                ps1.setString(5,phone);
                                ps1.setString(6,stAddr);
                                ps1.setString(7,ctAddr);
                                ps1.setString(8,state);
                                ps1.setString(9,zip);
                                if(ps1.executeUpdate()!=0)
                                {
                                    System.out.print("Sucessfull Contact insert!");
                                    String sqlInsertCase;
                                    //Inserting in Contact table
                                    sqlInsertCase="Insert into LCase(Contact_ID, Docket_Number, Per_Hour_Charge, Case_Status, Employee_ID) values ((select max(Contact_ID) from Contact),?,?,?,?);";
                                    PreparedStatement psIC = con.prepareStatement(sqlInsertCase);
                                    psIC.setString(1, s1);
                                    psIC.setString(2, s2);
                                    psIC.setString(3, s3);
                                    psIC.setInt(4,lawyer_id );
                                    if(psIC.executeUpdate()!=0)
                                    {

                                        JOptionPane.showMessageDialog(null,"Case Saved!");
                                        p1.removeAll();
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(null,"Failed to save Case!");
                                    }
                                }
                                else
                                {
                                    System.out.print("Unsucessful Contact insert!");
                                }
                            }
                          else{
                              System.out.print("RS not equals 0");
                          }
                        }
                     
                    else{
                        
                        JOptionPane.showMessageDialog(null,"Unable to Connect Database");
                    }

                    } catch (SQLException | ClassNotFoundException ex) {
                         Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
                else{
                    
                }
            }});

        }
    });
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                p1.removeAll();
                p1.setBounds(50,200,1400,700);
                p1.setBackground(Color.WHITE);
                p1.setVisible(true);
                l1.setText("Edit Case Details");
                l1.setBounds(5,2,300,40);
                //l1.setBackground(Color.gray);
                l1.setForeground(Color.BLACK);
                l1.setFont(new Font("Serif", Font.BOLD, 24));
                l1.setVisible(true);
                p1.add(l1);
                //---search by Docket Number---
                l2.setText("Docket Number :");
                l2.setBounds(5,70,140,20);
                l2.setForeground(Color.BLACK);
                //l2.setBackground(Color.gray);
                l2.setFont(new Font("Serif", Font.PLAIN, 18));
                l2.setVisible(true);
                p1.add(l2);
                TextField tb_docket=new TextField();
                tb_docket.setBounds(160, 65,210,30);
                tb_docket.setForeground(Color.BLACK);
                tb_docket.setFont(new Font("Serif", Font.PLAIN, 18));
                //tb_docket.setName("tb_Docket");
                tb_docket.setVisible(true);
                p1.add(tb_docket);
                //Edit form
                l3.setText("Per Hour Charges :");
                l3.setBounds(5,130,140,20);
                l3.setForeground(Color.BLACK);
                //l3.setBackground(Color.gray);
                l3.setFont(new Font("Serif", Font.PLAIN, 18));
                l3.setVisible(true);
                p1.add(l3);
                TextField tb_hrCharges=new TextField();
                tb_hrCharges.setBounds(160, 125,210,30);
                tb_hrCharges.setForeground(Color.BLACK);
                tb_hrCharges.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_hrCharges.setName("tb_hrCharges");
                tb_hrCharges.setVisible(true);
                p1.add(tb_hrCharges);

                l4.setText("Status :");
                l4.setBounds(5,160,140,20);
                l4.setForeground(Color.BLACK);
                //l4.setBackground(Color.gray);
                l4.setFont(new Font("Serif", Font.PLAIN, 18));
                l4.setVisible(true);
                p1.add(l4);
                TextField tb_Status=new TextField("Open");
                tb_Status.setBounds(160, 155,210,30);
                tb_Status.setForeground(Color.BLACK);
                tb_Status.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_Status.setName("tb_Status");
                tb_Status.setVisible(true);
                tb_Status.addFocusListener(new FocusListener(){
                    public void focusGained(FocusEvent e){
                        tb_Status.setText("");
                        tb_Status.setForeground(Color.BLACK);
                        tb_Status.setFont(new Font("Serif", Font.PLAIN, 18));
                    }
                    public void focusLost(FocusEvent e){

                    }
                });
                p1.add(tb_Status);

                l5.setText("Enter Client Details");
                l5.setBounds(5,190,300,40);
                //l1.setBackground(Color.gray);
                l5.setForeground(Color.BLACK);
                l5.setFont(new Font("Serif", Font.BOLD, 20));
                l5.setVisible(true);
                p1.add(l5);
                l16.setText("Last Name:");
                l16.setBounds(5,240,125,20);
                l16.setForeground(Color.BLACK);
                //l5.setBackground(Color.gray);
                l16.setFont(new Font("Serif", Font.PLAIN, 18));
                l16.setVisible(true);
                p1.add(l16);
                TextField tb_ln=new TextField();
                tb_ln.setBounds(160, 235,210,30);
                tb_ln.setForeground(Color.BLACK);
                tb_ln.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_ln.setName("Phone_tb");
                tb_ln.setVisible(true);
                p1.add(tb_ln);
                
                l17.setText("Email:");
                l17.setBounds(5,270,125,20);
                l17.setForeground(Color.BLACK);
                //l6.setBackground(Color.gray);
                l17.setFont(new Font("Serif", Font.PLAIN, 18));
                l17.setVisible(true);
                p1.add(l17);
                TextField tb_e=new TextField("Street");
                tb_e.setBounds(160, 265,210,30);
                tb_e.setForeground(Color.LIGHT_GRAY);
                tb_e.setFont(new Font("Serif", Font.ITALIC, 18));
                tb_e.setName("Address_tb1");
                tb_e.setVisible(true);
                p1.add(tb_e);

                l6.setText("Phone:");
                l6.setBounds(5,300,125,20);
                l6.setForeground(Color.BLACK);
                //l5.setBackground(Color.gray);
                l6.setFont(new Font("Serif", Font.PLAIN, 18));
                l6.setVisible(true);
                p1.add(l6);
                TextField tb_ph=new TextField();
                tb_ph.setBounds(160, 295,210,30);
                tb_ph.setForeground(Color.BLACK);
                tb_ph.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_ph.setName("Phone_tb");
                tb_ph.setVisible(true);
                p1.add(tb_ph);

                l7.setText("Address:");
                l7.setBounds(5,330,125,20);
                l7.setForeground(Color.BLACK);
                //l6.setBackground(Color.gray);
                l7.setFont(new Font("Serif", Font.PLAIN, 18));
                l7.setVisible(true);
                p1.add(l7);
                TextField tb_add1=new TextField("Street");
                tb_add1.setBounds(160, 325,210,30);
                tb_add1.setForeground(Color.LIGHT_GRAY);
                tb_add1.setFont(new Font("Serif", Font.ITALIC, 18));
                tb_add1.setName("Address_tb1");
                tb_add1.setVisible(true);

                tb_add1.addFocusListener(new FocusListener(){
                    public void focusGained(FocusEvent e){
                        tb_add1.setText("");
                        tb_add1.setForeground(Color.BLACK);
                        tb_add1.setFont(new Font("Serif", Font.PLAIN, 18));
                    }
                    public void focusLost(FocusEvent e){

                    }
                });
                p1.add(tb_add1);

                TextField tb_add2=new TextField("City");
                tb_add2.setBounds(160, 355,210,30);
                tb_add2.setForeground(Color.LIGHT_GRAY);
                tb_add2.setFont(new Font("Serif", Font.ITALIC, 18));
                tb_add2.setName("Address_tb2");
                tb_add2.setVisible(true);

                tb_add2.addFocusListener(new FocusListener(){
                    public void focusGained(FocusEvent e){
                        tb_add2.setText("");
                        tb_add2.setForeground(Color.BLACK);
                        tb_add2.setFont(new Font("Serif", Font.PLAIN, 18));
                    }
                    public void focusLost(FocusEvent e){

                    }
                });

                p1.add(tb_add2);
                TextField tb_add3=new TextField("State");
                tb_add3.setBounds(160, 385,210,30);
                tb_add3.setForeground(Color.LIGHT_GRAY);
                tb_add3.setFont(new Font("Serif", Font.ITALIC, 18));
                tb_add3.setName("Address_tb3");
                tb_add3.setVisible(true);

                tb_add3.addFocusListener(new FocusListener(){
                    public void focusGained(FocusEvent e){
                        tb_add3.setText("");
                        tb_add3.setForeground(Color.BLACK);
                        tb_add3.setFont(new Font("Serif", Font.PLAIN, 18));
                    }
                    public void focusLost(FocusEvent e){

                    }
                });

                p1.add(tb_add3);
                TextField tb_add4=new TextField("Zip");
                tb_add4.setBounds(160, 415,210,30);
                tb_add4.setForeground(Color.LIGHT_GRAY);
                tb_add4.setFont(new Font("Serif", Font.ITALIC, 18));
                tb_add4.setName("Address_tb4");
                tb_add4.setVisible(true);

                tb_add4.addFocusListener(new FocusListener(){
                    public void focusGained(FocusEvent e){
                        tb_add4.setText("");
                        tb_add4.setForeground(Color.BLACK);
                        tb_add4.setFont(new Font("Serif", Font.PLAIN, 18));
                    }
                    public void focusLost(FocusEvent e){

                    }
                });

                p1.add(tb_add4);

               
                
                Button bSearchClient=new Button("Search");
                bSearchClient.setBounds(160,95,100,30);
                bSearchClient.setForeground(Color.BLACK);
                bSearchClient.setBackground(Color.WHITE);
                p1.add(bSearchClient);
                 bSearchClient.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                   
                   docket=tb_docket.getText();
                   tb_docket.setEditable(false);
                   try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        con=DriverManager.getConnection(connectionUrl);

                        String query = "Select Case_ID,Contact_ID,Docket_Number,Per_Hour_Charge,Case_Status from LCase where Docket_Number=?";
                        PreparedStatement ps = con.prepareStatement(query);
                        ps.setString(1, docket);
                        rs=ps.executeQuery();
                        if(rs.next()){
                            //avinash
                            caseid=rs.getInt("Case_ID");
                            tb_hrCharges.setText(rs.getString("Per_Hour_Charge"));
                            tb_Status.setText(rs.getString("Case_Status"));
                            contact_id = rs.getInt("Contact_ID");
                            String query1 = "Select Phone, Street, City, State, Zip from Contact where Contact_ID=?";
                            PreparedStatement ps1 = con.prepareStatement(query1);
                            ps1.setInt(1,contact_id);
                            rs1=ps1.executeQuery();
                            if(rs1.next()){
                                tb_ph.setText(rs1.getString("Phone"));
                                tb_add1.setText(rs1.getString("Street"));
                                tb_add2.setText(rs1.getString("City"));
                                tb_add3.setText(rs1.getString("State"));
                                tb_add4.setText(rs1.getString("Zip"));
                            }else{
                                JOptionPane.showMessageDialog(null,"Unable to fetch client details!");
                            }
                            
                            
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Case does not exist! Enter valid Docket Number!");
                        }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
            }
                
        }});
                
        Button bResetClient=new Button("Reset");
        bResetClient.setBounds(165,450,100,30);
        bResetClient.setForeground(Color.BLACK);
        bResetClient.setBackground(Color.WHITE);
        p1.add(bResetClient);
        //Navigation Bar 
            Button home=new Button("Home");
            home.setBounds(600,565,100,30);
            home.setForeground(Color.BLACK);
            home.setBackground(Color.WHITE);
            home.setVisible(true);
            p1.add(home);
             home.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                homebutton.doClick();
                }});
            Button back=new Button("Back");
            back.setBounds(700,565,100,30);
            back.setForeground(Color.BLACK);
            back.setBackground(Color.WHITE);
            back.setVisible(true);
            p1.add(back);
            back.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                homebutton.doClick();
                }});
            
            Button next=new Button("Next");
            next.setBounds(800,565,100,30);
            next.setForeground(Color.BLACK);
            next.setBackground(Color.WHITE);
            next.setVisible(true);
            p1.add(next);
            next.setEnabled(false);
            
            Button logout=new Button("Logout");
            logout.setBounds(900,565,100,30);
            logout.setForeground(Color.BLACK);
            logout.setBackground(Color.WHITE);
            logout.setVisible(true);
            p1.add(logout);
            logout.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                logoutbutton.doClick();
                }});
            
            Button exit=new Button("Exit");
            exit.setBounds(1000,565,100,30);
            exit.setForeground(Color.BLACK);
            exit.setBackground(Color.WHITE);
            exit.setVisible(true);
            p1.add(exit);
            exit.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                System.exit(0);
                }});
            //end of Navigation

        bResetClient.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {

           tb_docket.setText(" ");
           tb_hrCharges.setText(" ");
           tb_Status.setText(" ");
           tb_ph.setText(" ");
           tb_add1.setText(" ");
           tb_add2.setText(" ");
           tb_add3.setText(" ");
           tb_add4.setText(" ");

        }});
        Button bUpdate=new Button("Update");
        bUpdate.setBounds(265,390,100,30);
        bUpdate.setForeground(Color.BLACK);
        bUpdate.setBackground(Color.WHITE);
        p1.add(bUpdate);

        bUpdate.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            String newPHC=tb_hrCharges.getText();
            String newStatus=tb_Status.getText();
            String newPhone=tb_ph.getText();
            String newStreet=tb_add1.getText();
            String newCity=tb_add2.getText();
            String newState=tb_add3.getText();
            String newZip=tb_add4.getText();
            int reply =JOptionPane.showConfirmDialog(null, "Confirm values to Update?", "Update Case", JOptionPane.YES_NO_OPTION);
            if(reply==JOptionPane.YES_OPTION){
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection(connectionUrl);

                String query = "Update LCase set Per_Hour_Charge=?,Case_Status=?  where Case_ID=?";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1, newPHC);
                ps.setString(2, newStatus);
                ps.setInt(3, caseid);

                if(ps.executeUpdate()!=0){

                    String query1 = "Update Contact set Phone=?, Street=?, City=?, State=?, Zip=? where Contact_ID=?";
                    PreparedStatement ps1 = con.prepareStatement(query1);
                    ps1.setString(1, newPhone);
                    ps1.setString(2, newStreet);
                    ps1.setString(3, newCity);
                    ps1.setString(4, newState);
                    ps1.setString(5, newZip);
                    ps1.setInt(6,contact_id);
                    if(ps1.executeUpdate()!=0){
                        JOptionPane.showMessageDialog(null,"Updated Sucessfully!");
                        p1.removeAll();
                    }else{
                        JOptionPane.showMessageDialog(null,"Update Failed!");
                    }
                    }
                else{
                    JOptionPane.showMessageDialog(null,"Case does not exist! Enter valid Docket Number!");
                }
                } catch (SQLException | ClassNotFoundException ex) {
                     Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
                } 
            }
            else{

            }
          }});
        }
        });
        b3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                p1.removeAll();
                p1.setBounds(800,200,580,510);
                p1.setBackground(Color.WHITE);
                p1.setVisible(true);
                l1.setText("Search Case Details");
                l1.setBounds(5,2,300,40);
                //l1.setBackground(Color.gray);
                l1.setForeground(Color.BLACK);
                l1.setFont(new Font("Serif", Font.BOLD, 24));
                l1.setVisible(true);
                p1.add(l1);
                //---search by Docket Number---
                l2.setText("Docket Number :");
                l2.setBounds(5,70,140,20);
                l2.setForeground(Color.BLACK);
                //l2.setBackground(Color.gray);
                l2.setFont(new Font("Serif", Font.PLAIN, 18));
                l2.setVisible(true);
                p1.add(l2);
                TextField tb_docket=new TextField();
                tb_docket.setBounds(160, 65,210,30);
                tb_docket.setForeground(Color.BLACK);
                tb_docket.setFont(new Font("Serif", Font.PLAIN, 18));
                //tb_docket.setName("tb_Docket");
                tb_docket.setVisible(true);
                p1.add(tb_docket);
                
                Button bSearchCase=new Button("Search");
                bSearchCase.setBounds(160,95,100,30);
                bSearchCase.setForeground(Color.BLACK);
                bSearchCase.setBackground(Color.WHITE);
                p1.add(bSearchCase);
                
                l3.setText("Per Hour Charge:");
                l3.setBounds(5,130,140,20);
                l3.setForeground(Color.BLACK);
                //l3.setBackground(Color.gray);
                l3.setFont(new Font("Serif", Font.PLAIN, 18));
                l3.setVisible(true);
                p1.add(l3);
                Label phc=new Label();
                phc.setBounds(160, 125,210,30);
                phc.setForeground(Color.BLACK);
                phc.setFont(new Font("Serif", Font.PLAIN, 18));
                phc.setVisible(true);
                p1.add(phc);

                l4.setText("Status:");
                l4.setBounds(5,160,140,20);
                l4.setForeground(Color.BLACK);
                l4.setFont(new Font("Serif", Font.PLAIN, 18));
                l4.setVisible(true);
                p1.add(l4);
                Label status=new Label();
                status.setBounds(160, 155,210,30);
                status.setForeground(Color.BLACK);
                status.setFont(new Font("Serif", Font.PLAIN, 18));
                status.setName("tb_Status");
                p1.add(status);

                l5.setText("Client Details");
                l5.setBounds(5,190,300,40);
                l5.setForeground(Color.BLACK);
                l5.setFont(new Font("Serif", Font.BOLD, 20));
                l5.setVisible(true);
                p1.add(l5);

                l6.setText("Name:");
                l6.setBounds(5,240,125,20);
                l6.setForeground(Color.BLACK);
                //l5.setBackground(Color.gray);
                l6.setFont(new Font("Serif", Font.PLAIN, 18));
                l6.setVisible(true);
                p1.add(l6);
                Label name=new Label();
                name.setBounds(160, 235,210,30);
                name.setForeground(Color.BLACK);
                name.setFont(new Font("Serif", Font.PLAIN, 18));
                name.setVisible(true);
                p1.add(name);

                l7.setText("Phone:");
                l7.setBounds(5,270,125,20);
                l7.setForeground(Color.BLACK);
                l7.setFont(new Font("Serif", Font.PLAIN, 18));
                l7.setVisible(true);
                p1.add(l7);
                Label phone=new Label();
                phone.setBounds(160, 265,210,30);
                phone.setForeground(Color.BLACK);
                phone.setFont(new Font("Serif", Font.ITALIC, 18));
                phone.setVisible(true);
                p1.add(phone);
                
                l8.setText("Address:");
                l8.setBounds(5,300,125,20);
                l8.setForeground(Color.BLACK);
                l8.setFont(new Font("Serif", Font.PLAIN, 18));
                l8.setVisible(true);
                p1.add(l8);
                Label add1=new Label();
                add1.setBounds(160, 295,210,30);
                add1.setForeground(Color.BLACK);
                add1.setFont(new Font("Serif", Font.ITALIC, 18));
                add1.setVisible(true);
                p1.add(add1);
                Label add2=new Label();
                add2.setBounds(160, 325,210,30);
                add2.setForeground(Color.BLACK);
                add2.setFont(new Font("Serif", Font.ITALIC, 18));
                add2.setName("Address_tb3");
                add2.setVisible(true);
                p1.add(add2);
                Label add3=new Label();
                add3.setBounds(160, 355,210,30);
                add3.setForeground(Color.BLACK);
                add3.setFont(new Font("Serif", Font.ITALIC, 18));
                add3.setName("Address_tb4");
                add3.setVisible(true);
                p1.add(add3);
                bSearchCase.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                   
                   docket=tb_docket.getText();
                   tb_docket.setEditable(false);
                   try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        con=DriverManager.getConnection(connectionUrl);

                        String query = "Select Case_ID,Contact_ID,Docket_Number,Per_Hour_Charge,Case_Status from LCase where Docket_Number=?";
                        PreparedStatement ps = con.prepareStatement(query);
                        ps.setString(1, docket);
                        rs=ps.executeQuery();
                        if(rs.next()){
                            //avinash
                            caseid=rs.getInt("Case_ID");
                            phc.setText(rs.getString("Per_Hour_Charge"));
                            status.setText(rs.getString("Case_Status"));
                            contact_id = rs.getInt("Contact_ID");
                            String query1 = "Select FirstName, LastName,Phone, Street, City, State, Zip from Contact where Contact_ID=?";
                            PreparedStatement ps1 = con.prepareStatement(query1);
                            ps1.setInt(1,contact_id);
                            rs1=ps1.executeQuery();
                            if(rs1.next()){
                                name.setText(rs1.getString("FirstName")+" "+rs1.getString("LastName"));
                                phone.setText(rs1.getString("Phone"));
                                add1.setText(rs1.getString("Street"));
                                add2.setText(rs1.getString("City"));
                                add3.setText(rs1.getString("State")+"-"+rs1.getString("Zip"));
                            }else{
                                JOptionPane.showMessageDialog(null,"Unable to fetch case details!");
                            }
                            
                            
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Case does not exist! Enter valid Docket Number!");
                        }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                }});
            }});
        this.add(p1);
        }
        else{
         JOptionPane.showMessageDialog(null,"Please login to access!");
        }
    

    }//GEN-LAST:event_caseButtonActionPerformed

    private void retainerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retainerButtonActionPerformed
    // TODO add your handling code here:
     backbutton.setEnabled(true);
        nextbutton.setEnabled(true);
    infoPanel.removeAll();
    this.remove(infoPanel);
    p1.removeAll();
    this.remove(p1);
    if(logPri==true){
           //Buttons for creating new retainer and changing existing values
            Button b1=new Button("New Retainer");
            b1.setFont(new Font("Serif", Font.PLAIN, 16));
            b1.setBounds(4,4,235,30);
            b1.setBackground(Color.WHITE);
            b1.setForeground(Color.BLACK);
            p1.add(b1);
            Button b2=new Button("Edit Retainer");
            b2.setFont(new Font("Serif", Font.PLAIN, 16));
            b2.setBounds(4,32,235,30);
            b2.setBackground(Color.WHITE);
            b2.setForeground(Color.BLACK);
            p1.add(b2);
            //Panel visibility and size
            p1.setBackground(Color.WHITE);
            p1.setBounds(605,145, 245, 100);
            
            p1.setVisible(true);
            this.add(p1);
            b1.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    p1.removeAll();
                    p1.setBounds(120,200,580,350);
                    p1.setBackground(Color.WHITE);
                    p1.setVisible(true);
                    l1.setText("Enter Retainer Details");
                    l1.setBounds(5,2,300,40);
                    //l1.setBackground(Color.gray);
                    l1.setForeground(Color.BLACK);
                    l1.setFont(new Font("Serif", Font.BOLD, 24));
                    l1.setVisible(true);
                    p1.add(l1);

                    l7.setText("Docket Number :");
                    l7.setBounds(5,70,150,20);
                    l7.setForeground(Color.BLACK);
                    //l2.setBackground(Color.gray);
                    l7.setFont(new Font("Serif", Font.PLAIN, 18));
                    l7.setVisible(true);
                    p1.add(l7);
                    TextField tb_docket=new TextField();
                    tb_docket.setBounds(160, 65,210,30);
                    tb_docket.setForeground(Color.BLACK);
                    tb_docket.setFont(new Font("Serif", Font.PLAIN, 18));
                    tb_docket.setVisible(true);
                    p1.add(tb_docket);
                    
             
                    //-----------------Search button here------------------------------//
                    Button bSearchCase=new Button("Search");
                    bSearchCase.setBounds(160,95,100,30);
                    bSearchCase.setForeground(Color.BLACK);
                    bSearchCase.setBackground(Color.WHITE);
                    p1.add(bSearchCase);
                      bSearchCase.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                   
             
                   
                   docket=tb_docket.getText();
                   
                   try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        con=DriverManager.getConnection(connectionUrl);

                        String query = "Select Case_ID,Contact_ID from LCase where Case_ID=(Select Case_ID from LCase where Docket_Number=?);";
                        PreparedStatement ps = con.prepareStatement(query);
                        ps.setString(1, docket);
                        rs=ps.executeQuery();
                        if(rs.next()){
                            
                                caseid=rs.getInt("Case_ID");
                                String query2 = "Select * from Contact where Contact_ID=?";
                                PreparedStatement ps2 = con.prepareStatement(query2);
                                ps2.setInt(1,rs.getInt("Contact_ID"));
                                rs2=ps2.executeQuery();
                               
                                if(rs2.next()){

                                        JOptionPane.showMessageDialog(null, "Client: "+rs2.getString("FirstName")+" "+rs2.getString("LastName"));
//                                     
                                }
                                else{
                                   JOptionPane.showMessageDialog(null,"Unable to retrieve data!");
                                }

                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Case does not exist! Enter valid Docket Number!");
                        }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                }});


                    l2.setText("Date:");
                    l2.setBounds(5,130,150,20);
                    l2.setForeground(Color.BLACK);
                    l2.setFont(new Font("Serif", Font.PLAIN, 18));
                    l2.setVisible(true);
                    p1.add(l2);
                    
                    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                    Date date = new Date();
                   
                    TextField tb_Date=new TextField();
                    tb_Date.setBounds(160, 125,210,30);
                    tb_Date.setForeground(Color.BLACK);
                    tb_Date.setFont(new Font("Serif", Font.PLAIN, 18));
                    tb_Date.setText(dateFormat.format(date));
                    tb_Date.setVisible(true);
                    p1.add(tb_Date);

                    l3.setText("Transaction Type:");
                    l3.setBounds(5,160,150,20);
                    l3.setForeground(Color.BLACK);
                    //l3.setBackground(Color.gray);
                    l3.setFont(new Font("Serif", Font.PLAIN, 18));
                    l3.setVisible(true);
                    p1.add(l3);
                    TextField tb_TType=new TextField();
                    tb_TType.setBounds(160, 155,210,30);
                    tb_TType.setForeground(Color.BLACK);
                    tb_TType.setFont(new Font("Serif", Font.PLAIN, 18));
                    tb_TType.setText("Credit");
                    tb_TType.setEditable(false);
                    tb_TType.setVisible(true);
                    p1.add(tb_TType);

                    l4.setText("Amount:");
                    l4.setBounds(5,190,150,20);
                    l4.setForeground(Color.BLACK);
                    //l4.setBackground(Color.gray);
                    l4.setFont(new Font("Serif", Font.PLAIN, 18));
                    l4.setVisible(true);
                    p1.add(l4);
                    TextField tb_Amt=new TextField();
                    tb_Amt.setBounds(160, 185,210,30);
                    tb_Amt.setForeground(Color.BLACK);
                    tb_Amt.setFont(new Font("Serif", Font.PLAIN, 18));
                    tb_Amt.setName("Amount_tb");
                    tb_Amt.setVisible(true);
                    p1.add(tb_Amt);

                  
                    Button bResetTrans=new Button("Reset");
                    bResetTrans.setBounds(160,215,100,30);
                    bResetTrans.setForeground(Color.BLACK);
                    bResetTrans.setBackground(Color.WHITE);
                    p1.add(bResetTrans);
                    bResetTrans.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                tb_docket.setText(" ");
                tb_Date.setText(" ");
                tb_TType.setText(" ");
                tb_Amt.setText(" ");
                
                
                }});
                    

                    Button bSaveTrans=new Button("Save");
                    bSaveTrans.setBounds(270,215,100,30);
                    bSaveTrans.setBackground(Color.WHITE);
                    bSaveTrans.setForeground(Color.BLACK);
                    p1.add(bSaveTrans);
                    bSaveTrans.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    p1.removeAll();
                    String dt=tb_Date.getText();
                    String tt=tb_TType.getText();
                    String amt=tb_Amt.getText();
                    tb_docket.setEditable(false);
                   try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        con=DriverManager.getConnection(connectionUrl);

                        String query2 = "Insert into Retainer (Case_ID,DOT,Transaction_Type,Amount)values(?,?,?,?);";
                                PreparedStatement ps2 = con.prepareStatement(query2);
                                ps2.setInt(1,caseid);
                                ps2.setString(2, dt);
                                ps2.setString(3, tt);
                                ps2.setString(4, amt);
                                if(ps2.executeUpdate()!=0){
                                    
                                  String query3 = "Select max(Transaction_ID) as tmax from Retainer;";
                                  PreparedStatement ps3 = con.prepareStatement(query3);
                                  rs3=ps3.executeQuery();
                                  if(rs3.next())
                                  {JOptionPane.showMessageDialog(null,"Transaction Saved! Transaction ID: "+rs3.getInt("tmax"));}
                                  //JOptionPane.showMessageDialog(null, "Transaction Saved!");
                                  
                                }
                                else{
                                    JOptionPane.showMessageDialog(null,"Transaction could not be saved!");
                                    
                                }
                   }catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
                }
                 p1.removeAll();
                
                }});
                  
                    
                }
            });
            b2.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    p1.removeAll();
                    p1.setBounds(120,200,480,350);
                    p1.setBackground(Color.WHITE);
                    p1.setVisible(true);
                    l1.setText("Edit Retainer Details");
                    l1.setBounds(5,2,300,40);
                    //l1.setBackground(Color.gray);
                    l1.setForeground(Color.BLACK);
                    l1.setFont(new Font("Serif", Font.BOLD, 24));
                    l1.setVisible(true);
                    p1.add(l1);

                    l7.setText("Transaction ID :");
                    l7.setBounds(5,70,140,20);
                    l7.setForeground(Color.BLACK);
                    //l2.setBackground(Color.gray);
                    l7.setFont(new Font("Serif", Font.PLAIN, 18));
                    l7.setVisible(true);
                    p1.add(l7);
                    TextField tb_retainer=new TextField();
                    tb_retainer.setBounds(160, 65,210,30);
                    tb_retainer.setForeground(Color.BLACK);
                    tb_retainer.setFont(new Font("Serif", Font.PLAIN, 18));
                    tb_retainer.setName("tb_TranID");
                    tb_retainer.setVisible(true);
                    p1.add(tb_retainer);
                    //-----------------Search button here------------------------------//
                    Button bSearchTans=new Button("Search");
                    bSearchTans.setBounds(160,95,100,30);
                    bSearchTans.setForeground(Color.BLACK);
                    bSearchTans.setBackground(Color.WHITE);
                    p1.add(bSearchTans);

                    l2.setText("Date :");
                    l2.setBounds(5,130,140,20);
                    l2.setForeground(Color.BLACK);
                    //l3.setBackground(Color.gray);
                    l2.setFont(new Font("Serif", Font.PLAIN, 18));
                    l2.setVisible(true);
                    p1.add(l2);
                    TextField tb_date=new TextField();
                    tb_date.setBounds(160, 125,210,30);
                    tb_date.setForeground(Color.BLACK);
                    tb_date.setFont(new Font("Serif", Font.PLAIN, 18));
                    tb_date.setName("tb_date");
                    tb_date.setVisible(true);
                    p1.add(tb_date);

                    l3.setText("Transaction Type :");
                    l3.setBounds(5,160,140,20);
                    l3.setForeground(Color.BLACK);
                    //l3.setBackground(Color.gray);
                    l3.setFont(new Font("Serif", Font.PLAIN, 18));
                    l3.setVisible(true);
                    p1.add(l3);
                    TextField tb_trans=new TextField();
                    tb_trans.setBounds(160, 155,210,30);
                    tb_trans.setForeground(Color.BLACK);
                    tb_trans.setFont(new Font("Serif", Font.PLAIN, 18));
                    tb_trans.setEditable(false);
                    tb_trans.setVisible(true);
                    p1.add(tb_trans);

                    l4.setText("Amount :");
                    l4.setBounds(5,190,140,20);
                    l4.setForeground(Color.BLACK);
                    //l4.setBackground(Color.gray);
                    l4.setFont(new Font("Serif", Font.PLAIN, 18));
                    l4.setVisible(true);
                    p1.add(l4);
                    TextField tb_Amt=new TextField();
                    tb_Amt.setBounds(160, 185,210,30);
                    tb_Amt.setForeground(Color.BLACK);
                    tb_Amt.setFont(new Font("Serif", Font.PLAIN, 18));
                    tb_Amt.setName("tb_Amt");
                    tb_Amt.setVisible(true);
                    p1.add(tb_Amt);

           

                    Button bUpdateReatainer=new Button("Update");
                    bUpdateReatainer.setBounds(160, 215,100,30);
                    bUpdateReatainer.setForeground(Color.BLACK);
                    bUpdateReatainer.setBackground(Color.WHITE);
                    p1.add(bUpdateReatainer);

                    Button bSaveReatainer=new Button("Reset");
                    bSaveReatainer.setBounds(270,215,100,30);
                    bSaveReatainer.setForeground(Color.BLACK);
                    bSaveReatainer.setBackground(Color.WHITE);
                    p1.add(bSaveReatainer);

                bSearchTans.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                   
                   
                   
                   int tranID=Integer.parseInt(tb_retainer.getText());
                   
                   try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        con=DriverManager.getConnection(connectionUrl);

                        String query = "Select * from Retainer where Transaction_ID=?;";
                        PreparedStatement ps = con.prepareStatement(query);
                        ps.setInt(1, tranID);
                        rs=ps.executeQuery();
                        if(rs.next()){
                            tb_date.setText(rs.getString("DOT"));
                            tb_trans.setText(rs.getString("Transaction_Type"));
                            tb_Amt.setText(rs.getString("Amount"));
                            tb_retainer.setEditable(false);

                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Case does not exist! Enter valid Docket Number!");
                        }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
            });
            bUpdateReatainer.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                   
                           
                   try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        con=DriverManager.getConnection(connectionUrl);

                        String query = "Update Retainer set DOT=?,Transaction_Type=?, Amount=? where Transaction_ID=?;";
                        PreparedStatement ps = con.prepareStatement(query);
                        
                        ps.setString(1,tb_date.getText());
                        ps.setString(2,tb_trans.getText());
                        ps.setString(3,tb_Amt.getText());
                        ps.setString(4, tb_retainer.getText());
                      
                        if(ps.executeUpdate()!=0){
                         
                            JOptionPane.showMessageDialog(null,"Transaction Updated!");
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Update failed!");
                        }
                        } catch (SQLException | ClassNotFoundException ex) {
                              Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
                         }
            }});
                   
    }});
    this.add(p1);
    }
    else{
        JOptionPane.showMessageDialog(null,"Please login to access!");
    }

    }//GEN-LAST:event_retainerButtonActionPerformed

    private void billButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billButtonActionPerformed
        // TODO add your handling code here:
         backbutton.setEnabled(true);
        nextbutton.setEnabled(true);
         infoPanel.removeAll();
        this.remove(infoPanel);
         p1.removeAll();
        this.remove(p1);
    if(logPri==true){
        
        //Buttons for creating new transaction and changing existing values
        Button b1=new Button("New Bill");
        b1.setFont(new Font("Serif", Font.PLAIN, 16));
        b1.setBounds(4,4,170,30);
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        p1.add(b1);
        Button b2=new Button("Edit Bill");
        b2.setBounds(4,32,170,30);
        b2.setBackground(Color.WHITE);
        b2.setFont(new Font("Serif", Font.PLAIN, 16));
        b2.setForeground(Color.BLACK);
        p1.add(b2);

        //Panel visibility and size
        p1.setBackground(Color.WHITE);
        p1.setBounds(860, 145, 180, 65);
        p1.setVisible(true);
        this.add(p1);
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                p1.removeAll();
                p1.setBounds(120,200,480,350);
                p1.setBackground(Color.WHITE);
                p1.setVisible(true);
                l1.setText("Enter Bill Details");
                l1.setBounds(5,2,300,40);
                //l1.setBackground(Color.gray);
                l1.setForeground(Color.BLACK);
                l1.setFont(new Font("Serif", Font.BOLD, 24));
                l1.setVisible(true);
                p1.add(l1);

                l2.setText("Date:");
                l2.setBounds(5,70,150,20);
                l2.setForeground(Color.BLACK);
                //l2.setBackground(Color.gray);
                l2.setFont(new Font("Serif", Font.PLAIN, 18));
                l2.setVisible(true);
                p1.add(l2);
                
                 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                 Date date = new Date();
                TextField tb_Date=new TextField();
                tb_Date.setBounds(160, 65,210,30);
                tb_Date.setForeground(Color.BLACK);
                tb_Date.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_Date.setText(dateFormat.format(date));
                tb_Date.setEditable(false);
                tb_Date.setVisible(true);
                p1.add(tb_Date);

                l3.setText("Docket No.:");
                l3.setBounds(5,100,150,20);
                l3.setForeground(Color.BLACK);
                //l3.setBackground(Color.gray);
                l3.setFont(new Font("Serif", Font.PLAIN, 18));
                l3.setVisible(true);
                p1.add(l3);
                TextField tb_docket=new TextField();
                tb_docket.setBounds(160, 95,210,30);
                tb_docket.setForeground(Color.BLACK);
                tb_docket.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_docket.setName("CaseId_tb");
                tb_docket.setVisible(true);
                p1.add(tb_docket);

                l4.setText("Hours:");
                l4.setBounds(5,130,150,20);
                l4.setForeground(Color.BLACK);
                //l4.setBackground(Color.gray);
                l4.setFont(new Font("Serif", Font.PLAIN, 18));
                l4.setVisible(true);
                p1.add(l4);
                TextField tb_Hrs=new TextField();
                tb_Hrs.setBounds(160, 125,210,30);
                tb_Hrs.setForeground(Color.BLACK);
                tb_Hrs.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_Hrs.setName("Hours_tb");
                tb_Hrs.setVisible(true);
                p1.add(tb_Hrs);

                Button bReset=new Button("Reset");
                bReset.setBounds(160,160,100,30);
                bReset.setForeground(Color.BLACK);
                bReset.setBackground(Color.WHITE);
                p1.add(bReset);
                
                bReset.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        tb_Date.setText(" ");
                        tb_docket.setText(" ");
                        tb_Hrs.setText(" ");
                    }
                });
                
                
                
                Button bSave=new Button("Save");
                bSave.setBounds(270,160,100,30);
                bSave.setForeground(Color.BLACK);
                bSave.setBackground(Color.WHITE);
                p1.add(bSave);
                
                bSave.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        p1.removeAll();
                        String dt=tb_Date.getText();
                        String docketNum=tb_docket.getText();
                        String hrs=tb_Hrs.getText();
                        tb_docket.setEditable(false);
                        try {
                            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                            con=DriverManager.getConnection(connectionUrl);

                            
                            String query1 = "Select count(*) from LCase where Docket_Number=?;";
                            PreparedStatement ps1 = con.prepareStatement(query1);
                            ps1.setString(1,docketNum);
                            
                            ResultSet rs=ps1.executeQuery();
                            if(rs.next()){
                                
                                String query2 = "Insert into Bill (Case_ID,DOB,No_of_Hours)values((select Case_ID from LCase where Docket_Number=?),?,?);";
                                PreparedStatement ps2 = con.prepareStatement(query2);
                                ps2.setString(1,docketNum);
                                ps2.setString(2, dt);
                                ps2.setString(3, hrs);

                                if(ps2.executeUpdate()!=0){

                                    String query3 = "Select Per_Hour_Charge from LCase where Docket_Number=?;";
                                    PreparedStatement ps3 = con.prepareStatement(query3);
                                    ps3.setString(1, docketNum);
                                    rs3=ps3.executeQuery();
                                    if(rs3.next())
                                    {
                                        Double perHour = Double.parseDouble(rs3.getString("Per_Hour_Charge"));
                                        Double totalAmount = perHour * Double.parseDouble(hrs);
                                        JOptionPane.showMessageDialog(null,"Bill Saved! Amount Charged: $ "+totalAmount);
                                        
                                        String query4 = "Insert into Retainer (Case_ID,DOT,Transaction_Type,Amount)values((select Case_ID from LCase where Docket_Number=?),?,?,?);";
                                        PreparedStatement ps4 = con.prepareStatement(query4);
                                        ps4.setString(1,docketNum);
                                        ps4.setString(2, dt);
                                        ps4.setString(3, "Debit");
                                        ps4.setDouble(4, totalAmount);
                                        if(ps4.executeUpdate()!=0){
                                            JOptionPane.showMessageDialog(null, "Transaction Saved!");
                                        }
                                        else{
                                            JOptionPane.showMessageDialog(null,"Transaction could not be saved!");
                                        }
                                        
                                    }else{
                                        JOptionPane.showMessageDialog(null, "Failed to compute Total bill amount!");
                                    }
                                    
                                }else{
                                    JOptionPane.showMessageDialog(null,"Failed to insert Bill records!");
                                }
                                
                            }else{
                                JOptionPane.showMessageDialog(null,"Invalid Docket Number!");
                            }
                            
                            
                                    
                        }catch (SQLException | ClassNotFoundException ex) {
                            Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        p1.removeAll();
                    }
                });
                
            }
        });

        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                p1.removeAll();
                p1.setBounds(120,200,480,350);
                p1.setBackground(Color.WHITE);
                p1.setVisible(true);
                l1.setText("Edit Bill Details");
                l1.setBounds(5,2,300,40);
                //l1.setBackground(Color.gray);
                l1.setForeground(Color.BLACK);
                l1.setFont(new Font("Serif", Font.BOLD, 24));
                l1.setVisible(true);
                p1.add(l1);

                l7.setText("Bill Number :");
                l7.setBounds(5,70,140,20);
                l7.setForeground(Color.BLACK);
                //l2.setBackground(Color.gray);
                l7.setFont(new Font("Serif", Font.PLAIN, 18));
                l7.setVisible(true);
                p1.add(l7);
                TextField tb_TransID=new TextField();
                tb_TransID.setBounds(160, 65,210,30);
                tb_TransID.setForeground(Color.BLACK);
                tb_TransID.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_TransID.setName("tb_TransID");
                tb_TransID.setVisible(true);
                p1.add(tb_TransID);

                //-------------------search button-------------------------//
                Button bSearchClient=new Button("Search");
                bSearchClient.setBounds(160,95,100,30);
                bSearchClient.setForeground(Color.BLACK);
                bSearchClient.setBackground(Color.WHITE);
                p1.add(bSearchClient);
                
                l3.setText("Date :");
                l3.setBounds(5,130,140,20);
                l3.setForeground(Color.BLACK);
                //l3.setBackground(Color.gray);
                l3.setFont(new Font("Serif", Font.PLAIN, 18));
                l3.setVisible(true);
                p1.add(l3);
                TextField tb_Date=new TextField();
                tb_Date.setBounds(160, 125,210,30);
                tb_Date.setForeground(Color.BLACK);
                tb_Date.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_Date.setName("tb_Date");
                tb_Date.setVisible(true);
                p1.add(tb_Date);

                l4.setText("Docket No.:");
                l4.setBounds(5,160,140,20);
                l4.setForeground(Color.BLACK);
                //l4.setBackground(Color.gray);
                l4.setFont(new Font("Serif", Font.PLAIN, 18));
                l4.setVisible(true);
                p1.add(l4);
                TextField tb_CaseId=new TextField();
                tb_CaseId.setBounds(160, 155,210,30);
                tb_CaseId.setForeground(Color.BLACK);
                tb_CaseId.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_CaseId.setName("tb_CaseId");
                tb_CaseId.setVisible(true);
                p1.add(tb_CaseId);

                l5.setText("Hours :");
                l5.setBounds(5,190,140,20);
                l5.setForeground(Color.BLACK);
                //l5.setBackground(Color.gray);
                l5.setFont(new Font("Serif", Font.PLAIN, 18));
                l5.setVisible(true);
                p1.add(l5);
                TextField tb_hrs=new TextField();
                tb_hrs.setBounds(160, 185,210,30);
                tb_hrs.setForeground(Color.BLACK);
                tb_hrs.setFont(new Font("Serif", Font.PLAIN, 18));
                tb_hrs.setName("b_hrs");
                tb_hrs.setVisible(true);
                p1.add(tb_hrs);

                Button billUpdate=new Button("Update");
                billUpdate.setBounds(165,230,100,30);
                billUpdate.setForeground(Color.BLACK);
                billUpdate.setBackground(Color.WHITE);
                p1.add(billUpdate);

                Button bSaveTrans=new Button("Reset");
                bSaveTrans.setBounds(265,230,100,30);
                bSaveTrans.setForeground(Color.BLACK);
                bSaveTrans.setBackground(Color.WHITE);
                p1.add(bSaveTrans);
                
                bSearchClient.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
            
                int billID=Integer.parseInt(tb_TransID.getText());
                   
                   try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        con=DriverManager.getConnection(connectionUrl);

                        String query = "Select B.DOB as DOB, B.No_of_Hours as No_of_Hours, C.Docket_Number as Docket_Number from Bill B,LCase C where B.Bill_ID=? and C.Case_ID=B.Case_ID;";
                        PreparedStatement ps = con.prepareStatement(query);
                        ps.setInt(1, billID);
                        rs=ps.executeQuery();
                        if(rs.next()){
                            tb_Date.setText(rs.getString("DOB"));
                            tb_CaseId.setText(rs.getString("Docket_Number"));
                            tb_hrs.setText(rs.getString("No_of_Hours"));
                            tb_TransID.setEditable(false);

                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Bill does not exist! Enter valid Docket Number!");
                        }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
            }});
        billUpdate.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        int billID=Integer.parseInt(tb_TransID.getText());
                           
                   try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        con=DriverManager.getConnection(connectionUrl);

                        String query = "Update Bill set DOB=?, No_of_Hours=? where Bill_ID=?;";
                        PreparedStatement ps = con.prepareStatement(query);
                        
                        ps.setString(1,tb_Date.getText());
                        ps.setString(2,tb_hrs.getText());
                        ps.setInt(3,billID);
                       
                      
                        if(ps.executeUpdate()!=0){
                         
                            JOptionPane.showMessageDialog(null,"Bill Updated!");
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Update failed!");
                        }
                        } catch (SQLException | ClassNotFoundException ex) {
                              Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
                         }
            }});
                   

            }
        });
        this.add(p1);
        }
        else{
            JOptionPane.showMessageDialog(null,"Please login to access!");
        }
    }//GEN-LAST:event_billButtonActionPerformed

    private void queryrequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryrequestButtonActionPerformed
        // TODO add your handling code here:
         backbutton.setEnabled(true);
        nextbutton.setEnabled(true);
         infoPanel.removeAll();
        this.remove(infoPanel);
        p1.removeAll();
        this.remove(p1);
if(logPri==true){
        
        Button b1=new Button("Case Statement");
        b1.setFont(new Font("Serif", Font.PLAIN, 16));
        b1.setBackground(Color.WHITE);
        b1.setBounds(4,4,205,30);
        b1.setForeground(Color.BLACK);
        p1.add(b1);
        Button b2=new Button("Date Statement");
        b2.setBounds(4,32,205,30);
        b2.setFont(new Font("Serif", Font.PLAIN, 16));
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        p1.add(b2);
        //Panel visibility and size
        p1.setBackground(Color.WHITE);
        p1.setBounds(1050, 145, 215, 70);
        p1.setVisible(true);
        this.add(p1);
         b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            p1.removeAll();
            
            l1.setText("Enter the dates:");
            l1.setBounds(5,2,300,40);
            l1.setForeground(Color.BLACK);
            l1.setFont(new Font("Serif", Font.BOLD, 24));
            l1.setVisible(true);
            p1.add(l1);
            p1.setBounds(420,300,500,400);
            p1.setBackground(Color.WHITE);
            p1.setVisible(true);
       
            l20.setText("all fields are mandatory");
            l20.setBounds(105,2,300,40);
            l20.setForeground(Color.BLACK);
            l20.setFont(new Font("Serif", Font.BOLD, 14));
            l20.setVisible(true);
            p1.add(l20);
            l2.setText("Start Date:");
            l2.setBounds(5,50,140,20);
            l2.setForeground(Color.BLACK);
            l2.setFont(new Font("Serif", Font.PLAIN, 18));
            l2.setVisible(true);
            p1.add(l2);

            TextField tb_sDate=new TextField("yyyy-MM-dd");
            tb_sDate.setBounds(180, 45,210,30);
            tb_sDate.setForeground(Color.LIGHT_GRAY);
            tb_sDate.setFont(new Font("Serif", Font.ITALIC, 18));
            tb_sDate.setVisible(true);
            tb_sDate.addFocusListener(new FocusListener(){
                public void focusGained(FocusEvent e){
                    tb_sDate.setText("");
                    tb_sDate.setForeground(Color.BLACK);
                    tb_sDate.setFont(new Font("Serif", Font.PLAIN, 18));
                }
                public void focusLost(FocusEvent e){

                }
            });
            p1.add(tb_sDate);

            l3.setText("End Date:");
            l3.setBounds(5,90,140,20);
            l3.setForeground(Color.BLACK);
            l3.setFont(new Font("Serif", Font.PLAIN, 18));
            l3.setVisible(true);
            p1.add(l3);
            TextField tb_eDate=new TextField("yyyy-MM-dd");
            tb_eDate.setBounds(180, 85,210,30);
            tb_eDate.setForeground(Color.LIGHT_GRAY);
            tb_eDate.setFont(new Font("Serif", Font.ITALIC, 18));
            tb_eDate.setVisible(true);
            p1.add(tb_eDate);
              tb_eDate.addFocusListener(new FocusListener(){
                public void focusGained(FocusEvent e){
                    tb_eDate.setText("");
                    tb_eDate.setForeground(Color.BLACK);
                    tb_eDate.setFont(new Font("Serif", Font.PLAIN, 18));
                }
                public void focusLost(FocusEvent e){

                }
            });

            Button submit = new Button("Submit"); 
            submit.setBounds(180,140,210,40);
            submit.setFont(new Font("Serif", Font.PLAIN, 16));
            submit.setBackground(Color.WHITE);
            submit.setForeground(Color.BLACK);
            p1.add(submit);
            submit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection(connectionUrl);
                String sqlQ ="Select distinct LC.Docket_Number as Docket,LC.Per_Hour_Charge as PerHourCharge, LC.Case_Status as Status,"+
                "B.DateNTimeStamp as BillDate,B.Bill_ID as Bill_ID, B.No_of_Hours as No_of_hours From LCase LC , Bill B "+
                "Where LC.Employee_ID=? and LC.Case_ID=B.Case_ID and B.DateNTimeStamp between ? and ?";
                PreparedStatement ps = con.prepareStatement(sqlQ);
                ps.setInt(1,lawyer_id);
                ps.setString(2,tb_sDate.getText());
                ps.setString(3, tb_eDate.getText());
                rs=ps.executeQuery();
               
                    ResultSetMetaData metaData = rs.getMetaData();
      
                    HSSFWorkbook workbook = new HSSFWorkbook();
                    HSSFFont boldFont = workbook.createFont();
                    boldFont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
                    HSSFSheet sheet = workbook.createSheet("Date Statement");
             
                    HSSFRow rowhead = sheet.createRow((short) 0);
                    rowhead.createCell((short) 0).setCellValue("Docket Number");
                    rowhead.createCell((short) 1).setCellValue("Per Hour Charge");
                    rowhead.createCell((short) 2).setCellValue(" Status");
                    rowhead.createCell((short) 3).setCellValue("Bill Date");
                    rowhead.createCell((short) 4).setCellValue(" Bill_ID");
                    rowhead.createCell((short) 5).setCellValue("No_of_hours");
                    
                    
                    int i = 1;
                    while (rs.next()){
                        HSSFRow row = sheet.createRow((short) i);
                        row.createCell((short) 0).setCellValue(rs.getString("Docket"));
                        row.createCell((short) 1).setCellValue(rs.getString("PerHourCharge"));
                        row.createCell((short) 2).setCellValue(rs.getString("Status"));
                        row.createCell((short) 3).setCellValue(rs.getString("BillDate"));
                        row.createCell((short) 4).setCellValue(rs.getString("Bill_ID"));
                        row.createCell((short) 5).setCellValue(rs.getString("No_of_hours"));
                        i++;
                    }
                    String fileName = "E:/Reports/"+tb_sDate.getText()+" to "+tb_eDate.getText()+"_Report"+".xls";
                    FileOutputStream fileOut = new FileOutputStream(fileName);
                    workbook.write(fileOut);
                    fileOut.close();
                    JOptionPane.showMessageDialog(null,"Report generated! File name-"+fileName+"and Path- E:/Reports/");
                    } catch (ClassNotFoundException e1) {
                       e1.printStackTrace();
                    } catch (SQLException e1) {
                        e1.printStackTrace();
                    } catch (FileNotFoundException e1) {
                        e1.printStackTrace();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }

                }
            });
   }});
    b1.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e) {
       p1.removeAll();
            
            l1.setText("Case Satement :");
            l1.setBounds(5,2,300,40);
            l1.setForeground(Color.BLACK);
            l1.setFont(new Font("Serif", Font.BOLD, 24));
            l1.setVisible(true);
            p1.add(l1);
            p1.setBounds(420,300,500,400);
            p1.setBackground(Color.WHITE);
            p1.setVisible(true);
       
            l2.setText("Docket Number:");
            l2.setBounds(5,50,140,20);
            l2.setForeground(Color.BLACK);
            l2.setFont(new Font("Serif", Font.PLAIN, 18));
            l2.setVisible(true);
            p1.add(l2);

            TextField tb_docket=new TextField();
            tb_docket.setBounds(180, 45,210,30);
            tb_docket.setForeground(Color.BLACK);
            tb_docket.setFont(new Font("Serif", Font.PLAIN, 18));
            tb_docket.setVisible(true);
            p1.add(tb_docket);      
            Button submit = new Button("Submit"); 
            submit.setBounds(180,100,210,40);
            submit.setFont(new Font("Serif", Font.PLAIN, 16));
            submit.setBackground(Color.WHITE);
            submit.setForeground(Color.BLACK);
            p1.add(submit);
            submit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection(connectionUrl);
                String sqlQ ="Select LC.Per_Hour_Charge as PerHourCharge, LC.Case_Status as Status,B.DateNTimeStamp as BillDate ,B.Bill_ID, B.DOB, B.No_of_Hours, (LC.Per_Hour_Charge* B.No_of_Hours) as Bill_Amount from LCase LC, Bill B Where   LC.Docket_Number=? and LC.Case_ID=B.Case_ID ;";
                PreparedStatement ps = con.prepareStatement(sqlQ);
                ps.setString(1,tb_docket.getText());
                
                rs=ps.executeQuery();
               
                    ResultSetMetaData metaData = rs.getMetaData();
      
                    HSSFWorkbook workbook = new HSSFWorkbook();
                    HSSFFont boldFont = workbook.createFont();
                    boldFont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
                    HSSFSheet sheet = workbook.createSheet("Case Statement");
             
                    HSSFRow rowhead = sheet.createRow((short) 0);
            
                    rowhead.createCell((short) 0).setCellValue("Per Hour Charge");
                    rowhead.createCell((short) 1).setCellValue(" Status");
                    rowhead.createCell((short) 2).setCellValue("Bill Date");
                    rowhead.createCell((short) 3).setCellValue(" Bill Number");
                    rowhead.createCell((short) 4).setCellValue("No of Hours");
                     rowhead.createCell((short) 5).setCellValue("Amount");
                    
                    int i = 1;
                    while (rs.next()){
                        HSSFRow row = sheet.createRow((short) i);
                       
                        row.createCell((short) 0).setCellValue(rs.getString("PerHourCharge"));
                        row.createCell((short) 1).setCellValue(rs.getString("Status"));
                        row.createCell((short) 2).setCellValue(rs.getString("BillDate"));
                        row.createCell((short) 3).setCellValue(rs.getString("Bill_ID"));
                        row.createCell((short) 4).setCellValue(rs.getString("No_of_hours"));
                        row.createCell((short) 5).setCellValue(rs.getString("Bill_Amount"));
                        i++;
                    }
                    String fileName = "E:/Reports/Case_"+tb_docket.getText()+"_Report"+".xls";
                    FileOutputStream fileOut = new FileOutputStream(fileName);
                    workbook.write(fileOut);
                    fileOut.close();
                    JOptionPane.showMessageDialog(null,"Report generated! File name-"+fileName+"and Path- E:/Reports/");
                    } catch (ClassNotFoundException e1) {
                       e1.printStackTrace();
                    } catch (SQLException e1) {
                        e1.printStackTrace();
                    } catch (FileNotFoundException e1) {
                        e1.printStackTrace();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
    }});
}});
}
else{
    
}
this.add(p1);
   
    }//GEN-LAST:event_queryrequestButtonActionPerformed

    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportButtonActionPerformed
        // TODO add your handling code here:
        backbutton.setEnabled(true);
        nextbutton.setEnabled(true);
        infoPanel.removeAll();
        this.remove(infoPanel);
        p1.removeAll();
        this.remove(p1);
    if(logPri==true){
           
            Button b1=new Button("My Account");
            b1.setFont(new Font("Serif", Font.PLAIN, 16));
            b1.setBackground(Color.WHITE);
            b1.setBounds(4,4,195,30);
            b1.setForeground(Color.BLACK);
            p1.add(b1);
          
            dbUpdateBtn =new JButton("DB Update");
            dbUpdateBtn.setBounds(4,32,195,30);
            dbUpdateBtn.setFont(new Font("Serif", Font.PLAIN, 16));
            dbUpdateBtn.setBackground(Color.WHITE);
            dbUpdateBtn.setForeground(Color.BLACK);
            p1.add(dbUpdateBtn);
            if(admin==false){
                dbUpdateBtn.setEnabled(false);
            }
            else{
                dbUpdateBtn.setEnabled(true);
            }
           
            //Panel visibility and size
            p1.setBackground(Color.WHITE);
            p1.setBounds(1270, 145, 205, 65);
            p1.setVisible(true);
            this.add(p1);
            b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                p1.removeAll();

        try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection(connectionUrl);

               String query = "Select C.DateNTimeStamp as DateTimeStamp, C.Status as Status, C.Contact_ID as Contact_ID,E.BarNumber,"
	                        + "E.Password as Regular_Password,E.Password as Unique_Password, C.FirstName as Fname, C.LastName as Lname, C.DOB as DOB, "
	                        + "C.Email as Email, C.Phone as Phone, C.House as House_or_Apt, C.Street as Street, C.City as City, C.State as State, "
	                        + "C.Zip as Zip, S1.Security_Question as SecQ1, E.Security_Answer1 as SecA1, S2.Security_Question as SecQ2, E.Security_Answer2 as SecA2, E.Designation as Designation "
	                        + "from Contact C, Employee E, SecurityQuestion1 S1, SecurityQuestion2 S2 "
	                        + "where Employee_ID=? and C.Contact_ID=E.Contact_ID and E.Security_Question_ID1=S1.Security_Question_ID and E.Security_Question_ID2=S2.Security_Question_ID;"; 
               PreparedStatement ps = con.prepareStatement(query);
               ps.setInt(1,lawyer_id );
                rs=ps.executeQuery();
                tableframe = new JFrame("My Account");
                JPanel p = new JPanel(new BorderLayout());
                table = new JTable(buildTableModel(rs));
                table.setBorder(new EtchedBorder(EtchedBorder.RAISED));
                table.setGridColor(Color.BLACK);
                table.setFont(new Font("Serif", Font.PLAIN, 16));
                table.setShowGrid(true);

            TableColumnModel tcm = table.getColumnModel();
            TableColumn tc = tcm.getColumn(tcm.getColumnCount()-1);
            //ActionEditor ae = new ActionEditor();
            tc.setCellEditor(new ActionEditor());
           
           
            JScrollPane scrollPane = new JScrollPane(table);
            table.setFillsViewportHeight(true);
            JButton back=new JButton("Back");
            back.setFont(new Font("Serif", Font.PLAIN, 16));
            back.setForeground(Color.BLACK);
            back.setBackground(Color.WHITE);
            
            back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            tableframe.dispose();
            homebutton.doClick();
            }});
          
            p.add(back,BorderLayout.PAGE_END);
            p.add(scrollPane,BorderLayout.CENTER);
             tableframe.getContentPane();
          
            tableframe.getContentPane().add(p);

            tableframe.setSize(1500, 800);
            tableframe.setVisible(true);
                
                
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        
//                        p1.removeAll();
//                        l1.setText("My Account");
//                        l1.setBounds(5,2,250,40);
//                        l1.setForeground(Color.BLACK);
//                        l1.setFont(new Font("Serif", Font.BOLD, 24));
//                        l1.setVisible(true);
//                        p1.add(l1);
//                        p1.setBounds(50,200,580,400);
//                        p1.setBackground(Color.WHITE);
//                        p1.setVisible(true);
//                       
//                        l2.setText("First Name :");
//                        l2.setBounds(5,70,140,20);
//                        l2.setForeground(Color.BLACK);
//                        l2.setFont(new Font("Serif", Font.PLAIN, 18));
//                        l2.setVisible(true);
//                        p1.add(l2);
//                        TextField tb_fname=new TextField();
//                        tb_fname.setBounds(180, 65,210,30);
//                        tb_fname.setForeground(Color.BLACK);
//                        tb_fname.setFont(new Font("Serif", Font.PLAIN, 18));
//                        tb_fname.setVisible(true);
//                        tb_fname.setEditable(false);
//                        p1.add(tb_fname);
//
//                        l3.setText("Last Name :");
//                        l3.setBounds(5,100,140,20);
//                        l3.setForeground(Color.BLACK);
//                        l3.setFont(new Font("Serif", Font.PLAIN, 18));
//                        l3.setVisible(true);
//                        p1.add(l3);
//                        TextField tb_lname=new TextField();
//                        tb_lname.setBounds(180,95,210,30);
//                        tb_lname.setForeground(Color.BLACK);
//                        tb_lname.setFont(new Font("Serif", Font.PLAIN, 18));
//                        tb_lname.setVisible(true);
//                        p1.add(tb_lname);
//                        
//                        
//                        l4.setText("Date of Birth :");
//                        l4.setBounds(5,130,160,20);
//                        l4.setForeground(Color.BLACK);
//                        l4.setFont(new Font("Serif", Font.PLAIN, 18));
//                        l4.setVisible(true);
//                        p1.add(l4);
//                        TextField tb_dob=new TextField();
//                        tb_dob.setBounds(180,125,210,30);
//                        tb_dob.setForeground(Color.BLACK);
//                        tb_dob.setFont(new Font("Serif", Font.PLAIN, 18));
//                        tb_dob.setVisible(true);
//                        tb_dob.setEditable(false);
//                        p1.add(tb_dob);
//                        
//                        
//                        l5.setText("Phone :");
//                        l5.setBounds(5,160,160,20);
//                        l5.setForeground(Color.BLACK);
//                        l5.setFont(new Font("Serif", Font.PLAIN, 18));
//                        l5.setVisible(true);
//                        p1.add(l5);
//                        TextField tb_phone=new TextField();
//                        tb_phone.setBounds(180,155,210,30);
//                        tb_phone.setForeground(Color.BLACK);
//                        tb_phone.setFont(new Font("Serif", Font.PLAIN, 18));
//                        tb_phone.setVisible(true);
//                        p1.add(tb_phone);
//                       
//
//                        l6.setText("Address :");
//                        l6.setBounds(5,190,160,20);
//                        l6.setForeground(Color.BLACK);
//                        l6.setFont(new Font("Serif", Font.PLAIN, 18));
//                        l6.setVisible(true);
//                        p1.add(l6);
//                        TextField tb_street=new TextField();
//                        tb_street.setBounds(180,185,210,30);
//                        tb_street.setForeground(Color.BLACK);
//                        tb_street.setFont(new Font("Serif", Font.PLAIN, 18));
//                        tb_street.setVisible(true);
//                        p1.add(tb_street);
//                        
//                       
//
//                        l7.setText("City :");
//                        l7.setBounds(5,220,160,20);
//                        l7.setForeground(Color.BLACK);
//                        l7.setFont(new Font("Serif", Font.PLAIN, 18));
//                        l7.setVisible(true);
//                        p1.add(l7);
//                        TextField tb_city=new TextField();
//                        tb_city.setBounds(180,215,210,30);
//                        tb_city.setForeground(Color.BLACK);
//                        tb_city.setFont(new Font("Serif", Font.ITALIC, 18));
//                        tb_city.setVisible(true);
//                        p1.add(tb_city);
//                        
//
//                        l9.setText("State :");
//                        l9.setBounds(5,250,160,20);
//                        l9.setForeground(Color.BLACK);
//                        l9.setFont(new Font("Serif", Font.PLAIN, 18));
//                        l9.setVisible(true);
//                        p1.add(l9);
//                        TextField tb_state=new TextField();
//                        tb_state.setBounds(180,245,210,30);
//                        tb_state.setForeground(Color.BLACK);
//                        tb_state.setFont(new Font("Serif", Font.ITALIC, 18));
//                        tb_state.setVisible(true);
//                        p1.add(tb_state);
//                        
//                        
//                        l8.setText("Zip :");
//                        l8.setBounds(5,280,160,20);
//                        l8.setForeground(Color.BLACK);
//                        l8.setFont(new Font("Serif", Font.PLAIN, 18));
//                        l8.setVisible(true);
//                        p1.add(l8);
//                        TextField tb_zip=new TextField();
//                        tb_zip.setBounds(180,275,210,30);
//                        tb_zip.setForeground(Color.BLACK);
//                        tb_zip.setFont(new Font("Serif", Font.ITALIC, 18));
//                        tb_zip.setVisible(true);
//                        p1.add(tb_zip);
//                        Button bEdit=new Button("Edit");
//                        bEdit.setBounds(180,310,100,30);
//                        bEdit.setForeground(Color.BLACK);
//                        bEdit.setBackground(Color.WHITE);
//                        bEdit.setVisible(true);
//                        p1.add(bEdit);
//                        
//                        Button bUpdate=new Button("Update");
//                        bUpdate.setBounds(280,310,100,30);
//                        bUpdate.setForeground(Color.BLACK);
//                        bUpdate.setBackground(Color.WHITE);
//                        bUpdate.setVisible(true);
//                        p1.add(bUpdate);
//                    bEdit.addActionListener(new ActionListener(){
//                        @Override
//                    public void actionPerformed(ActionEvent e) {
//                    
//                    tb_lname.setEditable(true);
//                    tb_phone.setEditable(true);
//                    tb_street.setEditable(true);
//                    tb_city.setEditable(true);
//                    tb_state.setEditable(true);
//                    tb_zip.setEditable(true);
//                    
//                    }});
//
//                        
//                
//                 try {
//                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//                    con=DriverManager.getConnection(connectionUrl);
//
//                    String query = "Select * from Contact where Contact_ID=(Select Contact_ID from  Employee where Employee_ID=?)";
//                    PreparedStatement ps = con.prepareStatement(query);
//                    ps.setInt(1, lawyer_id);
//                    rs=ps.executeQuery();
//                    if(rs.next()){
//                        contact_id=rs.getInt("Contact_ID");
//                        tb_fname.setText(rs.getString("FirstName"));
//                        tb_lname.setText(rs.getString("LastName"));
//                        tb_dob.setText(rs.getString("DOB"));
//                        tb_phone.setText(rs.getString("Phone"));
//                        tb_street.setText(rs.getString("Street"));
//                        tb_city.setText(rs.getString("City"));
//                        tb_state.setText(rs.getString("State"));
//                        tb_zip.setText(rs.getString("Zip"));
//
//                        
//                    }
//                    else{
//                        JOptionPane.showMessageDialog(null,"Unable to fetch!");
//                        
//                    }
//                } catch (SQLException | ClassNotFoundException ex) {
//                    Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            bUpdate.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int reply =JOptionPane.showConfirmDialog(null, "Confirm values to Update?", "Update My Account", JOptionPane.YES_NO_OPTION);
//                if(reply==JOptionPane.YES_OPTION){
//            
//                try {
//                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//                    con=DriverManager.getConnection(connectionUrl);
//
//                    String query = "Update Contact set LastName=?,Phone=?,Street=?,City=?,State=?, Zip=? where Contact_ID=?";
//                    PreparedStatement ps = con.prepareStatement(query);
//                    ps.setString(1,tb_lname.getText());
//                    ps.setString(2, tb_phone.getText());
//                    ps.setString(3, tb_street.getText());
//                    ps.setString(4, tb_city.getText());
//                    ps.setString(5, tb_state.getText());
//                    ps.setString(6, tb_zip.getText());
//                    ps.setInt(7, contact_id);
//                    if(ps.executeUpdate()!=0){
//                        JOptionPane.showMessageDialog(null,"Updated Successfully!!");
//                    }else{
//                        JOptionPane.showMessageDialog(null,"Failed to update!");
//                    }
//                    
//                    
//                    
//                } catch (SQLException | ClassNotFoundException ex) {
//                    Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            
//                }
//                else{
//                }
//                
//            
//            }});
//
//            
            }});

               
            dbUpdateBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                p1.removeAll();

        try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection(connectionUrl);

               String query = "Select C.DateNTimeStamp as DateTimeStamp, C.Status as Status, C.Contact_ID as Contact_ID,E.BarNumber,"
	                        + "E.Password as Regular_Password,E.Password as Unique_Password, C.FirstName as Fname, C.LastName as Lname, C.DOB as DOB, "
	                        + "C.Email as Email, C.Phone as Phone, C.House as House_or_Apt, C.Street as Street, C.City as City, C.State as State, "
	                        + "C.Zip as Zip, S1.Security_Question as SecQ1, E.Security_Answer1 as SecA1, S2.Security_Question as SecQ2, E.Security_Answer2 as SecA2, E.Designation as Designation "
	                        + "from Contact C, Employee E, SecurityQuestion1 S1, SecurityQuestion2 S2 "
	                        + "where C.Contact_ID=E.Contact_ID and E.Security_Question_ID1=S1.Security_Question_ID and E.Security_Question_ID2=S2.Security_Question_ID;"; PreparedStatement ps = con.prepareStatement(query);
                rs=ps.executeQuery();
                tableframe = new JFrame("DB Output");
                JPanel p = new JPanel(new BorderLayout());
                table = new JTable(buildTableModel(rs));
                table.setBorder(new EtchedBorder(EtchedBorder.RAISED));
                table.setGridColor(Color.BLACK);
                table.setFont(new Font("Serif", Font.PLAIN, 16));
                table.setShowGrid(true);

            TableColumnModel tcm = table.getColumnModel();
            TableColumn tc = tcm.getColumn(tcm.getColumnCount()-1);
            //ActionEditor ae = new ActionEditor();
            tc.setCellEditor(new ActionEditor());
           
           
            JScrollPane scrollPane = new JScrollPane(table);
            table.setFillsViewportHeight(true);
            JButton back=new JButton("Back");
            back.setFont(new Font("Serif", Font.PLAIN, 16));
            back.setForeground(Color.BLACK);
            back.setBackground(Color.WHITE);
            
            back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            tableframe.dispose();
            homebutton.doClick();
            }});
          
            p.add(back,BorderLayout.PAGE_END);
            p.add(scrollPane,BorderLayout.CENTER);
             tableframe.getContentPane();
          
            tableframe.getContentPane().add(p);

            tableframe.setSize(1500, 800);
            tableframe.setVisible(true);
                
                
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(FMSL.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        
        
            }});
             }
        
        else{
            JOptionPane.showMessageDialog(null,"Please login to access!");
        }
        
        this.add(p1);
       
    }//GEN-LAST:event_reportButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       backbutton.setEnabled(true);
        nextbutton.setEnabled(true);
        infoPanel.removeAll();
        this.remove(infoPanel);
        p1.removeAll();
        this.remove(p1);      
        l1.setText("Frequently Asked Questions:");
        l1.setBounds(205,102,300,40);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Serif", Font.BOLD, 24));
        l1.setVisible(true);
        p1.add(l1);
 
       
        l2.setText("1. What does the home page contains?");
        l2.setBounds(205,170,300,20);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Serif", Font.BOLD, 18));
        l2.setVisible(true);
        p1.add(l2);
        l3.setText("Ans: Home page display the overview of the application. No matter where you are in the application home button brings back you to");
        l3.setBounds(205,190,1500,20);
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Serif", Font.PLAIN, 18));
        l3.setVisible(true);
        p1.add(l3);
        l4.setText("the home page of the application. You need to login first in order to go further to use the application. But you can only login after you  ");
        l4.setBounds(205,210,1500,20);
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Serif", Font.PLAIN, 18));
        l4.setVisible(true);
        p1.add(l4);
         
        l6.setText("are done with the registration. ");
        l6.setBounds(205,230,1500,20);
        l6.setForeground(Color.BLACK);
        l6.setFont(new Font("Serif", Font.PLAIN, 18));
        l6.setVisible(true);
        p1.add(l6);
        
        
        l12.setText("2. How to Login? ");
        l12.setBounds(205,250,1500,20);
        l12.setForeground(Color.BLACK);
        l12.setFont(new Font("Serif", Font.BOLD, 18));
        l12.setVisible(true);
        p1.add(l12);
        l13.setText("Ans: To login as lawyer you need to enter bar number and password. If you forget your credentials you have to click on forgot password ");
        l13.setBounds(205,270,1500,20);
        l13.setForeground(Color.BLACK);
        l13.setFont(new Font("Serif", Font.PLAIN, 18));
        l13.setVisible(true);
        p1.add(l13);
        l14.setText("in order to get a temporary password. ");
        l14.setBounds(205,290,1500,20);
        l14.setForeground(Color.BLACK);
        l14.setFont(new Font("Serif", Font.PLAIN, 18));
        l14.setVisible(true);
        p1.add(l14);

        l15.setText("3. How to Register?");
        l15.setBounds(205,310,1500,20);
        l15.setForeground(Color.BLACK);
        l15.setFont(new Font("Serif", Font.BOLD, 18));
        l15.setVisible(true);
        p1.add(l15);
        
        l5.setText("Ans: To login as admin you need to enter user id password and unique password. If you forget your credentials you have to click on ");
        l5.setBounds(205,330,1500,20);
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("Serif", Font.PLAIN, 18));
        l5.setVisible(true);
        p1.add(l5);

        l7.setText("forgot password in order to get a temporary password. ");
        l7.setBounds(205,350,1500,20);
        l7.setForeground(Color.BLACK);
        l7.setFont(new Font("Serif", Font.PLAIN, 18));
        l7.setVisible(true);
        p1.add(l7);
        
        l8.setText("4. What is Client's Case?");
        l8.setBounds(205,370,1500,20);
        l8.setForeground(Color.BLACK);
        l8.setFont(new Font("Serif", Font.BOLD, 18));
        l8.setVisible(true);
        p1.add(l8);
        
        l9.setText("Ans: After you are logged in successfully, you can enter New Case details by clicking on New Case button. You can also edit your case ");
        l9.setBounds(205,390,1500,20);
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("Serif", Font.PLAIN, 18));
        l9.setVisible(true);
        p1.add(l9);
        
        l10.setText("details through the Edit Case button. Search button can be used to search any case details.");
        l10.setBounds(205,410,1500,20);
        l10.setForeground(Color.BLACK);
        l10.setFont(new Font("Serif", Font.PLAIN, 18));
        l10.setVisible(true);
        p1.add(l10);
        
        l11.setText("5. What does Lawyer's Retainer do?");
        l11.setBounds(205,430,1500,20);
        l11.setForeground(Color.BLACK);
        l11.setFont(new Font("Serif", Font.BOLD, 18));
        l11.setVisible(true);
        p1.add(l11);
        
        l16.setText("Ans: Lawyer's Financial Management System will provide Lawyers to store/ update retainer, case and hours spent by Lawyer on each ");
        l16.setBounds(205,450,1500,20);
        l16.setForeground(Color.BLACK);
        l16.setFont(new Font("Serif", Font.PLAIN, 18));
        l16.setVisible(true);
        p1.add(l16);
        
        l17.setText("case to calculate and deduct fees from client retainer.\" It also generates financial reports by centralizing client data and lawyer fee ");
        l17.setBounds(205,470,1500,20);
        l17.setForeground(Color.BLACK);
        l17.setFont(new Font("Serif", Font.PLAIN, 18));
        l17.setVisible(true);
        p1.add(l17);
        
        l18.setText("transactions to analyze retainer thus by reducing the time spent on evaluation of transactions by the Lawyer. New Retainer details can ");
        l18.setBounds(205,490,1500,20);
        l18.setForeground(Color.BLACK);
        l18.setFont(new Font("Serif", Font.PLAIN, 18));
        l18.setVisible(true);
        p1.add(l18);
        
        l19.setText("be entered by using New Retainer button, also the same details can be edited by the Edit Retainer button. ");
        l19.setBounds(205,510,1500,20);
        l19.setForeground(Color.BLACK);
        l19.setFont(new Font("Serif", Font.PLAIN, 18));
        l19.setVisible(true);
        p1.add(l19);
        
        l20.setText("6. How Client Bill will be generated ");
        l20.setBounds(205,530,1500,20);
        l20.setForeground(Color.BLACK);
        l20.setFont(new Font("Serif", Font.BOLD, 18));
        l20.setVisible(true);
        p1.add(l20);
        Label l21=new Label();
        Label l22=new Label();
        Label l23=new Label();
        Label l24=new Label();
        Label l25=new Label();
        Label l26=new Label();
        Label l27=new Label();
        Label l28=new Label();
        l21.setText("Ans: Bill will be generated as per the Number of hours worked by a Lawyer per case New Bill button contains Date, Docket Number ");
        l21.setBounds(205,550,1500,20);
        l21.setForeground(Color.BLACK);
        l21.setFont(new Font("Serif", Font.PLAIN, 18));
        l21.setVisible(true);
        p1.add(l21);
        l22.setText("and hours, which can be edited through the Edit Bill button by Searching for Docket Number.");
        l22.setBounds(205,570,1500,20);
        l22.setForeground(Color.BLACK);
        l22.setFont(new Font("Serif", Font.PLAIN, 18));
        l22.setVisible(true);
        p1.add(l22);
        l23.setText("7. What does Query Request contains?");
        l23.setBounds(205,590,1500,20);
        l23.setForeground(Color.BLACK);
        l23.setFont(new Font("Serif", Font.BOLD, 18));
        l23.setVisible(true);
        p1.add(l23);
        l24.setText("Ans: Query Request has Case Statement which shows the case details like date bill and Number of hours worked on that case and Date ");
        l24.setBounds(205,610,1500,20);
        l24.setForeground(Color.BLACK);
        l24.setFont(new Font("Serif", Font.PLAIN, 18));
        l24.setVisible(true);
        p1.add(l24);
        l25.setText("Statement displays the case details from one date to another Number of hours worked by a lawyer on Number of cases.");
        l25.setBounds(205,630,1500,20);
        l25.setForeground(Color.BLACK);
        l25.setFont(new Font("Serif", Font.PLAIN, 18));
        l25.setVisible(true);
        p1.add(l25);
        l26.setText("8. What is system Reports?");
        l26.setBounds(205,650,1500,20);
        l26.setForeground(Color.BLACK);
        l26.setFont(new Font("Serif", Font.BOLD, 18));
        l26.setVisible(true);
        p1.add(l26);
        l27.setText("Ans: Report contains My Profile and DB Update buttons. In My Profile you can change your password, address, phone number and the ");
        l27.setBounds(205,670,1500,20);
        l27.setForeground(Color.BLACK);
        l27.setFont(new Font("Serif", Font.PLAIN, 18));
        l27.setVisible(true);
        p1.add(l27);
        l28.setText("security question. In DB Update only Admin can view the database dump. ");
        l28.setBounds(205,690,1500,20);
        l28.setForeground(Color.BLACK);
        l28.setFont(new Font("Serif", Font.PLAIN, 18));
        l28.setVisible(true);
        p1.add(l28);
        
        
        p1.setBackground(Color.WHITE);
        p1.setBounds(20, 145, 1600, 750);
        p1.setVisible(true);
        this.add(p1);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void nextbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextbuttonActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
        p1.removeAll();
        this.remove(p1);
    }//GEN-LAST:event_backbuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        p1.removeAll();
        this.remove(p1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void logoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(FMSL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FMSL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FMSL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FMSL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMSL().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton aboutUs_button;
    private javax.swing.JButton backbutton;
    private javax.swing.JButton billButton;
    private javax.swing.JButton caseButton;
    private javax.swing.JButton contactUs_button;
    private javax.swing.JButton homebutton;
    private javax.swing.JLabel hometext;
    private javax.swing.JLabel info1;
    private javax.swing.JLabel info2;
    private javax.swing.JLabel info3;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel loggedUser;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel logo;
    private javax.swing.JButton logoutbutton;
    private javax.swing.JLabel luser;
    private javax.swing.JButton nextbutton;
    private javax.swing.JButton queryrequestButton;
    private javax.swing.JButton registerButton;
    private javax.swing.JButton reportButton;
    private javax.swing.JButton retainerButton;
    // End of variables declaration//GEN-END:variables
 public static DefaultTableModel buildTableModel(ResultSet rs)
        throws SQLException {

    ResultSetMetaData metaData = rs.getMetaData();

    // names of columns
    Vector<String> columnNames = new Vector<>();
    int columnCount = metaData.getColumnCount();
    for (int column = 1; column <= columnCount; column++) {
        System.out.println(metaData.getColumnName(column));
        
        columnNames.add(metaData.getColumnName(column));
    }
    String action="Action";
    columnNames.add(action);
   
    
    // data of the table
    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
    while (rs.next()) {
        Vector<Object> vector = new Vector<Object>();
        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
            System.out.println(rs.getObject(columnIndex));
            vector.add(rs.getObject(columnIndex));
       
        }
        //vector.add(new ActionEditor());
        data.add(vector);
    }
    
    
    
    
    return new DefaultTableModel(data, columnNames);

}
    
    //////////////////////////////
    
public static class TableCombo extends BasicComboBoxUI {

  public JList getList() {
    return listBox;
  }
}
public static class ActionEditor extends JComboBox implements TableCellEditor, CaretListener {

  protected EventListenerList listenerList = new EventListenerList();

  protected ChangeEvent changeEvent = new ChangeEvent(this);

  private TableCombo combo = new TableCombo();

  private JTextField tf;
  private JTextField stat;

  Object newValue;
  int selectRow,selectColumn;
  String u1,p1,up1,fn,ln,b,p,s,c,st,z,sa,desig;
  int emp_id,sid;




  public ActionEditor() {
    super();
    setUI(combo);
    // comboUi.get
    addItem("Action");
    addItem("Query");
    addItem("Change");
    addItem("Delete");
    setEditable(true);
    tf = (JTextField) getEditor().getEditorComponent();
    stat = (JTextField) getEditor().getEditorComponent();
    tf.addCaretListener(this);
    

    tf.addKeyListener(new KeyAdapter() {
      public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == e.VK_ENTER) {
          Object value = combo.getList().getSelectedValue();
          tf.transferFocus();
          hidePopup();
          fireEditingStopped();
        }
      }
    });

    addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        // fireEditingStopped();
      }
    });
  }

  public void addCellEditorListener(CellEditorListener listener) {
    listenerList.add(CellEditorListener.class, listener);
  }

  public void removeCellEditorListener(CellEditorListener listener) {
    listenerList.remove(CellEditorListener.class, listener);
  }

  protected void fireEditingStopped() {

    CellEditorListener listener;
    Object[] listeners = listenerList.getListenerList();
    for (int i = 0; i < listeners.length; i++) {
      if (listeners[i] == CellEditorListener.class) {
        listener = (CellEditorListener) listeners[i + 1];
   
        listener.editingStopped(changeEvent);
      
      }
    }
  }

  protected void fireEditingCanceled() {
    CellEditorListener listener;
    Object[] listeners = listenerList.getListenerList();
    for (int i = 0; i < listeners.length; i++) {
      //if (listeners == CellEditorListener.class) {
      if (listeners[i] == CellEditorListener.class) {
        listener = (CellEditorListener) listeners[i + 1];
       
        listener.editingCanceled(changeEvent);
        
      }
    }
  }

  public void cancelCellEditing() {
   
    fireEditingCanceled();
  }

  public boolean stopCellEditing() {
   
    fireEditingStopped();
    return true;
  }

  public boolean isCellEditable(EventObject event) {

    return true;
  }

  public boolean shouldSelectCell(EventObject event) {
    return true;
  }

  public Object getCellEditorValue() {
  
    tf.setText(newValue.toString());
    return newValue;
   
  }

  public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected,
      int row, int column) {
      selectRow=row;
      selectColumn=column;
    return this;
  }

  public void caretUpdate(CaretEvent e) {
   
    if (!isPopupVisible() && tf.isShowing() && tf.hasFocus())
      showPopup();

    JTextField tf = (JTextField) e.getSource();
    String text = tf.getText().toLowerCase();

    int index = -1;
    for (int i = 0; i < super.getItemCount(); i++) {
      String item = ((String) getItemAt(i)).toLowerCase();
      if (item.startsWith(text)) {
        index = i;
        break;
      }
    }
    if (index != -1)
      combo.getList().setSelectedIndex(index);
    else
      combo.getList().clearSelection();

    newValue = combo.getList().getSelectedValue();
   if(newValue.equals("Delete")){

       roww=selectRow;
       choice="Delete";
       table.getModel().setValueAt("Delete",roww,1);
       int id=(int) table.getModel().getValueAt(roww, 2);
       System.out.println("ID----"+id);
       table.repaint();
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
    
           try {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    con=DriverManager.getConnection(connectionUrl1);
                    String query = "Update  Contact set Status=? where Contact_ID=?;";
                    PreparedStatement ps = con.prepareStatement(query);
                     ps.setString(1,choice);
                     ps.setInt(2,id);
                    
                    if(ps.executeUpdate()!=0){
                       // con=DriverManager.getConnection("jdbc:mysql://localhost:3306/FMSL?verifyServerCertificate=false&useSSL=true",user,pwd);
                        String query1= "Select Employee_ID from Employee E, Contact C where E.Contact_ID=C.Contact_ID and C.Contact_ID=?;";
                        PreparedStatement ps1 = con.prepareStatement(query1);
                        ps1.setInt(2,id);
                        rs=ps1.executeQuery();
                        if(rs.next())
                        {
                            String query2 = "Update  Employee set ActiveBit=? where Employee_ID=?;";
                            PreparedStatement ps2 = con.prepareStatement(query2);
                            ps2.setInt(1,0);
                            ps2.setInt(2, rs.getInt("Employee_ID"));
                            if(ps2.executeUpdate()!=0)
                            {
                                System.out.println("Active bit changed to 0");
                            }
                            else{
                                System.out.println("Active bit change failed");
                            }

                        }
                        else{
                            System.out.println( "Unable to fetch Employee_ID");
                        }
                    }
                    else{
                         System.out.println( "Unable to update Status");
                    }
           }
           catch(SQLException | ClassNotFoundException ex){

           }
       
       
   }
   else if(newValue.equals("Change")){
        System.out.println("change selected: ");
       
        System.out.println("@Row: "+selectRow+"@Column: "+selectColumn);
        roww=selectRow;
        choice="Change";
        
        //table.getModel().setValueAt("Delete",roww,1);
        int id=(int) table.getModel().getValueAt(roww, 2);
        String stat = (String)table.getModel().getValueAt(roww, 1);
        
        String barNum = (String) table.getModel().getValueAt(roww, 3);
        String regPass = (String) table.getModel().getValueAt(roww, 4);
        String uniqPass = (String) table.getModel().getValueAt(roww, 5);
        String firstName = (String) table.getModel().getValueAt(roww, 6);
        String lastName = (String) table.getModel().getValueAt(roww, 7);
        String dateOfB = (String) table.getModel().getValueAt(roww, 8);
        String emaiL = (String) table.getModel().getValueAt(roww, 9);
        String phonE = (String) table.getModel().getValueAt(roww, 10);
        String housE = (String) table.getModel().getValueAt(roww, 11);
        String streeT = (String) table.getModel().getValueAt(roww, 12);
        String citY = (String) table.getModel().getValueAt(roww, 13);
        String statE = (String) table.getModel().getValueAt(roww, 14);
        String ziP = (String) table.getModel().getValueAt(roww, 15);
        String secQ1 = (String) table.getModel().getValueAt(roww, 16);
        String secA1 = (String) table.getModel().getValueAt(roww, 17);
        String secQ2 = (String) table.getModel().getValueAt(roww, 18);
        String secA2 = (String) table.getModel().getValueAt(roww, 19);
        String desig = (String) table.getModel().getValueAt(roww, 20);
        if(stat.equals("Delete"))
        {
            JOptionPane.showMessageDialog(null, "Deleted record cannot be changed!");
        }
        else{
         new Change(id,barNum,regPass,uniqPass,firstName,lastName,dateOfB,emaiL,phonE,housE,streeT,citY,statE,ziP,secQ1,secA1,secQ2,secA2,desig,dbUpdateBtn).setVisible(true);
        
         tableframe.dispose();
        }
        
   }
   else{
       
   } 
  }   
 } 

}
