package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

import java.util.Scanner;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }
    static void retrieveMaxDataSize(){
        System.out.println("Maximo de dados do banco de dados");
    }
}
