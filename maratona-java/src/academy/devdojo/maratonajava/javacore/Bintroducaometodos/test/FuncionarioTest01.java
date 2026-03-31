package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Jorge";
        funcionario.idade = 23;
        funcionario.salarios = new double[]{1000, 2500, 5000};

        funcionario.imprime();
    }
}
