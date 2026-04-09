package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Televisao extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.21;
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularTaxa() {
        System.out.println("Calculando taxa da televisão");
        return valor * IMPOSTO_POR_CENTO;
    }
}
