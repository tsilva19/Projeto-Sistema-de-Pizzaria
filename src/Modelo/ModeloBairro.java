/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author thiago
 */
public class ModeloBairro {
    private int IdBairro;
    private String NomeBairro;
    private int CodCidade;

    
  
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
     * @return the NomeBairro
     */
    public String getNomeBairro() {
        return NomeBairro;
    }

    /**
     * @param NomeBairro the NomeBairro to set
     */
    public void setNomeBairro(String NomeBairro) {
        this.NomeBairro = NomeBairro;
    }

    /**
     * @return the CodCidade
     */
    public int getCodCidade() {
        return CodCidade;
    }

    /**
     * @param CodCidade the CodCidade to set
     */
    public void setCodCidade(int CodCidade) {
        this.CodCidade = CodCidade;
    }
    
}
