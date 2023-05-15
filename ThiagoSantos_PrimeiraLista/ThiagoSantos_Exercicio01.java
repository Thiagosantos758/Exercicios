import java.util.Scanner;
public class ThiagoSantos_Exercicio01 {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Digite um número");
        double n1 = input.nextDouble();
        System.out.println("Digite o segundo número");
        double n2 = input.nextDouble();
        System.out.println("Digite o terceiro número");
        double n3 = input.nextDouble();
        System.out.println("Digite o quarto e último número");
        double n4 = input.nextDouble();
        double res;
        res = n1+n2+n3+n4;
        System.out.println("O resultado dos números somados é: "+res);
        
        input.close();

    }
    
}
