/*
* Descrição: Recebe uma a idade do usuário e diz se ele é criança, adolescente, adulto ou idoso
* Autor: Thiago
* Data: 15/05/2023
*/
import java.util.Scanner;
public class ThiagoSantos_Exercicio05 {
    public static void main(String[] args){
        System.out.println("Digite sua idade: ");
        Scanner input = new Scanner (System.in); // faz com que a variável input abra uma porta de entrada para dados inseridos pelo usuário :D
        int idade = input.nextInt();
        if (idade<=12)
        System.out.println("Você é criança!");
        else if (idade>12 && idade<19) //se a idade for maior que 12 e menor que 19
        System.out.println("Você é adolescente!"); // mostra o texto baseado na condição
        else if (idade>=19 && idade <65)
        System.out.println("Você é adulto!");
        else 
        System.out.println("Você é idoso!");

        input.close();
    }
    
}
