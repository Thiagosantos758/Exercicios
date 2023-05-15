import java.util.Scanner;
public class ThiagoSantos_Exercicio06 {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        double pi = 3.1415;
        System.out.println("Digite o valor do raio do círculo: ");
        double raio = input.nextDouble();
        double per = raio*(pi*2);
        System.out.print("O perímetro do circulo é: " + per);
        input.close();
    }
}
