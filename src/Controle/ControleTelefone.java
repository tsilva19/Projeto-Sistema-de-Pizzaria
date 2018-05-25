/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.ModeloTelefone;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
/**
 *
 * @author tsilva
 */
public class ControleTelefone {
    ConectaBanco connTelefone = new ConectaBanco();
    ModeloTelefone mod = new ModeloTelefone();
    
    public void InserirTelefone(ModeloTelefone mod){
        connTelefone.Conexao();
        try {
            PreparedStatement pst= connTelefone.conn.prepareStatement("INSERT INTO  telefone(numero_tel) values (?) ");
            pst.setString(1,mod.getTel());
           
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados armazenados com sucesso ");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro de inserção \n erro"+ex);
        }
        connTelefone.desconecta();
    }
    
    public void ExcluiTelefone(ModeloTelefone mod){
        connTelefone.Conexao();
         try {
            PreparedStatement pst= connTelefone.conn.prepareStatement("delete from telefone where id_telefone=?");
           pst.setInt(1,mod.getCod());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados excluidos com sucesso ");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro de exclusão\n erro"+ex);
        }
      
         connTelefone.desconecta();
    }
     public void AlterarTelefone(ModeloTelefone mod){
         
       connTelefone.Conexao();
          
          try{
        PreparedStatement pst= connTelefone.conn.prepareStatement("update  telefone set numero_tel=? where id_telefone=?");
          pst.setString(1,mod.getTel());
         
            pst.setInt(2,mod.getCod());
          pst.execute();
              JOptionPane.showMessageDialog(null,"Alterado COM SUCESSO");
            
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro na Alteração \n Erro"+ex);
           }    
     }
     
     public ModeloTelefone Primeiro(){
         connTelefone.Conexao();
         connTelefone.executaSql(" select * from telefone order by id_telefone");
       
             try {
                 connTelefone.rs.first();
                 mod.setCod(connTelefone.rs.getInt("id_telefone"));
                 mod.setTel(connTelefone.rs.getString("numero_tel"));
             } catch (SQLException ex) {
                 Logger.getLogger(ControleTelefone.class.getName()).log(Level.SEVERE, null, ex);
             }
             connTelefone.desconecta();
             return mod;
         }
     
     public ModeloTelefone Anterior(){
         connTelefone.Conexao();
         connTelefone.executaSql(" select * from telefone order by id_telefone");
       
             try {
                 connTelefone.rs.previous();
                 mod.setCod(connTelefone.rs.getInt("id_telefone"));
                 mod.setTel(connTelefone.rs.getString("numero_tel"));
             } catch (SQLException ex) {
                 Logger.getLogger(ControleTelefone.class.getName()).log(Level.SEVERE, null, ex);
             }
             connTelefone.desconecta();
             return mod;
         }
      public ModeloTelefone Proximo(){
         connTelefone.Conexao();
         connTelefone.executaSql(" select * from telefone order by id_telefone");
       
             try {
                 connTelefone.rs.next();
                 mod.setCod(connTelefone.rs.getInt("id_telefone"));
                 mod.setTel(connTelefone.rs.getString("numero_tel"));
             } catch (SQLException ex) {
                 Logger.getLogger(ControleTelefone.class.getName()).log(Level.SEVERE, null, ex);
             }
             connTelefone.desconecta();
             return mod;
         }
       public ModeloTelefone Ultimo(){
         connTelefone.Conexao();
         connTelefone.executaSql(" select * from telefone order by id_telefone");
       
             try {
                 connTelefone.rs.last();
                 mod.setCod(connTelefone.rs.getInt("id_telefone"));
                 mod.setTel(connTelefone.rs.getString("numero_tel"));
             } catch (SQLException ex) {
                 Logger.getLogger(ControleTelefone.class.getName()).log(Level.SEVERE, null, ex);
             }
             connTelefone.desconecta();
             return mod;
         }
}
