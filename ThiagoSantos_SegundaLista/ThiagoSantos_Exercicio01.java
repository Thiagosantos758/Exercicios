/*
 * Descrição: Algoritmo que recebe um número e aplica um desconto de 15% a ele;
 * Autor: Thiago Lima;
 * Data: 22/05/2023
 */
import java.util.Scanner; //importa o tipo de variável Scanner
public class ThiagoSantos_Exercicio01{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);// faz com que a variável input possibilite uma entrada de dados
        System.out.println("Digite um valor a ser aplicado o desconto de 15%"); //mostra a mensagem em string
        double n1 = input.nextDouble(); //lê o valor inserido pelo usuário
        double desconto = 0.0; //variável desconto recebe 0.0
        desconto = n1-(n1*15/100); //desconto recebe...
        System.out.println("O valor: " + n1 + " com desconto de 15% é igual a: " + desconto); //mostra a mensagem em string
        input.close(); //fecha a variável input
    }

}