/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class FormPrincipal extends javax.swing.JFrame {

    private final Calculadora calculadora;
    private double valor1;
    private double valor2;
    
    /**
     * Creates new form FormPrincipal
     */
    public FormPrincipal() {
        initComponents();
        calculadora = new Calculadora();
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblValor2 = new javax.swing.JLabel();
        lblValor1 = new javax.swing.JLabel();
        lblResutado = new javax.swing.JLabel();
        tfValor02 = new javax.swing.JTextField();
        tfValor01 = new javax.swing.JTextField();
        tfResultado = new javax.swing.JTextField();
        btnAdicao = new javax.swing.JButton();
        btnSubtracao = new javax.swing.JButton();
        btnMultiplicacao = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();
        btnPotenciacao = new javax.swing.JButton();
        btnRadiciacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblValor2.setText("Valor 2");

        lblValor1.setText("Valor 1:");

        lblResutado.setText("Resultado:");

        tfResultado.setEditable(false);

        btnAdicao.setText("Adição");
        btnAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicaoActionPerformed(evt);
            }
        });

        btnSubtracao.setText("Subtração");
        btnSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtracaoActionPerformed(evt);
            }
        });

        btnMultiplicacao.setText("Multiplicação");
        btnMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacaoActionPerformed(evt);
            }
        });

        btnDivisao.setText("Divisão");
        btnDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisaoActionPerformed(evt);
            }
        });

        btnPotenciacao.setText("Potenciação");
        btnPotenciacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenciacaoActionPerformed(evt);
            }
        });

        btnRadiciacao.setText("Radiciação");
        btnRadiciacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadiciacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdicao)
                            .addComponent(btnDivisao))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPotenciacao)
                            .addComponent(btnSubtracao))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMultiplicacao)
                            .addComponent(btnRadiciacao)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblValor2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfValor02, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblValor1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfValor01, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblResutado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor1)
                    .addComponent(tfValor01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor2)
                    .addComponent(tfValor02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResutado)
                    .addComponent(tfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicao)
                    .addComponent(btnSubtracao)
                    .addComponent(btnMultiplicacao))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDivisao)
                    .addComponent(btnPotenciacao)
                    .addComponent(btnRadiciacao))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicaoActionPerformed
        valor1 = Double.parseDouble(tfValor01.getText());
        valor2 = Double.parseDouble(tfValor02.getText());
        
        calculadora.setN1(valor1);
        calculadora.setN2(valor2);
        calculadora.adicao();
        
        tfResultado.setText(String.valueOf(calculadora.getResultado())); 
    }//GEN-LAST:event_btnAdicaoActionPerformed

    private void btnSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtracaoActionPerformed
        valor1 = Double.parseDouble(tfValor01.getText());
        valor2 = Double.parseDouble(tfValor02.getText());

        calculadora.setN1(valor1);
        calculadora.setN2(valor2);
        
        tfResultado.setText(String.valueOf(calculadora.subtracao())); 
    }//GEN-LAST:event_btnSubtracaoActionPerformed

    private void btnMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacaoActionPerformed
        valor1 = Double.parseDouble(tfValor01.getText());
        valor2 = Double.parseDouble(tfValor02.getText());
        
        calculadora.multiplicacao(valor1,valor2);
        
        tfResultado.setText(String.valueOf(calculadora.getResultado())); 
    }//GEN-LAST:event_btnMultiplicacaoActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisaoActionPerformed
        valor1 = Double.parseDouble(tfValor01.getText());
        valor2 = Double.parseDouble(tfValor02.getText());

        calculadora.setN1(valor1);
        if(valor2 == 0)
            JOptionPane.showMessageDialog(this, "O valor do divisor tem que ser diferente de zero.");
        else{
            calculadora.setN2(valor2);
                      
            tfResultado.setText(String.valueOf(calculadora.divisao()));
        }
    }//GEN-LAST:event_btnDivisaoActionPerformed

    private void btnPotenciacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenciacaoActionPerformed
        valor1 = Double.parseDouble(tfValor01.getText());
        valor2 = Double.parseDouble(tfValor02.getText());

        calculadora.setN1(valor1);
        calculadora.setN2(valor2);
        
        tfResultado.setText(String.valueOf(calculadora.potenciacao())); 
    }//GEN-LAST:event_btnPotenciacaoActionPerformed

    private void btnRadiciacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadiciacaoActionPerformed
        valor1 = Double.parseDouble(tfValor01.getText());
        valor2 = Double.parseDouble(tfValor02.getText());

        calculadora.setN1(valor1);
        calculadora.setN2(valor2);
        calculadora.radiciacao();
        
        tfResultado.setText(String.valueOf(calculadora.getResultado())); 
    }//GEN-LAST:event_btnRadiciacaoActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicao;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnMultiplicacao;
    private javax.swing.JButton btnPotenciacao;
    private javax.swing.JButton btnRadiciacao;
    private javax.swing.JButton btnSubtracao;
    private javax.swing.JLabel lblResutado;
    private javax.swing.JLabel lblValor1;
    private javax.swing.JLabel lblValor2;
    private javax.swing.JTextField tfResultado;
    private javax.swing.JTextField tfValor01;
    private javax.swing.JTextField tfValor02;
    // End of variables declaration//GEN-END:variables
}
