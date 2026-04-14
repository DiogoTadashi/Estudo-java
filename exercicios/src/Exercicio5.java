import java.util.Scanner;

public class Exercicio5 {
    //5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
    public static void executar(Scanner sc) {
        System.out.println("Digite o valor do seu salário: ");
        double salario = sc.nextInt();
        double salarioMinimo = 1293.20;

        double qntSalario = salario / salarioMinimo;

        System.out.println("Você ganha cerca de " + qntSalario + "salários mínimos");
    }
}
