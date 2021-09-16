/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author hugo.gomes
 */
public class PedidoFinal {
    public int CodigoItem;
    public int QuantidadeItem;
    public Float ValorItem;
    
    
    
    public float Calcular(int QuantidadeItem, float ValorItem){
        float ValorTotal = 0;
        
        if(QuantidadeItem > 0 && ValorItem >0){
            ValorTotal = QuantidadeItem * ValorItem;
        }else{
            System.out.println("Dados não informados!");
        }
        return ValorTotal;
    }
    
}
