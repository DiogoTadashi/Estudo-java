package academy.devdojo.maratonajava.introducao;

public class DesafioRepeticao02 {
    public static void main(String[] args) {
        //dado um valor de um carro, descubra quantas vezes ele pode ser parcelado
        //Condição da valorParcela >= 1000
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela ++){
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("Parcela "+ parcela+ " R$ "+valorParcela);

            /**if(valorParcela >= 1000){
                System.out.println("Parcela "+ parcela+ " R$ "+valorParcela);
            } else {
                break;
            }**/
        }
    }
}
