package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.Repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        Repositorio repositorio2 = new RepositorioArquivo();
        Repositorio repositorio3 = new RepositorioMemoria();
        repositorio.salvar();
        repositorio2.salvar();
        repositorio3.salvar();
    }
}
