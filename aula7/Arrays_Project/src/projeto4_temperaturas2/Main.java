package projeto4_temperaturas2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Registro dataset[];
        int diasMes;

        System.out.println("Quantidade de dias do mês: ");
        diasMes = scanner.nextInt();
        dataset = new Registro[diasMes];

        for(int i = 0; i != dataset.length; i++){
            System.out.printf("Temperatura mínima e máxima no %dº dia: ", i+1);
            dataset[i] = new Registro(
                i + 1,
                scanner.nextDouble(), 
                scanner.nextDouble());
        }

        Registro maior = dataset[0];
        for(Registro registro : dataset){
            if(registro.getMedia() > maior.getMedia()){
                maior = registro;
            }
        }
        System.out.println("Maior temperatura média: " + maior.toString());

        
    }
}
