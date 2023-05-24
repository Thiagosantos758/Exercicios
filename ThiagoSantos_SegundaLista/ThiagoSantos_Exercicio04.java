/*
 * Descrição: Algoritmo que recebe 2 números e troca o valor deles;
 * Autor: Thiago Lima;
 * Data: 22/05/2023
 */
import java.util.Scanner; //importa o tipo de variável Scanner
public class ThiagoSantos_Exercicio04 {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);// faz com que a variável input possibilite uma entrada de dados
        System.out.println("Digite o primeiro número");
        int n1 = input.nextInt();// lê o valor inserido pelo usuário e o armazena em "n1"
        System.out.println("Digite o segundo número");
        int n2 = input.nextInt();// lê o valor inserido pelo usuário e o armazena em "n2"
        int n3 = 0;//cria uma variável sem valor
        n3 = n1;//n3 recebe n1
        n1 = n2;//n1 recebe n2
        n2 = n3;//n2 recebe n3
        System.out.println("O primeiro número digitado foi: "+ n1 + " e o segundo: " + n2);//os valores foram trocados!
        input.close();//fecha a variável input
    }
}
