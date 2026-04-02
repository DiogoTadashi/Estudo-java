package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pelé");
        Jogador jogador02 = new Jogador("Romário");
        Jogador jogador03 = new Jogador("Yuri Alberto");
        Time time = new Time("Seleção Brasileira");
        Time time2 = new Time("Corinthians");

        jogador01.setTime(time);
        jogador02.setTime(time);
        jogador03.setTime(time2);

        jogador01.imprime();
        jogador02.imprime();
        jogador03.imprime();
    }
}
