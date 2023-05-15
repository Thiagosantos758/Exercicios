/*
* Descrição: Converte um valor inserido em reais para Dólar (Baseado na cotação do dia 14/05/2023*)
* Autor: Thiago
* Data: 15/05/2023
*/
import java.util.Scanner;
public class ThiagoSantos_Exercicio03 {
    public static void main(String [] args){
        System.out.println("Digite um valor em reais a ser convertido");
        Scanner input = new Scanner (System.in); //Faz com que o tipo de variável input faça a leitura de um valor inserido pelo usuário
        float reais = input.nextFloat(); //Faz com que uma informação digitada pelo usuário seja armazenada na variável reais
        double conv;
        conv = reais/4.94; // converte reais para dólar
        System.out.println("Você tem um total de " + conv + " Dólares!");
        input.close();
    }
}
