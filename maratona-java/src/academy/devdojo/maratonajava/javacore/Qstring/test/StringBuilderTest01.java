package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "William Suane";
        String nomeConcat = nome.concat(" DevDojo");
        String substring = nome.substring(0, 3);

        System.out.println(nome);
        System.out.println(nomeConcat);
        System.out.println(substring);

        StringBuilder sb = new StringBuilder("William Suane");
        sb.append(" DevDojo").append(" Academy");
        String subs = sb.substring(0, 2);
        System.out.println(subs);
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb.toString());
        sb.reverse();
        sb.delete(0, 2);
        System.out.println(sb.toString());
    }
}
