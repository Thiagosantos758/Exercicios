/*
* Descrição: Recebe quatro números, os exponencia e soma
* Autor: Thiago
* Data: 15/05/2023
*/
import java.util.Scanner;
public class Ex2 {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        double n1;
        System.out.println("Digite o primeiro número:");//Mostra a mensagem na String na tela
        n1 = input.nextDouble(); //faz com que a variável n1 receba um valor digitado pelo usuário
        System.out.println("Digite o segundo número:");
        double n2 = input.nextDouble();
        System.out.println("Digite o terceiro número:");
        double n3 = input.nextDouble();
        System.out.println ("Digite o quarto número:");
        double n4 = input.nextDouble();
        double resultado;
        resultado = n1*n1 + n2*n2 + n3*n3 + n4*n4;
        System.out.println("Os números exponenciados e somados são iguais a: " + resultado);
        input.close();


    }
    
}
