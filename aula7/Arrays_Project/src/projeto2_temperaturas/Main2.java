package projeto2_temperaturas;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double array[];
        int diasMes;

        System.out.println("Quantidade de dias do mês: ");
        diasMes = scanner.nextInt();
        array = new double[diasMes];

        for(int i = 0; i != array.length; i++){
            System.out.printf("Temperatura no %dº dia: ", i+1);
            array[i] = scanner.nextDouble();
        }

        int posicaoMaior = 0;
        for(int i = 1; i < array.length; i++){
            if(array[i] > array[posicaoMaior]){
                posicaoMaior = i;
            }
        }
        System.out.printf("Maior temperatura do mês no dia %d foi %.1fº\n", 
            posicaoMaior+1, 
            array[posicaoMaior]);
    }
}
