/*
 * Descrição: Algoritmo que recebe um número e mostra seu sucessor e antecessor;
 * Autor: Thiago Lima;
 * Data: 22/05/2023
 */
import java.util.Scanner;//importa o tipo de variável Scanner
public class ThiagoSantos_Exercicio05 {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);// faz com que a variável input possibilite uma entrada de dados
        System.out.println("Digite um número");
        int n1 = input.nextInt();// lê o valor inserido pelo usuário e o armazena em "n1"
        System.out.println("O seu antecessor é: "+ (n1-1) +", o número é: "+n1+" e o seu sucessor é "+ (n1+1) );//realiza as operações na própria mensagem
        input.close(); //fecha a variável input
    }
}
