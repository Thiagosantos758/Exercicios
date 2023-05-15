/*
* Descrição: Calcula o perímetro do círculo a partir do valor do raio inserido pelo usuário
* Autor: Thiago
* Data: 15/05/2023
*/
import java.util.Scanner;
public class ThiagoSantos_Exercicio06 {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        double pi = 3.1415; //Atribui um valor constante de 3,1415 para a variável pi
        System.out.println("Digite o valor do raio do círculo: ");
        double raio = input.nextDouble();
        double per = raio*(pi*2);
        System.out.print("O perímetro do circulo é: " + per);
        input.close();
    }
}
