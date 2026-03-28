package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //Arrays tem padrao de inicialização
        // byte, short, int, long, float e double = 0
        // char = '\u0000' ' '
        // boolean = false
        // String = null
        String [] nomes = new String[3];
        nomes[0] = "Isa";
        nomes[1] = "Pia";
        nomes[2] = "Dia";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
