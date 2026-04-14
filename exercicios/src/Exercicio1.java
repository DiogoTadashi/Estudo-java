import java.util.Scanner;

public class Exercicio1 {
    //1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
    public static void executar(Scanner sc) {
        System.out.println("Digite o valor de A");
        int a = sc.nextInt();
        System.out.println("Digite o valor de B");
        int b = sc.nextInt();
        System.out.println("Digite o valor de C");
        int c = sc.nextInt();

        int soma = a + b;
        System.out.println("O valor da soma de A + B é " + soma);
        System.out.println("O valor de C é " + c + ". Portanto nesse caso");
        if (soma < c) {
            System.out.println("o valor da soma de A+B é menor que C");
        } else if (soma == c) {
            System.out.println("o valor da soma de A+B é igual a C");
        }
        System.out.println("o valor da soma de A+B é maior que C");
    }
}
