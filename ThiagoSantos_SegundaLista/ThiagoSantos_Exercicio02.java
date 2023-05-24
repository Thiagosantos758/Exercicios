/*
 * Descrição: Algoritmo que recebe três números e mostra qual deles é o maior;
 * Autor: Thiago Lima;
 * Data: 22/05/2023
 */
import java.util.Scanner; //importa o tipo de variável Scanner
public class ThiagoSantos_Exercicio02 {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);// faz com que a variável input possibilite uma entrada de dados
        System.out.println("Digite o primeiro número: ");//mostra a mensagem em string
        int n1 = input.nextInt();// lê o valor inserido pelo usuário e o armazena em "n1"
        System.out.println("Digite o segundo número: ");//mostra a mensagem em string
        int n2 = input.nextInt();// lê o valor inserido pelo usuário e o armazena em "n2"
        System.out.println("Digite o terceiro número: ");//mostra a mensagem em string
        int n3 = input.nextInt();// lê o valor inserido pelo usuário e o armazena em "n3"
        if (n1>n2 && n1>n3){// SE n1 for maior que n2 E n1 for maior que n3...
            System.out.println("o primeiro número digitado ("+n1+") é o maior!");////mostra a mensagem em string
        }
        else if (n2>n1 && n2>n3){ //SE n2 for maior que n1 E n2 for maior que n3...
            System.out.println("O segundo número digitado ("+n2+") é o maior!");//mostra a mensagem em string
        }
        else { //SENÃO...
            System.out.println("O terceiro número digitado ("+n3+") é o maior!");//mostra a mensagem em string
        }
        input.close();//fecha a variável input
    }
}
