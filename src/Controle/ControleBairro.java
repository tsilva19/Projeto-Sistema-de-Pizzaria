/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;


import Modelo.ModeloBairro;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;
/**
 *
 * @author thiago
 */
public class ControleBairro {
     ConectaBanco connBairro = new ConectaBanco();
    
    public void InserirBairro(ModeloBairro mod){
        connBairro.Conexao();
        try {
            PreparedStatement pst= connBairro.conn.prepareStatement("INSERT INTO  bairro(nome_bairro,cod_cidade) values (?,?) ");
            pst.setString(1,mod.getNomeBairro());
            pst.setInt(2,mod.getCodCidade());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados armazenados com sucesso ");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro de inserção \n erro"+ex);
        }
        connBairro.desconecta();
    }
    
    public void ExcluiBairro(ModeloBairro mod){
        connBairro.Conexao();
         try {
            PreparedStatement pst= connBairro.conn.prepareStatement("delete from bairro where id_bairro=?");
           pst.setInt(1,mod.getCodCidade());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados excluidos com sucesso ");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro de exclusão\n erro"+ex);
        }
      
         connBairro.desconecta();
    }
     public void AlterarBairro(ModeloBairro mod){
         
       connBairro.Conexao();
          
          try{
        PreparedStatement pst= connBairro.conn.prepareStatement("update  bairro set nome_bairro=?, cod_cidade=? where id_bairro=?");
          pst.setString(1,mod.getNomeBairro());
           pst.setInt(2,mod.getCodCidade());
            pst.setInt(3,mod.getIdBairro());
          pst.execute();
              JOptionPane.showMessageDialog(null,"Alterado COM SUCESSO");
            
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro na Alteração \n Erro"+ex);
           }    
     }
}
