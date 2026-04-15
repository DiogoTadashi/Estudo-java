import java.util.Scanner;

public class Exercicio9 {
    //9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição
//    Fórmula do IMC = peso / (altura) ²
//    Tabela Condições IMC
//    Abaixo de 18,5   | Abaixo do peso
//    Entre 18,6 e 24,9 | Peso ideal (parabéns)
//    Entre 25,0 e 29,9 | Levemente acima do peso
//    Entre 30,0 e 34,9 | Obesidade – grau I
//    Entre 35,0 e 39,9 | Obesidade – grau II (severa)
//    Maior ou igual a 40 | Obesidade – grau III (mórbida)
    public static void executar(Scanner sc) {
        System.out.println("Calculadora de IMC");
        System.out.println("Digite o peso da pessoa desejada(kg)");
        double peso = sc.nextDouble();
        System.out.println("Digite a altura da pessoa desejada(m)");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        String imcCalc;
        if (imc < 18.5) {
            imcCalc = "Abaixo do peso";
        } else if (imc >= 18.6 && imc <= 24.9) {
            imcCalc = "Peso ideal (parabéns)";
        } else if (imc >= 25.0 && imc <= 29.9) {
            imcCalc = "Levemente acima do peso";
        } else if (imc >= 30.0 && imc <= 34.9) {
            imcCalc = "Obesidade – grau I";
        } else if (imc >= 35.0 && imc <= 39.9) {
            imcCalc = "Obesidade – grau II (severa)";
        } else if (imc >= 40.0) {
            imcCalc = "Obesidade – grau III (mórbida)";
        } else {
            imcCalc = "Dados inválidos";
        }

        System.out.println("IMC: " + imc + " - Condição: " + imcCalc);
    }
}
