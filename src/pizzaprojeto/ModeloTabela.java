/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaprojeto;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tsilva
 */
public class ModeloTabela extends AbstractTableModel{
    private ArrayList linhas = null;
    private String[]  Colunas=null;
    
    
    public ModeloTabela(ArrayList lin,String[] col){
         setLinhas(lin);
         setColunas(col);
        
        
    }
    
    public ArrayList getLinhas(){
        return linhas;
    }
    
    public void setLinhas(ArrayList Dados){
        linhas= Dados;
    }
    
    public String[] getColunas(){
        return Colunas;
    }
    
    public void setColunas(String[] nomes){
        Colunas=nomes;
    }
    public int getColumnCount(){
        return Colunas.length;
    }
    
    public int getRowCount(){
        return linhas.size();
    }
    public String getColumnName(int numCol){
        return Colunas[numCol];
    }
    
    public Object getValueAt(int numLin, int numCol){
        Object[] linhas=(Object[])getLinhas().get(numLin);
        return linhas[numCol];
    }
}
