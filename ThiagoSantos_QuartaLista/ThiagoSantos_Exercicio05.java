/*
 * Descrição: Algoritmo que conta de 10 a 0.
 * Autor: Thiago Lima
 * Data:30/05/2023
 */
public class ThiagoSantos_Exercicio05 {
    public static void main(String args []){
        int n1 = 10; //declara que n1 equivale a 10
        while(n1>0){ //enquanto n1 for maior que 0...
            System.out.println(n1); //mostre n1
            n1--; //e subtraia 1 dele
            if(n1==0){ //se n1 for igual a 0
                System.out.println(n1); //mostre n1
                System.out.println("fim."); // e mostre "fim."
            }
        }

    }
    
}
