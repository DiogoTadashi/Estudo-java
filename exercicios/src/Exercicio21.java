import java.util.Scanner;

public class Exercicio21 {
    //21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.
    public static void executar(Scanner sc) {
        System.out.println ("Imprimindo um numero aleatório entre 0 e 100");
        int num = (int)(Math.random() * 101);
        System.out.println("Valor aleatório entre 0 e 100 = " + num);
    }
}
