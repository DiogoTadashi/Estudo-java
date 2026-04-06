package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Yuri Alberto");
        Jogador jogador2 = new Jogador("Pelé");
        Jogador jogador3 = new Jogador("Rodrygo");
        Jogador jogador4 = new Jogador("Memphis");
        Time time = new Time("Corinthians");
        Time time2 = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador4};
        Jogador[] jogadores2 = {jogador2, jogador3};

        jogador.setTime(time);
        jogador2.setTime(time2);
        jogador3.setTime(time2);
        jogador4.setTime(time);

        time.setJogadores(jogadores);
        time2.setJogadores(jogadores2);

        System.out.println("--------Jogador----------");

        jogador.imprime();

        System.out.println("--------Jogador----------");

        jogador2.imprime();

        System.out.println("--------Jogador----------");

        jogador3.imprime();

        System.out.println("--------Jogador----------");

        jogador4.imprime();

        System.out.println("--------Time----------");

        time.imprime();

        System.out.println("--------Time----------");

        time2.imprime();
    }
}
