/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import functionUtils.*;

/**
 *
 * @author Kevin
 */
public class calculatorGUI extends javax.swing.JFrame {


    /**
     * Creates new form calculatorGUI
     */
    public calculatorGUI() {
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

        sept = new javax.swing.JButton();
        huit = new javax.swing.JButton();
        neuf = new javax.swing.JButton();
        quatre = new javax.swing.JButton();
        cinq = new javax.swing.JButton();
        six = new javax.swing.JButton();
        un = new javax.swing.JButton();
        deux = new javax.swing.JButton();
        trois = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        fois = new javax.swing.JButton();
        moins = new javax.swing.JButton();
        diviser = new javax.swing.JButton();
        egal = new javax.swing.JButton();
        operation = new javax.swing.JTextField();
        resultat = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(155, 212));

        sept.setText("7");
        sept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                septActionPerformed(evt);
            }
        });

        huit.setText("8");
        huit.setPreferredSize(new java.awt.Dimension(41, 23));
        huit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huitActionPerformed(evt);
            }
        });

        neuf.setText("9");
        neuf.setPreferredSize(new java.awt.Dimension(41, 23));
        neuf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neufActionPerformed(evt);
            }
        });

        quatre.setText("4");
        quatre.setPreferredSize(new java.awt.Dimension(41, 25));
        quatre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quatreActionPerformed(evt);
            }
        });

        cinq.setText("5");
        cinq.setPreferredSize(new java.awt.Dimension(41, 23));
        cinq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinqActionPerformed(evt);
            }
        });

        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        un.setText("1");
        un.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unActionPerformed(evt);
            }
        });

        deux.setText("2");
        deux.setPreferredSize(new java.awt.Dimension(41, 23));
        deux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deuxActionPerformed(evt);
            }
        });

        trois.setText("3");
        trois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                troisActionPerformed(evt);
            }
        });

        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        zero.setText("0");
        zero.setPreferredSize(new java.awt.Dimension(41, 23));
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        fois.setText("x");
        fois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foisActionPerformed(evt);
            }
        });

        moins.setText("-");
        moins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moinsActionPerformed(evt);
            }
        });

        diviser.setText("/");
        diviser.setPreferredSize(new java.awt.Dimension(41, 23));
        diviser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diviserActionPerformed(evt);
            }
        });

        egal.setText("=");
        egal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egalActionPerformed(evt);
            }
        });

        operation.setEditable(false);
        operation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operationActionPerformed(evt);
            }
        });

        resultat.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultat, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(operation)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(quatre, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(un, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(moins, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cinq, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(deux, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(trois, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fois, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(diviser, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(egal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sept, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(huit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(neuf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(operation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sept, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(huit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(neuf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quatre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cinq, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(un, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deux, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trois, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fois, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moins, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diviser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(egal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void septActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_septActionPerformed
        operation.setText(operation.getText() + "7");
        // TODO add your handling code here:
    }//GEN-LAST:event_septActionPerformed

    private void diviserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diviserActionPerformed
        operation.setText(operation.getText() + "/");
        // TODO add your handling code here:
    }//GEN-LAST:event_diviserActionPerformed

    private void huitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huitActionPerformed
        operation.setText(operation.getText() + "8");   
        // TODO add your handling code here:
    }//GEN-LAST:event_huitActionPerformed

    private void neufActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neufActionPerformed
        operation.setText(operation.getText() + "9");
        // TODO add your handling code here:
    }//GEN-LAST:event_neufActionPerformed

    private void quatreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quatreActionPerformed
        operation.setText(operation.getText() + "4");
        // TODO add your handling code here:
    }//GEN-LAST:event_quatreActionPerformed

    private void cinqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinqActionPerformed
        operation.setText(operation.getText() + "5");
        // TODO add your handling code here:
    }//GEN-LAST:event_cinqActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        operation.setText(operation.getText() + "6");
        // TODO add your handling code here:
    }//GEN-LAST:event_sixActionPerformed

    private void unActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unActionPerformed
        operation.setText(operation.getText() + "1");
        // TODO add your handling code here:
    }//GEN-LAST:event_unActionPerformed

    private void deuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deuxActionPerformed
        operation.setText(operation.getText() + "2");
        // TODO add your handling code here:
    }//GEN-LAST:event_deuxActionPerformed

    private void troisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_troisActionPerformed
        operation.setText(operation.getText() + "3");
        // TODO add your handling code here:
    }//GEN-LAST:event_troisActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        operation.setText(operation.getText() + "+");
        // TODO add your handling code here:
    }//GEN-LAST:event_plusActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        operation.setText(operation.getText() + "0");
        // TODO add your handling code here:
    }//GEN-LAST:event_zeroActionPerformed

    private void foisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foisActionPerformed
        operation.setText(operation.getText() + "*");
        // TODO add your handling code here:
    }//GEN-LAST:event_foisActionPerformed

    private void moinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moinsActionPerformed
        operation.setText(operation.getText() + "-");
        // TODO add your handling code here:
    }//GEN-LAST:event_moinsActionPerformed

    private void egalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egalActionPerformed
        String input = operation.getText();
        InToPost calcul = new InToPost(input);
        String output = calcul.calc();
        resultat.setText(output);
        // TODO add your handling code here:
        
    }//GEN-LAST:event_egalActionPerformed

    private void operationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_operationActionPerformed

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
            java.util.logging.Logger.getLogger(calculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculatorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cinq;
    private javax.swing.JButton deux;
    private javax.swing.JButton diviser;
    private javax.swing.JButton egal;
    private javax.swing.JButton fois;
    private javax.swing.JButton huit;
    private javax.swing.JButton moins;
    private javax.swing.JButton neuf;
    private javax.swing.JTextField operation;
    private javax.swing.JButton plus;
    private javax.swing.JButton quatre;
    private javax.swing.JTextField resultat;
    private javax.swing.JButton sept;
    private javax.swing.JButton six;
    private javax.swing.JButton trois;
    private javax.swing.JButton un;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
