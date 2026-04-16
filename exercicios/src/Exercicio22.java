import java.util.Scanner;

public class Exercicio22 {
    //22 - Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles.
    public static void executar(Scanner sc) {
        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        System.out.println("Digite outro número: ");
        int num2 = sc.nextInt();

        int div = num / num2;
        int resDiv = num % num2;

        System.out.println("O quociente da divisão é " + div + " e o resto é " + resDiv);
    }
}
