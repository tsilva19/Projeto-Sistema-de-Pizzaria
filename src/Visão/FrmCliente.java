/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visão;

import Controle.ConectaBanco;
import Controle.ControleBairro;
import Controle.ControleCliente;
import Controle.ControleTelefone;
import Modelo.ModeloBairro;
import Controle.ModeloTabela;

import java.sql.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import Controle.ModeloTabela;
import Modelo.ModeloCliente;
import Modelo.ModeloTelefone;
/**
 *
 * @author thiago
 */
public class FrmCliente extends javax.swing.JFrame {

    
 
            ConectaBanco conexao = new ConectaBanco();
            ConectaBanco connCidade = new ConectaBanco();
            ConectaBanco connCliente= new ConectaBanco();  
             ConectaBanco connBairro= new ConectaBanco();
             ConectaBanco connTelefone= new ConectaBanco();
              ModeloCliente mod = new ModeloCliente();
            ControleCliente control= new ControleCliente();
           
            /**  /**
              *  
     * Creates new form FrmBairro
     */
    public FrmCliente() {
      initComponents();
        conexao.Conexao();
        connCidade.Conexao();
        connBairro.Conexao();
        connTelefone.Conexao();
        connCliente.Conexao();
          PreencherTabela("     SELECT * FROM cliente   inner join telefone on cliente.fk_numero_tel = telefone.id_telefone inner join bairro on cliente.cod_bairro = bairro.id_bairro inner join cidade on cliente.fk_cidade = cidade.id_cidade");

         connBairro.executaSql(" SELECT * FROM bairro ORDER BY nome_bairro ");
         jComboBoxBairro.removeAllItems();
         try{
              connBairro.rs.first();
             do{
               jComboBoxBairro.addItem(connBairro.rs.getString("nome_bairro"));
             }while(connBairro.rs.next());            
         }catch(SQLException e){
             JOptionPane.showMessageDialog(rootPane,"Erro ao preencher a lista"+e);
         }
        
                 connCidade.executaSql(" SELECT * FROM cidade ORDER BY nome_cidade ");
                 jComboBoxCidade.removeAllItems();
                 try{
                       connCidade.rs.first();
                     do{
                        jComboBoxCidade.addItem(connCidade.rs.getString("nome_cidade"));
                        }while(connCidade.rs.next());
             
                  }catch(SQLException e){
                      JOptionPane.showMessageDialog(rootPane,"Erro ao preencher a lista"+e);
                  }
         
                 
                   connTelefone.executaSql(" SELECT * FROM telefone ORDER BY  numero_tel ");
                   jComboBoxTel.removeAllItems();
                           try{
                                  connTelefone.rs.first();
                                do{
                                     jComboBoxTel.addItem( connTelefone.rs.getString("numero_tel"));
                                     }while( connTelefone.rs.next());
             
                                   }catch(SQLException e){
                                     JOptionPane.showMessageDialog(rootPane,"Erro ao preencher a lista"+e);
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
        jTxtCodCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtCli = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCidade = new javax.swing.JTable();
        jBnNovoCli = new javax.swing.JButton();
        jBnEditCli = new javax.swing.JButton();
        jBtnExcluCli = new javax.swing.JButton();
        jBnSalvarCli = new javax.swing.JButton();
        jButtonPrimeiroCli = new javax.swing.JButton();
        jButtonAnteriorCli = new javax.swing.JButton();
        jButtonProximoCli = new javax.swing.JButton();
        jButtonUltimoCli = new javax.swing.JButton();
        jBnSairCli = new javax.swing.JButton();
        jButtonCliCancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxBairro = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextFeNDE = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxTel = new javax.swing.JComboBox<>();
        jComboBoxCidade = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORMULARIO DE CADASTRO DE CLIENTE");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Codigo");

        jTxtCodCliente.setEnabled(false);

        jLabel3.setText("Nome");

        jTxtCli.setEnabled(false);

        jTableCidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableCidade);

        jBnNovoCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novo.png"))); // NOI18N
        jBnNovoCli.setToolTipText("Novo");
        jBnNovoCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnNovoCliActionPerformed(evt);
            }
        });

        jBnEditCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar.png"))); // NOI18N
        jBnEditCli.setToolTipText("Editar");
        jBnEditCli.setEnabled(false);
        jBnEditCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnEditCliActionPerformed(evt);
            }
        });

        jBtnExcluCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        jBtnExcluCli.setToolTipText("Excluir");
        jBtnExcluCli.setEnabled(false);
        jBtnExcluCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluCliActionPerformed(evt);
            }
        });

        jBnSalvarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save1.png"))); // NOI18N
        jBnSalvarCli.setToolTipText("Salvar");
        jBnSalvarCli.setEnabled(false);
        jBnSalvarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnSalvarCliActionPerformed(evt);
            }
        });

        jButtonPrimeiroCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/primeiro.png"))); // NOI18N
        jButtonPrimeiroCli.setToolTipText("Primeiro");
        jButtonPrimeiroCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeiroCliActionPerformed(evt);
            }
        });

        jButtonAnteriorCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/anterior.png"))); // NOI18N
        jButtonAnteriorCli.setToolTipText("Anterior");
        jButtonAnteriorCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorCliActionPerformed(evt);
            }
        });

        jButtonProximoCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/proximo.png"))); // NOI18N
        jButtonProximoCli.setToolTipText("Próximo");
        jButtonProximoCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximoCliActionPerformed(evt);
            }
        });

        jButtonUltimoCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ultmio2.png"))); // NOI18N
        jButtonUltimoCli.setToolTipText("ultimo");
        jButtonUltimoCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUltimoCliActionPerformed(evt);
            }
        });

        jBnSairCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jBnSairCli.setToolTipText("Sair");
        jBnSairCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnSairCliActionPerformed(evt);
            }
        });

        jButtonCliCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_download_cancel_103531.png"))); // NOI18N
        jButtonCliCancel.setToolTipText("Cancelar");
        jButtonCliCancel.setEnabled(false);
        jButtonCliCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCliCancelActionPerformed(evt);
            }
        });

        jLabel5.setText("BAIRRO");

        jComboBoxBairro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("ENDEREÇO");

        jLabel7.setText("TELEFONE");

        jLabel8.setText("CIDADE");

        jComboBoxTel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFeNDE, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jComboBoxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)))
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jBnNovoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jBnEditCli)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jBtnExcluCli)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jBnSalvarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButtonCliCancel)
                                    .addGap(86, 86, 86)
                                    .addComponent(jButtonPrimeiroCli)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonAnteriorCli)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonProximoCli)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonUltimoCli)
                                    .addGap(23, 23, 23)
                                    .addComponent(jBnSairCli)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(494, 494, 494)
                                        .addComponent(jComboBoxTel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTxtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTxtCli, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(101, 101, 101)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtCli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFeNDE, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBnSairCli, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonCliCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6))
                                    .addComponent(jButtonUltimoCli)
                                    .addComponent(jButtonProximoCli)
                                    .addComponent(jButtonAnteriorCli)
                                    .addComponent(jButtonPrimeiroCli))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBnNovoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jBnEditCli)
                                        .addComponent(jBtnExcluCli)))
                                .addGap(24, 24, 24)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBnSalvarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(182, 182, 182))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBnNovoCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnNovoCliActionPerformed
        // TODO add your handling code here:

        jTxtCli.setEnabled(true);

        jBnEditCli.setEnabled(true);
        jBtnExcluCli.setEnabled(true);
        jBnSalvarCli.setEnabled(true);
        jButtonCliCancel.setEnabled(true);
        jTxtCodCliente.setEnabled(true);
        jTxtCli.setEnabled(true);
         jTextFeNDE.setEnabled(true);
        jBnNovoCli.setEnabled(false);
        jTxtCodCliente.setText(" ");
        jTxtCli.setText(" ");
        jTextFeNDE.setText(" ");
        
    }//GEN-LAST:event_jBnNovoCliActionPerformed

    private void jBnEditCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnEditCliActionPerformed
        // TODO add your handling code here:
         jTextFeNDE.setEnabled(true);
         jTxtCli.setEnabled(true);
          jBnSalvarCli.setEnabled(true);
         jBnEditCli.setEnabled(true);
         
       
        

    }//GEN-LAST:event_jBnEditCliActionPerformed

    private void jBtnExcluCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluCliActionPerformed
       
        
      
      
          
      

    }//GEN-LAST:event_jBtnExcluCliActionPerformed

    private void jBnSalvarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnSalvarCliActionPerformed
      
        // TODO add your handling code here:

        try {
          mod.setNome(jTxtCli.getText());
          mod.setEndereco(jTextFeNDE.getText());
   
          connBairro.executaSql("SELECT * FROM bairro WHERE NOME_bairro ='"+jComboBoxBairro.getSelectedItem()+"'");
          connBairro.rs.first(); 
          mod.setIdBairro(connBairro.rs.getInt("id_bairro"));
           
          connCidade.executaSql("SELECT * FROM cidade WHERE nome_cidade ='"+jComboBoxCidade.getSelectedItem()+"'");
          connCidade.rs.first(); 
          mod.setIdCidade(connCidade.rs.getInt("id_cidade"));
           
           connTelefone.executaSql("SELECT * FROM telefone WHERE numero_tel ='"+jComboBoxTel.getSelectedItem()+"'");
           connTelefone.rs.first(); 
           mod.setFk_telefone(connTelefone.rs.getInt("id_telefone"));
               
                
                  
             control.Inserir(mod);
          
          jBnSalvarCli.setEnabled(!true);
          jButtonCliCancel.setEnabled(!true);
          jTextFeNDE.setEnabled(!true);
          jTxtCli.setEnabled(!true);
          jBnNovoCli.setEnabled(!true);
          jTextFeNDE.setText(" ");
          jTxtCli.setText(" ");
        }
         catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Erro de inserção teste 5 \n erro"+ex);
                }
          
      

    }//GEN-LAST:event_jBnSalvarCliActionPerformed

    private void jButtonPrimeiroCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiroCliActionPerformed
        // TODO add your handling code here:
      
        

       
    }//GEN-LAST:event_jButtonPrimeiroCliActionPerformed

    private void jButtonAnteriorCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorCliActionPerformed
      
    }//GEN-LAST:event_jButtonAnteriorCliActionPerformed

    private void jButtonProximoCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoCliActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_jButtonProximoCliActionPerformed

    private void jButtonUltimoCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoCliActionPerformed
        // TODO add your handling code here:

      
    }//GEN-LAST:event_jButtonUltimoCliActionPerformed

    private void jBnSairCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnSairCliActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBnSairCliActionPerformed

    private void jButtonCliCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCliCancelActionPerformed
        // TODO add your handling code here:

        jTxtCli.setEnabled(false);

        jBnEditCli.setEnabled(false);
        jBtnExcluCli.setEnabled(false);
        jBnSalvarCli.setEnabled(false);
        jButtonCliCancel.setEnabled(false);

        jTxtCodCliente.setText(" ");
        jTxtCli.setText(" ");
        jBnNovoCli.setEnabled(true);
    }//GEN-LAST:event_jButtonCliCancelActionPerformed
         public void PreencherTabela(String SQL){
       ArrayList Dados = new ArrayList(); 
        String [] Colunas = new String[]{"CLIENTE ","ENDEREÇO","TELEFONE","BAIRRO","CIDADE"};
        
       connCliente.executaSql(SQL);
        try{
           connCliente.rs.first();
            do{
                Dados.add(new Object[]{connCliente.rs.getString("nome_cliente"),connCliente.rs.getString("endereco_cliente"),connCliente.rs.getString("numero_tel"),connCliente.rs.getString("nome_bairro"),connCliente.rs.getString("nome_cidade")});
            }while(connCliente.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao preencher \n Erro"+ex);
           }    
          ModeloTabela modelo  = new ModeloTabela(Dados,Colunas);
          jTableCidade.setModel(modelo);
          jTableCidade.getColumnModel().getColumn(0).setPreferredWidth(105);
          jTableCidade.getColumnModel().getColumn(0).setResizable(false);
          jTableCidade.getColumnModel().getColumn(1).setPreferredWidth(280);
          jTableCidade.getColumnModel().getColumn(1).setResizable(false);
          jTableCidade.getColumnModel().getColumn(2).setPreferredWidth(105);
          jTableCidade.getColumnModel().getColumn(2).setResizable(false);
          jTableCidade.getTableHeader().setReorderingAllowed(false);
          jTableCidade.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
         jTableCidade.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
   }
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
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBnEditCli;
    private javax.swing.JButton jBnNovoCli;
    private javax.swing.JButton jBnSairCli;
    private javax.swing.JButton jBnSalvarCli;
    private javax.swing.JButton jBtnExcluCli;
    private javax.swing.JButton jButtonAnteriorCli;
    private javax.swing.JButton jButtonCliCancel;
    private javax.swing.JButton jButtonPrimeiroCli;
    private javax.swing.JButton jButtonProximoCli;
    private javax.swing.JButton jButtonUltimoCli;
    private javax.swing.JComboBox<String> jComboBoxBairro;
    private javax.swing.JComboBox<String> jComboBoxCidade;
    private javax.swing.JComboBox<String> jComboBoxTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCidade;
    private javax.swing.JTextField jTextFeNDE;
    private javax.swing.JTextField jTxtCli;
    private javax.swing.JTextField jTxtCodCliente;
    // End of variables declaration//GEN-END:variables
}
