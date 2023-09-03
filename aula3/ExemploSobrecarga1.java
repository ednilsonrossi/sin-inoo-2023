package aula3;

public class ExemploSobrecarga1 {
    public static void main(String[] args) {
        int n1, n2, n3;
        String str1, str2, str3;

        n1 = 5;
        n2 = 10;

        str1 = "Python é ";
        str2 = "recurso alternativo de engenharia avançada.";

        n3 = n1 + n2;
        str3 = str1 + str2;

        System.out.println(n3);
        System.out.println(str3);
        System.out.println(str1 + n2);
    }
}
