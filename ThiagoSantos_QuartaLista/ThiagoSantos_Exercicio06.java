/*
 * Descrição: Algoritmo que soma 10 valores inteiros positivos (ignorando negativos) e mostra a raiz quadrada da soma deles.
 * Autor: Thiago Lima
 * Data:30/05/2023
 */
import java.util.Scanner;
import java.lang.Math; //importa funções matemáticas como raiz quadrada
public class ThiagoSantos_Exercicio06 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in); //faz com que a variavel do tipo Scanner receba uma entrada de dados
        int soma = 0;
        for(int n = 0; n<10; n++){ //n equivale a 0, enquanto ele for menor que 10 some 1 a ele.
            System.out.println("Digite um número: ");
            int n1 = input.nextInt();
            if(n1<0){ //se n1 for um número negativo...
                n1 = n1*0; //o multiplique por 0 (fazendo com que seu valor seja "ignorado" por ser igual a nada)
            }
            soma += n1; //soma recebe soma mais n1
        }
        System.out.println("A soma dos números inteiros POSITIVOS  é: "+ soma);
        System.out.println("E a raiz quadrada da soma dos números é: "+ Math.sqrt(soma)); //mostra a mensagem em string e mostra a raiz quadrada da soma dos números inteiros positivos
        input.close();
    }
}
