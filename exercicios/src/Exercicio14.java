import java.util.Scanner;

public class Exercicio14 {
    //14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.
    public static void executar(Scanner sc) {
        System.out.println("Digite um valor: )");
        int a = sc.nextInt();
        System.out.println("Digite um outro valor: ");
        int b = sc.nextInt();
        System.out.println("Antes o valor de a era "+ a +"e o valor de b era "+ b);

        int temp = b;

        b = a;
        a = temp;

        System.out.println("Agora trocando o valor de a é "+ a + " e o valor de b "+ b);
    }
}
