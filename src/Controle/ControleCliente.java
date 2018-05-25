/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Modelo.ModeloCliente;

        


/**
 *
 * @author tsilva
 */
public class ControleCliente {
    
    ConectaBanco connCliente = new ConectaBanco();
    ModeloCliente modCli = new ModeloCliente();
   
    
    
     public void Inserir(ModeloCliente mod){
        connCliente.Conexao();
       
        
        try {
            PreparedStatement pst= connCliente.conn.prepareStatement("INSERT INTO  cliente(nome_cliente, endereco_cliente,cod_bairro,fk_cidade,fk_numero_tel) values (?,?,?,?,?)");
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getEndereco());
            pst.setInt(3,mod.getIdBairro());
            pst.setInt(4,mod.getIdCidade());
            pst.setInt(5,mod.getFk_telefone());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados armazenados com sucesso ");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro de inserção teste 3 \n erro"+ex);
        }
        connCliente.desconecta();
    }
     
     
    
     
    

    

    

    
    
}
