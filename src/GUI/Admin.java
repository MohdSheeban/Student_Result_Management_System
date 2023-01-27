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
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InsertStudent_Button = new javax.swing.JButton();
        AddResult_Button = new javax.swing.JButton();
        ListStudent_Button = new javax.swing.JButton();
        ListStudentResult_Button = new javax.swing.JButton();
        UpdateStudentMarks_Button = new javax.swing.JButton();
        Logout_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(550, 400));
        setMinimumSize(new java.awt.Dimension(550, 400));
        setPreferredSize(new java.awt.Dimension(550, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InsertStudent_Button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        InsertStudent_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-schoolboy-at-a-desk-30.png"))); // NOI18N
        InsertStudent_Button.setText("Insert Student");
        InsertStudent_Button.setMaximumSize(new java.awt.Dimension(130, 30));
        InsertStudent_Button.setMinimumSize(new java.awt.Dimension(130, 30));
        InsertStudent_Button.setPreferredSize(new java.awt.Dimension(130, 30));
        InsertStudent_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertStudent_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(InsertStudent_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 25, 183, 35));

        AddResult_Button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddResult_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-grade-24.png"))); // NOI18N
        AddResult_Button.setText("Add Result");
        AddResult_Button.setMaximumSize(new java.awt.Dimension(130, 30));
        AddResult_Button.setMinimumSize(new java.awt.Dimension(130, 30));
        AddResult_Button.setPreferredSize(new java.awt.Dimension(130, 30));
        AddResult_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddResult_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddResult_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 95, 183, 35));

        ListStudent_Button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ListStudent_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-checklist-30.png"))); // NOI18N
        ListStudent_Button.setText("List Student");
        ListStudent_Button.setMaximumSize(new java.awt.Dimension(130, 30));
        ListStudent_Button.setMinimumSize(new java.awt.Dimension(130, 30));
        ListStudent_Button.setPreferredSize(new java.awt.Dimension(130, 30));
        ListStudent_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListStudent_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ListStudent_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 165, 183, 35));

        ListStudentResult_Button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ListStudentResult_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-checklist-30.png"))); // NOI18N
        ListStudentResult_Button.setText("List Student Result");
        ListStudentResult_Button.setMaximumSize(new java.awt.Dimension(130, 30));
        ListStudentResult_Button.setMinimumSize(new java.awt.Dimension(130, 30));
        ListStudentResult_Button.setPreferredSize(new java.awt.Dimension(130, 30));
        ListStudentResult_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListStudentResult_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ListStudentResult_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 235, 183, 35));

        UpdateStudentMarks_Button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UpdateStudentMarks_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-grade-24.png"))); // NOI18N
        UpdateStudentMarks_Button.setText("Update Student Marks");
        UpdateStudentMarks_Button.setMaximumSize(new java.awt.Dimension(130, 30));
        UpdateStudentMarks_Button.setMinimumSize(new java.awt.Dimension(130, 30));
        UpdateStudentMarks_Button.setPreferredSize(new java.awt.Dimension(130, 30));
        UpdateStudentMarks_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateStudentMarks_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateStudentMarks_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 305, 190, 40));

        Logout_Button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Logout_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-close-30.png"))); // NOI18N
        Logout_Button.setText("Logout");
        Logout_Button.setMaximumSize(new java.awt.Dimension(130, 30));
        Logout_Button.setMinimumSize(new java.awt.Dimension(130, 30));
        Logout_Button.setPreferredSize(new java.awt.Dimension(130, 30));
        Logout_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Logout_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 136, 37));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/schoolPic2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, -120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InsertStudent_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertStudent_ButtonActionPerformed
        // TODO add your handling code here:
        InsertStudent frame = new InsertStudent();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_InsertStudent_ButtonActionPerformed

    private void UpdateStudentMarks_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateStudentMarks_ButtonActionPerformed
        // TODO add your handling code here:
        UpdateResult frame = new UpdateResult();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_UpdateStudentMarks_ButtonActionPerformed

    private void AddResult_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddResult_ButtonActionPerformed
        // TODO add your handling code here:
        InsertResult frame = new InsertResult();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_AddResult_ButtonActionPerformed

    private void ListStudent_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListStudent_ButtonActionPerformed
        // TODO add your handling code here:
        ListStudents frame = new ListStudents();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_ListStudent_ButtonActionPerformed

    private void ListStudentResult_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListStudentResult_ButtonActionPerformed
        // TODO add your handling code here:
        ListResult frame = new ListResult();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_ListStudentResult_ButtonActionPerformed

    private void Logout_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout_ButtonActionPerformed
        // TODO add your handling code here:
        int response  = JOptionPane.showConfirmDialog(null, "Are you sure, you want to exit ?","Submit",JOptionPane.YES_NO_OPTION);
        if(response == 0){
            setVisible(false);
            AdminLogin frame = new AdminLogin();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_Logout_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddResult_Button;
    private javax.swing.JButton InsertStudent_Button;
    private javax.swing.JButton ListStudentResult_Button;
    private javax.swing.JButton ListStudent_Button;
    private javax.swing.JButton Logout_Button;
    private javax.swing.JButton UpdateStudentMarks_Button;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}