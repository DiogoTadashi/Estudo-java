package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100_000);
        long fim = System.currentTimeMillis();

        long inicio2 = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        long fim2 = System.currentTimeMillis();

        long inicio3 = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        long fim3 = System.currentTimeMillis();


        System.out.println("Tempo gasto para String "+ (fim - inicio) + "ms");
        System.out.println("Tempo gasto para StringBuilder "+ (fim2 - inicio2) + "ms");
        System.out.println("Tempo gasto para StringBuffer "+ (fim3 - inicio3) + "ms");
    }

    public static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    public static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    public static void concatStringBuffer(int tamanho) {
        StringBuffer sb2 = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb2.append(i);
        }
    }
}
