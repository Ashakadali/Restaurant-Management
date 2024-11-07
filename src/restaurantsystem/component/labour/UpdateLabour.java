/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package restaurantsystem.component.labour;


import javax.swing.JOptionPane;
import restaurantsystem.model.Labour;
import restaurantsystem.service.LabourService;

/**
 *
 * @author Shahin
 */
public class UpdateLabour extends javax.swing.JFrame {

    private final LabourService labourService;

    /**
     * Creates new form ModifyLabour
     */
    public UpdateLabour() {
        initComponents();
        this.labourService = new LabourService();
        performFileRelatedTask();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        newLabourNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        newLabourSalaryField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        oldLabourIdField = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        newLabourIDField = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/labou.r.jpeg"))); // NOI18N
        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newLabourNameField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        newLabourNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                newLabourNameFieldKeyPressed(evt);
            }
        });
        getContentPane().add(newLabourNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 610, 160, 55));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Enter New Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 610, 315, 55));

        text.setEditable(false);
        text.setColumns(20);
        text.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        text.setRows(5);
        jScrollPane1.setViewportView(text);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 480, 180));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Enter New Salary");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 670, 315, 55));

        newLabourSalaryField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        newLabourSalaryField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                newLabourSalaryFieldKeyPressed(evt);
            }
        });
        getContentPane().add(newLabourSalaryField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 670, 160, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Which labour id want to modify");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 315, 51));

        oldLabourIdField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        oldLabourIdField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                oldLabourIdFieldKeyPressed(evt);
            }
        });
        getContentPane().add(oldLabourIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 490, 160, 49));

        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 740, 118, 45));

        backButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 740, 106, 45));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Enter New ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, 315, 56));

        newLabourIDField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        newLabourIDField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                newLabourIDFieldKeyPressed(evt);
            }
        });
        getContentPane().add(newLabourIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 550, 160, 51));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField1.setText("Id");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField2.setText("Name");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, -1, -1));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField3.setText("Salary");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/labour.jpeg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1830, 900));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void performFileRelatedTask() {
        StringBuilder stringBuilder = new StringBuilder();

        labourService.getAll().forEach((labour) -> {
            stringBuilder.append(labour.getId())
                    .append("\t")
                    .append(labour.getName())
                    .append("\t")
                    .append(labour.getSalary())
                    .append("\n");
        });

        text.setText(stringBuilder.toString());
    }
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

        String sourceId = oldLabourIdField.getText();

        String id = newLabourIDField.getText();
        String name = newLabourNameField.getText();
        double salary = Double.parseDouble(newLabourSalaryField.getText());

        if (sourceId.isEmpty() || id.isEmpty() || name.isEmpty() || newLabourSalaryField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Field(s) cannot be left empty");
            return;
        }

        if (!newLabourSalaryField.getText().chars().allMatch(Character::isDigit)) {
            JOptionPane.showMessageDialog(this, "Please enter valid salary");
            return;
        }

        Labour updatedLabour = new Labour(id, name, salary);

        boolean isUpdated = labourService.update(sourceId, updatedLabour);
        
        if (!isUpdated) {
            JOptionPane.showConfirmDialog(this, "No labour found to update");
            return;
        }

        // Reset the modify fields
        oldLabourIdField.setText("");
        newLabourIDField.setText("");
        newLabourNameField.setText("");
        newLabourSalaryField.setText("");

        // Show confirmation pop up
        JOptionPane.showMessageDialog(this, "Labour info has been Updated");

        // Update display information
        performFileRelatedTask();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        LabourManagement lm = new LabourManagement();
        lm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void newLabourNameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newLabourNameFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_newLabourNameFieldKeyPressed

    private void newLabourSalaryFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newLabourSalaryFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_newLabourSalaryFieldKeyPressed

    private void newLabourIDFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newLabourIDFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_newLabourIDFieldKeyPressed

    private void oldLabourIdFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_oldLabourIdFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_oldLabourIdFieldKeyPressed

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
            java.util.logging.Logger.getLogger(UpdateLabour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateLabour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateLabour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateLabour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UpdateLabour().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField newLabourIDField;
    private javax.swing.JTextField newLabourNameField;
    private javax.swing.JTextField newLabourSalaryField;
    private javax.swing.JTextField oldLabourIdField;
    private javax.swing.JTextArea text;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}