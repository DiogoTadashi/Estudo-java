import java.util.Scanner;

public class Exercicio18 {
    //18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
    // Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que sara ser maior que Francisco.
    public static void executar(Scanner sc) {
        System.out.println (" Francisco tem 1.50m de altura e sara tem 1.10m de altura");
        double francisco = 1.50;
        double sara = 1.10;
        int ano = 0;
        while (francisco >= sara){
            francisco += 0.02;
            sara += 0.03;
            ano++;
        }
        System.out.println("Serão necessários " + ano + " anos para que Sara seja maior que Francisco.");
    }
}
