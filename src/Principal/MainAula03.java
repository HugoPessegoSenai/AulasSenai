/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Model.Bicicleta;
import Model.Celular;
import Model.Geladeira;
import Model.Pessoa;
import java.util.Scanner;

/**
 *
 * @author hugo.gomes
 */
public class MainAula03 {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = scanner.next();

        System.out.println("Informe sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Informe seu peso: ");
        float peso = scanner.nextFloat();

        System.out.println("Você cresceu: ");
        String valor = scanner.next();
        boolean cresceu = Pessoa.VerificacaoVerdadeiroFalso(valor);

        System.out.println("Informe sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("********* SEUS DADOS CADASTRADOS*********");
        System.out.println("Olá " + nome);
        System.out.println("Vi seu peso de " + peso);
        System.out.println("Você é velho heim sua idade é " + idade);
        System.out.println("E você cresceu: " + cresceu);
        System.out.println("Sua altura é de  " + altura);

    }


}
