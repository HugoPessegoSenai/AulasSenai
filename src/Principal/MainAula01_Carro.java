/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Model.Carro;



/**
 *
 * @author hugo.gomes
 */
public class MainAula01_Carro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Carro gol = new Carro();
        gol.modelo = "Gol";
        gol.Marca = "Volks";
        gol.Cor = "Cinza";
        gol.ano = 2015;
        
        
        
        Carro onix = new Carro();
        onix.modelo = "onix";
        onix.Marca = "Hyunday";
        onix.Cor = "Cinza";
        onix.ano = 2021;
        
        System.out.println(gol.toString());
        gol.ligar();
        System.out.println(onix.toString());
        String dados = gol.Desligar();
        System.out.println(dados);

    }
    
}
