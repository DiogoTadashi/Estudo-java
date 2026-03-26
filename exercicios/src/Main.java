//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
/**
 * Lista de exercícios para treinamento de lógica de programação em Java.
 * <p>
 * Esta classe contém resoluções focadas em estruturas de repetição,
 * condicionais e manipulação de variáveis.
 * </p>
 *
 * @author Diogo Tadashi
 * @version 1.0
 * @see <a href="https://www.dio.me/articles/lista-de-exercicios-para-treinar-logica-de-programacao">Studying using Logical Lists </a>
 */

/*
    Exercícios
        1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

        2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

        3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores, caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.

        4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

        5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).

        6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

        7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

        8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

        9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição de acordo com a tabela abaixo:
        Fórmula do IMC = peso / (altura) ²
        Tabela Condições IMC
        Abaixo de 18,5   | Abaixo do peso
        Entre 18,6 e 24,9 | Peso ideal (parabéns)
        Entre 25,0 e 29,9 | Levemente acima do peso
        Entre 30,0 e 34,9 | Obesidade grau I
        Entre 35,0 e 39,9 | Obesidade grau II (severa)
        Maior ou igual a 40 | Obesidade grau III (mórbida)

        10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

        11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.

        12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.

        Tabela de Código de Condições de Pagamento
        1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
        2 - À Vista no cartão de crédito, recebe 10% de desconto
        3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
        4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%

        13 - Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.

        14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.

        15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em consideração o ano com 365 dias e o mês com 30 dias.
        (Ex: 5 anos, 2 meses e 15 dias de vida)

        16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é equilátero, isósceles ou escaleno.

        17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
        Fórmula: C = (5 * ( F-32) / 9)

        18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano. Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.

        19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.

        20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.

        21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.

        22 - Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles.

        23 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.

        24 - Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem, sabendo que o carro faz 12km com um litro. Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média, distância percorrida e a quantidade de litros utilizados para fazer a viagem.
            Fórmula: distância = tempo x velocidade.
                    litros usados = distância / 12.
     */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n=== MENU DE EXERCÍCIOS ===");
            System.out.println("1 - Soma A + B e comparação com C");
            System.out.println("2 - Par/Ímpar e Positivo/Negativo");
            System.out.println("3 - Soma ou multiplicação de A e B");
            System.out.println("4 - Antecessor e sucessor");
            System.out.println("5 - Quantos salários mínimos");
            System.out.println("6 - ");
            System.out.println("7 - ");
            System.out.println("8 - ");
            System.out.println("9 - ");
            System.out.println("10 - ");
            System.out.println("11 - ");
            System.out.println("12 - ");
            System.out.println("13 - ");
            System.out.println("14 - ");
            System.out.println("15 - ");
            System.out.println("16 - ");
            System.out.println("17 - ");
            System.out.println("18 - ");
            System.out.println("19 - ");
            System.out.println("20 - ");
            System.out.println("21 - ");
            System.out.println("22 - ");
            System.out.println("23 - ");
            System.out.println("24 - ");
            System.out.println("0 - Sair");
            System.out.print("Escolha o exercício: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> exercicio1(sc);
                case 2 -> exercicio2(sc);
                case 3 -> exercicio3(sc);
                case 4 -> exercicio4(sc);
                case 5 -> exercicio5(sc);
                case 6 -> exercicio6(sc);
                case 7 -> exercicio7(sc);
                case 8 -> exercicio8(sc);
                case 9 -> exercicio9(sc);
                case 10 -> exercicio10(sc);
                case 11 -> exercicio11(sc);
                case 12 -> exercicio12(sc);
                case 13 -> exercicio13(sc);
                case 14 -> exercicio14(sc);
                case 15 -> exercicio15(sc);
                case 16 -> exercicio16(sc);
                case 17 -> exercicio17(sc);
                case 18 -> exercicio18(sc);
                case 19 -> exercicio19(sc);
                case 20 -> exercicio20(sc);
                case 21 -> exercicio21(sc);
                case 22 -> exercicio22(sc);
                case 23 -> exercicio23(sc);
                case 24 -> exercicio24(sc);
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }

    //1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
    public static void exercicio1(String[] args) {
        System.out.println("");
    }

    //2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
    public static void exercicio2(String[] args) {
        System.out.println("");
    }

    //3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.
    public static void exercicio3(String[] args) {
        System.out.println("");
    }

    //4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
    public static void exercicio4(String[] args) {
        System.out.println("");
    }

    //5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
    public static void exercicio5(String[] args) {
        System.out.println("");
    }

    //6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
    public static void exercicio6(String[] args) {
        System.out.println("");
    }

    //7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
    public static void exercicio7(String[] args) {
        System.out.println("");
    }

    //8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.
    public static void exercicio8(String[] args) {
        System.out.println("");
    }

    //9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição
    public static void exercicio9(String[] args) {
        System.out.println("");
    }

    // 10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.
    public static void exercicio10(String[] args) {
        System.out.println("");
    }

    //11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.
    public static void exercicio11(String[] args) {
        System.out.println("");
    }

    //12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
    public static void exercicio12(String[] args) {
        System.out.println("");
    }

    //13 - Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.
    public static void exercicio13(String[] args) {
        System.out.println("");
    }

    //14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.
    public static void exercicio14(String[] args) {
        System.out.println("");
    }

    //15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em consideração o ano com 365 dias e o mês com 30 dias.
    public static void exercicio15(String[] args) {
        System.out.println("");
    }

    //16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é equilátero, isósceles ou escaleno.
    public static void exercicio16(String[] args) {
        System.out.println("");
    }

    //17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
    public static void exercicio17(String[] args) {
        System.out.println("");
    }

    //18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano. Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.
    public static void exercicio18(String[] args) {
        System.out.println("");
    }

    //19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.
    public static void exercicio19(String[] args) {
        System.out.println("");
    }

    //20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.
    public static void exercicio20(String[] args) {
        System.out.println("");
    }

    //21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.
    public static void exercicio21(String[] args) {
        System.out.println("");
    }

    //22 - Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles.
    public static void exercicio22(String[] args) {
        System.out.println("");
    }

    //23 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.
    public static void exercicio23(String[] args) {
        System.out.println("");
    }

    //24 - Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem, sabendo que o carro faz 12km com um litro. Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média, distância percorrida e a quantidade de litros utilizados para fazer a viagem.
    public static void exercicio24(String[] args) {
        System.out.println("");
    }
}