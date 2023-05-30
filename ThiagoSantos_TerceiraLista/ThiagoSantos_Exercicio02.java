/*
 * Descrição: Algoritmo que lê 2 números e mostra os números entre eles
 * Autor: Thiago Lima dos Santos
 * Data: 15/05/2023
*/
import java.util.Scanner;
public class ThiagoSantos_Exercicio02 {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Digite um número");
        int n1 = input.nextInt();
        System.out.println("Digite outro número");
        int n2 = input.nextInt();
        System.out.println("Os números entre eles são: ");
        if (n1<n2){
            n1++;
        while(n1<n2){
            System.out.println(n1);
            n1++;
        }   
    }
        else{
            n1--;
        while (n1>n2){
            System.out.println(n1);
            n1--;
        }
    }
    input.close();
}
}
