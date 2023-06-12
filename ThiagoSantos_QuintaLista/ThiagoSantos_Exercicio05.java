
/*
 * Descrição: Crie uma classe e atribua e atribua a ela, no mínimo, 10 atributos, 10 métodos e 1 método construtor
 * Autor: Thiago Lima dos Santos
 * Data: 07/06/2023
*/
public class ThiagoSantos_Exercicio05{
    public static void main(String [] args){
    }
}
class meiodetransporte{
    /*Criando Atributos */
    String corDoVolante, marca, materialDoBanco, tipoDeCombustivel;
    int velocidadeMax, anoDoAutomovel;
    boolean automatico, possuiPortas, eletrico;
    float litrosPorKMRodado;
    char primeiraLetraDaPlaca;
    /*Criando Métodos */ 
    void acelerar(){
        System.out.println("Você está acelerando!");
    }
    void ligar(){
        System.out.println("O automóvel está ligando!");
    }
    void desligar(){
        System.out.println("O automóvel está desligando!");
    }
    void freiar(){
        System.out.println("Você está freiando!");
    }
    void tocarmusica(){
        System.out.println("Você está tocando música!");
    }
    void darRe(){
        System.out.println("Você está dando ré!");
    }
    void driftar(){
        System.out.println("Você está dando drift!");
    }
    void voar(){
        System.out.println("Você está voando");
    }
    void abrirPortas(){
        System.out.println("Você abriu a(s) porta(s)!");
    }
    void poluir(){
        System.out.println("Seu automóvel polui demais!");
    }
    /*Criando o método construtor*/
    meiodetransporte(String CorVolante, String marca){
        this.corDoVolante = CorVolante;
        this.marca = marca;
    }
}