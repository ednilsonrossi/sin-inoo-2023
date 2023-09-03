package aula3.ExemplosStrings;

public class Exemplo2 {
    public static void main(String[] args) {
        String str1 = new String("Esse construtor cria uma string com o argumento.");

        String str2 = "Aqui também é construída uma string e atribuída ao objeto.";

        String str3 = str1;

        String str4 = str1 + " " + str2;

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
