import java.util.Scanner;

public class Exercicio7 {
    //7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
    public static void executar(Scanner sc) {
        System.out.println("Digite o primeiro valor lógico (true/false):");
        boolean valor1 = sc.nextBoolean();

        System.out.println("Digite o segundo valor lógico (true/false):");
        boolean valor2 = sc.nextBoolean();

        if (valor1 && valor2) {
            System.out.println("Ambos são VERDADEIROS.");
        } else if (!valor1 && !valor2) {
            System.out.println("Ambos são FALSOS.");
        } else {
            System.out.println("Um é VERDADEIRO e o outro é FALSO.");
        }
    }
}
