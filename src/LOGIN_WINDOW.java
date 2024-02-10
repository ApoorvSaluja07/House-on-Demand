
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author apoor
 */
public class LOGIN_WINDOW extends javax.swing.JFrame {

    /**
     * Creates new form LOGIN_WINDOW
     */
    public LOGIN_WINDOW() {
        initComponents();
        
        //center the form
        this.setLocationRelativeTo(null);
        
        
        //display image in login(jpanel)
        jLabel_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/house65.png")));
        
        // username and password icon
         jLabel_username_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/username45.png")));
         jLabel_password_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/password.png")));
        // add a bottom border to the jlabel title
         Border title_border = BorderFactory.createMatteBorder (0, 0, 3, 0, Color.red);
         jLabel1.setBorder (title_border);
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
        jLabel_image = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_username_icon = new javax.swing.JLabel();
        jLabel_password_icon = new javax.swing.JLabel();
        jTextField_username = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton_login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel_image.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_image.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("LOGIN");

        jLabel_username_icon.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_username_icon.setOpaque(true);

        jLabel_password_icon.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_password_icon.setOpaque(true);

        jTextField_username.setFont(new java.awt.Font("Segoe UI Symbol", 0, 15)); // NOI18N
        jTextField_username.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_username.setText("Username");
        jTextField_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_usernameFocusLost(evt);
            }
        });

        jPasswordField1.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField1.setText("password");
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });

        jButton_login.setBackground(new java.awt.Color(255, 0, 0));
        jButton_login.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton_login.setForeground(new java.awt.Color(255, 255, 255));
        jButton_login.setText("Log In");
        jButton_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_image, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel_username_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_password_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_username_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_password_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jButton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_usernameFocusGained
        // TODO add your handling code here:
        // remove the text from the text field on focus gained
// if the text field text = "username"
                  if (jTextField_username.getText().trim().toLowerCase().equals("username"))
                {
                        jTextField_username.setText ("");
                            // change the text field color to black
                        jTextField_username.setForeground (Color.black);
                }
    }//GEN-LAST:event_jTextField_usernameFocusGained

    private void jTextField_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_usernameFocusLost
        
        
        // if the text field is empty -> set it to 'Username'
              if (jTextField_username.getText().trim().equals("") ||
          jTextField_username.getText().trim().toLowerCase().equals("username"))
           {
                 jTextField_username.setText ("Username");
                   jTextField_username.setForeground (new Color (153, 153, 153));
            }
    }//GEN-LAST:event_jTextField_usernameFocusLost

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        // TODO add your handling code here:
        
          //clear password field on focus if tex = password
          //get the password
          String password = String.valueOf(jPasswordField1.getPassword());
          if(password.trim().toLowerCase().equals("password"))
          {
              jPasswordField1.setText("");
              jPasswordField1.setForeground(Color.BLACK);
          }
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        // TODO add your handling code here:
        
        // if the password field Is empty -> set it to 'password'
                               String password = String.valueOf(jPasswordField1.getPassword () );
                                   if (password.trim().equals("") ||
                                  password.trim().toLowerCase().equals("password"))
                       {
                             jPasswordField1.setText ("password");
                             jPasswordField1. setForeground (new Color (153, 153, 153));
                        }
              
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginActionPerformed
        // TODO add your handling code here:
        
        String username = jTextField_username.getText();
        String password = String.valueOf(jPasswordField1.getPassword());
        
        PreparedStatement ps;
        ResultSet rs;
        
        String selectquery = "SELECT * FROM `users` WHERE `username` = ? AND password = ?";
        
        if(username.trim().toLowerCase().equals("username") ||
                password.trim().toLowerCase().equals("password"))
        {
            JOptionPane.showMessageDialog(null, "ENTER USERNAME AND PASSWORD FIRST", "Empty Field", 2);
        }
        else
        {
        
            try {
                ps = THE_CONNECTION.getTheConnection().prepareStatement(selectquery);
                
                 ps.setString(1, username);         
             ps.setString(2, password);
             
             rs = ps.executeQuery();
             
             if(rs.next())
             {
                // JOptionPane.showMessageDialog(null, "Need to show the main form to the user");
                 MAIN_WINDOW mainform = new MAIN_WINDOW();
                 mainform.setVisible(true);
                 mainform.pack();
                 mainform.setExtendedState(JFrame.MAXIMIZED_BOTH);
                 
                 // close the login window
                 this.dispose();
             }
             else
             {
                 JOptionPane.showMessageDialog(null, "Invalid username or password!!", "Wrong Data", 2);
             }
            } catch (SQLException ex) {
                Logger.getLogger(LOGIN_WINDOW.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_jButton_loginActionPerformed

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
            java.util.logging.Logger.getLogger(LOGIN_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN_WINDOW().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_image;
    private javax.swing.JLabel jLabel_password_icon;
    private javax.swing.JLabel jLabel_username_icon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField_username;
    // End of variables declaration//GEN-END:variables
}