/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.ModeloCidade;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;
/**
 *
 * @author tsilva
 */
public class ControleCidade {
    ConectaBanco connCidade = new ConectaBanco();
    ModeloCidade mod= new ModeloCidade();
    
    public void InserirCidade(ModeloCidade mod){
        connCidade.Conexao();
        try {
            PreparedStatement pst= connCidade.conn.prepareStatement("INSERT INTO  cidade(nome_cidade,cod_estado) values (?,?) ");
            pst.setString(1,mod.getNome());
            pst.setInt(2,mod.getCod_estado());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados armazenados com sucesso ");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro de inserção \n erro"+ex);
        }
        connCidade.desconecta();
    }
    
    public void ExcluiCidade(ModeloCidade mod){
        connCidade.Conexao();
         try {
            PreparedStatement pst= connCidade.conn.prepareStatement("delete from cidade where id_cidade=?");
           pst.setInt(1,mod.getCod());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados excluidos com sucesso ");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro de exclusão\n erro"+ex);
        }
      
         connCidade.desconecta();
    }
     public void AlterarCidade(ModeloCidade mod){
         
       connCidade.Conexao();
          
          try{
        PreparedStatement pst= connCidade.conn.prepareStatement("update  cidade set nome_cidade=?, cod_estado=? where id_cidade=?");
          pst.setString(1,mod.getNome());
           pst.setInt(2,mod.getCod_estado());
            pst.setInt(3,mod.getCod());
          pst.execute();
              JOptionPane.showMessageDialog(null,"Alterado COM SUCESSO");
            
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro na Alteração \n Erro"+ex);
           }    
     }
}
