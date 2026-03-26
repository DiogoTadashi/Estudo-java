package academy.devdojo.maratonajava.introducao;

public class DesafioCondicionais02 {
    public static void main(String[] args) {
        //Utilizando switch dado os valores de 1 a 7 imprima se o dia é útil ou fim de semana
        //Domingo sendo 1

        byte dia = 5;

        String diaUtil = switch(dia) {
            default -> "Data inválida";
            case 1,7 -> "Fim de semana";
            case 2,3,4,5,6 -> "Dia útil";
        };
        System.out.println(diaUtil);
    }

}

