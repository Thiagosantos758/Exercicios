import java.util.Scanner;
public class Ex1{
    public static void main(String[] arg){
        Scanner input = new Scanner (System.in);
        String txt;
        System.out.println ("Digite o seu nome");
        txt = input.nextLine();
        System.out.println("Bem vindo " + txt + "!");
        
        System.out.println("Digite o primeiro número");
        int n1 = input.nextInt();
        System.out.println("Digite o segundo número");
        int n2 = input.nextInt();
        System.out.println ("Digite o terceiro número");
        int n3 = input.nextInt();
        System.out.println ("Digite o quarto número");
        int n4 = input.nextInt();  
        int soma;
        soma = n1+n2+n3+n4;
        System.out.println (txt + ", A soma dos 4 números digitados é: " + soma);

    input.close();
    

    }
}