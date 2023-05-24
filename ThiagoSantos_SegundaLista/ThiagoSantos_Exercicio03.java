/*
 * Descrição: Algoritmo que calcula a área de um triângulo;
 * Autor: Thiago Lima;
 * Data: 22/05/2023
 */
import java.util.Scanner; //importa o tipo de variável Scanner
public class ThiagoSantos_Exercicio03 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);// faz com que a variável input possibilite uma entrada de dados
        double area; //cria a variável area
        System.out.println("Digite o valor da altura do triângulo: ");
        double altura = input.nextDouble();// lê o valor inserido pelo usuário e o armazena em "altura"
        System.out.println("Digite o valor da base do triângulo: ");
        double base =  input.nextDouble();// lê o valor inserido pelo usuário e o armazena em "base"
        area = (base*altura)/2; //area recebe base vezes altura divido para 2
        System.out.print("o valor da área do triângulo é: " + area);
        input.close(); //fecha a variável input
    }
}
