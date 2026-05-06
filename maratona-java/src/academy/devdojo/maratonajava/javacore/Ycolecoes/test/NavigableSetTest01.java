package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("1", "nokia");
        Smartphone smartphone2 = new Smartphone("2", "mokia");
        Smartphone smartphone3 = new Smartphone("3", "dokia");

        set.add(smartphone);
        set.add(smartphone2);
        set.add(smartphone3);

        for (Smartphone smartphones : set) {
            System.out.println(smartphones);
        }

//        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9,0));
        mangas.add(new Manga(1L, "Berserk", 9.5,5));
        mangas.add(new Manga(4L, "Pokemon", 3.2,0));
        mangas.add(new Manga(3L, "Attack on titan", 11.20,2));
        mangas.add(new Manga(2L, "Dragon ball Z", 2.99,0));
        mangas.add(new Manga(10L, "Aaragon", 2.99,0));
        mangas.add(new Manga(10L, "Aaragon", 10.0,0));

//        for (Manga manga : mangas.descendingSet()) {  // inverte a ordem do set
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga yuyu = new Manga(21L, "Yuyu Hakusho", 3.2, 5);
        Manga black = new Manga(31L, "Black Clover", 11.2, 5);

        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println("------------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));
        System.out.println("------------");

        System.out.println(mangas.lower(black));
        System.out.println(mangas.floor(black));
        System.out.println(mangas.higher(black));
        System.out.println(mangas.ceiling(black));

        System.out.println("------------");
        System.out.println(mangas.size());
        System.out.println(mangas.pollLast());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());
    }
}