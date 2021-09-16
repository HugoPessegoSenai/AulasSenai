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
public class Geladeira {
    
    
    
    public int CapacidadeLt;
    public float Potencia;
    public String Marca;
    public int Tamanho;
    public String Cor;
    public String Modelo;

    public String Gelar() {
        return "Está gelando!";
    }

    public void Descongelar() {
    }

    public void AlterarPotencia() {
    }

    public Geladeira(int CapacidadeLt, float Potencia, String Marca, int Tamanho, String Cor, String Modelo) {
        this.CapacidadeLt = CapacidadeLt;
        this.Cor = Cor;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Potencia = Potencia;
        this.Tamanho = Tamanho;

        Gelar();
    }
}
