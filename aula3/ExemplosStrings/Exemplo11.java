package aula3.ExemplosStrings;

public class Exemplo11 {
    public static void main(String[] args) {
        
        String str = "Java é uma linguagem de programação.";

        int contaVogais = 0;
        for(int i = 0; i < str.length(); i++){
            switch(str.charAt(i)){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contaVogais += 1;
                    break;
            }
        }
        System.out.println("String possui " + contaVogais + " vogais");
    }
}
