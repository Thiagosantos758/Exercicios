/*
 * Descrição: Algoritmo que soma números que ao quadrado são divisíveis por 4.
 * Autor: Thiago Lima
 * Data:30/05/2023
 */
public class ThiagoSantos_Exercicio01{
    public static void main(String [] args){
        int n1 = 1;
        int exp = 0;
        int soma = 0;
        while(n1>0){ //laço infinito porque enquanto n1 for maior que 0 vai continuar somando.
            n1++;
            exp = n1*n1; //calcula o quadrado do número
            if(exp % 4 == 0){ // se o quadrado do número dividido por 4 não sobrar nada...
                System.out.println("O número é: " + n1 + ", que ao quadrado é: " + exp);
                soma = n1 + soma; 
                System.out.println("A soma agora é: " + soma);
            }
        }
        System.out.println("A soma dos números que o quadrado é divisível por 4 é: "+ soma);
    }
}