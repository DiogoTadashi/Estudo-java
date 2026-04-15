import java.util.Scanner;

public class Exercicio10 {
    // 10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.
    public static void executar(Scanner sc) {
        System.out.println("Digite a primeira nota)");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("As notas tiradas pelo aluno foram %.1f, %.1f, %.1f e a sua média foi %.2f%n",
                nota1, nota2, nota3, media);
    }
}
