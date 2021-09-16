/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Model.Pessoa;

/**
 *
 * @author Hugo Christian
 */
public class MainAula01_Pessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Pessoa pessoa1 = new Pessoa("HUGO CHRISTIAN", 10,65,170);
       
       System.out.println(pessoa1.toString());
       
       pessoa1.envelhecer(pessoa1);
       
       System.out.println(pessoa1.toString());
    }
    
}
