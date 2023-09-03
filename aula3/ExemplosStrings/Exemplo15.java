package aula3.ExemplosStrings;

public class Exemplo15 {
    public static void main(String[] args) {
        String str = "Gosto de comer frango com batata. Não gosto de batata frita.";
        str = str.replace("batata","polenta");
        System.out.println(str);

        String str2 = "arara";
        str2 = str2.replace('a','e');
        System.out.println(str2);
    }
}
