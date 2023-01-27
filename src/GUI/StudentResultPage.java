/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import ConnectionProvider.ConnectionProviderCode;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ADMIN
 */
public class StudentResultPage extends javax.swing.JFrame {

    /**
     * Creates new form StudentResultPage
     */
    public StudentResultPage() {
        initComponents();
    }
    
    public StudentResultPage(String rollNo) {
        initComponents();
        RollNo_TextField.setText(rollNo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Name_Label = new javax.swing.JLabel();
        Name_TextField = new javax.swing.JTextField();
        RollNo_Label = new javax.swing.JLabel();
        RollNo_TextField = new javax.swing.JTextField();
        FatherName_Label = new javax.swing.JLabel();
        FatherName_TextField = new javax.swing.JTextField();
        Gender_Label = new javax.swing.JLabel();
        Gender_TextField = new javax.swing.JTextField();
        Course_Label = new javax.swing.JLabel();
        Course_TextField = new javax.swing.JTextField();
        Branch_Label = new javax.swing.JLabel();
        Branch_TextField = new javax.swing.JTextField();
        Subjects_Label = new javax.swing.JLabel();
        TotalMarks_Label = new javax.swing.JLabel();
        PassingMarks_Label = new javax.swing.JLabel();
        MarksObtained_Label = new javax.swing.JLabel();
        Physics_Label = new javax.swing.JLabel();
        Chemistry_Label = new javax.swing.JLabel();
        Maths_Label = new javax.swing.JLabel();
        Electrical_Label = new javax.swing.JLabel();
        Comm_Label = new javax.swing.JLabel();
        Hundred_Label5 = new javax.swing.JLabel();
        Hundred_Label1 = new javax.swing.JLabel();
        Hundred_Label2 = new javax.swing.JLabel();
        Hundred_Label3 = new javax.swing.JLabel();
        Hundred_Label4 = new javax.swing.JLabel();
        Thirty_Label1 = new javax.swing.JLabel();
        Thirty_Label2 = new javax.swing.JLabel();
        Thirty_Label3 = new javax.swing.JLabel();
        Thirty_Label4 = new javax.swing.JLabel();
        Thirty_Label5 = new javax.swing.JLabel();
        PhyMarks_TextField = new javax.swing.JTextField();
        ChemMarks_TextField = new javax.swing.JTextField();
        MathsMarks_TextField = new javax.swing.JTextField();
        ElectricalMarks_TextField = new javax.swing.JTextField();
        CommMarks_TextField = new javax.swing.JTextField();
        Total_Label = new javax.swing.JLabel();
        Total_TextField = new javax.swing.JTextField();
        Verdict_Label = new javax.swing.JLabel();
        Verdict_TextField = new javax.swing.JTextField();
        Exit_Button = new javax.swing.JButton();
        StudentResultPageBG_Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(550, 500));
        setMinimumSize(new java.awt.Dimension(550, 500));
        setPreferredSize(new java.awt.Dimension(550, 500));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Name_Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Name_Label.setText("Name");
        getContentPane().add(Name_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 90, 30));

