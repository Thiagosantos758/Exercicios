/*
 * Descrição: Algoritmo que recebe um número e aplica um desconto de 15% a ele;
 * Autor: Thiago Lima;
 * Data: 22/05/2023
 */
import java.util.Scanner; //importa o tipo de variável Scanner
public class ThiagoSantos_Exercicio09 {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in); // faz com que a variável input possibilite uma entrada de dados
        System.out.println("Digite um número: ");
        double n1 = input.nextDouble(); // lê o valor inserido pelo usuário e o armazena em "n1"
        System.out.println("Digite outro número: ");
        double n2 = input.nextDouble(); // lê o valor inserido pelo usuário e o armazena em "n2"
        if(n1 == n2){ //SE n1 for igual a n2...
            System.out.println("Os números digitados são iguais");//mostra a mensagem em string
        }
        else if(n1>n2){ //SENÃO SE n1 for maior que n2...
            System.out.println("O primeiro número digitado é maior");//mostra a mensagem em string
        }
        else{ // SENÃO...
            System.out.println("O segundo número digitado é maior");//mostra a mensagem em string
        }
        input.close();//fecha a variável input
    }
}
