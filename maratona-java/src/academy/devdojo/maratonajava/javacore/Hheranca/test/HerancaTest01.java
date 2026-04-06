package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("12345-123");
        endereco.setRua("Rua 5");
        Pessoa pessoa = new Pessoa("Maria");
        pessoa.setCpf("1234567890");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("-------------");

        Funcionario funcionario = new Funcionario("Logan");
        funcionario.setCpf("1234567890");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);
        funcionario.imprime();
        funcionario.relatorioPagamento();
    }
}
