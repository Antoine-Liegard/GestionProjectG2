/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

/**
 *
 * @author Kevin
 */
public class calculatorGUI extends javax.swing.JFrame {
    //calculatorGUI.getContentPane().setBackground(Color.white);
 
    /**
     * Creates new form calculatorGUI
     */
    public calculatorGUI() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
       

                            
                  
          
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        sept = new javax.swing.JButton();
        huit = new javax.swing.JButton();
        neuf = new javax.swing.JButton();
        quatre = new javax.swing.JButton();
        operation = new javax.swing.JLabel();
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
        resultat = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setFocusableWindowState(false);
        setForeground(new java.awt.Color(255, 204, 153));
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(155, 212));
        setResizable(false);
        setSize(new java.awt.Dimension(165, 220));

        sept.setBackground(new java.awt.Color(189, 216, 252));
        sept.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sept.setForeground(new java.awt.Color(32, 105, 201));
        sept.setText("7");
        sept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                septActionPerformed(evt);
            }
        });

        huit.setBackground(new java.awt.Color(189, 216, 252));
        huit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        huit.setForeground(new java.awt.Color(32, 105, 201));
        huit.setText("8");
        huit.setPreferredSize(new java.awt.Dimension(41, 23));
        huit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huitActionPerformed(evt);
            }
        });

        neuf.setBackground(new java.awt.Color(189, 216, 252));
        neuf.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        neuf.setForeground(new java.awt.Color(32, 105, 201));
        neuf.setText("9");
        neuf.setPreferredSize(new java.awt.Dimension(41, 23));
        neuf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neufActionPerformed(evt);
            }
        });

        quatre.setBackground(new java.awt.Color(189, 216, 252));
        quatre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        quatre.setForeground(new java.awt.Color(32, 105, 201));
        quatre.setText("4");
        quatre.setPreferredSize(new java.awt.Dimension(41, 25));
        quatre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quatreActionPerformed(evt);
            }
        });

        operation.setBackground(new java.awt.Color(189, 216, 252));
        operation.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        operation.setForeground(new java.awt.Color(32, 105, 201));
        operation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 216, 252)));

        cinq.setBackground(new java.awt.Color(189, 216, 252));
        cinq.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cinq.setForeground(new java.awt.Color(32, 105, 201));
        cinq.setText("5");
        cinq.setPreferredSize(new java.awt.Dimension(41, 23));
        cinq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinqActionPerformed(evt);
            }
        });

        six.setBackground(new java.awt.Color(189, 216, 252));
        six.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        six.setForeground(new java.awt.Color(32, 105, 201));
        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        un.setBackground(new java.awt.Color(189, 216, 252));
        un.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        un.setForeground(new java.awt.Color(32, 105, 201));
        un.setText("1");
        un.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unActionPerformed(evt);
            }
        });

        deux.setBackground(new java.awt.Color(189, 216, 252));
        deux.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        deux.setForeground(new java.awt.Color(32, 105, 201));
        deux.setText("2");
        deux.setPreferredSize(new java.awt.Dimension(41, 23));
        deux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deuxActionPerformed(evt);
            }
        });

        trois.setBackground(new java.awt.Color(189, 216, 252));
        trois.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        trois.setForeground(new java.awt.Color(32, 105, 201));
        trois.setText("3");
        trois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                troisActionPerformed(evt);
            }
        });

        plus.setBackground(new java.awt.Color(189, 216, 252));
        plus.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        plus.setForeground(new java.awt.Color(32, 105, 201));
        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        zero.setBackground(new java.awt.Color(189, 216, 252));
        zero.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        zero.setForeground(new java.awt.Color(32, 105, 201));
        zero.setText("0");
        zero.setPreferredSize(new java.awt.Dimension(41, 23));
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        fois.setBackground(new java.awt.Color(189, 216, 252));
        fois.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        fois.setForeground(new java.awt.Color(32, 105, 201));
        fois.setText("x");
        fois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foisActionPerformed(evt);
            }
        });

        moins.setBackground(new java.awt.Color(189, 216, 252));
        moins.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        moins.setForeground(new java.awt.Color(32, 105, 201));
        moins.setText("-");
        moins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moinsActionPerformed(evt);
            }
        });

        diviser.setBackground(new java.awt.Color(189, 216, 252));
        diviser.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        diviser.setForeground(new java.awt.Color(32, 105, 201));
        diviser.setText("/");
        diviser.setPreferredSize(new java.awt.Dimension(41, 23));
        diviser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diviserActionPerformed(evt);
            }
        });

        egal.setBackground(new java.awt.Color(189, 216, 252));
        egal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        egal.setForeground(new java.awt.Color(32, 105, 201));
        egal.setText("=");
        egal.setDefaultCapable(false);
        egal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egalActionPerformed(evt);
            }
        });

        resultat.setBackground(new java.awt.Color(189, 216, 252));
        resultat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        resultat.setForeground(new java.awt.Color(32, 105, 201));
        resultat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultat.setAlignmentY(2.0F);
        resultat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 216, 252)));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(32, 105, 201));
        jTextField2.setText("Result =");
        jTextField2.setBorder(null);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(32, 105, 201));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Calculatrice G2");
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 216, 252)));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quatre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(un, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(plus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(moins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                                .addComponent(egal))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cinq, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(resultat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(operation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sept, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(huit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(neuf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(operation, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(resultat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(egal)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void septActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_septActionPerformed
        operation.setText(operation.getText() + "7");
        // TODO add your handling code here:
    }//GEN-LAST:event_septActionPerformed

    private void diviserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diviserActionPerformed
        String recup = operation.getText();
        char last_insert = recup.charAt(recup.length()-1) ;
        switch (last_insert) {
            case '+' : 
                recup = recup.substring(0, recup.length()-1) + "/" ;
                operation.setText (recup);
            break;
            case '-' : 
                recup = recup.substring(0, recup.length()-1) + "/" ;
                operation.setText (recup);
            break;
            case '*' : 
                recup = recup.substring(0, recup.length()-1) + "/" ;
                operation.setText (recup);
            break;
            case '/' : 
                recup = recup.substring(0, recup.length()-1) + "/" ;
                operation.setText (recup);
            break;
            default :
                operation.setText(operation.getText() + "/");
        }
        
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
        String recup = operation.getText();
        char last_insert = recup.charAt(recup.length()-1) ;
        switch (last_insert) {
            case '+' : 
                recup = recup.substring(0, recup.length()-1) + "+" ;
                operation.setText (recup);
            break;
            case '-' : 
                recup = recup.substring(0, recup.length()-1) + "+" ;
                operation.setText (recup);
            break;
            case '*' : 
                recup = recup.substring(0, recup.length()-1) + "+" ;
                operation.setText (recup);
            break;
            case '/' : 
                recup = recup.substring(0, recup.length()-1) + "+" ;
                operation.setText (recup);
            break;
            default :
                operation.setText(operation.getText() + "+");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_plusActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        operation.setText(operation.getText() + "0");
        // TODO add your handling code here:
    }//GEN-LAST:event_zeroActionPerformed

    private void foisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foisActionPerformed
        String recup = operation.getText();
        char last_insert = recup.charAt(recup.length()-1) ;
        switch (last_insert) {
            case '+' : 
                recup = recup.substring(0, recup.length()-1) + "*" ;
                operation.setText (recup);
            break;
            case '-' : 
                recup = recup.substring(0, recup.length()-1) + "*" ;
                operation.setText (recup);
            break;
            case '*' : 
                recup = recup.substring(0, recup.length()-1) + "*" ;
                operation.setText (recup);
            break;
            case '/' : 
                recup = recup.substring(0, recup.length()-1) + "*" ;
                operation.setText (recup);
            break;
            default :
                operation.setText(operation.getText() + "*");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_foisActionPerformed

    private void moinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moinsActionPerformed
        String recup = operation.getText();
        char last_insert = recup.charAt(recup.length()-1) ;
        switch (last_insert) {
            case '+' : 
                recup = recup.substring(0, recup.length()-1) + "-" ;
                operation.setText (recup);
            break;
            case '-' : 
                recup = recup.substring(0, recup.length()-1) + "-" ;
                operation.setText (recup);
            break;
            case '*' : 
                recup = recup.substring(0, recup.length()-1) + "-" ;
                operation.setText (recup);
            break;
            case '/' : 
                recup = recup.substring(0, recup.length()-1) + "-" ;
                operation.setText (recup);
            break;
            default :
                operation.setText(operation.getText() + "-");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_moinsActionPerformed

    private void egalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egalActionPerformed
        operation.setText(operation.getText() + "=");
        // TODO add your handling code here:
    }//GEN-LAST:event_egalActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton moins;
    private javax.swing.JButton neuf;
    private javax.swing.JLabel operation;
    private javax.swing.JButton plus;
    private javax.swing.JButton quatre;
    private javax.swing.JLabel resultat;
    private javax.swing.JButton sept;
    private javax.swing.JButton six;
    private javax.swing.JButton trois;
    private javax.swing.JButton un;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}

