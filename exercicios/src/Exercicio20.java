import java.util.Scanner;

public class Exercicio20 {
    //20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.
    public static void executar(Scanner sc) {
        System.out.println ("Digite um número para saber a sua tabuada ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++){ System.out.println (num + "*" + i + "=" +(num*i));
        }
    }
}
