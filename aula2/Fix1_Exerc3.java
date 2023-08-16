import java.util.Scanner;

public class Fix1_Exerc3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double leitura;

        for(int i = 0; i != 10; i+=1){
            System.out.print("Digite valor: ");
            leitura = input.nextDouble();
            sum += leitura;
        }

        System.out.printf("Média: %.2f\n\n", sum/10);
    }

}
