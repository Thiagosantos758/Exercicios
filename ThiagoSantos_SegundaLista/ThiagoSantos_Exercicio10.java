/*
 * Descrição: Algoritmo que recebe um número e aplica um desconto de 15% a ele;
 * Autor: Thiago Lima;
 * Data: 22/05/2023
 */
import java.util.Scanner;
public class ThiagoSantos_Exercicio10 {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);// faz com que a variável input possibilite uma entrada de dados
        System.out.println("Digite um número");
        int n1 = input.nextInt();// lê o valor inserido pelo usuário e o armazena em "n1"
        if(n1%2 == 0){ //SE n1 divido para dois sobrar 0...
            System.out.println("O número digitado é par!");//mostra a mensagem em string
        }
        else{ //SENÃO...
            System.out.println("O número digitado é ímpar!");//mostra a mensagem em string
        }
        input.close(); //fecha a variável input
    }
}
