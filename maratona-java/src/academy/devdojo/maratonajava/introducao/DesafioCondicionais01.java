package academy.devdojo.maratonajava.introducao;

public class DesafioCondicionais01 {
    public static void main(String[] args) {
        double salario = 2000.0;
        double salarioAnual = 12 * salario;
        double imposto1 = 9.70 / 100;
        double imposto2 = 37.35 / 100;
        double imposto3 = 49.50 / 100;

        System.out.println("Salário anual: " + salarioAnual);

        double imposto;
        if (salarioAnual < 34712) {
            imposto = salarioAnual * imposto1;
            System.out.println("Você tem que pagar 9,70% de imposto (" + imposto + ")");
        } else if (salarioAnual >= 34712 && salarioAnual <= 68507) {
            imposto = salarioAnual * imposto2;
            System.out.println("Você tem que pagar 37,35% de imposto (" + imposto + ")");
        } else {
            imposto = salarioAnual * imposto3;
            System.out.println("Você tem que pagar 49,50% de imposto (" + imposto + ")");
        }

        System.out.println("Portanto você vai receber líquido " + (salarioAnual - imposto));
    }
}

