import java.util.Scanner;

public class Exercicio16 {
    // 16 - Leia três valores que representam os lados de um triângulo e verifique se são válidos.
    // Determine se o triângulo é equilátero, isósceles ou escaleno.
    public static void executar(Scanner sc) {
        System.out.println("Digite o valor do primeiro lado do triângulo:");
        int lado1 = sc.nextInt();
        System.out.println("Digite o valor do segundo lado do triângulo:");
        int lado2 = sc.nextInt();
        System.out.println("Digite o valor do terceiro lado do triângulo:");
        int lado3 = sc.nextInt();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Seu triângulo é equilátero.");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("Seu triângulo é isósceles.");
            } else {
                System.out.println("Seu triângulo é escaleno.");
            }
        } else {
            System.out.println("Os valores informados não formam um triângulo válido.");
        }
    }
}
