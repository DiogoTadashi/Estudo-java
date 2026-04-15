import java.util.Arrays;
import java.util.Scanner;

public class Exercicio8 {
    //8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.
    public static void executar(Scanner sc) {
        System.out.println("Digite o primeiro valor");
        int a = sc.nextInt();
        System.out.println("Digite o segundo valor");
        int b = sc.nextInt();
        System.out.println("Digite o terceiro valor");
        int c = sc.nextInt();
        if (a == b || a == c || b == c) {
            System.out.println("Os valores devem ser diferentes!");
            return;
        }

        int[] valores = {a, b, c};
        Arrays.sort(valores);
        System.out.println("Ordem decrescente: " + valores[2] + " > " + valores[1] + " > " + valores[0]);

//        System.out.println("Os valores em ordem decrescente são");
//        if (a > b && a > c) {
//            if (b > c) {
//                System.out.println(a + ">" + b + ">" + c);
//            } else{
//                System.out.println(a + ">" + c + ">" + b);
//            }
//        } else if (b > a && b > c) {
//            if (a > c) {
//                System.out.println(b + ">" + a + ">" + c);
//            } else {
//                System.out.println(b + ">" + c + ">" + a);
//            }
//        } else{
//            if (a > b) {
//                System.out.println(c + ">" + a + ">" + b);
//            } else {
//                System.out.println(c + ">" + b + ">" + a);
//            }
//        }
    }
}
