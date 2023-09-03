package aula3.ExemplosStrings;

public class Exemplo6 {
    
    public static void main(String[] args) {
        String str1 = "Linguagem Java";
        String str2 = str1;

        if(str1 == str2){
            System.out.println("As strings apontam para a mesma referência.");
        }
    }
}
