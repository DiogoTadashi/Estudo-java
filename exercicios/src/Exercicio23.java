import java.util.Scanner;

public class Exercicio23 {
    //23 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
    //As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS.
    //Imprima na tela o salário líquido final.
    public static void executar(Scanner sc) {
        System.out.println("Digite o valor da hora da aula");
        double valorHora = sc.nextDouble();
        System.out.println("Digite a quantidade de aulas no mês");
        int nAula = sc.nextInt();
        System.out.println("Digite o percentual de desconto do INSS");
        double descontoI = sc.nextDouble();

        double salarioBruto = valorHora * nAula;
        double descontoSalario = salarioBruto * (descontoI / 100);
        double salarioLiquido = salarioBruto - descontoSalario;
        System.out.println("Salário líquido: R$" + salarioLiquido);
    }
}
