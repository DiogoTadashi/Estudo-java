package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        //Arrays tem padrao de inicialização
        // byte, short, int, long, float e double = 0
        // char = '\u0000' ' '
        // boolean = false
        // String = null
        int [] numeros = new int[3];
        int [] numeros2 = {1,2,3,4,5};
        int [] numeros3 = new int[]{5,4,3,2,1};

//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println(numeros[i]);
//        }

        for (int num : numeros3){
            System.out.println(num);
        }
    }
}
