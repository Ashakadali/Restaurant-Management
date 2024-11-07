/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantsystem.component.auth;

import javax.swing.JOptionPane;
import restaurantsystem.MainMenu;

/**
 *
 * @author Shahin
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    public Login() {
        initComponents();

        // Since we are not maintaining any user profile so - 
        // let's set the default user and password
        setDefaultUserName();
    }

    /**
     * Set default username and password
     */
    private void setDefaultUserName() {
        this.userNameField.setText("Asha");
        this.passwordField.setText("Asha");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        userNameLabel = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/loginpagemain.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPanel.setBackground(new java.awt.Color(153, 153, 255));
        loginPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FSKTM Restaurant", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 15), new java.awt.Color(0, 0, 204))); // NOI18N
        loginPanel.setForeground(new java.awt.Color(153, 153, 255));
        loginPanel.setToolTipText("");
        loginPanel.setName(""); // NOI18N
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 371, 2001, -1));
        loginPanel.getAccessibleContext().setAccessibleName("");

        userNameLabel.setBackground(new java.awt.Color(255, 153, 153));
        userNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        userNameLabel.setText("User Name: ");
        getContentPane().add(userNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 140, 40));

        userNameField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        userNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameFieldActionPerformed(evt);
            }
        });
        userNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userNameFieldKeyPressed(evt);
            }
        });
        getContentPane().add(userNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 170, 60));

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password :");
        getContentPane().add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 130, 30));

        passwordField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 170, 60));

        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        loginButton.setText("Log In");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 120, 50));

        jTextField2.setBackground(java.awt.Color.gray);
        jTextField2.setFont(new java.awt.Font("Segoe UI Black", 3, 54)); // NOI18N
        jTextField2.setText(" Restaurant  Management");
        jTextField2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 15), new java.awt.Color(153, 153, 153))); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 800, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/loginpagemain.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1070));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        if (userNameField.getText().equalsIgnoreCase("Asha")) {
            JOptionPane.showMessageDialog(this, "Access granted");
            this.dispose();
            MainMenu mainMenu = new MainMenu();
            mainMenu.setVisible(true);
        } else {
            userNameField.setText("");
            passwordField.setText("");
            JOptionPane.showMessageDialog(this, userNameField.getText() + " Access Denied");
        }

    }//GEN-LAST:event_loginButtonActionPerformed

    private void userNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameFieldActionPerformed

    private void userNameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNameFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameFieldKeyPressed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField userNameField;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables

}
