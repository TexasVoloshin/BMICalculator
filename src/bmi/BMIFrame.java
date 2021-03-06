/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

/**
 *
 * @author KasiaW
 */
public class BMIFrame extends javax.swing.JFrame {

    /**
     * Creates new form BMIFrame
     */
    public BMIFrame() {
        initComponents();
        setSize(300,410);
        setLocationRelativeTo(null);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextHeight = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTextWeight = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jMessage = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jResult = new javax.swing.JTextPane();
        jTextHeight1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("Oblicz BMI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 200, 120, 50);

        jLabel1.setText("Podaj swoją wagę [ kg] ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 110, 150, 20);

        jLabel2.setText("Podaj swój wzrost [cm]");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 20, 150, 32);

        jTextHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextHeightActionPerformed(evt);
            }
        });
        getContentPane().add(jTextHeight);
        jTextHeight.setBounds(90, 60, 120, 30);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setFocusable(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextWeightActionPerformed(evt);
            }
        });
        jPanel1.add(jTextWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 120, 30));

        jMessage.setBackground(new java.awt.Color(204, 204, 255));
        jScrollPane2.setViewportView(jMessage);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 210, 40));

        jResult.setEditable(false);
        jResult.setBackground(new java.awt.Color(204, 204, 255));
        jScrollPane3.setViewportView(jResult);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 210, 40));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 300, 400);

        jTextHeight1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextHeight1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextHeight1);
        jTextHeight1.setBounds(90, 80, 120, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  
       double iheight = Double.parseDouble(jTextHeight.getText());
       double iweight = Double.parseDouble(jTextWeight.getText());  
       double iheight_m =  iheight/100;
       double square = Math.pow(iheight_m, 2);
       double bmi=iweight/square;
       String Calc_bmi = String.format("%,2f", bmi);
       jResult.setText("Twoje BMI wynosi: " + Calc_bmi);
       String msg = "";
       if (bmi < 18.5) {
                msg = " Masz niedowagę";
            } else if (bmi >= 18.5 && bmi < 25) {
                msg = " Twoja waga jest w normie";
            } else if (bmi >= 25) {
                msg = " Masz nadwagę";
            }


            jMessage.setText(msg);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextHeightActionPerformed
    jTextHeight.setText(null);
    }//GEN-LAST:event_jTextHeightActionPerformed

    private void jTextHeight1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextHeight1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextHeight1ActionPerformed

    private void jTextWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextWeightActionPerformed

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
            java.util.logging.Logger.getLogger(BMIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BMIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BMIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BMIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BMIFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextPane jMessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextPane jResult;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextHeight;
    private javax.swing.JTextField jTextHeight1;
    private javax.swing.JTextField jTextWeight;
    // End of variables declaration//GEN-END:variables
}
