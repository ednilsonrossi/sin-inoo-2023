package aula3.ExemplosStrings;

public class Exemplo9 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "java";

        if(str1.equals(str2)){
            System.out.println("Strings possuem o mesmo conteúdo");
        }else{
            System.out.println("Strings possuem conteúdos distintos");
        }

        if(str1.equalsIgnoreCase(str2)){
            System.out.println("Strings possuem o mesmo conteúdo");
        }else{
            System.out.println("Strings possuem conteúdos distintos");
        }
    }
}
