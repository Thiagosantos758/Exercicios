import java.util.Scanner;
public class ThiagoSantos_Exercicio05 {
    public static void main(String[] args){
        System.out.println("Digite sua idade: ");
        Scanner input = new Scanner (System.in);
        int idade = input.nextInt();
        if (idade<=12)
        System.out.println("Você é criança!");
        else if (idade>12 && idade<19)
        System.out.println("Você é adolescente!");
        else if (idade>=19 && idade <65)
        System.out.println("Você é adulto!");
        else 
        System.out.println("Você é idoso!");

        input.close();
    }
    
}
