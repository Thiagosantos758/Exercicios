/*
 * Descrição: Algoritmo que lê quantas letras tem uma palavra digitada pelo usuário e diz se é grande ou pequena.
 * Autor: Thiago Lima
 * Data:30/05/2023
 */
import java.util.Scanner;
public class ThiagoSantos_Exercicio04 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = input.nextLine(); //cria variável que recebe texto e armazena uma informação inserida pelo usuário nela
        if(palavra.length()>10){ //se o tamanho da variável palavra for maior que 10...
            System.out.println("você digitou um palavrão!");
        }
        else{ //senão
            System.out.println("Você digitou uma palavrinha!");
        }
        input.close();
    }
}