        Name_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name_TextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(Name_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 130, 30));

        RollNo_Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RollNo_Label.setText("Roll No");
        getContentPane().add(RollNo_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 80, 30));

        RollNo_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RollNo_TextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(RollNo_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 130, 30));

        FatherName_Label.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        FatherName_Label.setText("Father's Name");
        getContentPane().add(FatherName_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, 30));

        FatherName_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FatherName_TextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(FatherName_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 130, 30));

        Gender_Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Gender_Label.setText("Gender");
        getContentPane().add(Gender_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 60, 30));
        getContentPane().add(Gender_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 130, 30));

        Course_Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Course_Label.setText("Course");
        getContentPane().add(Course_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 60, 30));
        getContentPane().add(Course_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 130, 30));

        Branch_Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Branch_Label.setText("Branch");
        getContentPane().add(Branch_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 70, 30));
        getContentPane().add(Branch_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 130, 30));

        Subjects_Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Subjects_Label.setText("Subjects");
        getContentPane().add(Subjects_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 80, -1));

        TotalMarks_Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TotalMarks_Label.setText("Total Marks");
        getContentPane().add(TotalMarks_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 80, -1));

        PassingMarks_Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PassingMarks_Label.setText("Passing Marks");
        getContentPane().add(PassingMarks_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 90, -1));

        MarksObtained_Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MarksObtained_Label.setText("Marks Obtained");
        getContentPane().add(MarksObtained_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 100, -1));

        Physics_Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Physics_Label.setText("Physics");
        getContentPane().add(Physics_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 80, -1));

        Chemistry_Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Chemistry_Label.setText("Chemistry");
        getContentPane().add(Chemistry_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        Maths_Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Maths_Label.setText("Maths");
        getContentPane().add(Maths_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        Electrical_Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Electrical_Label.setText("Electrical");
        getContentPane().add(Electrical_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        Comm_Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Comm_Label.setText("Communication");
        getContentPane().add(Comm_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        Hundred_Label5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Hundred_Label5.setText("100");
        getContentPane().add(Hundred_Label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        Hundred_Label1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Hundred_Label1.setText("100");
        getContentPane().add(Hundred_Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        Hundred_Label2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Hundred_Label2.setText("100");
        getContentPane().add(Hundred_Label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        Hundred_Label3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Hundred_Label3.setText("100");
        getContentPane().add(Hundred_Label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        Hundred_Label4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Hundred_Label4.setText("100");
        getContentPane().add(Hundred_Label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        Thirty_Label1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Thirty_Label1.setText("30");
        getContentPane().add(Thirty_Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        Thirty_Label2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Thirty_Label2.setText("30");
        getContentPane().add(Thirty_Label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        Thirty_Label3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Thirty_Label3.setText("30");
        getContentPane().add(Thirty_Label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));

        Thirty_Label4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Thirty_Label4.setText("30");
        getContentPane().add(Thirty_Label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, -1));

        Thirty_Label5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Thirty_Label5.setText("30");
        getContentPane().add(Thirty_Label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 20, -1));

        PhyMarks_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhyMarks_TextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(PhyMarks_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 80, -1));
        getContentPane().add(ChemMarks_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 80, -1));
        getContentPane().add(MathsMarks_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 80, -1));
        getContentPane().add(ElectricalMarks_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 80, -1));
        getContentPane().add(CommMarks_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 80, -1));

        Total_Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Total_Label.setText("Total");
        getContentPane().add(Total_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        Total_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Total_TextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(Total_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 90, -1));

        Verdict_Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Verdict_Label.setText("Verdict");
        getContentPane().add(Verdict_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, -1, -1));

        Verdict_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Verdict_TextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(Verdict_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 90, -1));

        Exit_Button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Exit_Button.setText("Exit");
        Exit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Exit_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, -1, -1));

        StudentResultPageBG_Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        StudentResultPageBG_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/schoolPic2.png"))); // NOI18N
        StudentResultPageBG_Label.setText("jLabel28");
        getContentPane().add(StudentResultPageBG_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, -170, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Name_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Name_TextFieldActionPerformed

    private void FatherName_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FatherName_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FatherName_TextFieldActionPerformed

    private void PhyMarks_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhyMarks_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhyMarks_TextFieldActionPerformed

    private void Total_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Total_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Total_TextFieldActionPerformed

    private void Verdict_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Verdict_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Verdict_TextFieldActionPerformed

    private void Exit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_ButtonActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit", "Submit", JOptionPane.YES_NO_OPTION);
        
        if(response == 0){
            setVisible(false);
            Student frame =new Student();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_Exit_ButtonActionPerformed

    private void RollNo_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RollNo_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RollNo_TextFieldActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        String rollNo = RollNo_TextField.getText();
        try{
            Connection con = ConnectionProviderCode.getcon();
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("select * from student inner join result where student.rollNo='"+rollNo+"' and result.rollNo='"+rollNo+"'");
            if(!rs.first()){
                JOptionPane.showMessageDialog(null, "Entered Roll No doesn't exist");
            }
            else{
                Name_TextField.setText(rs.getString(1));
                FatherName_TextField.setText(rs.getString(4));
                Gender_TextField.setText(rs.getString(3));
                Course_TextField.setText(rs.getString(5));
                Branch_TextField.setText(rs.getString(6));
                
                PhyMarks_TextField.setText(rs.getString(8));
                ChemMarks_TextField.setText(rs.getString(9));
                MathsMarks_TextField.setText(rs.getString(10));
                ElectricalMarks_TextField.setText(rs.getString(11));
                CommMarks_TextField.setText(rs.getString(12));
                Total_TextField.setText(rs.getString(13));
                
                Name_TextField.setEditable(false);
                FatherName_TextField.setEditable(false);
                Gender_TextField.setEditable(false);
                Course_TextField.setEditable(false);
                Branch_TextField.setEditable(false);
                RollNo_TextField.setEditable(false);
                
                PhyMarks_TextField.setEditable(false);
                ChemMarks_TextField.setEditable(false);
                MathsMarks_TextField.setEditable(false);
                ElectricalMarks_TextField.setEditable(false);
                CommMarks_TextField.setEditable(false);
                Total_TextField.setEditable(false);
                
                int phyMarks = Integer.parseInt(rs.getString(8));
                int chemMarks = Integer.parseInt(rs.getString(9));
                int mathsMarks = Integer.parseInt(rs.getString(10));
                int electricalMarks = Integer.parseInt(rs.getString(11));
                int commMarks = Integer.parseInt(rs.getString(12));
                
                if(phyMarks>=30 && chemMarks>=30 && mathsMarks>=30 && electricalMarks>=30 && commMarks>=30){
                    Verdict_TextField.setText("PASS");
                }
                else{
                    Verdict_TextField.setText("FAIL");
                }
                Verdict_TextField.setEditable(false);
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentResultPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Branch_Label;
    private javax.swing.JTextField Branch_TextField;
    private javax.swing.JTextField ChemMarks_TextField;
    private javax.swing.JLabel Chemistry_Label;
    private javax.swing.JTextField CommMarks_TextField;
    private javax.swing.JLabel Comm_Label;
    private javax.swing.JLabel Course_Label;
    private javax.swing.JTextField Course_TextField;
    private javax.swing.JTextField ElectricalMarks_TextField;
    private javax.swing.JLabel Electrical_Label;
    private javax.swing.JButton Exit_Button;
    private javax.swing.JLabel FatherName_Label;
    private javax.swing.JTextField FatherName_TextField;
    private javax.swing.JLabel Gender_Label;
    private javax.swing.JTextField Gender_TextField;
    private javax.swing.JLabel Hundred_Label1;
    private javax.swing.JLabel Hundred_Label2;
    private javax.swing.JLabel Hundred_Label3;
    private javax.swing.JLabel Hundred_Label4;
    private javax.swing.JLabel Hundred_Label5;
    private javax.swing.JLabel MarksObtained_Label;
    private javax.swing.JTextField MathsMarks_TextField;
    private javax.swing.JLabel Maths_Label;
    private javax.swing.JLabel Name_Label;
    private javax.swing.JTextField Name_TextField;
    private javax.swing.JLabel PassingMarks_Label;
    private javax.swing.JTextField PhyMarks_TextField;
    private javax.swing.JLabel Physics_Label;
    private javax.swing.JLabel RollNo_Label;
    private javax.swing.JTextField RollNo_TextField;
    private javax.swing.JLabel StudentResultPageBG_Label;
    private javax.swing.JLabel Subjects_Label;
    private javax.swing.JLabel Thirty_Label1;
    private javax.swing.JLabel Thirty_Label2;
    private javax.swing.JLabel Thirty_Label3;
    private javax.swing.JLabel Thirty_Label4;
    private javax.swing.JLabel Thirty_Label5;
    private javax.swing.JLabel TotalMarks_Label;
    private javax.swing.JLabel Total_Label;
    private javax.swing.JTextField Total_TextField;
    private javax.swing.JLabel Verdict_Label;
    private javax.swing.JTextField Verdict_TextField;
    // End of variables declaration//GEN-END:variables
}