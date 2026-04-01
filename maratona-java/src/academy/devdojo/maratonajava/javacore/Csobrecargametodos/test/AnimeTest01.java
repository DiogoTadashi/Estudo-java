package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Jojo","TV",12,"Ação");
//        anime.setNome("JoJo");
//        anime.setTipo("TV");
//        anime.setEpisodios(12);
        anime.imprime();
    }
}
