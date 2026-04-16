import java.util.Scanner;

public class Exercicio24 {
    //24 - Faça um algoritmo que calcule a quantidade de litros de combustível gastos numa viagem,
    //sabendo que o carro faz 12km com um litro. Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua
    // velocidade média, distância percorrida e a quantidade de litros utilizados para fazer a viagem.
    //    Fórmula: distância = tempo x velocidade.
    //             litros usados = distância / 12.
    public static void executar(Scanner sc) {
        System.out.println("Digite o tempo gasto na viagem (em horas):");
        double tempo = sc.nextDouble();

        System.out.println("Digite a velocidade média (em km/h):");
        double velocidade = sc.nextDouble();

        double distancia = tempo * velocidade;
        double gas = distancia / 12;

        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Litros de combustível usados: " + gas + " L");
    }
}
