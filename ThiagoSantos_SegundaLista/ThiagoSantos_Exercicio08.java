/*
 * Descrição: Algoritmo ;
 * Autor: Thiago Lima;
 * Data: 22/05/2023
 */
import java.util.Scanner; //importa o tipo de variável Scanner
public class ThiagoSantos_Exercicio08 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in); // faz com que a variável input possibilite uma entrada de dados
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();// lê o texto inserido pelo usuário e o armazena em "nome"
        System.out.println("Digite seu gênero (F para feminino e M para masculino): ");
        char genero = input.next().charAt(0);// lê o caracter inserido pelo usuário e o armazena em "n1"
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();// lê o valor inserido pelo usuário e o armazena em "n1"
        System.out.println("Digite sua altura: ");
        double altura = input.nextDouble();// lê o valor inserido pelo usuário e o armazena em "n1"    
        System.out.println(nome +", Bem vindo! Você tem " + idade + " anos, " + altura + " metros de altura");
        if(genero == 'F'){//SE genero for igual a F
            System.out.println("Vocé é mulher!"); //mostra a mensagem em string
        }
        else if(genero =='M'){ //SENÂO SE genero for igual a M
            System.out.println("você é homem!");//mostra a mensagem em string
        }
        else{//SENÃO...
            System.out.println("F ou M!");//mostra a mensagem em string
        }
        if(idade >= 60){//SE idade maior ou igual a 60...
            System.out.println("Você é idoso!");//mostra a mensagem em string
        }
        else if (idade<60 && idade>=18){//SENÃO SE idade for menor que 60 E idade for menor ou igual a 18...
            System.out.println("Você é adulto!");//mostra a mensagem em string
        }
        else if (idade<18 && idade>12){//SENÃO SE idade for menor que 18 E  idade maior que 12...
            System.out.println("Você é adolescente!");//mostra a mensagem em string
        }
        else{//SENÃO...
            System.out.println("Você é criança!");//mostra a mensagem em string
        }
        input.close();//fecha a variável input
    }
}
