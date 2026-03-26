package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições";
        /**String resultado;
        if (salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);**/

        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        //String resultado = salario > 5000 ? "eu vou doar 500 pro DevDojo" : "Ainda não tenho condições";
        System.out.println(resultado);
    }
}
