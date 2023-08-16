import java.util.Scanner;

public class Exerc5 {
    
    Scanner scan;

    public void executar(int n){
        scan = new Scanner(System.in);
        double maiorValor;
        int frequencia;
        double number;
        if(n > 0){
            maiorValor = leValor();
            frequencia = 1;

            for(int controle = 1; controle < n; controle += 1){
                number = leValor();
                if(number > maiorValor){
                    maiorValor = number;
                    frequencia = 1;
                }else if(number == maiorValor){
                    frequencia++;
                }
            }
            System.out.printf("Maior valor digitado = %.2f com frequência de %d vezes.\n\n", maiorValor, frequencia);
        }
    }

    private double leValor(){
        System.out.print("Digite número: ");
        return scan.nextDouble();
    }

    public static void main(String[] args) {
        Exerc5 objeto = new Exerc5();
        int qtdade;
        Scanner input = new Scanner(System.in);
        System.out.println("Quantidade de números: ");
        qtdade = input.nextInt();
        objeto.executar(qtdade);
    }
}
