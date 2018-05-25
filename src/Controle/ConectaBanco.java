/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

import javax.swing.JOptionPane;
/**
 *
 * @author tsilva
 */
public class ConectaBanco {
    
   public  Statement stm;//pesquisa no banco
   public  ResultSet  rs;//armazena o resultado
    
    private String host = "jdbc:mysql://localhost/controlepizza";
    private String usr="root";
    private String senha="logistica";
   public  Connection conn;
   
   
   public void Conexao(){//metodo responsavel para conexao
       try {
           conn= DriverManager.getConnection(host,usr,senha);
        //   JOptionPane.showMessageDialog(null,"Conectado com sucesso");
                  } catch (SQLException e) {
                       JOptionPane.showMessageDialog(null,"Erro de conexão\n Erro:"+e.getMessage());
            throw new RuntimeException(e);
       }
   }
   
   public void executaSql(String sql){
       try {
           stm= conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
           rs=stm.executeQuery(sql);
       } catch (SQLException ex) {
         //     JOptionPane.showMessageDialog(null,"Erro de execução de SQL\n Erro:"+ex.getMessage());
       }
   }
    public void desconecta(){
        try{
             conn.close();
           //   JOptionPane.showMessageDialog(null,"Desconectado com sucesso");
        } catch(SQLException e){
         
         JOptionPane.showMessageDialog(null,"Erro de conexão\n Erro:"+e.getMessage());
    }
    }

  
}
