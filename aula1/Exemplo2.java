import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        /*
         * Declaração de variáveis é semelhante ao trabalhado em linguagem C.
         */
        int ano;

        /*
         * Instanciar um objeto para leitura de dados.
         * A classe Scanner facilita a entrada de dados pois fornece
         * um conjunto de métodos que permitem a leitura de vários
         * tipos de dados.
         */
        Scanner input = new Scanner(System.in);

        System.out.print("Ano de nascimento: ");

        /*
         * Método nextInt() o objeto input indica à JVM que realize 
         * a leitura de um valor do tipo inteiro, esse método retorna
         * o valor inteiro lido.
         */
        ano = input.nextInt();

        System.out.printf("Idade: %d\n", 2023 - ano);
    }    
}
