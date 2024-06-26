/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration.gui;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author 91708
 */
public class OptionsFrame extends javax.swing.JFrame {
    private Object DBConnection;

    /**
     * Creates new form OptionsFrame
     */
    public OptionsFrame() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnDoTask = new javax.swing.JButton();
        jrQuit = new javax.swing.JRadioButton();
        jrDeleteReg = new javax.swing.JRadioButton();
        jrUpdateReg = new javax.swing.JRadioButton();
        jrShowAllReg = new javax.swing.JRadioButton();
        jrAddReg = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 51));

        btnDoTask.setBackground(new java.awt.Color(153, 0, 0));
        btnDoTask.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDoTask.setText("Do Task");
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });

        jrQuit.setBackground(new java.awt.Color(153, 0, 51));
        buttonGroup1.add(jrQuit);
        jrQuit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrQuit.setForeground(new java.awt.Color(255, 255, 255));
        jrQuit.setText("Quit");
        jrQuit.setActionCommand("");
        jrQuit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jrQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrQuitActionPerformed(evt);
            }
        });

        jrDeleteReg.setBackground(new java.awt.Color(153, 0, 51));
        buttonGroup1.add(jrDeleteReg);
        jrDeleteReg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrDeleteReg.setForeground(new java.awt.Color(255, 255, 255));
        jrDeleteReg.setText("Delete Registrations");
        jrDeleteReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrDeleteRegActionPerformed(evt);
            }
        });

        jrUpdateReg.setBackground(new java.awt.Color(153, 0, 51));
        buttonGroup1.add(jrUpdateReg);
        jrUpdateReg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrUpdateReg.setForeground(new java.awt.Color(255, 255, 255));
        jrUpdateReg.setText("Update in Registrations");
        jrUpdateReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrUpdateRegActionPerformed(evt);
            }
        });

        jrShowAllReg.setBackground(new java.awt.Color(153, 0, 51));
        buttonGroup1.add(jrShowAllReg);
        jrShowAllReg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrShowAllReg.setForeground(new java.awt.Color(255, 255, 255));
        jrShowAllReg.setText("Show All Registrations");
        jrShowAllReg.setActionCommand("");
        jrShowAllReg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jrShowAllReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrShowAllRegActionPerformed(evt);
            }
        });

        jrAddReg.setBackground(new java.awt.Color(153, 0, 51));
        buttonGroup1.add(jrAddReg);
        jrAddReg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrAddReg.setForeground(new java.awt.Color(255, 255, 255));
        jrAddReg.setText("Add Registrations");
        jrAddReg.setActionCommand("");
        jrAddReg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jrAddReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrAddRegActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(102, 102, 255));
        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select Your Choice");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 111, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrShowAllReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jrAddReg, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(196, 196, 196))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrDeleteReg)
                                    .addComponent(jrUpdateReg)
                                    .addComponent(jrQuit)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(btnDoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jrAddReg)
                .addGap(18, 18, 18)
                .addComponent(jrShowAllReg)
                .addGap(18, 18, 18)
                .addComponent(jrUpdateReg)
                .addGap(18, 18, 18)
                .addComponent(jrDeleteReg)
                .addGap(18, 18, 18)
                .addComponent(jrQuit)
                .addGap(54, 54, 54)
                .addComponent(btnDoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed
        // TODO add your handling code here:

        if(validateInput()==false){
            JOptionPane.showMessageDialog(null, "Please make a selection first", "No Selection", JOptionPane.INFORMATION_MESSAGE );
            return ;
        }

     /*   JFrame userChoiceFrame=null;

        if(jrAddReg.isSelected()){
            userChoiceFrame =new AddRegistrationFrame();

        }
      
        else if(jrShowAllReg.isSelected()){
            userChoiceFrame =new ViewAllRegistrationFrame();

        }
        if(jrUpdateReg.isSelected()){
            userChoiceFrame =new UpdateRegistrationFrame();

        }
      
        else if(jrDeleteReg.isSelected()){
            userChoiceFrame =new DeleteRegistrationFrame();

        }
*/ if(jrAddReg.isSelected()){
            AddRegistrationFrame addReg=new AddRegistrationFrame();
            addReg.setVisible(true);
            this.dispose();
        }
        else if(jrShowAllReg.isSelected()){
            ViewAllRegistrationFrame viewReg;
            try {
                viewReg = new ViewAllRegistrationFrame();
                viewReg.setVisible(true);
            this.dispose();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OptionsFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
        else if(jrUpdateReg.isSelected()){
            UpdateRegistrationFrame UpdateReg;
            try {
                UpdateReg = new UpdateRegistrationFrame();
                 UpdateReg.setVisible(true);
            this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(OptionsFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
           }
        
         else if(jrDeleteReg.isSelected()){
           DeleteRegistrationFrame deleteReg =new DeleteRegistrationFrame();
           deleteReg.setVisible(true);
            this.dispose();

        }
        else
        {
            JOptionPane.showMessageDialog(null, "Thank you for using this app", "Thanks", JOptionPane.INFORMATION_MESSAGE );
           // DBConnection.closeConnection();
            System.exit(0);
        }

      
    }//GEN-LAST:event_btnDoTaskActionPerformed

    private void jrQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrQuitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrQuitActionPerformed

    private void jrDeleteRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrDeleteRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrDeleteRegActionPerformed

    private void jrUpdateRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrUpdateRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrUpdateRegActionPerformed

    private void jrShowAllRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrShowAllRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrShowAllRegActionPerformed

    private void jrAddRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrAddRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrAddRegActionPerformed

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
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoTask;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrAddReg;
    private javax.swing.JRadioButton jrDeleteReg;
    private javax.swing.JRadioButton jrQuit;
    private javax.swing.JRadioButton jrShowAllReg;
    private javax.swing.JRadioButton jrUpdateReg;
    // End of variables declaration//GEN-END:variables
private boolean validateInput() {
        
        if(jrAddReg.isSelected()==false&&jrShowAllReg.isSelected()==false&&jrUpdateReg.isSelected()==false&&jrDeleteReg.isSelected()==false&&jrQuit.isSelected()==false)
    {return false;
    
}
        return true;
}}
