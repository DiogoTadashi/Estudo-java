import java.util.Scanner;

public class Exercicio11 {
    //11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das notas obtidas, imprima na tela o nome do aluno e se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado a sua média final deve ser maior ou igual a 7.
    public static void executar(Scanner sc) {
        System.out.println("Digite seu nome: )");
        String nome = sc.nextLine();
        System.out.println("Digite a primeira nota)");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota");
        double nota3 = sc.nextDouble();
        System.out.println("Digite a quarta nota");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println("Nome: " + nome);
            System.out.println("Status: Aprovado: " + media);
        }else {
            System.out.println("Nome: " + nome);
            System.out.println("Status: Não Aprovado: " + media);
        }
    }
}
