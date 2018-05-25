/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.ModeloBairro;
import Modelo.ModeloCidade;
import Modelo.ModeloTelefone;

/**
 *
 * @author tsilva
 */
public class ModeloCliente {

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the Endereco
     */
    public String getEndereco() {
        return Endereco;
    }

    /**
     * @param Endereco the Endereco to set
     */
    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    /**
     * @return the fk_telefone
     */
    public int getFk_telefone() {
        return fk_telefone;
    }

    /**
     * @param fk_telefone the fk_telefone to set
     */
    public void setFk_telefone(int fk_telefone) {
        this.fk_telefone = fk_telefone;
    }

    /**
     * @return the IdBairro
     */
    public int getIdBairro() {
        return IdBairro;
    }

    /**
     * @param IdBairro the IdBairro to set
     */
    public void setIdBairro(int IdBairro) {
        this.IdBairro = IdBairro;
    }

    /**
     * @return the IdCidade
     */
    public int getIdCidade() {
        return IdCidade;
    }

    /**
     * @param IdCidade the IdCidade to set
     */
    public void setIdCidade(int IdCidade) {
        this.IdCidade = IdCidade;
    }

   
   
     private int idCliente;
     private String nome;
     private String Endereco;   
     private int fk_telefone;
     private int IdBairro;
     private int IdCidade;

    /**
     * @return the id
     */
  
}
