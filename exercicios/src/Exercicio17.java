import java.util.Scanner;

public class Exercicio17 {
    // 17 - Leia uma temperatura em Fahrenheit e calcule a correspondente em Celsius.
    // Fórmula: C = (5 * (F - 32)) / 9
    public static void executar(Scanner sc) {
        System.out.println("Digite uma temperatura em Fahrenheit (°F): ");
        double tempF = sc.nextDouble();

        double tempC = (5.0 * (tempF - 32)) / 9.0;

        System.out.println("A temperatura de " + tempF + "°F é igual a "
                + String.format("%.2f", tempC) + "°C");
    }
}