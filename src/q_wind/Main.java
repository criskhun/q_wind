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
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.Timer;
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
    }
    
    public void rate_ref(){
    try {
            String sql = "SELECT * FROM exchange_tbl ORDER BY ID DESC";
            pst = (java.sql.PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();

            rate_table.setModel(DbUtils.resultSetToTableModel(rs));

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
            }
            catch (SQLException x) {
            }
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
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rate_table = new javax.swing.JTable();
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

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("DATE");

        window.setFont(new java.awt.Font("Arial Black", 1, 60)); // NOI18N
        window.setForeground(new java.awt.Color(51, 153, 255));
        window.setText("Window");

        sb_num.setFont(new java.awt.Font("Arial Black", 1, 55)); // NOI18N
        sb_num.setForeground(new java.awt.Color(255, 0, 0));
        sb_num.setText("####");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("Serving Number:");

        date.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        date.setForeground(new java.awt.Color(255, 0, 0));
        date.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        date.setText("DATE");

        time.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        time.setForeground(new java.awt.Color(255, 0, 0));
        time.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        time.setText("TIME");
        time.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("TIME");

        q_client.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        q_client.setForeground(new java.awt.Color(255, 0, 0));
        q_client.setText("Client");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(sb_num, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(q_client, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(time, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42))))))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(window, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(302, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sb_num, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q_client, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(window, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(181, Short.MAX_VALUE)))
        );

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

        javax.swing.GroupLayout MainLayout = new javax.swing.GroupLayout(Main);
        Main.setLayout(MainLayout);
        MainLayout.setHorizontalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MainLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1054, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        MainLayout.setVerticalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rate_tf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
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
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM assessment_tbl WHERE "
                            + "Assessment_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
            
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
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM assessment_tbl WHERE "
                            + "Assessment_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
            
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
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM assessment_tbl WHERE "
                            + "Assessment_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
            
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
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM cashier_tbl WHERE "
                            + "Cashier_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
            
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
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM cashier_tbl WHERE "
                            + "Cashier_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
            
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
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM encoding_tbl WHERE "
                            + "Encoding_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
            
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
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM encoding_tbl WHERE "
                            + "Encoding_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
            
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
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM encoding_tbl WHERE "
                            + "Encoding_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
            
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
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM marine_tbl WHERE "
                            + "Marine_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
            
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
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM terminal_tbl WHERE "
                            + "Terminal_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
            
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
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM ad_tbl WHERE "
                            + "Ad_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
            
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
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM fd_tbl WHERE "
                            + "Fd_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
            
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
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM opm_tbl WHERE "
                            + "Opm_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
            
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
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM psd_tbl WHERE "
                            + "Psd_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
            
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
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM ppd_tbl WHERE "
                            + "Ppd_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
            
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
                    
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM esd_tbl WHERE "
                            + "Esd_num = '" + sb_num.getText() + "'");
                    int del = pst.executeUpdate();
                    if (del > 0) {
                    }
            
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
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `ad_tbl` WHERE 1-1000");
            pst.executeUpdate();
            String sql = "alter table ad_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `ad_ticket` WHERE 1-1000");
            pst.executeUpdate();
            String sql1 = "alter table ad_ticket AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql1);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `assessment_tbl` WHERE 1-1000");
            pst.executeUpdate();
            String sql2 = "alter table assessment_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql2);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `asse_ticket` WHERE 1-1000");
            pst.executeUpdate();
            String sql3 = "alter table asse_ticket AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql3);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `cashier_tbl` WHERE 1-1000");
            pst.executeUpdate();
            String sql4 = "alter table cashier_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql4);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `cash_ticket` WHERE 1-1000");
            pst.executeUpdate();
            String sql5 = "alter table cash_ticket AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql5);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `dis_ad_tbl` WHERE 1-1000");
            pst.executeUpdate();
            String sql6 = "alter table dis_ad_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql6);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `dis_asse1_tbl` WHERE 1-1000");
            pst.executeUpdate();
            String sql7 = "alter table dis_asse1_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql7);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `dis_asse2_tbl` WHERE 1-1000");
            pst.executeUpdate();
            String sql8 = "alter table dis_asse2_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql8);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `dis_cash1_tbl` WHERE 1-1000");
            pst.executeUpdate();
            String sql9 = "alter table dis_cash1_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql9);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `dis_cash2_tbl` WHERE 1-1000");
            pst.executeUpdate();
            String sql10 = "alter table dis_cash2_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql10);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `dis_enco1_tbl` WHERE 1-1000");
            pst.executeUpdate();
            String sql11 = "alter table dis_enco1_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql11);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `dis_enco2_tbl` WHERE 1-1000");
            pst.executeUpdate();
            String sql12 = "alter table dis_enco2_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql12);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `dis_enco3_tbl` WHERE 1-1000");
            pst.executeUpdate();
            String sql13 = "alter table dis_enco3_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql13);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `dis_esd_tbl` WHERE 1-1000");
            pst.executeUpdate();
            String sql14 = "alter table dis_esd_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql14);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `dis_fd_tbl` WHERE 1-1000");
            pst.executeUpdate();
            String sql15 = "alter table dis_fd_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql15);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `dis_marn_tbl` WHERE 1-1000");
            pst.executeUpdate();
            String sql16 = "alter table dis_marn_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql16);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `dis_opm_tbl` WHERE 1-1000");
            pst.executeUpdate();
            String sql17 = "alter table dis_opm_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql17);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `dis_ppd_tbl` WHERE 1-1000");
            pst.executeUpdate();
            String sql18 = "alter table dis_ppd_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql18);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `dis_psd_tbl` WHERE 1-1000");
            pst.executeUpdate();
            String sql19 = "alter table dis_psd_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql19);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `dis_term_tbl` WHERE 1-1000");
            pst.executeUpdate();
            String sql20 = "alter table dis_term_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql20);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `encoding_tbl` WHERE 1-1000");
            pst.executeUpdate();
            String sql21 = "alter table encoding_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql21);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `enco_ticket` WHERE 1-1000");
            pst.executeUpdate();
            String sql22 = "alter table enco_ticket AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql22);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `esd_tbl` WHERE 1-1000");
            pst.executeUpdate();
            String sql23 = "alter table esd_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql23);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `esd_ticket` WHERE 1-1000");
            pst.executeUpdate();
            String sql24 = "alter table esd_ticket AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql24);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `fd_tbl` WHERE 1-1000");
            pst.executeUpdate();
            String sql25 = "alter table fd_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql25);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `fd_ticket` WHERE 1-1000");
            pst.executeUpdate();
            String sql26 = "alter table fd_ticket AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql26);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `marine_tbl` WHERE 1-1000");
            pst.executeUpdate();
            String sql27 = "alter table marine_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql27);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `marn_ticket` WHERE 1-1000");
            pst.executeUpdate();
            String sql28 = "alter table marn_ticket AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql28);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `opm_tbl` WHERE 1-1000");
            pst.executeUpdate();
            String sql29 = "alter table opm_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql29);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `opm_ticket` WHERE 1-1000");
            pst.executeUpdate();
            String sql30 = "alter table opm_ticket AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql30);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `ppd_tbl` WHERE 1-1000");
            pst.executeUpdate();
            String sql31 = "alter table ppd_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql31);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `ppd_ticket` WHERE 1-1000");
            pst.executeUpdate();
            String sql32 = "alter table ppd_ticket AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql32);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `priority_tbl` WHERE 1-1000");
            pst.executeUpdate();
            String sql33 = "alter table priority_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql33);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `prio_ticket` WHERE 1-1000");
            pst.executeUpdate();
            String sql34 = "alter table prio_ticket AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql34);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `psd_tbl` WHERE 1-1000");
            pst.executeUpdate();
            String sql35 = "alter table psd_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql35);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `psd_ticket` WHERE 1-1000");
            pst.executeUpdate();
            String sql36 = "alter table psd_ticket AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql36);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `terminal_tbl` WHERE 1-1000");
            pst.executeUpdate();
            String sql37 = "alter table terminal_tbl AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql37);
            pst.execute();
            
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("DELETE FROM `term_ticket` WHERE 1-1000");
            pst.executeUpdate();
            String sql38 = "alter table term_ticket AUTO_INCREMENT = 1";
            pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql38);
            pst.execute();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    //JOptionPane.showMessageDialog(null, "All transaction reset");
    }
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Login;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel Sadmin;
    private javax.swing.JLabel date;
    private javax.swing.JLabel fwd;
    private javax.swing.JButton fwd_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
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
    private javax.swing.JLabel window;
    // End of variables declaration//GEN-END:variables
}
