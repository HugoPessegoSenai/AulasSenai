/*
Classe Pessoa: Crie uma classe que modele uma pessoa: 
Atributos: nome, idade, peso e altura 
Métodos: Envelhecer, engordar, emagrecer, crescer. 

Obs: Por padrão, a cada ano que nossa pessoa envelhece, sendo a idade dela menor que 21 anos, ela deve crescer 0,5 cm 
Pode possuir ou não parâmetros.

 */
package Model;

/**
 *
 * @author hugo.gomes
 */
public class Pessoa {
    
    public String nome;
    public int idade;
    public float peso;
    public float altura;
    
    public static boolean Dados;
    
  public Pessoa(String nome, int idade, float peso, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    
    //METODOS
    public void envelhecer(Pessoa pessoa){
        if(pessoa.idade < 21){
            pessoa.altura +=1;
        }
        
        pessoa.idade +=1;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    
    public void engordar(Pessoa pessoa, float peso){
        pessoa.peso +=peso;
    }
    public void emagrecer(Pessoa pessoa, float peso){
        pessoa.peso -= peso;
    }
    public void crescer(Pessoa pessoa, float altura){
        pessoa.altura += altura;
    }
        
    public static boolean VerificacaoVerdadeiroFalso(String valor) {

        if (valor.equals("sim") || valor.equals("Sim")) {
            Dados = true;
        } else if (valor.equals("não") || valor.equals("Não") || valor.equals("Nao") || valor.equals("nao")) {
            Dados = false;
        }

        return Dados;

    }
}
