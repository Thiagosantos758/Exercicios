/*
 * Descrição: Algoritmo que calcula qual o preço final de uma compra de picolés;
 * Autor: Thiago Lima;
 * Data: 22/05/2023
 */
import java.util.Scanner;
public class ThiagoSantos_Exercicio06 {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);// faz com que a variável input possibilite uma entrada de dados
        System.out.println("Digite quantos picoles de kiwi você comprou: ");
        double kiwi = input.nextDouble();// lê o valor inserido pelo usuário e o armazena em "kiwi"
        System.out.println("Digite quantos picolés de laranja você comprou: ");
        double laranja = input.nextDouble();// lê o valor inserido pelo usuário e o armazena em "laranja"
        System.out.println("Digite quantos picolés de romã você comprou: ");
        double roma = input.nextDouble();// lê o valor inserido pelo usuário e o armazena em "roma"
        double precofinal = (kiwi*3.20) + (laranja*2.39) + (roma*7.99); //faz a conta através da constante que é o preço de cada picolé
        System.out.println("Sua compra final deu um total de: "+ precofinal + " R$");
        input.close();//fecha a variável input
    }
}
