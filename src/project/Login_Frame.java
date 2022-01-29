
package project;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.Border;




/**
 *
 * @author asus
 */
public class Login_Frame extends javax.swing.JFrame {
        public static String u="";
    public static Connection getConnection(){
        Connection con =null;
        try{
           
        con = DriverManager.getConnection("jdbc:mysql://localhost/bakery", "root", "dalia");
        }catch (Exception e){
            System.out.println(e.getMessage());  
        }
        return con;
    }
    
    public Login_Frame() {
        initComponents();
        ButtonGroup g = new ButtonGroup();
        g.add(jRadioButton1);
        g.add(jRadioButton2);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        JTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JPasswordField = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Castellar", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Log In");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(318, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(303, 303, 303))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 60));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 750, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 750, 20));

        jPanel4.setBackground(new java.awt.Color(255, 255, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 750, 20));

        JTextField1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JTextField1.setBorder(null);
        JTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(JTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 200, 30));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 202, -1, 30));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Login as:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        JPasswordField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JPasswordField.setBorder(null);
        JPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(JPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 200, 30));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jButton1.setText("LogIn");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 118, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText(" Register");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 110, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/username.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 40, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/password.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 40, -1));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 204));
        jRadioButton2.setText("Customer");
        jRadioButton2.setContentAreaFilled(false);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, -1, 40));

        jRadioButton1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 204));
        jRadioButton1.setText("Admin");
        jRadioButton1.setBorder(null);
        jRadioButton1.setBorderPainted(true);
        jRadioButton1.setContentAreaFilled(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 90, 40));

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Password:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 272, -1, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("don't have an account?");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, -1, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/DarkGrayBg.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 750, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel6.setBorder(null);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        Border Label_Border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.RED);
        jLabel6.setBorder(Label_Border);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        Register_Frame f = new Register_Frame();
        f.setVisible(true);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void JPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPasswordFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String user = JTextField1.getText();
        String pass = String.valueOf(JPasswordField.getPassword());
        if (user.equals("")&&pass.equals(""))
        JOptionPane.showMessageDialog(null,"You did not write username nor password","Login Confirmation",JOptionPane.INFORMATION_MESSAGE);
        else if (user.equals(""))
        JOptionPane.showMessageDialog(null,"You did not write a username","Login Confirmation",JOptionPane.INFORMATION_MESSAGE);
        else if (pass.equals(""))
        JOptionPane.showMessageDialog(null,"You did not write a password","Login Confirmation",JOptionPane.INFORMATION_MESSAGE);
        else if (user.equals("user1")&&pass.equals("enter"))
       JOptionPane.showMessageDialog(null,"Inavalid Entry","Login Confirmation",JOptionPane.INFORMATION_MESSAGE);  
        
        u = JTextField1.getText();
        Register_Frame.uname=u;
        
        PreparedStatement ps;
        ResultSet rs;
          PreparedStatement tr;
        ResultSet rss;
       
        String query2 = "SELECT * FROM `admin` WHERE `username` =? AND `password` =?";
        
        String query = "SELECT * FROM `customer` WHERE `username` =? AND `password` =?";
        
                try {
           
           
            
            if (jRadioButton1.isSelected())
            {
                 ps= getConnection().prepareStatement(query2);
                 ps.setString(1, user);
                 ps.setString(2, pass);
                 
                rs= ps.executeQuery();
                if (rs.next()){
                    adminPage a =new adminPage();
                 a.setVisible(true);
                 this.dispose();
                }
                else
            {
                JOptionPane.showMessageDialog(null, "this account is not regestired!");
            }

            }
            else if(jRadioButton2.isSelected())
            {
                 ps= getConnection().prepareStatement(query);
                 ps.setString(1, user);
                 ps.setString(2, pass);
                 
               rs= ps.executeQuery();
                if (rs.next()){
                    CustomerMain b = new CustomerMain();
                    b.setVisible(true);
                    this.dispose();
                }
                else
            {
                JOptionPane.showMessageDialog(null, "this account is not regestired!");
            }
 
            }
            else{
                JOptionPane.showMessageDialog(null, "You must choose an option!","Error loging in!",JOptionPane.WARNING_MESSAGE);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error connecting to our database, for successful connection please rewrite your information! Error:"+ ex, "warning!", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void JTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField1ActionPerformed

    }//GEN-LAST:event_JTextField1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField JPasswordField;
    private javax.swing.JTextField JTextField1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration//GEN-END:variables
}
