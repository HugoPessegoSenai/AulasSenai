package Model;

/*
 * Classe Bicicleta: Crie uma classe que modele uma Bicicleta: 
Atributos: velocidade, marcha e cor. 
Métodos: pedalar, trocarMarcha. 

Obs: Validar se a velocidade é maior que 0;
Trocar de marcha quando a velocidade é maior que 21; 

 */

/**
 *
 * @author hugo.gomes
 */


public class Bicicleta {
    public String marca;
    public int aro;
    public int qntMarchas ;
    public int marchaAtual;
    public String cor;    

    public Bicicleta() {
        Geladeira gel = new Geladeira(50,220,"Brastemp",170,"Cinza","FROSFIG");
        gel.CapacidadeLt = 50;
        
    }
    
    
    public void passarMarcha(Bicicleta monark){
        if (monark.marchaAtual < qntMarchas){
            monark.marchaAtual += 1;
        }
    }
    public void voltarMarcha(Bicicleta monark){
        if (monark.marchaAtual > 1){
            monark.marchaAtual -= 1;
        }
    }
    
    @Override
    public String toString() {
        return "MARCHA ATUAL:" + marchaAtual;
    }
}
