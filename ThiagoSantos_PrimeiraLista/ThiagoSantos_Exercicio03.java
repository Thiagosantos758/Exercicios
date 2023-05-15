import java.util.Scanner;
public class ThiagoSantos_Exercicio03 {
    public static void main(String [] args){
        System.out.println("Digite um valor em reais a ser convertido");
        Scanner input = new Scanner (System.in);
        float reais = input.nextFloat();
        double conv;
        conv = reais/4.94;
        System.out.println("Você tem um total de " + conv + " Dólares!");
        input.close();
    }
}
