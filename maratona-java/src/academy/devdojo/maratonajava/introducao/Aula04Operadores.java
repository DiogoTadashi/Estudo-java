package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero1 = 10;
        double numero2 = 20;
        double resultado = numero1 + numero2;

        System.out.println(resultado);

        // < >
        boolean dezMaiorQueVinte = 10 >= 20;
        boolean dezMenorIgualVinte = 10 <= 20;
        System.out.println(dezMaiorQueVinte);
        System.out.println(dezMenorIgualVinte);
        System.out.println(5==5);
        System.out.println(5 != 5);

        // && ||
        int idade = 18;
        float salario = 5000f;
        System.out.println(idade >= 16 & salario >= 2000);
    }
}
