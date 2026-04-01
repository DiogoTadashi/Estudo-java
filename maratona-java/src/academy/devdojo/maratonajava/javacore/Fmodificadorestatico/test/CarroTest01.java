package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro("BWM", 280);
        Carro carro02 = new Carro("Mercedes", 300);
        Carro carro03 = new Carro("Audi", 290);

        Carro.setVelocidadeLimite(180);

        carro01.imprime();
        carro02.imprime();
        carro03.imprime();
    }
}
