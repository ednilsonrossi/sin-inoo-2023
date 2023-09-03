package aula3.ExemplosStrings;

public class Exemplo8 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Python";
        String str3 = "Java";

        if(str1.equals(str2)){
            System.out.println("Strings possuem o mesmo conteúdo");
        }else{
            System.out.println("Strings possuem conteúdos distintos");
        }

        if(str1.equals(str3)){
            System.out.println("Strings possuem o mesmo conteúdo");
        }else{
            System.out.println("Strings possuem conteúdos distintos");
        }
    }
}
