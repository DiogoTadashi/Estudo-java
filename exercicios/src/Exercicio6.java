import java.util.Scanner;

public class Exercicio6 {
    //6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
    public static void executar(Scanner sc) {
        System.out.println("Digite um valor qualquer para reajuste de 5%:");
        double num = sc.nextInt();
        double reajuste = num * 0.05;
        double valorReajustado = num + reajuste;
        System.out.println("O valor digitado foi " + num + "e o valor fica " + valorReajustado + " apos o reajuste de 5%");
    }
}
