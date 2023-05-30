/*
 * Descrição: Algoritmo que calcula a média de 500 números inseridos pelo usuário
 * Autor: Thiago Lima dos Santos
 * Data: 15/05/2023
*/
import java.util.Scanner;
public class ThiagoSantos_Exercicio03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int quant = 500;
        int cont = 1;
        double nota = 0;
        double soma = 0;
        do{
            cont++;
            System.out.println("Digite uma nota");
            nota = input.nextDouble();
            soma = soma+nota;
        }
        while(cont<=quant);
        double res = soma/quant;
        System.out.println("A média final é: "+res);
        input.close();
    }
}
