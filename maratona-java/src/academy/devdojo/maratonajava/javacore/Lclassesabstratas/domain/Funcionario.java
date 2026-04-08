package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }

    public abstract void calcularBonus();

    @Override
    public void imprime() {
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
    }
}
