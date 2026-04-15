import java.util.Scanner;

public class Exercicio12 {
    public static void executar(Scanner sc) {
        System.out.println("Digite o valor do produto:");
        double valor = sc.nextDouble();

        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1 - À Vista em Dinheiro ou Pix (15% de desconto)");
        System.out.println("2 - À Vista no cartão de crédito (10% de desconto)");
        System.out.println("3 - Parcelado no cartão em duas vezes (sem juros)");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais (10% de juros)");

        int opcao = sc.nextInt();
        double valorFinal;

        switch (opcao) {
            case 1 -> valorFinal = valor * 0.85; // 15% desconto
            case 2 -> valorFinal = valor * 0.90; // 10% desconto
            case 3 -> valorFinal = valor;        // preço normal
            case 4 -> valorFinal = valor * 1.10; // 10% juros
            default -> {
                System.out.println("Opção inválida!");
                return;
            }
        }

        System.out.printf("Valor final a ser pago: R$ %.2f%n", valorFinal);
    }
}
