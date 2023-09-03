package aula3.ExemplosStrings;

public class Exemplo12 {
    public static void main(String[] args) {
        String str = "";
        if(str.isEmpty()){
            System.out.println("String vazia.");
        }

        String str2 = " ";
        if(str2.isEmpty()){
            System.out.println("String vazia.");
        }else{
            System.out.println("Espaço é um caractere.");
        }

        if(str2.isBlank()){
            System.out.println("String vazia.");
        }else{
            System.out.println("Espaço é um caractere desconsiderado aqui.");
        }
    }
}
