package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Professor2;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local local = new Local("Jardim do Bosque");
        Local local2 = new Local("Alameda");

        Aluno aluno01 = new Aluno("Pedro", 19);
        Aluno aluno02 = new Aluno("João", 20);
        Aluno aluno03 = new Aluno("Caio", 21);
        Aluno aluno04 = new Aluno("Paulo", 22);

        Aluno[] alunos = new Aluno[]{aluno01, aluno02};
        Aluno[] alunos2 = new Aluno[]{aluno03, aluno04};

        Professor2 professor01 = new Professor2("Flavio", "Historia");
        Professor2 professor02 = new Professor2("Junior", "Ciencias");

        Seminario seminario01 = new Seminario("Historia da Grecia", local);
        Seminario seminario02 = new Seminario("Ciencia Biologicas", local2);

        Seminario[] seminarios = new Seminario[]{seminario01};
        Seminario[] seminarios2 = new Seminario[]{seminario02};

        seminario01.setAlunos(alunos);
        seminario02.setAlunos(alunos2);

        professor01.setSeminarios(seminarios);
        professor02.setSeminarios(seminarios2);

        professor01.imprime();
        System.out.println("*********************************************************************************");
        professor02.imprime();
    }
}
