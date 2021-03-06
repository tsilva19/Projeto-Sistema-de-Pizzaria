/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visão;

import Controle.ConectaBanco;
import Controle.ControleTelefone;
import Modelo.ModeloTelefone;



import java.text.ParseException;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author thiago
 */
public class FrmTelefone extends javax.swing.JFrame {

    
  
            ModeloTelefone mod = new ModeloTelefone();
            ControleTelefone control= new ControleTelefone();  
             ConectaBanco conexao = new ConectaBanco();/**
     * Creates new form FrmBairro
     */
    public FrmTelefone() {
        initComponents();
          
            try {
                MaskFormatter form= new MaskFormatter("(##)####-#####");
                 jFormattedTextNumero.setFormatterFactory(new DefaultFormatterFactory(form));
            } catch (ParseException ex) {
                Logger.getLogger(FrmTelefone.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTxtCodTel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jBnNovoTel = new javax.swing.JButton();
        jBnEditTel = new javax.swing.JButton();
        jBtnExcluiTel = new javax.swing.JButton();
        jBnSalvaTel = new javax.swing.JButton();
        jButtonPrimeiroTel = new javax.swing.JButton();
        jButtonAnteriorTel = new javax.swing.JButton();
        jButtonProximoTel = new javax.swing.JButton();
        jButtonUltimoTel = new javax.swing.JButton();
        jBnSairTel = new javax.swing.JButton();
        jBtCancelTel = new javax.swing.JButton();
        jFormattedTextNumero = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORMULARIO DE CADASTRO DE TELEFONE");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Codigo");

        jTxtCodTel.setEnabled(false);

        jLabel3.setText("Numero");

        jBnNovoTel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novo.png"))); // NOI18N
        jBnNovoTel.setToolTipText("Novo");
        jBnNovoTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnNovoTelActionPerformed(evt);
            }
        });

        jBnEditTel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar.png"))); // NOI18N
        jBnEditTel.setToolTipText("Editar");
        jBnEditTel.setEnabled(false);
        jBnEditTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnEditTelActionPerformed(evt);
            }
        });

        jBtnExcluiTel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        jBtnExcluiTel.setToolTipText("Excluir");
        jBtnExcluiTel.setEnabled(false);
        jBtnExcluiTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluiTelActionPerformed(evt);
            }
        });

        jBnSalvaTel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save1.png"))); // NOI18N
        jBnSalvaTel.setToolTipText("Salvar");
        jBnSalvaTel.setEnabled(false);
        jBnSalvaTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnSalvaTelActionPerformed(evt);
            }
        });

        jButtonPrimeiroTel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/primeiro.png"))); // NOI18N
        jButtonPrimeiroTel.setToolTipText("Primeiro");
        jButtonPrimeiroTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeiroTelActionPerformed(evt);
            }
        });

        jButtonAnteriorTel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/anterior.png"))); // NOI18N
        jButtonAnteriorTel.setToolTipText("Anterior");
        jButtonAnteriorTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorTelActionPerformed(evt);
            }
        });

        jButtonProximoTel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/proximo.png"))); // NOI18N
        jButtonProximoTel.setToolTipText("Próximo");
        jButtonProximoTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximoTelActionPerformed(evt);
            }
        });

        jButtonUltimoTel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ultmio2.png"))); // NOI18N
        jButtonUltimoTel.setToolTipText("ultimo");
        jButtonUltimoTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUltimoTelActionPerformed(evt);
            }
        });

        jBnSairTel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jBnSairTel.setToolTipText("Sair");
        jBnSairTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnSairTelActionPerformed(evt);
            }
        });

        jBtCancelTel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_download_cancel_103531.png"))); // NOI18N
        jBtCancelTel.setToolTipText("Cancelar");
        jBtCancelTel.setEnabled(false);
        jBtCancelTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtCancelTelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBnNovoTel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBnEditTel)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnExcluiTel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBnSalvaTel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtCancelTel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtCodTel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAnteriorTel)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonProximoTel)
                        .addGap(18, 18, 18)
                        .addComponent(jBnSairTel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonPrimeiroTel)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonUltimoTel)))
                .addGap(124, 124, 124))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonPrimeiroTel)
                            .addComponent(jButtonUltimoTel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTxtCodTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jFormattedTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jBnNovoTel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(jBnEditTel)
                            .addComponent(jBtnExcluiTel)
                            .addComponent(jBnSalvaTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtCancelTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAnteriorTel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonProximoTel, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(jBnSairTel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBnNovoTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnNovoTelActionPerformed
        // TODO add your handling code here:
         jTxtCodTel.setText(" ");
        jFormattedTextNumero.setText(" ");
        jFormattedTextNumero.setEnabled(true);

        jBnEditTel.setEnabled(true);
        jBtnExcluiTel.setEnabled(true);
        jBnSalvaTel.setEnabled(true);
        jBtCancelTel.setEnabled(true);

       
        jBnNovoTel.setEnabled(false);
    }//GEN-LAST:event_jBnNovoTelActionPerformed

    private void jBnEditTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnEditTelActionPerformed
        // TODO add your handling code here:
      mod.setCod(Integer.parseInt(jTxtCodTel.getText()));
      mod.setTel(jFormattedTextNumero.getText());
      control.AlterarTelefone(mod);
      jFormattedTextNumero.setEnabled(!true);
            jBnEditTel.setEnabled(!false);
            jBtnExcluiTel.setEnabled(!false);
            jBnSalvaTel.setEnabled(!false);
            jBtCancelTel.setEnabled(!false);
             jBnNovoTel.setEnabled(!true);
    }//GEN-LAST:event_jBnEditTelActionPerformed

    private void jBtnExcluiTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluiTelActionPerformed
        mod.setCod(Integer.parseInt(jTxtCodTel.getText()));
        control.ExcluiTelefone(mod);
         jFormattedTextNumero.setEnabled(!true);
            jBnEditTel.setEnabled(!false);
            jBtnExcluiTel.setEnabled(!false);
            jBnSalvaTel.setEnabled(!false);
            jBtCancelTel.setEnabled(!false);
             jBnNovoTel.setEnabled(!true);

    }//GEN-LAST:event_jBtnExcluiTelActionPerformed

    private void jBnSalvaTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnSalvaTelActionPerformed
        // TODO add your handling code here:

        

            mod.setTel(jFormattedTextNumero.getText());
            control.InserirTelefone(mod);
            jFormattedTextNumero.setEnabled(!true);
            jBnEditTel.setEnabled(!false);
            jBtnExcluiTel.setEnabled(!false);
            jBnSalvaTel.setEnabled(!false);
            jBtCancelTel.setEnabled(!false);
             jBnNovoTel.setEnabled(!true);
           
           
        
            

    }//GEN-LAST:event_jBnSalvaTelActionPerformed

    private void jButtonPrimeiroTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiroTelActionPerformed
        // TODO add your handling code here:
        
        mod = control.Primeiro();
        jTxtCodTel.setText(String.valueOf(mod.getCod()));
        jFormattedTextNumero.setText(mod.getTel());
        jFormattedTextNumero.setEnabled(true);
        jBnEditTel.setEnabled(true);
        jBtnExcluiTel.setEnabled(true);

        jBtCancelTel.setEnabled(true);
        jBnNovoTel.setEnabled(false);
       

       
    }//GEN-LAST:event_jButtonPrimeiroTelActionPerformed

    private void jButtonAnteriorTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorTelActionPerformed
         mod = control.Anterior();
        jTxtCodTel.setText(String.valueOf(mod.getCod()));
        jFormattedTextNumero.setText(mod.getTel());
        jFormattedTextNumero.setEnabled(true);
        jBnEditTel.setEnabled(true);
        jBtnExcluiTel.setEnabled(true);

        jBtCancelTel.setEnabled(true);
        jBnNovoTel.setEnabled(false);
    }//GEN-LAST:event_jButtonAnteriorTelActionPerformed

    private void jButtonProximoTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoTelActionPerformed
        // TODO add your handling code here:
        mod = control.Proximo();
        jTxtCodTel.setText(String.valueOf(mod.getCod()));
        jFormattedTextNumero.setText(mod.getTel());
        jFormattedTextNumero.setEnabled(true);
        jBnEditTel.setEnabled(true);
        jBtnExcluiTel.setEnabled(true);

        jBtCancelTel.setEnabled(true);
        jBnNovoTel.setEnabled(false);
    }//GEN-LAST:event_jButtonProximoTelActionPerformed

    private void jButtonUltimoTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoTelActionPerformed
        // TODO add your handling code here:

        mod = control.Ultimo();
        jTxtCodTel.setText(String.valueOf(mod.getCod()));
        jFormattedTextNumero.setText(mod.getTel());
        jFormattedTextNumero.setEnabled(true);
        jBnEditTel.setEnabled(true);
        jBtnExcluiTel.setEnabled(true);

        jBtCancelTel.setEnabled(true);
        jBnNovoTel.setEnabled(false);
    }//GEN-LAST:event_jButtonUltimoTelActionPerformed

    private void jBnSairTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnSairTelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBnSairTelActionPerformed

    private void jBtCancelTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtCancelTelActionPerformed
        // TODO add your handling code here:

        jFormattedTextNumero.setEnabled(false);

        jBnEditTel.setEnabled(false);
        jBtnExcluiTel.setEnabled(false);
        jBnSalvaTel.setEnabled(false);
        jBtCancelTel.setEnabled(false);

        jTxtCodTel.setText(" ");
        jFormattedTextNumero.setText(" ");
        jBnNovoTel.setEnabled(true);
    }//GEN-LAST:event_jBtCancelTelActionPerformed
         
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
            java.util.logging.Logger.getLogger(FrmTelefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTelefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTelefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTelefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTelefone().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBnEditTel;
    private javax.swing.JButton jBnNovoTel;
    private javax.swing.JButton jBnSairTel;
    private javax.swing.JButton jBnSalvaTel;
    private javax.swing.JButton jBtCancelTel;
    private javax.swing.JButton jBtnExcluiTel;
    private javax.swing.JButton jButtonAnteriorTel;
    private javax.swing.JButton jButtonPrimeiroTel;
    private javax.swing.JButton jButtonProximoTel;
    private javax.swing.JButton jButtonUltimoTel;
    private javax.swing.JFormattedTextField jFormattedTextNumero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtCodTel;
    // End of variables declaration//GEN-END:variables
}
