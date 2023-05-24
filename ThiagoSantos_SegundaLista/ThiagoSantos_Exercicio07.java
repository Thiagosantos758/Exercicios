/*
 * Descrição: Algoritmo que recebe um número e mostra "Acertou!" se o número estiver entre 94 e 456;
 * Autor: Thiago Lima;
 * Data: 22/05/2023
 */
import java.util.Scanner; //importa o tipo de variável Scanner
public class ThiagoSantos_Exercicio07 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);// faz com que a variável input possibilite uma entrada de dados
        System.out.println("Digite um número entre 94 e 456");
        int n1 = input.nextInt();// lê o valor inserido pelo usuário e o armazena em "n1"
        if(n1>94 && n1<456){ //SE n1 for maior que 94 E n1 for menor que 456...
            System.out.println("Acertou!"); //mostre "Acertou!"
        }
        else{ //SENÃO...
            System.out.println("Errou!");//mostre "Errou!"
        }
       input.close(); //fecha a variável input
    }
}
