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
public class Carro {
    
    /*ATRIBUTOS: CARACTERISTICAS DO CARRO*/
    public String modelo;
    public String Marca;
    public String Cor;
    public String Placa;
    public int ano;
    
    /*METODOS: AÇÕES QUE A CLASSE OU OBJETO FAZ */
        /*VISIBILIDADE: public, private e protected */
        /*RETORNO: void: Sem retorno, String, Float, int, Boolean, Classe*/
        /*NOME: */
    /*VISIBILIDADE + RETORNO + NOME + () + {}*/
    
    public void ligar(){
        System.out.println("O carro está ligou!");
    }
    public String Desligar(){
        String mensagem = "O carro desligou!";       
        return mensagem;
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", Marca=" + Marca + ", Cor=" + Cor + ", Placa=" + Placa + ", ANO=" + ano + '}';
    }
    
    
    
    
    
}
