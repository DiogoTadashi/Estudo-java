import java.util.Scanner;

public class Exercicio3 {
    //3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.
    public static void executar(Scanner sc) {
        System.out.println("Digite o valor de A");
        int a = sc.nextInt();
        System.out.println("Digite o valor de B");
        int b = sc.nextInt();
        int c;
        if (a == b) {
            c = a + b;
            System.out.println("Como A e B são iguais, se somam, dando assim o valor de " + c);
        } else {
            c = a * b;
            System.out.println("Como A e B são diferentes, se multiplicam, dando assim o valor de " + c);
        }
    }
}
