package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.CarroDesafio;

public class CarroDesafioTest {
    public static void main(String[] args) {
        CarroDesafio carro = new CarroDesafio();
        CarroDesafio carro2 = new CarroDesafio();

        carro.nome = "Mazda";
        carro.modelo = "Mazda RX-7";
        carro.ano = 2002;

        carro2.nome = "GTR";
        carro2.modelo = "Nissan Skyline GT-R R34";
        carro2.ano = 1999;

        System.out.println("O carro1 é chamado de "+ carro.nome + ", seu modelo é " + carro.modelo + " e seu ano é " + carro.ano);
        System.out.println("O carro2 é chamado de "+ carro2.nome + ", seu modelo é " + carro2.modelo + " e seu ano é " + carro2.ano);
    }
}
