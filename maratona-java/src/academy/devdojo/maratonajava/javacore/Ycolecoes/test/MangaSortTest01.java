package academy.devdojo.maratonajava.javacore.Ycolecoes.test;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class MangaByIdComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}
public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> listaManga = new ArrayList<>(6);
        listaManga.add(new Manga(5L, "Hellsing Ultimate", 19.9));
        listaManga.add(new Manga(1L, "Berserk", 9.5));
        listaManga.add(new Manga(4L, "Pokemon", 3.2));
        listaManga.add(new Manga(3L, "Attack on titan", 11.20));
        listaManga.add(new Manga(2L, "Dragon ball Z", 2.99));

        for (Manga manga : listaManga) {
            System.out.println(manga);
        }
        System.out.println("-----------------------");
        Collections.sort(listaManga);
        for (Manga manga : listaManga) {
            System.out.println(manga);
        }

        System.out.println("-----------------------");
        //Collections.sort(listaManga, new MangaByIdComparator());
        listaManga.sort(new MangaByIdComparator());
        for (Manga manga : listaManga) {
            System.out.println(manga);
        }
    }
}
