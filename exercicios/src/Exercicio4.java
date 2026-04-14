import java.util.Scanner;

public class Exercicio4 {
    //4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
    public static void executar(Scanner sc) {
        System.out.println("Digite o valor ");
        int num = sc.nextInt();

        int suc = num + 1;
        int ant = num - 1;
        System.out.println("O numero digitado foi " + num + "Seu antecessor é " + ant + "e seu sucessor é" + suc);
    }
}
