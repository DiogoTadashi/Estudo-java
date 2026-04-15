import java.util.Scanner;

public class Exercicio13 {
    //13 - Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.
    public static void executar(Scanner sc) {
        System.out.println("Digite seu nome: )");
        String nome = sc.nextLine();
        System.out.println("Digite a sua idade)");
        double idade = sc.nextDouble();
        System.out.println("Digite o seu peso(kg))");
        double peso = sc.nextDouble();

        if (idade >= 18){
            System.out.println("Nome: "+nome+ ". Parabens você é maior de idade");
        }else if (idade < 18){
            System.out.println("Nome: "+nome+ ". Você ainda é menor de idade");
        }
    }
}
