/*
 * Descrição: Algoritmo que recebe três números e enquanto a soma deles não for 48 ou 71.
 * continua recebendo números infinitamente.
 * Autor: Thiago Lima
 * Data:30/05/2023
 */
import java.util.Scanner;
public class ThiagoSantos_Exercicio02 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int n1 = 0;
        int soma = 0;            
        System.out.println("Digite um número");
        do{ //faça

            n1 = input.nextInt();
            soma = n1+soma;
            System.out.println("A soma dos números é: ");
            System.out.println(soma);
            if(soma>71){
                System.out.println("O valor excedeu o necessário, digite um número negativo!"); //se a soma dos números foi maior que 71...
            }
            else if(soma<71 && soma>48){ //senão se a soma for menor que 71 e maior que 48...
                System.out.println("Sua soma passou de 48!");
                System.out.println("Digite um outro valor (O valor 71 está próximo)");
            }
            else if(soma<48){ //senão se a soma for menor que 48
                System.out.println("Digite um outro valor (O valor 48 está próximo)");
            }
        }
        while(soma != 48 && soma !=71); //enquanto a soma for diferente de 48 E diferente de 71...
        input.close();
    }
    
}
