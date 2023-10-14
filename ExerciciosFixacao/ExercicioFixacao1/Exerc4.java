package ExercicioFixacao1;
import java.util.Scanner;

public class Exerc4 {

    /*
     * Em Java não são definidas constantes da mesmo forma que em C. Aqui os 
     * atributos são classificados com o operador "final" que implica que o valor
     * do atributo não será alterado. Por convenção, as constantes (atributos final)
     * são escritos com letras maiúsculas.
     */
    private final int TAMANHO = 20;
    /*
     * Declaração de um array em Java segue o princípio que é necessário
     * instanciar 20 (no exemplo abaixo) variáveis do tipo do array. Após
     * a instância do array, a manipulação é a mesma que realizada em 
     * linguagem C.
     */
    private int array[] = new int[TAMANHO];


    public void lerValores(){
        Scanner scan = new Scanner(System.in);
        for(int index = 0; index != TAMANHO; index += 1){
            System.out.printf("Digite %dº número: ", index+1);
            array[index] = scan.nextInt();
        }
        scan.close();
    }

    public int buscaMaior(){
        int position = 0;
        for(int index = 1; index != TAMANHO; index += 1){
            if(array[index] > array[position]){
                position = index;
            }
        }
        return array[position];
    }

    public int buscaMenor(){
        int position = 0;
        for(int index = 1; index != TAMANHO; index += 1){
            if(array[index] < array[position]){
                position = index;
            }
        }
        return array[position];
    }


    public static void main(String[] args) {
        Exerc4 objeto = new Exerc4();

        objeto.lerValores();
        System.out.println("Maior valor: " + objeto.buscaMaior());
        System.out.println("Menor valor: " + objeto.buscaMenor());
    }

}
