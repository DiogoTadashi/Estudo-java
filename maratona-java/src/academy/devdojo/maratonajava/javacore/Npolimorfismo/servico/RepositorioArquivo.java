package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.Repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
