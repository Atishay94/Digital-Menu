
import hibernate.beans.AdminLogin;
import hibernate.beans.Desert;
import hibernate.beans.Drinks;
import hibernate.beans.MainCourse;
import hibernate.beans.OrderTable;
import hibernate.beans.Staters;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;


public class Admin extends javax.swing.JFrame {
 public Admin() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel55 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jTextField8 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jTextField10 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jTextField12 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jTextField14 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jComboBox6 = new javax.swing.JComboBox<>();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel23 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jTextField17 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jTextField19 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel72 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jTextField21 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jComboBox8 = new javax.swing.JComboBox<>();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel39 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jPanel41 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTextArea13 = new javax.swing.JTextArea();
        jTextField31 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTextArea14 = new javax.swing.JTextArea();
        jTextField33 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jComboBox11 = new javax.swing.JComboBox<>();
        jLabel90 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jScrollPane22 = new javax.swing.JScrollPane();
        jTextArea15 = new javax.swing.JTextArea();
        jTextField35 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jComboBox12 = new javax.swing.JComboBox<>();
        jPanel31 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close123.png"))); // NOI18N
        jLabel8.setToolTipText("Yes ! for cancle & No for Login page");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 30, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setOpaque(true);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setOpaque(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administrator (1).png"))); // NOI18N
        jLabel3.setFocusable(false);
        jLabel3.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(898, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(457, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Home", jPanel4);

        jPanel3.setOpaque(false);

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "contactNo", "tableNo", "custumerName", "review", "Timing"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "mp", "up" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(349, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(250, 250, 250))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 102, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("VIEW", jPanel3);

        jPanel5.setOpaque(false);

        jPanel6.setOpaque(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 587, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 587, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("SOURCE", jPanel5);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drinkerlogo.jpg"))); // NOI18N
        jLabel4.setOpaque(true);
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 220));

        jTabbedPane3.addTab("Drink", jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drinkerlogo.jpg"))); // NOI18N
        jLabel11.setOpaque(true);
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 220));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Category", "Name", "Main Ingredients", "Price"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jPanel9.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, -3, -1, 450));

        jTabbedPane3.addTab("View", jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Price:-");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 90, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Category:-");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 80, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Drink Name:-");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 90, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Ingredients:-");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 90, 30));
        jPanel7.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 250, 30));
        jPanel7.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 32, 250, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        jPanel7.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 250, 80));
        jPanel7.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 250, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/submitbutton.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 180, 40));

        jPanel10.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 480, 390));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drinkerlogo.jpg"))); // NOI18N
        jLabel14.setOpaque(true);
        jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 220));

        jTabbedPane3.addTab("Drink Insert", jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drinkerlogo.jpg"))); // NOI18N
        jLabel5.setOpaque(true);
        jPanel11.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 220));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Price:-");
        jPanel12.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 90, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Drink Name:-");
        jPanel12.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 90, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Ingredients:-");
        jPanel12.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 90, 30));
        jPanel12.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 250, 30));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane5.setViewportView(jTextArea2);

        jPanel12.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 250, 80));
        jPanel12.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 250, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/submitbutton.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 180, 40));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Name", "Ingredients", "Price" }));
        jPanel12.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 110, 30));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 102, 0));
        jPanel12.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 290, 30));

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 480, 390));

        jTabbedPane3.addTab("Drink Update", jPanel11);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drinkerlogo.jpg"))); // NOI18N
        jLabel6.setOpaque(true);
        jPanel13.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 220));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Price:-");
        jPanel14.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 90, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Drink Name:-");
        jPanel14.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 90, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Ingredients:-");
        jPanel14.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 90, 30));
        jPanel14.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 250, 30));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane6.setViewportView(jTextArea3);

        jPanel14.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 250, 80));
        jPanel14.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 250, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/submitbutton.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 180, 40));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Tyoe", "Drink Name", "Ingredients", "Price" }));
        jPanel14.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 90, 30));

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 480, 390));

        jTabbedPane3.addTab("Drink Delete", jPanel13);

        jPanel2.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("HOME", jPanel2);

        jTabbedPane1.addTab("Drinks", jTabbedPane3);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drinkerlogo.jpg"))); // NOI18N
        jLabel21.setOpaque(true);
        jPanel15.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 220));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close123.png"))); // NOI18N
        jLabel22.setToolTipText("Yes ! for cancle & No for Login page");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel15.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 30, -1));

        jTabbedPane2.addTab("Desert", jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drinkerlogo.jpg"))); // NOI18N
        jLabel23.setOpaque(true);
        jPanel16.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 220));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Category", "Name", "Main Ingredients", "Price"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTable3);

        jPanel16.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, -3, -1, 450));

        jTabbedPane2.addTab("View", jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("Price:-");
        jPanel18.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 90, 30));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("Category:-");
        jPanel18.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 80, 30));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setText("Desert Name:-");
        jPanel18.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 100, 30));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("Ingredients:-");
        jPanel18.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 90, 30));
        jPanel18.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 250, 30));
        jPanel18.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 32, 250, 30));

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane8.setViewportView(jTextArea4);

        jPanel18.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 250, 80));
        jPanel18.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 250, 30));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/submitbutton.png"))); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 180, 40));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 51, 0));
        jPanel18.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 350, 30));

        jPanel17.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 480, 390));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drinkerlogo.jpg"))); // NOI18N
        jLabel29.setOpaque(true);
        jPanel17.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 220));

        jTabbedPane2.addTab("Desert Insert", jPanel17);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drinkerlogo.jpg"))); // NOI18N
        jLabel30.setOpaque(true);
        jPanel19.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 220));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setText("Price:-");
        jPanel20.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 90, 30));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setText("Desert Name:-");
        jPanel20.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 110, 30));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setText("Ingredients:-");
        jPanel20.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 90, 30));
        jPanel20.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 250, 30));

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane9.setViewportView(jTextArea5);

        jPanel20.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 250, 80));
        jPanel20.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 250, 30));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/submitbutton.png"))); // NOI18N
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 180, 40));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Name", "Ingredients", "Price" }));
        jPanel20.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 110, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jPanel20.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 290, 30));

        jPanel19.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 480, 390));

        jTabbedPane2.addTab("Desert Update", jPanel19);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drinkerlogo.jpg"))); // NOI18N
        jLabel34.setOpaque(true);
        jPanel21.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 220));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setText("Price:-");
        jPanel22.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 90, 30));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setText("Desert Name:-");
        jPanel22.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 110, 30));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setText("Ingredients:-");
        jPanel22.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 90, 30));
        jPanel22.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 250, 30));

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jScrollPane10.setViewportView(jTextArea6);

        jPanel22.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 250, 80));
        jPanel22.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 250, 30));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/submitbutton.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 180, 40));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Desert Name", "Ingredients", "Price" }));
        jPanel22.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 110, 30));

        jPanel21.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 480, 390));

        jTabbedPane2.addTab("Desert Delete", jPanel21);

        jTabbedPane1.addTab("Desert", jTabbedPane2);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drinkerlogo.jpg"))); // NOI18N
        jLabel38.setOpaque(true);
        jPanel23.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 220));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close123.png"))); // NOI18N
        jLabel39.setToolTipText("Yes ! for cancle & No for Login page");
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel39MouseClicked(evt);
            }
        });
        jPanel23.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 30, -1));

        jTabbedPane4.addTab("MainCourse", jPanel23);

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drinkerlogo.jpg"))); // NOI18N
        jLabel40.setOpaque(true);
        jPanel24.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 220));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Category", "Name", "Main Ingredients", "Price"
            }
        ));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(jTable4);

        jPanel24.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, -3, -1, 450));

        jTabbedPane4.addTab("View", jPanel24);

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel41.setText("Price:-");
        jPanel26.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 90, 30));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel42.setText("Category:-");
        jPanel26.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 80, 30));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setText("Dish Name:-");
        jPanel26.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 90, 30));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setText("Ingredients:-");
        jPanel26.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 90, 30));
        jPanel26.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 250, 30));
        jPanel26.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 32, 250, 30));

        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jScrollPane12.setViewportView(jTextArea7);

        jPanel26.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 250, 80));
        jPanel26.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 250, 30));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/submitbutton.png"))); // NOI18N
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel26.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 180, 40));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 51, 0));
        jPanel26.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 350, 30));

        jPanel25.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 480, 390));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drinkerlogo.jpg"))); // NOI18N
        jLabel46.setOpaque(true);
        jPanel25.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 220));

        jTabbedPane4.addTab("MainCourse Insert", jPanel25);

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drinkerlogo.jpg"))); // NOI18N
        jLabel47.setOpaque(true);
        jPanel27.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 220));

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setText("Price:-");
        jPanel28.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 90, 30));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel49.setText("Desert Name:-");
        jPanel28.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 110, 30));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setText("Ingredients:-");
        jPanel28.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 90, 30));
        jPanel28.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 250, 30));

        jTextArea8.setColumns(20);
        jTextArea8.setRows(5);
        jScrollPane13.setViewportView(jTextArea8);

        jPanel28.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 250, 80));
        jPanel28.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 250, 30));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/submitbutton.png"))); // NOI18N
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel28.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 180, 40));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Name", "Ingredients", "Price" }));
        jPanel28.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 110, 30));

        jLabel72.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 102, 0));
        jPanel28.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 290, 30));

        jPanel27.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 480, 390));

        jTabbedPane4.addTab("MainCourse Update", jPanel27);

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drinkerlogo.jpg"))); // NOI18N
        jLabel51.setOpaque(true);
        jPanel29.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 220));

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel52.setText("Price:-");
        jPanel30.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 90, 30));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel53.setText("Desert Name:-");
        jPanel30.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 110, 30));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel54.setText("Ingredients:-");
        jPanel30.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 90, 30));
        jPanel30.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 250, 30));

        jTextArea9.setColumns(20);
        jTextArea9.setRows(5);
        jScrollPane14.setViewportView(jTextArea9);

        jPanel30.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 250, 80));
        jPanel30.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 250, 30));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/submitbutton.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel30.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 180, 40));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Name", "Ingredients", "Price" }));
        jPanel30.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 110, 30));

        jPanel29.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 480, 390));

        jTabbedPane4.addTab(" Delete", jPanel29);

        jTabbedPane1.addTab("MainCourse", jTabbedPane4);

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));
        jPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drinkerlogo.jpg"))); // NOI18N
        jLabel73.setOpaque(true);
        jPanel39.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 220));

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close123.png"))); // NOI18N
        jLabel74.setToolTipText("Yes ! for cancle & No for Login page");
        jLabel74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel74MouseClicked(evt);
            }
        });
        jPanel39.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 30, -1));

        jTabbedPane6.addTab("Staters", jPanel39);

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));
        jPanel40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drinkerlogo.jpg"))); // NOI18N
        jLabel75.setOpaque(true);
        jPanel40.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 220));

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Category", "Name", "Main Ingredients", "Price"
            }
        ));
        jTable6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable6MouseClicked(evt);
            }
        });
        jScrollPane19.setViewportView(jTable6);

        jPanel40.add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, -3, -1, 450));

        jTabbedPane6.addTab("View", jPanel40);

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));
        jPanel41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel42.setBackground(new java.awt.Color(255, 255, 255));
        jPanel42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel76.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel76.setText("Price:-");
        jPanel42.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 90, 30));

        jLabel77.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel77.setText("Category:-");
        jPanel42.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 80, 30));

        jLabel78.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel78.setText("Desert Name:-");
        jPanel42.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 100, 30));

        jLabel79.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel79.setText("Ingredients:-");
        jPanel42.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 90, 30));
        jPanel42.add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 250, 30));
        jPanel42.add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 32, 250, 30));

        jTextArea13.setColumns(20);
        jTextArea13.setRows(5);
        jScrollPane20.setViewportView(jTextArea13);

        jPanel42.add(jScrollPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 250, 80));
        jPanel42.add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 250, 30));

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/submitbutton.png"))); // NOI18N
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel42.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 180, 40));

        jLabel80.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 51, 0));
        jPanel42.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 350, 30));

        jPanel41.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 480, 390));

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drinkerlogo.jpg"))); // NOI18N
        jLabel81.setOpaque(true);
        jPanel41.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 220));

        jTabbedPane6.addTab("Staters Insert", jPanel41);

        jPanel43.setBackground(new java.awt.Color(255, 255, 255));
        jPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drinkerlogo.jpg"))); // NOI18N
        jLabel82.setOpaque(true);
        jPanel43.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 220));

        jPanel44.setBackground(new java.awt.Color(255, 255, 255));
        jPanel44.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel83.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel83.setText("Price:-");
        jPanel44.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 90, 30));

        jLabel84.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel84.setText("Staters Name:-");
        jPanel44.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 110, 30));

        jLabel85.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel85.setText("Ingredients:-");
        jPanel44.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 90, 30));
        jPanel44.add(jTextField32, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 250, 30));

        jTextArea14.setColumns(20);
        jTextArea14.setRows(5);
        jScrollPane21.setViewportView(jTextArea14);

        jPanel44.add(jScrollPane21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 250, 80));
        jPanel44.add(jTextField33, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 250, 30));

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/submitbutton.png"))); // NOI18N
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel44.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 180, 40));

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Desert Name", "Ingredients", "Price" }));
        jPanel44.add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 110, 30));

        jLabel90.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(255, 102, 0));
        jPanel44.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 290, 30));

        jPanel43.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 480, 390));

        jTabbedPane6.addTab("Staters Update", jPanel43);

        jPanel45.setBackground(new java.awt.Color(255, 255, 255));
        jPanel45.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drinkerlogo.jpg"))); // NOI18N
        jLabel86.setOpaque(true);
        jPanel45.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 220));

        jPanel46.setBackground(new java.awt.Color(255, 255, 255));
        jPanel46.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel87.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel87.setText("Price:-");
        jPanel46.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 90, 30));

        jLabel88.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel88.setText("Staters Name:-");
        jPanel46.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 110, 30));

        jLabel89.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel89.setText("Ingredients:-");
        jPanel46.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 90, 30));
        jPanel46.add(jTextField34, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 250, 30));

        jTextArea15.setColumns(20);
        jTextArea15.setRows(5);
        jScrollPane22.setViewportView(jTextArea15);

        jPanel46.add(jScrollPane22, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 250, 80));
        jPanel46.add(jTextField35, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 250, 30));

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/submitbutton.png"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel46.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 180, 40));

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Desert Name", "Ingredients", "Price" }));
        jPanel46.add(jComboBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 110, 30));

        jPanel45.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 480, 390));

        jTabbedPane6.addTab("Staters Delete", jPanel45);

        jTabbedPane1.addTab("Staters", jTabbedPane6);

        jPanel31.setOpaque(false);

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 587, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("SETTING", jPanel31);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 620));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 730));
        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 1030));

        jMenu1.setText("File");

        jMenu3.setText("Add Table");
        jMenu1.add(jMenu3);

        jMenu4.setText("Add Dish");
        jMenu1.add(jMenu4);

        jMenu7.setText("Chef");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenu1.add(jMenu7);

        jMenu5.setText("Coustumer");

        jMenu6.setText("Login");
        jMenu5.add(jMenu6);

        jMenu1.add(jMenu5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenu8.setText("Change Password");
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });

        jMenu9.setText("Chef Change Password");
        jMenu8.add(jMenu9);

        jMenu2.add(jMenu8);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        // TODO add your handling code here:
        Chef chef=new Chef();
        chef.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
      AdminPassChange ad=new AdminPassChange();
      ad.setVisible(true);
      dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jMenu8MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        int result=JOptionPane.showConfirmDialog(this,"Do you wanna close/sign out","sign out/ close message",JOptionPane.YES_NO_OPTION);
        if(result==0){
            dispose();
        }
        else{
            AdminPassChange ap=new AdminPassChange();
            ap.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        jComboBox1.removeAllItems();
        String item=(String)jComboBox2.getSelectedItem();
        if(item.equalsIgnoreCase("mp")){
            jComboBox1.addItem("indore \t"+"MINI bomboy");
            jComboBox1.addItem("Bhopal \t"+"Capital of Madhya Pradesh");

        }
        if(item.equalsIgnoreCase("up")){
            jComboBox1.addItem("Agra \t");
            jComboBox1.addItem("Lakhnaw \t"+"Capital of Uttar Pradesh");

        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        Criteria crt=session.createCriteria(OrderTable.class);
        List<OrderTable> data=crt.list();
        DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
        DateFormat df=DateFormat.getDateInstance(DateFormat.FULL);
        SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:yyyy");
       
        for(OrderTable ref: data)
        {
            Object ob[]={ref.getContactNo(),ref.getTableNo(),ref.getCustomerName(),ref.getReview(),sdf};
            dtm.addRow(ob);
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        int result=JOptionPane.showConfirmDialog(this,"Do you wanna close/sign out","sign out/ close message",JOptionPane.YES_NO_OPTION);
        if(result==0){
            dispose();
        }
        else{
            Admin ap=new Admin();
            ap.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        Criteria crt=session.createCriteria(Desert.class);
        List<Desert> data=crt.list();
        DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
        for(Desert ref: data)
        {
            Object ob[]={ref.getCategory(),ref.getDishName(),ref.getMainIngredients(),ref.getPrice()};
            dtm.addRow(ob);
        }
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        org.hibernate.classic.Session session =sf.openSession();

        Transaction tx=session.beginTransaction();//to take the permission
        /*Scanner sc=new Scanner(System.in);
        System.out.println(" Enter Category");
        String category=sc.next();
        System.out.println("Enter dish name");
        String dish=sc.next();
        System.out.println("Enter Main Ingredients name");
        String mainIngredients=sc.next();
        System.out.println("Enter Dish Price");
        int price = sc.nextInt();
        Desert adl=new Desert(category, dish,mainIngredients,price);
        */
        //JOptionPane.showMessageDialog(null,"Hi !! Welcome");
        //String category=JOptionPane.showInputDialog("Enter Desert Category");
        //String dishName=JOptionPane.showInputDialog("Enter Dish Name");
        //String mainIngredients=JOptionPane.showInputDialog("Enter Main Ingredients");
        //int price=Integer.parseInt(JOptionPane.showInputDialog("Enter Price"));
        String category=jTextField2.getText();
        String dishName=jTextField3.getText();
        String mainIngredients=jTextArea1.getText();
        int price=Integer.parseInt(jTextField1.getText());
        Desert adl=new Desert(category,dishName,mainIngredients,price);
        session.save(adl);// replacement of the insert query
        tx.commit();
        session.close();
        //JOptionPane.showMessageDialog(null,"Data Insertes Sucessfully");
        jLabel18.setText("inserted Data !!!!!!");
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jLabel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseClicked
        // TODO add your handling code here:
        int result=JOptionPane.showConfirmDialog(this,"Do you wanna close/sign out","sign out/ close message",JOptionPane.YES_NO_OPTION);
        if(result==0){
            dispose();
        }
        else{
            Admin ap=new Admin();
            ap.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jLabel39MouseClicked

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        // TODO add your handling code here:
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        Criteria crt=session.createCriteria(MainCourse.class);
        List<MainCourse> data=crt.list();
        DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
        for(MainCourse ref: data)
        {
            Object ob[]={ref.getCategory(),ref.getDishName(),ref.getMainIngredients(),ref.getPrice()};
            dtm.addRow(ob);
        }
    }//GEN-LAST:event_jTable4MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        org.hibernate.classic.Session session =sf.openSession();

        Transaction tx=session.beginTransaction();//to take the permission
        /*Scanner sc=new Scanner(System.in);
        System.out.println(" Enter Category");
        String category=sc.next();
        System.out.println("Enter dish name");
        String dish=sc.next();
        System.out.println("Enter Main Ingredients name");
        String mainIngredients=sc.next();
        System.out.println("Enter Dish Price");
        int price = sc.nextInt();
        Desert adl=new Desert(category, dish,mainIngredients,price);
        */
        //JOptionPane.showMessageDialog(null,"Hi !! Welcome");
        //String category=JOptionPane.showInputDialog("Enter Desert Category");
        //String dishName=JOptionPane.showInputDialog("Enter Dish Name");
        //String mainIngredients=JOptionPane.showInputDialog("Enter Main Ingredients");
        //int price=Integer.parseInt(JOptionPane.showInputDialog("Enter Price"));
        String category=jTextField2.getText();
        String dishName=jTextField3.getText();
        String mainIngredients=jTextArea1.getText();
        int price=Integer.parseInt(jTextField1.getText());
        MainCourse adl=new MainCourse(category,dishName,mainIngredients,price);
        session.save(adl);// replacement of the insert query
        tx.commit();
        session.close();
        //JOptionPane.showMessageDialog(null,"Data Insertes Sucessfully");
        jLabel18.setText("inserted Data !!!!!!");
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        
       String dishName=jTextField12.getText();
       String mainIngredients=jTextArea5.getText();
       String price=jTextField11.getText();
      String level=(String)jComboBox5.getSelectedItem();
      SessionFactory sf=new Configuration().configure().buildSessionFactory();
      Session session = sf.openSession();
      Transaction tx=session.beginTransaction();
      Criteria crit=session.createCriteria(Desert.class);
      //Criteria crit1=session.createCriteria(ChefBeans.class);
      crit.add(Restrictions.eq("dishName",dishName));
      Desert adl=(Desert)session.get(Desert.class,dishName);
      List<Desert> data=crit.list();
      //List<ChefBeans> data1=crit1.list();
      if(data.isEmpty()){
          jLabel1.setText("invalid Id / password");
      }
      else {
          if(level.equalsIgnoreCase("name")){
        adl.setDishName(dishName);
                    session.update(adl);
                   jLabel1.setText("Dish Name updated  !!!!!");
      }
      
      if(level.equalsIgnoreCase("ingredients")){
           adl.setDishName(mainIngredients);
                    session.update(adl);
           jLabel5.setText(" ingredients updated sucessfully");
      }
      if(level.equalsIgnoreCase("price")){
           adl.setDishName(price);
                    session.update(adl);
           jLabel5.setText("price Updated sucessfully");
      }
     
    }  
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
         String dishName=jTextField19.getText();
       String mainIngredients=jTextArea8.getText();
       String price=jTextField18.getText();
      String level=(String)jComboBox7.getSelectedItem();
      SessionFactory sf=new Configuration().configure().buildSessionFactory();
      Session session = sf.openSession();
      Transaction tx=session.beginTransaction();
      Criteria crit=session.createCriteria(MainCourse.class);
      //Criteria crit1=session.createCriteria(ChefBeans.class);
      crit.add(Restrictions.eq("dishName",dishName));
      MainCourse adl=(MainCourse)session.get(MainCourse.class,dishName);
      List<MainCourse> data=crit.list();
      //List<ChefBeans> data1=crit1.list();
      if(data.isEmpty()){
          jLabel72.setText("invalid Id / password");
      }
      else {
          if(level.equalsIgnoreCase("name")){
        adl.setDishName(dishName);
                    session.update(adl);
                   jLabel72.setText("Dish Name updated  !!!!!");
      }
      
      if(level.equalsIgnoreCase("ingredients")){
           adl.setDishName(mainIngredients);
                    session.update(adl);
           jLabel72.setText(" ingredients updated sucessfully");
      }
      if(level.equalsIgnoreCase("price")){
           adl.setDishName(price);
                    session.update(adl);
           jLabel72.setText("price Updated sucessfully");
      }
     
    }  
    }//GEN-LAST:event_jButton8MouseClicked

    private void jLabel74MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel74MouseClicked
        // TODO add your handling code here:
        int result=JOptionPane.showConfirmDialog(this,"Do you wanna close/sign out","sign out/ close message",JOptionPane.YES_NO_OPTION);
        if(result==0){
            dispose();
        }
        else{
            Admin ap=new Admin();
            ap.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jLabel74MouseClicked

    private void jTable6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable6MouseClicked
        // TODO add your handling code here:
        
        
       SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        Criteria crt=session.createCriteria(Staters.class);
        List<Staters> data=crt.list();
        DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
        for(Staters ref: data)
        {
            Object ob[]={ref.getCategory(),ref.getDishName(),ref.getMainIngredients(),ref.getPrice()};
            dtm.addRow(ob);
        } 
    }//GEN-LAST:event_jTable6MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        // TODO add your handling code here:
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        org.hibernate.classic.Session session =sf.openSession();

        Transaction tx=session.beginTransaction();//to take the permission
        /*Scanner sc=new Scanner(System.in);
        System.out.println(" Enter Category");
        String category=sc.next();
        System.out.println("Enter dish name");
        String dish=sc.next();
        System.out.println("Enter Main Ingredients name");
        String mainIngredients=sc.next();
        System.out.println("Enter Dish Price");
        int price = sc.nextInt();
        Desert adl=new Desert(category, dish,mainIngredients,price);
        */
        //JOptionPane.showMessageDialog(null,"Hi !! Welcome");
        //String category=JOptionPane.showInputDialog("Enter Desert Category");
        //String dishName=JOptionPane.showInputDialog("Enter Dish Name");
        //String mainIngredients=JOptionPane.showInputDialog("Enter Main Ingredients");
        //int price=Integer.parseInt(JOptionPane.showInputDialog("Enter Price"));
        String category=jTextField2.getText();
        String dishName=jTextField3.getText();
        String mainIngredients=jTextArea1.getText();
        int price=Integer.parseInt(jTextField1.getText());
        Staters adl=new Staters(category,dishName,mainIngredients,price);
        session.save(adl);// replacement of the insert query
        tx.commit();
        session.close();
        //JOptionPane.showMessageDialog(null,"Data Insertes Sucessfully");
        jLabel18.setText("inserted Data !!!!!!");
    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked


        // TODO add your handling code here:
        String dishName=jTextField33.getText();
       String mainIngredients=jTextArea14.getText();
       String price=jTextField32.getText();
      String level=(String)jComboBox11.getSelectedItem();
      SessionFactory sf=new Configuration().configure().buildSessionFactory();
      Session session = sf.openSession();
      Transaction tx=session.beginTransaction();
      Criteria crit=session.createCriteria(MainCourse.class);
      //Criteria crit1=session.createCriteria(ChefBeans.class);
      crit.add(Restrictions.eq("dishName",dishName));
      MainCourse adl=(MainCourse)session.get(MainCourse.class,dishName);
      List<MainCourse> data=crit.list();
      //List<ChefBeans> data1=crit1.list();
      if(data.isEmpty()){
          jLabel90.setText("invalid Id / password");
      }
      else {
          if(level.equalsIgnoreCase("name")){
        adl.setDishName(dishName);
                    session.update(adl);
                   jLabel90.setText("Dish Name updated  !!!!!");
      }
      
      if(level.equalsIgnoreCase("ingredients")){
           adl.setDishName(mainIngredients);
                    session.update(adl);
           jLabel90.setText(" ingredients updated sucessfully");
      }
      if(level.equalsIgnoreCase("price")){
           adl.setDishName(price);
                    session.update(adl);
           jLabel90.setText("price Updated sucessfully");
      }
     
    }  
    }//GEN-LAST:event_jButton14MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
         String dishName=jTextField6.getText();
       String mainIngredients=jTextArea2.getText();
       String price=jTextField14.getText();
      String level=(String)jComboBox3.getSelectedItem();
      SessionFactory sf=new Configuration().configure().buildSessionFactory();
      Session session = sf.openSession();
      Transaction tx=session.beginTransaction();
      Criteria crit=session.createCriteria(Drinks.class);
      //Criteria crit1=session.createCriteria(ChefBeans.class);
      crit.add(Restrictions.eq("dishName",dishName));
      Drinks adl=(Drinks)session.get(Drinks.class,dishName);
      List<Drinks> data=crit.list();
      //List<ChefBeans> data1=crit1.list();
      if(data.isEmpty()){
          jLabel55.setText("invalid Id / password");
      }
      else {
          if(level.equalsIgnoreCase("name")){
        adl.setDishName(dishName);
                    session.update(adl);
                   jLabel55.setText("Dish Name updated  !!!!!");
      }
      
      if(level.equalsIgnoreCase("ingredients")){
           adl.setDishName(mainIngredients);
                    session.update(adl);
           jLabel55.setText(" ingredients updated sucessfully");
      }
      if(level.equalsIgnoreCase("price")){
           adl.setDishName(price);
                    session.update(adl);
           jLabel55.setText("price Updated sucessfully");
      }
     
    }  
    }//GEN-LAST:event_jButton2MouseClicked

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseEntered

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseReleased

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        org.hibernate.classic.Session session =sf.openSession();

        Transaction tx=session.beginTransaction();//to take the permission
        String category=jTextField2.getText();
        String dishName=jTextField3.getText();
        String mainIngredients=jTextArea1.getText();
        int price=Integer.parseInt(jTextField1.getText());
        Drinks adl=new Drinks(category,dishName,mainIngredients,price);
        session.save(adl);// replacement of the insert query
        tx.commit();
        session.close();
        //JOptionPane.showMessageDialog(null,"Data Insertes Sucessfully");
        jLabel18.setText("inserted Data !!!!!!");
    }//GEN-LAST:event_jButton1MouseClicked
       // private void jLabel5MouseJavaEntered
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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea13;
    private javax.swing.JTextArea jTextArea14;
    private javax.swing.JTextArea jTextArea15;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
