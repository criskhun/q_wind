/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q_wind;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Support
 */
public class Main extends javax.swing.JFrame {
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        conn = (Connection) MySqlConnect.ConnectDB();
        currentdate();
        role_list();
        rate_ref();
        Alarmtest ac=new Alarmtest();
        ac.checkAlarm(00,00);
        
    }
    
    public void rate_ref(){
    try {
            String sql = "SELECT * FROM exchange_tbl ORDER BY ID DESC";
            pst = (java.sql.PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();

            rate_table.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void currentdate(){
    new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("HH:mm:ss");
                time.setText(s.format(d));
                timerforreset.setText(s.format(d));

                SimpleDateFormat st = new SimpleDateFormat("MM/dd/yyyy");
                date.setText(st.format(d));
            }
        })
                .start();
    }
    
    public void auto_up_asse(){
    Timer timer = new Timer(0, new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
        
      try {
            String sql = "SELECT * FROM assessment_tbl ORDER BY Time ASC";
            pst = (java.sql.PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();

            q_table.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
        });
        timer.setDelay(1000); // delay for 0.5 seconds
        timer.start();
    }
    
    public void auto_up_cash(){
    Timer timer = new Timer(0, new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
        
      try {
            String sql = "SELECT * FROM cashier_tbl ORDER BY Time ASC";
            pst = (java.sql.PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();

            q_table.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
        });
        timer.setDelay(1000); // delay for 0.5 seconds
        timer.start();
    }
    
    public void auto_up_enco(){
    Timer timer = new Timer(0, new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
        
      try {
            String sql = "SELECT * FROM encoding_tbl ORDER BY Time ASC";
            pst = (java.sql.PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();

            q_table.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
        });
        timer.setDelay(1000); // delay for 0.5 seconds
        timer.start();
    }
    
    public void auto_up_marn(){
    Timer timer = new Timer(0, new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
        
      try {
            String sql = "SELECT * FROM marine_tbl ORDER BY Time ASC";
            pst = (java.sql.PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();

            q_table.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
        });
        timer.setDelay(1000); // delay for 0.5 seconds
        timer.start();
    }
    
    public void auto_up_term(){
    Timer timer = new Timer(0, new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
        
      try {
            String sql = "SELECT * FROM terminal_tbl ORDER BY Time ASC";
            pst = (java.sql.PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();

            q_table.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
        });
        timer.setDelay(1000); // delay for 0.5 seconds
        timer.start();
    }
    
    public void auto_up_ad(){
    Timer timer = new Timer(0, new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
        
      try {
            String sql = "SELECT * FROM ad_tbl ORDER BY Time ASC";
            pst = (java.sql.PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();

            q_table.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
        });
        timer.setDelay(1000); // delay for 0.5 seconds
        timer.start();
    }
    
    public void auto_up_fd(){
    Timer timer = new Timer(0, new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
        
      try {
            String sql = "SELECT * FROM fd_tbl ORDER BY Time ASC";
            pst = (java.sql.PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();

            q_table.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
        });
        timer.setDelay(1000); // delay for 0.5 seconds
        timer.start();
    }
    
    public void auto_up_opm(){
    Timer timer = new Timer(0, new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
        
      try {
            String sql = "SELECT * FROM opm_tbl ORDER BY Time ASC";
            pst = (java.sql.PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();

            q_table.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
        });
        timer.setDelay(1000); // delay for 0.5 seconds
        timer.start();
    }
    
    public void auto_up_psd(){
    Timer timer = new Timer(0, new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
        
      try {
            String sql = "SELECT * FROM psd_tbl ORDER BY Time ASC";
            pst = (java.sql.PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();

            q_table.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
        });
        timer.setDelay(1000); // delay for 0.5 seconds
        timer.start();
    }
    
    public void auto_up_ppd(){
    Timer timer = new Timer(0, new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
        
      try {
            String sql = "SELECT * FROM ppd_tbl ORDER BY Time ASC";
            pst = (java.sql.PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();

            q_table.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
        });
        timer.setDelay(1000); // delay for 0.5 seconds
        timer.start();
    }
    
    public void auto_up_esd(){
    Timer timer = new Timer(0, new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
        
      try {
            String sql = "SELECT * FROM esd_tbl ORDER BY Time ASC";
            pst = (java.sql.PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();

            q_table.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
        });
        timer.setDelay(1000); // delay for 0.5 seconds
        timer.start();
    }
    
    public void role_list(){
    String sqll = "select * from role_tbl";
    try{
        pst= conn.prepareStatement(sqll);
        rs = pst.executeQuery();
        while(rs.next()){
            role_cb.addItem(rs.getString("Role"));
        }
        pst.close();
    }catch (Exception e) {
    }
    }
    
    public void access(){
    if(test.getText().equals("SITE ADMIN")){
        try {
        String sql = "SELECT * FROM user_tbl where Role =? and Password =?";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, (String) role_cb.getSelectedItem());
            pst.setString(2, password.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
            JOptionPane.showMessageDialog(null, "User Logged In!");
            
            Login.setVisible(false);
            Sadmin.setVisible(true);
            role_cb.setSelectedItem("--SELECT ROLE--");
            password.setText("");
            }
            else{
            JOptionPane.showMessageDialog(null, "Incorrect Username or Password!");
            }
            pst.close();
            }
            catch (SQLException x) {
            }
        }
        
        else if(test.getText().equals("--SELECT ROLE--") || test.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please Select Role!");
        }
        
        else if(password.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please Input Password!");
        }
        
        else if(test.getText().equals("ASSESSMENT")){
            try {
            String sql = "SELECT * FROM user_tbl where Role =? and Password =?";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, (String) role_cb.getSelectedItem());
            pst.setString(2, password.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
            String remarks[] = {"ASSESSMENT 1","ASSESSMENT 2"};
                JComboBox cb = new JComboBox(remarks);
                
                int input;
                input = JOptionPane.showConfirmDialog(this,cb, "Select Remarks",JOptionPane.DEFAULT_OPTION);
                
                if(input == JOptionPane.OK_OPTION){
                String str = (String) cb.getSelectedItem();
                window.setText(str);
                }    
                
            JOptionPane.showMessageDialog(null, "User Logged In!");
            
            auto_up_asse();
            Login.setVisible(false);
            Main.setVisible(true);
            role_cb.setSelectedItem("--SELECT ROLE--");
            password.setText("");
            }
            else{
            JOptionPane.showMessageDialog(null, "Incorrect Username or Password!");
            }
            pst.close();
            }
            catch (SQLException x) {
            }
        }
        
        else if(test.getText().equals("CASHIER")){
            try {
            String sql = "SELECT * FROM user_tbl where Role =? and Password =?";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, (String) role_cb.getSelectedItem());
            pst.setString(2, password.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
            String remarks[] = {"CASHIER 1","CASHIER 2"};
                JComboBox cb = new JComboBox(remarks);
                
                int input;
                input = JOptionPane.showConfirmDialog(this,cb, "Select Remarks",JOptionPane.DEFAULT_OPTION);
                
                if(input == JOptionPane.OK_OPTION){
                String str = (String) cb.getSelectedItem();
                window.setText(str);
                }    
                
            JOptionPane.showMessageDialog(null, "User Logged In!");
            
            auto_up_cash();
            Login.setVisible(false);
            Main.setVisible(true);
            role_cb.setSelectedItem("--SELECT ROLE--");
            password.setText("");
            }
            else{
            JOptionPane.showMessageDialog(null, "Incorrect Username or Password!");
            }
            pst.close();
            }
            catch (SQLException x) {
            }
        }
        
        else if(test.getText().equals("ENCODING")){
            try {
            String sql = "SELECT * FROM user_tbl where Role =? and Password =?";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, (String) role_cb.getSelectedItem());
            pst.setString(2, password.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
            String remarks[] = {"ENCODING 1","ENCODING 2","ENCODING 3"};
                JComboBox cb = new JComboBox(remarks);
                
                int input;
                input = JOptionPane.showConfirmDialog(this,cb, "Select Remarks",JOptionPane.DEFAULT_OPTION);
                
                if(input == JOptionPane.OK_OPTION){
                String str = (String) cb.getSelectedItem();
                window.setText(str);
                }    
                
            JOptionPane.showMessageDialog(null, "User Logged In!");
            
            auto_up_enco();
            Login.setVisible(false);
            Main.setVisible(true);
            role_cb.setSelectedItem("--SELECT ROLE--");
            password.setText("");
            }
            else{
            JOptionPane.showMessageDialog(null, "Incorrect Username or Password!");
            }
            pst.close();
            }
            catch (SQLException x) {
            }
        }
        
        else{
        try {
        String sql = "SELECT * FROM user_tbl where Role =? and Password =?";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, (String) role_cb.getSelectedItem());
            pst.setString(2, password.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
            JOptionPane.showMessageDialog(null, "User Logged In!");
            
            Login.setVisible(false);
            Main.setVisible(true);
            
            window.setText(test.getText());
            role_cb.setSelectedItem("--SELECT ROLE--");
            password.setText("");
            switch (window.getText()) {
                case "MARINE":
                    auto_up_marn();
                    break;
                case "TERMINAL":
                    auto_up_term();
                    break;
                case "AD-Records":
                    auto_up_ad();
                    break;
                case "FD-Disbursement":
                    auto_up_fd();
                    break;
                case "OPM-Permits":
                    auto_up_opm();
                    break;
                case "PSD-Safety":
                    auto_up_psd();
                    break;
                case "PPD":
                    auto_up_ppd();
                    break;
                case "ESD":
                    auto_up_esd();
                    break;
                default:
            }
            }
            else{
            JOptionPane.showMessageDialog(null, "Incorrect Username or Password!");
            }
            pst.close();
            }
            catch (SQLException x) {
            }
        }
    }
    
     public void intohistory(){
         try{
         String sql1 = "Insert into history_tbl (Window, Queu_Num, Client, Date, Time) values (?,?,?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql1);
                    pst.setString(1, window.getText());
                    pst.setString(2, sb_num.getText());
                    pst.setString(3, q_client.getText());
                    pst.setString(4, date.getText());
                    pst.setString(5, time.getText());

                    pst.execute();
                    pst.close();
         }
         catch (SQLException x){
             JOptionPane.showMessageDialog(null, x);
         }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Login = new javax.swing.JPanel();
        role_cb = new javax.swing.JComboBox();
        password = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        test = new javax.swing.JLabel();
        Main = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        q_table = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        window = new javax.swing.JLabel();
        sb_num = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        q_client = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        fwd_btn = new javax.swing.JButton();
        Sadmin = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        rate_tf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        admintime = new javax.swing.JLabel();
        timerforreset = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rate_table = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        history = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        fwd = new javax.swing.JLabel();
        prio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.CardLayout());

        Login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LoginKeyPressed(evt);
            }
        });

        role_cb.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        role_cb.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                role_cbPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        role_cb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                role_cbKeyPressed(evt);
            }
        });

        password.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        password.setText("jPasswordField1");
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login.png"))); // NOI18N
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                .addContainerGap(473, Short.MAX_VALUE)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(role_cb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(test, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(450, 450, 450))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(test, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(role_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(274, Short.MAX_VALUE))
        );

        jPanel1.add(Login, "card3");

        Main.setBackground(new java.awt.Color(255, 255, 255));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        q_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(q_table);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 1333, -1));

        Main.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 1335, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("DATE");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(785, 33, 255, 43));

        window.setFont(new java.awt.Font("Arial Black", 1, 60)); // NOI18N
        window.setForeground(new java.awt.Color(51, 153, 255));
        window.setText("Window");
        jPanel5.add(window, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 22, 759, 69));

        sb_num.setFont(new java.awt.Font("Arial Black", 1, 55)); // NOI18N
        sb_num.setForeground(new java.awt.Color(255, 0, 0));
        sb_num.setText("####");
        jPanel5.add(sb_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 82, 356, 98));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("Serving Number:");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 105, -1, 69));

        date.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        date.setForeground(new java.awt.Color(255, 0, 0));
        date.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        date.setText("DATE");
        jPanel5.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(785, 82, 255, 43));

        time.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        time.setForeground(new java.awt.Color(255, 0, 0));
        time.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        time.setText("TIME");
        time.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel5.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(785, 205, 255, 43));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("TIME");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(793, 143, 247, 43));

        q_client.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        q_client.setForeground(new java.awt.Color(255, 0, 0));
        q_client.setText("Client");
        jPanel5.add(q_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 192, 356, 69));

        Main.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 1054, 273));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/next.png"))); // NOI18N
        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 0, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/history.png"))); // NOI18N
        jButton4.setText("HISTORY");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        fwd_btn.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        fwd_btn.setForeground(new java.awt.Color(51, 0, 255));
        fwd_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/forward.png"))); // NOI18N
        fwd_btn.setText("FORWARD");
        fwd_btn.setEnabled(false);
        fwd_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fwd_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(fwd_btn)
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fwd_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Main.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 11, -1, -1));

        jPanel1.add(Main, "card2");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rate_tf.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        rate_tf.setText("Update Rate");
        rate_tf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rate_tfMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("New Rate");

        jButton3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exchange.png"))); // NOI18N
        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exchange.png"))); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        admintime.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        admintime.setForeground(new java.awt.Color(51, 51, 255));
        admintime.setText("New Rate");

        timerforreset.setText("14:20:01");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rate_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(admintime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(timerforreset))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(admintime)
                .addGap(41, 41, 41)
                .addComponent(timerforreset, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rate_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rate_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(rate_table);

        jTextField1.setText("Search");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout SadminLayout = new javax.swing.GroupLayout(Sadmin);
        Sadmin.setLayout(SadminLayout);
        SadminLayout.setHorizontalGroup(
            SadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SadminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        SadminLayout.setVerticalGroup(
            SadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SadminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(Sadmin, "card4");

        history.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setGridColor(new java.awt.Color(153, 255, 255));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTable1MouseExited(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        history.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 1335, 470));

        jButton5.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 0, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reque.png"))); // NOI18N
        jButton5.setText("Re-Que");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        history.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 180, 220, 70));

        jButton6.setFont(new java.awt.Font("Arial Black", 1, 22)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 0, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reserve.png"))); // NOI18N
        jButton6.setText("Re-serve");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        history.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 100, 220, 70));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("jLabel3");
        history.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 26, 154, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("jLabel5");
        history.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 67, 190, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("jLabel6");
        history.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 162, 190, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("jLabel8");
        history.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 121, 190, -1));

        jButton7.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(51, 0, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.png"))); // NOI18N
        jButton7.setText("Back");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        history.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, 220, 70));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        history.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 320, 30));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        history.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 50, 320, 30));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        history.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, 320, 30));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        history.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 194, 420, 40));

        jPanel1.add(history, "card6");

        fwd.setText("forward");

        prio.setText("prio");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fwd, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(prio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(1052, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fwd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(prio)
                .addContainerGap(680, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        password.setText("");
    }//GEN-LAST:event_passwordMouseClicked

    private void role_cbPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_role_cbPopupMenuWillBecomeInvisible
         try{
            String sql="SELECT Role FROM role_tbl where Role = '" + (String) role_cb.getSelectedItem() + "' ";
            pst = (com.mysql.jdbc.PreparedStatement) (java.sql.PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
        
            if(rs.next()){
            String name =rs.getString("Role");
            
            test.setText(name);
            }
            pst.close();
            }
            catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_role_cbPopupMenuWillBecomeInvisible

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            access(); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void role_cbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_role_cbKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           access(); 
        }    
    }//GEN-LAST:event_role_cbKeyPressed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           access(); 
        }
    }//GEN-LAST:event_passwordKeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           access(); 
        }
    }//GEN-LAST:event_jButton2KeyPressed

    private void LoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoginKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           access(); 
        }
    }//GEN-LAST:event_LoginKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int column = 1;
        int column2 = 2;
        int row = 0;

                    String value = q_table.getModel().getValueAt(row, column).toString();
                    String value2 = q_table.getModel().getValueAt(row, column2).toString();
                    sb_num.setText(value);
                    q_client.setText(value2);
        
        switch (window.getText()) {
                
                case "ASSESSMENT 1":
                    
                    try {
                    String sql = "Insert into dis_asse1_tbl (Assessment_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());
                    
                    pst.execute();
                    
                    intohistory();
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM assessment_tbl WHERE "
                            + "Assessment_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    
                    break;
                    
                case "ASSESSMENT 2":
                    
                    try {
                    String sql = "Insert into dis_asse2_tbl (Assessment_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());

                    pst.execute();
                    
                    intohistory();
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM assessment_tbl WHERE "
                            + "Assessment_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    
                    break;
                    
                case "ASSESSMENT 3":
                    
                    try {
                    String sql = "Insert into dis_asse3_tbl (Assessment_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());

                    pst.execute();
                    
                    intohistory();
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM assessment_tbl WHERE "
                            + "Assessment_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    
                    break;
            
            
                case "CASHIER 1":
                    
                    try {
                    String sql = "Insert into dis_cash1_tbl (Cashier_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());

                    pst.execute();
                    
                    intohistory();
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM cashier_tbl WHERE "
                            + "Cashier_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    
                    break;
            
                case "CASHIER 2":
                    
                    try {
                    String sql = "Insert into dis_cash2_tbl (Cashier_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());

                    pst.execute();
                    
                    intohistory();
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM cashier_tbl WHERE "
                            + "Cashier_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    
                    break;

                case "ENCODING 1":
                    
                    try {
                    String sql = "Insert into dis_enco1_tbl (Encoding_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());

                    pst.execute();
                    
                    intohistory();
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM encoding_tbl WHERE "
                            + "Encoding_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    
                    break;
                    
                
                case "ENCODING 2":
                    
                    try {
                    String sql = "Insert into dis_enco2_tbl (Encoding_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());

                    pst.execute();
                    
                    intohistory();
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM encoding_tbl WHERE "
                            + "Encoding_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    
                    break;
                    
                case "ENCODING 3":
                    
                    try {
                    String sql = "Insert into dis_enco3_tbl (Encoding_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());

                    pst.execute();
                    
                    intohistory();
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM encoding_tbl WHERE "
                            + "Encoding_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    
                    break;
                    
                case "MARINE":

                    try {
                    String sql = "Insert into dis_marn_tbl (Marine_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());

                    pst.execute();
                    
                    intohistory();
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM marine_tbl WHERE "
                            + "Marine_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }

                    break;
                    
                case "TERMINAL":
                    
                    try {
                    String sql = "Insert into dis_term_tbl (Terminal_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());

                    pst.execute();
                    
                    intohistory();
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM terminal_tbl WHERE "
                            + "Terminal_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    
                    break;
                    
                case "AD-Records":
                    
                    try {
                    String sql = "Insert into dis_ad_tbl (Ad_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());

                    pst.execute();
                    
                    intohistory();
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM ad_tbl WHERE "
                            + "Ad_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    
                    break;
                    
                case "FD-Disbursement":
                    
                    try {
                    String sql = "Insert into dis_fd_tbl (Fd_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());

                    pst.execute();
                    
                    intohistory();
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM fd_tbl WHERE "
                            + "Fd_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    
                    break;
                case "OPM-Permits":
                    
                    try {
                    String sql = "Insert into dis_opm_tbl (Opm_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());

                    pst.execute();
                    
                    intohistory();
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM opm_tbl WHERE "
                            + "Opm_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    
                    break;
                case "PSD-Safety":
                    
                    try {
                    String sql = "Insert into dis_psd_tbl (Psd_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());

                    pst.execute();
                    
                    intohistory();
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM psd_tbl WHERE "
                            + "Psd_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    
                    break;
                    
                case "PPD":
                    
                    try {
                    String sql = "Insert into dis_ppd_tbl (Ppd_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());

                    pst.execute();
                    
                    intohistory();
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM ppd_tbl WHERE "
                            + "Ppd_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    
                    break;
                    
                case "ESD":
                    
                    try {
                    String sql = "Insert into dis_esd_tbl (Esd_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());

                    pst.execute();
                    
                    intohistory();
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM esd_tbl WHERE "
                            + "Esd_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    
                    break;
                default:
            }
        fwd_btn.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fwd_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fwd_btnActionPerformed
        String remarks[] = {"ASSESSMENT","ENCODING","PAYMENT","MARINE","TERMINAL","FD-Disbursement","PSD-Safety",""
                    + "PPD","AD-Records","OPM-Permits","ESD"};
                    JComboBox cb = new JComboBox(remarks);

                    int input;
                    input = JOptionPane.showConfirmDialog(this,cb, "Select Remarks",JOptionPane.DEFAULT_OPTION);

                    if(input == JOptionPane.OK_OPTION){
                    String str = (String) cb.getSelectedItem();
                    fwd.setText(str);
                        int n = JOptionPane.showConfirmDialog(null, "Regular Customer?", "Query Status", JOptionPane.YES_NO_OPTION);
                        if(n==JOptionPane.OK_OPTION){
                        prio.setText("R");
                        }
                        else{
                        prio.setText("P");
                        }
                    fwd_cast();
                    
                    }
                    else{
                    }
        fwd_btn.setEnabled(false);      
    }//GEN-LAST:event_fwd_btnActionPerformed

    private void rate_tfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rate_tfMouseClicked
        rate_tf.setText("");
    }//GEN-LAST:event_rate_tfMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if(rate_tf.getText().equals("") || rate_tf.getText().equals("Update Rate")) {
        JOptionPane.showMessageDialog(null, "Please Fill the rate Properly");
        }
        else{
                    try{
                    String sql = "Insert into exchange_tbl (Rate, Date, Time) values (?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, rate_tf.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());
                    pst.execute();
                    pst.close();
                    } catch (Exception e){
                    }
        }
        rate_tf.setText("Update Rate");
        rate_ref();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        String res = JOptionPane.showInputDialog(this, "Spell r353t:");
        //clientname.setText(res);
        if(res.equals("reset")){
        reset_cast();
        JOptionPane.showMessageDialog(null, "All transaction reset");
        }
        else{
        JOptionPane.showMessageDialog(null, "Please do it properly");
        }
        
    }//GEN-LAST:event_resetActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        try {
            
           String sql = "SELECT *"
                    + " FROM exchange_tbl WHERE "
                    + "ID like ? or Rate like ? or Date like ? or Time like ?";

            pst = (com.mysql.jdbc.PreparedStatement) (java.sql.PreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, "%" + jTextField1.getText() + "%");
            pst.setString(2, "%" + jTextField1.getText() + "%");
            pst.setString(3, "%" + jTextField1.getText() + "%");
            pst.setString(4, "%" + jTextField1.getText() + "%");
            
            rs = (ResultSet) pst.executeQuery();
            rate_table.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex);
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Login.setVisible(false);
        Sadmin.setVisible(false);
        Main.setVisible(false);
        history.setVisible(true);
        
         try {
           String sql = "SELECT Queu_Num, Client, Date, Time"
                    + " FROM history_tbl WHERE "
                    + "Window like ? ";

            pst = (com.mysql.jdbc.PreparedStatement) (java.sql.PreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, "%" + window.getText() + "%");

            rs = (ResultSet) pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(jLabel3.getText().equals("") || jLabel5.getText().equals("") || jLabel6.getText()
                .equals("") || jLabel8.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Please Select From the table");
        }
        else{
            
            sb_num.setText(jLabel3.getText());
            q_client.setText(jLabel5.getText());
            
            switch (window.getText()) {
                
                case "ASSESSMENT 1":
                    
                    try {
                    String sql = "Insert into dis_asse1_tbl (Assessment_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());
                    
                    pst.execute();
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    break;
                    
                case "ASSESSMENT 2":
                    
                    try {
                    String sql = "Insert into dis_asse2_tbl (Assessment_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());

                    pst.execute();
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    break;
                    
                case "ASSESSMENT 3":
                    
                    try {
                    String sql = "Insert into dis_asse3_tbl (Assessment_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());

                    pst.execute();
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    break;
            
                case "CASHIER 1":
                    
                    try {
                    String sql = "Insert into dis_cash1_tbl (Cashier_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());

                    pst.execute();
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    break;
            
                case "CASHIER 2":
                    
                    try {
                    String sql = "Insert into dis_cash2_tbl (Cashier_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());

                    pst.execute();
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    break;

                case "ENCODING 1":
                    
                    try {
                    String sql = "Insert into dis_enco1_tbl (Encoding_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());

                    pst.execute();
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    break;
                
                case "ENCODING 2":
                    
                    try {
                    String sql = "Insert into dis_enco2_tbl (Encoding_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());

                    pst.execute();
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    break;
                    
                case "ENCODING 3":
                    
                    try {
                    String sql = "Insert into dis_enco3_tbl (Encoding_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());

                    pst.execute();
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    break;
                    
                case "MARINE":

                    try {
                    String sql = "Insert into dis_marn_tbl (Marine_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());

                    pst.execute();
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    break;
                    
                case "TERMINAL":
                    
                    try {
                    String sql = "Insert into dis_term_tbl (Terminal_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());

                    pst.execute();
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    break;
                    
                case "AD-Records":
                    
                    try {
                    String sql = "Insert into dis_ad_tbl (Ad_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());

                    pst.execute();
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    break;
                    
                case "FD-Disbursement":
                    
                    try {
                    String sql = "Insert into dis_fd_tbl (Fd_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());

                    pst.execute();
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    break;
                    
                case "OPM-Permits":
                    
                    try {
                    String sql = "Insert into dis_opm_tbl (Opm_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());

                    pst.execute();
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    break;
                    
                case "PSD-Safety":
                    
                    try {
                    String sql = "Insert into dis_psd_tbl (Psd_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());

                    pst.execute();
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    break;
                    
                case "PPD":
                    
                    try {
                    String sql = "Insert into dis_ppd_tbl (Ppd_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());

                    pst.execute();
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    break;
                    
                case "ESD":
                    
                    try {
                    String sql = "Insert into dis_esd_tbl (Esd_num, Date, Time) values (?,?,?)";

                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, date.getText());
                    pst.setString(3, time.getText());

                    pst.execute();
                    pst.close();
                    }
                    catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    break;

            }
            
        Login.setVisible(false);
        Sadmin.setVisible(false);
        Main.setVisible(true);
        history.setVisible(false);
        } 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(jLabel3.getText().equals("") || jLabel5.getText().equals("") || jLabel6.getText()
                .equals("") || jLabel8.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Please Select From the table");
        }
        else{
            
            sb_num.setText(jLabel3.getText());
            q_client.setText(jLabel5.getText());
            
            switch (window.getText()) {
                
                case "ASSESSMENT 1":
                    
                    try{
                    String sql = "Insert into assessment_tbl (Assessment_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, q_client.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "R"+time.getText());
                    pst.execute();
                    pst.close();
                    } catch (Exception e){
                    }
                    break;
                    
                case "ASSESSMENT 2":
                    
                    try{
                    String sql = "Insert into assessment_tbl (Assessment_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, q_client.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "R"+time.getText());
                    pst.execute();
                    pst.close();
                    } catch (Exception e){
                    }
                    break;
                    
                case "ASSESSMENT 3":
                    
                    try{
                    String sql = "Insert into assessment_tbl (Assessment_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, q_client.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "R"+time.getText());
                    pst.execute();
                    pst.close();
                    } catch (Exception e){
                    }
                    break;
            
                case "CASHIER 1":
                    
                    try{
                    String sql = "Insert into cashier_tbl (Cashier_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, q_client.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "R"+time.getText());
                    pst.execute();
                    pst.close();
                    } catch (Exception e){
                    }
                    break;
            
                case "CASHIER 2":
                    
                    try{
                    String sql = "Insert into cashier_tbl (Cashier_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, q_client.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "R"+time.getText());
                    pst.execute();
                    pst.close();
                    } catch (Exception e){
                    }
                    break;

                case "ENCODING 1":
                    
                    try{
                    String sql = "Insert into encoding_tbl (Encoding_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, q_client.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "R"+time.getText());
                    pst.execute();
                    pst.close();
                    } catch (Exception e){
                    }
                    break;
                
                case "ENCODING 2":
                    
                    try{
                    String sql = "Insert into encoding_tbl (Encoding_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, q_client.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "R"+time.getText());
                    pst.execute();
                    pst.close();
                    } catch (Exception e){
                    }
                    break;
                    
                case "ENCODING 3":
                    
                    try{
                    String sql = "Insert into encoding_tbl (Encoding_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, q_client.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "R"+time.getText());
                    pst.execute();
                    pst.close();
                    } catch (Exception e){
                    }
                    break;
                    
                case "MARINE":

                    try{
                    String sql = "Insert into marine_tbl (Marine_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, q_client.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "R"+time.getText());
                    pst.execute();
                    pst.close();
                    } catch (Exception e){
                    }
                    break;
                    
                case "TERMINAL":
                    
                    try{
                    String sql = "Insert into terminal_tbl (Terminal_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, q_client.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "R"+time.getText());
                    pst.execute();
                    pst.close();
                    } catch (Exception e){
                    }
                    break;
                    
                case "AD-Records":
                    
                    try{
                    String sql = "Insert into ad_tbl (Ad_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, q_client.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "R"+time.getText());
                    pst.execute();
                    pst.close();
                    } catch (Exception e){
                    }
                    break;
                    
                case "FD-Disbursement":
                    
                    try{
                    String sql = "Insert into fd_tbl (Fd_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, q_client.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "R"+time.getText());
                    pst.execute();
                    pst.close();
                    } catch (Exception e){
                    }
                    break;
                    
                case "OPM-Permits":
                    
                    try{
                    String sql = "Insert into opm_tbl (Opm_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, q_client.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "R"+time.getText());
                    pst.execute();
                    pst.close();
                    } catch (Exception e){
                    }
                    break;
                    
                case "PSD-Safety":
                    
                    try{
                    String sql = "Insert into psd_tbl (Psd_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, q_client.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "R"+time.getText());
                    pst.execute();
                    pst.close();
                    } catch (Exception e){
                    }
                    break;
                    
                case "PPD":
                    
                    try{
                    String sql = "Insert into ppd_tbl (Ppd_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, q_client.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "R"+time.getText());
                    pst.execute();
                    pst.close();
                    } catch (Exception e){
                    }
                    break;
                    
                case "ESD":
                    
                    try{
                    String sql = "Insert into esd_tbl (Esd_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, q_client.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "R"+time.getText());
                    pst.execute();
                    pst.close();
                    } catch (Exception e){
                    }
                    break;

            }
            sb_num.setText("####");
            q_client.setText("Client");
        Login.setVisible(false);
        Sadmin.setVisible(false);
        Main.setVisible(true);
        history.setVisible(false);
        } 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int z = jTable1.getSelectedRow();

            TableModel model = (TableModel)jTable1.getModel();
          jLabel3.setText(model.getValueAt(z, 0).toString());
          jLabel5.setText(model.getValueAt(z, 1).toString());
          jLabel6.setText(model.getValueAt(z, 2).toString());
          jLabel8.setText(model.getValueAt(z, 3).toString());

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Login.setVisible(false);
        Sadmin.setVisible(false);
        Main.setVisible(true);
        history.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        jLabel10.setText("Go back to main board");
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        jLabel10.setText("");
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        jLabel11.setText("Serve Selected row");
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        jLabel11.setText("");
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        jLabel9.setText("Back to que Selected row");
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        jLabel9.setText("");
    }//GEN-LAST:event_jButton5MouseExited

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
        jLabel12.setText("Please select row from the table");
    }//GEN-LAST:event_jTable1MouseEntered

    private void jTable1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseExited
         jLabel12.setText("");
    }//GEN-LAST:event_jTable1MouseExited

    public void fwd_cast(){
            switch (fwd.getText()) {
            
                case "ASSESSMENT":
                    try{
                    String sql = "Insert into assessment_tbl (Assessment_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, q_client.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, prio.getText()+time.getText());
                    pst.execute();
                    pst.close();
                    } catch (Exception e){
                    }
                    sb_num.setText("#####");
                    q_client.setText("Client");
                    break;
            
                case "ENCODING":
                    try{
                    String sql = "Insert into encoding_tbl (Encoding_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, q_client.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, prio.getText()+time.getText());
                    pst.execute();
                    pst.close();
                    } catch (Exception e){
                    }
                    sb_num.setText("#####");
                    q_client.setText("Client");
                    break;

                case "PAYMENT":
                    try{
                    String sql = "Insert into cashier_tbl (Cashier_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, q_client.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, prio.getText()+time.getText());
                    pst.execute();
                    pst.close();
                    } catch (Exception e){
                    }
                    sb_num.setText("#####");
                    q_client.setText("Client");
                    break;

                case "MARINE":
                    try{
                    String sql = "Insert into marine_tbl (Marine_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, q_client.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, prio.getText()+time.getText());
                    pst.execute();
                    pst.close();
                    } catch (Exception e){
                    }
                    sb_num.setText("#####");
                    q_client.setText("Client");
                    break;
                    
                case "TERMINAL":
                    try{
                    String sql = "Insert into terminal_tbl (Terminal_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, q_client.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, prio.getText()+time.getText());
                    pst.execute();
                    pst.close();
                    } catch (Exception e){
                    }
                    sb_num.setText("#####");
                    q_client.setText("Client");
                    break;
                    
                case "AD-Records":
                    try{
                    String sql = "Insert into ad_tbl (Ad_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, q_client.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, prio.getText()+time.getText());
                    pst.execute();
                    pst.close();
                    } catch (Exception e){
                    }
                    sb_num.setText("#####");
                    q_client.setText("Client");
                    break;
                    
                case "FD-Disbursement":
                    try{
                    String sql = "Insert into fd_tbl (Fd_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, q_client.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, prio.getText()+time.getText());
                    pst.execute();
                    pst.close();
                    } catch (Exception e){
                    }
                    sb_num.setText("#####");
                    q_client.setText("Client");
                    break;
                    
                case "OPM-Permits":
                    try{
                    String sql = "Insert into opm_tbl (Opm_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, q_client.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, prio.getText()+time.getText());
                    pst.execute();
                    pst.close();
                    } catch (Exception e){
                    }
                    sb_num.setText("#####");
                    q_client.setText("Client");
                    break;
                    
                case "PSD-Safety":
                    try{
                    String sql = "Insert into psd_tbl (Psd_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, q_client.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, prio.getText()+time.getText());
                    pst.execute();
                    pst.close();
                    } catch (Exception e){
                    }
                    sb_num.setText("#####");
                    q_client.setText("Client");
                    break;
                    
                case "PPD":
                    try{
                    String sql = "Insert into ppd_tbl (Ppd_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, q_client.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, prio.getText()+time.getText());
                    pst.execute();
                    pst.close();
                    } catch (Exception e){
                    }
                    sb_num.setText("#####");
                    q_client.setText("Client");
                    break;
                    
                case "ESD":
                    try{
                    String sql = "Insert into esd_tbl (Esd_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, sb_num.getText());
                    pst.setString(2, q_client.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, prio.getText()+time.getText());
                    pst.execute();
                    pst.close();
                    } catch (Exception e){
                    }
                    sb_num.setText("#####");
                    q_client.setText("Client");
                    break;
                    
                default:
            }
    }
    
    public void reset_cast(){
    try {
            pst = conn.prepareStatement("DELETE FROM `ad_tbl` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `ad_ticket` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `assessment_tbl` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `asse_ticket` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `cashier_tbl` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `cash_ticket` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `dis_ad_tbl` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `dis_asse1_tbl` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `dis_asse2_tbl` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `dis_cash1_tbl` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `dis_cash2_tbl` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `dis_enco1_tbl` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `dis_enco2_tbl` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `dis_enco3_tbl` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `dis_esd_tbl` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `dis_fd_tbl` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `dis_marn_tbl` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `dis_opm_tbl` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `dis_ppd_tbl` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `dis_psd_tbl` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `dis_term_tbl` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `encoding_tbl` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `enco_ticket` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `esd_tbl` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `esd_ticket` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `fd_tbl` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `fd_ticket` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `marine_tbl` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `marn_ticket` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `opm_tbl` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `opm_ticket` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `ppd_tbl` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `ppd_ticket` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `priority_tbl` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `prio_ticket` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `psd_tbl` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `psd_ticket` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `terminal_tbl` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `term_ticket` WHERE 1-1000");
            pst.executeUpdate();
            pst = conn.prepareStatement("DELETE FROM `history_tbl` WHERE 1-1000");
            pst.executeUpdate();
            
            String sql = "alter table ad_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
            pst.execute();
            String sql1 = "alter table ad_ticket AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql1);
            pst.execute();
            String sql2 = "alter table assessment_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql2);
            pst.execute();
            String sql3 = "alter table asse_ticket AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql3);
            pst.execute();
            String sql4 = "alter table cashier_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql4);
            pst.execute();
            String sql5 = "alter table cash_ticket AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql5);
            pst.execute();
            String sql6 = "alter table dis_ad_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql6);
            pst.execute();
            String sql7 = "alter table dis_asse1_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql7);
            pst.execute();
            String sql8 = "alter table dis_asse2_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql8);
            pst.execute();
            String sql9 = "alter table dis_cash1_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql9);
            pst.execute();
            String sql10 = "alter table dis_cash2_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql10);
            pst.execute();
            String sql11 = "alter table dis_enco1_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql11);
            pst.execute();
            String sql12 = "alter table dis_enco2_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql12);
            pst.execute();
            String sql13 = "alter table dis_enco3_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql13);
            pst.execute();
            String sql14 = "alter table dis_esd_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql14);
            pst.execute();
            String sql15 = "alter table dis_fd_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql15);
            pst.execute();
            String sql16 = "alter table dis_marn_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql16);
            pst.execute();
            String sql17 = "alter table dis_opm_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql17);
            pst.execute();
            String sql18 = "alter table dis_ppd_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql18);
            pst.execute();
            String sql19 = "alter table dis_psd_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql19);
            pst.execute();
            String sql20 = "alter table dis_term_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql20);
            pst.execute();
            String sql21 = "alter table encoding_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql21);
            pst.execute();
            String sql22 = "alter table enco_ticket AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql22);
            pst.execute();
            String sql23 = "alter table esd_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql23);
            pst.execute();
            String sql24 = "alter table esd_ticket AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql24);
            pst.execute();
            String sql25 = "alter table fd_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql25);
            pst.execute();
            String sql26 = "alter table fd_ticket AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql26);
            pst.execute();
            String sql27 = "alter table marine_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql27);
            pst.execute();
            String sql28 = "alter table marn_ticket AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql28);
            pst.execute();
            String sql29 = "alter table opm_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql29);
            pst.execute();
            String sql30 = "alter table opm_ticket AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql30);
            pst.execute();
            String sql31 = "alter table ppd_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql31);
            pst.execute();
            String sql32 = "alter table ppd_ticket AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql32);
            pst.execute();
            String sql33 = "alter table priority_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql33);
            pst.execute();
            String sql34 = "alter table prio_ticket AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql34);
            pst.execute();
            String sql35 = "alter table psd_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql35);
            pst.execute();
            String sql36 = "alter table psd_ticket AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql36);
            pst.execute();
            String sql37 = "alter table terminal_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql37);
            pst.execute();
            String sql38 = "alter table term_ticket AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql38);
            pst.execute();
            
            pst.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    //JOptionPane.showMessageDialog(null, "All transaction reset");
    }
    /**
     * @param args the command line arguments
     */
    public class Alarmtest {
    public void checkAlarm(final int a, final int b){
        Thread t=new Thread(){
            public void run(){
                int wl=0;
                while(wl==0){
                    Calendar c=new GregorianCalendar();
                    int hour=c.get(Calendar.HOUR_OF_DAY);
                    int mins=c.get(Calendar.MINUTE);
                    if(a==hour&&b==mins){
                        reset_cast();
                        break;
                    }
                }
            }
        };
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();
    }
    }
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
        @FunctionalInterface
public interface SimpleDocumentListener extends DocumentListener {
    void update(DocumentEvent e);

    @Override
    default void insertUpdate(DocumentEvent e) {
       //update(e);
    }
    @Override
    default void removeUpdate(DocumentEvent e) {
       update(e);
    }
    @Override
    default void changedUpdate(DocumentEvent e) {
        //update(e);
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Login;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel Sadmin;
    private javax.swing.JLabel admintime;
    private javax.swing.JLabel date;
    private javax.swing.JLabel fwd;
    private javax.swing.JButton fwd_btn;
    private javax.swing.JPanel history;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel prio;
    private javax.swing.JLabel q_client;
    private javax.swing.JTable q_table;
    private javax.swing.JTable rate_table;
    private javax.swing.JTextField rate_tf;
    private javax.swing.JButton reset;
    private javax.swing.JComboBox role_cb;
    private javax.swing.JLabel sb_num;
    private javax.swing.JLabel test;
    private javax.swing.JLabel time;
    private javax.swing.JTextField timerforreset;
    private javax.swing.JLabel window;
    // End of variables declaration//GEN-END:variables
}
