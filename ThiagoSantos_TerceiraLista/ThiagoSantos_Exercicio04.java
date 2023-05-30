/*
 * Descrição: Algoritmo que mostra apenas os números ímpares entre 0 e 1000
 * Autor: Thiago Lima dos Santos
 * Data: 15/05/2023
*/
public class ThiagoSantos_Exercicio04 {
    public static void main(String args[]){
        int n1 = 0;
        System.out.println("Os números ímpares entre 0 e 1000 sâo: ");
        while(n1<1000){
            if(n1%2==0){
                n1++;
            }
            else{
                System.out.println(n1);
                n1++;
            }
        }
    }
    
}
