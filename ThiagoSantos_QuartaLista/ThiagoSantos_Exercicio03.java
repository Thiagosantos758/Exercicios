/*
 * Descrição: Algoritmo que gera 50 números reais e inteiros aleatórios, os soma e mostra qual soma foi maior.
 * Autor: Thiago Lima
 * Data:30/05/2023
 */
import java.util.Random; //importa a classe para receber números aleatórios
public class ThiagoSantos_Exercicio03 {
    public static void main(String [] args){
        Random random = new Random();
        int n;
        int cont = 0;
        int soma = 0;
        double soma1 = 0.0;
        do{
            n = random.nextInt(99); //gera números inteiros aleatórios de no máximo 2 casas
            cont++;
            soma = soma + n;
            System.out.println(n);
            double n1 = random.nextDouble(1)*100; //gera números reais aleatórios de no máximo 2 casas
            soma1 = soma1 +n1;
            System.out.println(n1);
        }
        while (cont<50); //enquanto a contagem for menor que 50...
        System.out.println("O resultado da soma dos números inteiros foi de: "+ soma);
        System.out.println("o resultado da soma dos números reais foi de: "+ soma1);
        if(soma>soma1){ //se a soma dos números inteiros for maior que a dos reais...
            System.out.println("A soma dos números inteiros ("+soma+") é maior que a de números reais ("+soma1+")");
        }
        else{ //senão...
            System.out.println("A soma dos números reais ("+soma1+") é maior que a de números inteiros ("+soma+")");
        }



















































    }
}
