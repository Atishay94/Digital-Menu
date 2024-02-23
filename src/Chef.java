
import hibernate.beans.AdminLogin;
import hibernate.beans.Desert;
import hibernate.beans.MainCourse;
import hibernate.beans.OrderTable;
import hibernate.beans.Staters;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Chef extends javax.swing.JFrame {
 public Chef() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel23 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel39 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
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

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chefs.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 190));

        jTabbedPane1.addTab("Home", jPanel1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "contactNo", "tableNo", "custumerName", "review"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1074, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Order", jPanel2);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chefs.jpg"))); // NOI18N
        jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 220, 170));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drinkerlogo.jpg"))); // NOI18N
        jLabel4.setOpaque(true);
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 220));

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

        jTabbedPane1.addTab("Staters", jTabbedPane6);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close123.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jMenu1.setText("File");

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
        jMenu2.add(jMenu8);

        jMenu9.setText("jMenu9");
        jMenu2.add(jMenu9);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1074, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        // TODO add your handling code here:
        Chef chef=new Chef();
        chef.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        Criteria crt=session.createCriteria(OrderTable.class);
        List<OrderTable> data=crt.list();
        DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
        for(OrderTable ref: data)
        {
            Object ob[]={ref.getContactNo(),ref.getTableNo(),ref.getCustomerName(),ref.getReview()};
            dtm.addRow(ob);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        int result =JOptionPane.showConfirmDialog(this,"Do you wanna signout","signout message",JOptionPane.YES_NO_OPTION);
        if(result==0){
           
            dispose();
            //if(result==1){
                //  System.exit(0);
                //}
        }
        else{
             new ChefHome().setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_jLabel3MouseClicked

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chef().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane7;
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
    // End of variables declaration//GEN-END:variables
}
