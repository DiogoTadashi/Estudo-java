package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        System.out.println("Digite F ou M para seu sexo: ");
        char sexoChar = input.next().toUpperCase().charAt(0);
        String sexo;
        if (sexoChar == 'M') {
            sexo = "Masculino";
        } else {
            sexo = "Feminino";
        }
        System.out.println("Nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("sexo: " + sexo);
    }
}
