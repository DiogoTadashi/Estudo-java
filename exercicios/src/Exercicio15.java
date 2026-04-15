import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio15 {
    //15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em consideração o ano com 365 dias e o mês com 30 dias.
    public static void executar(Scanner sc) {
        System.out.println("Digite o ano de nascimento ");
        int nasc = sc.nextInt();
        LocalDate data = LocalDate.now();

        System.out.println("Você já viveu aproximadamente:");
        int ano = data.getYear()-nasc;
        int mes = ano*30;
        int dia = ano*365;

        System.out.println("Anos: "+ano);
        System.out.println("Mes: "+mes);
        System.out.println("Dia: "+dia);
    }
}
