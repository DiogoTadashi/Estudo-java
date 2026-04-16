import java.util.Scanner;

public class Exercicio19 {
    //19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.
    public static void executar() {
        System.out.println("Imprimindo a tabuada do 1 até o 10");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
