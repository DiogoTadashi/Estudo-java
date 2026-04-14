import java.util.Scanner;

public class Exercicio2 {
    //2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
    public static void executar(Scanner sc) {
        System.out.println("Digite o valor ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("O valor é par");
        } else {
            System.out.println("O valor é ímpar");
        }

        if (num > 0) {
            System.out.println("e o número é positivo.");
        } else if (num < 0) {
            System.out.println("e o número é negativo.");
        } else {
            System.out.println("e o número é zero.");
        }
    }
}
