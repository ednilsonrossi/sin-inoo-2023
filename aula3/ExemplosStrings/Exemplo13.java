package aula3.ExemplosStrings;

public class Exemplo13 {
    public static void main(String[] args) {
        String str = " Introdução à Orientação a Objetos ";

        //retorna a string em minúsculo
        System.out.println(str.toLowerCase());

        //retorna a string em maiúsculo
        System.out.println(str.toUpperCase());

        //retorna a string sem caracteres em branco no início
        // ou no final da string
        System.out.println(str.trim());
    }
}
