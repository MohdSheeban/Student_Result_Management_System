/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class AdminLogin extends javax.swing.JFrame {

    /**
     * Creates new form AdminLogin
     */
    public AdminLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Username_Label = new javax.swing.JLabel();
        Password_Label = new javax.swing.JLabel();
        Username_TextField = new javax.swing.JTextField();
        Login_Button = new javax.swing.JButton();
        Exit_Button = new javax.swing.JButton();
        Password_Field = new javax.swing.JPasswordField();
        AdminLogin_Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Username_Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Username_Label.setText("Username");
        getContentPane().add(Username_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        Password_Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Password_Label.setText("Password");
        getContentPane().add(Password_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));
        getContentPane().add(Username_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 180, -1));

        Login_Button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Login_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-login-30.png"))); // NOI18N
        Login_Button.setText("Login");
        Login_Button.setMaximumSize(new java.awt.Dimension(150, 30));
        Login_Button.setMinimumSize(new java.awt.Dimension(150, 30));
        Login_Button.setPreferredSize(new java.awt.Dimension(150, 30));
        Login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Login_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        Exit_Button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Exit_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-close-30.png"))); // NOI18N
        Exit_Button.setText("Exit");
        Exit_Button.setMaximumSize(new java.awt.Dimension(150, 30));
        Exit_Button.setMinimumSize(new java.awt.Dimension(150, 30));
        Exit_Button.setPreferredSize(new java.awt.Dimension(150, 30));
        Exit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Exit_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, 30));
        getContentPane().add(Password_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 180, -1));

        AdminLogin_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/schoolPic2.png"))); // NOI18N
        AdminLogin_Label.setText("jLabel3");
        AdminLogin_Label.setMaximumSize(new java.awt.Dimension(550, 500));
        AdminLogin_Label.setMinimumSize(new java.awt.Dimension(550, 500));
        AdminLogin_Label.setPreferredSize(new java.awt.Dimension(550, 500));
        getContentPane().add(AdminLogin_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Exit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_ButtonActionPerformed

        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit", "Submit", JOptionPane.YES_NO_OPTION);
        
        if(response == 0){
            setVisible(false);
            Home frame = new Home();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_Exit_ButtonActionPerformed

    private void Login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_ButtonActionPerformed
        // TODO add your handling code here:
        String userName = Username_TextField.getText();
        String password = Password_Field.getText();
        
        if(userName.contentEquals("user") && password.contentEquals("password")){
            setVisible(false);
            Admin frame = new Admin();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
        else{
            JOptionPane.showMessageDialog(null, "Username or Password is Incorrect");
        }
    }//GEN-LAST:event_Login_ButtonActionPerformed

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
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminLogin_Label;
    private javax.swing.JButton Exit_Button;
    private javax.swing.JButton Login_Button;
    private javax.swing.JPasswordField Password_Field;
    private javax.swing.JLabel Password_Label;
    private javax.swing.JLabel Username_Label;
    private javax.swing.JTextField Username_TextField;
    // End of variables declaration//GEN-END:variables
}
