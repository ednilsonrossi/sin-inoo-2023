import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Instant inicio, fim;
//        Duration duracao;
//        int minutos;
//
//        System.out.println("Quantidade de minutos: ");
//        minutos = scanner.nextInt();
//
//        inicio = Instant.now();
//        System.out.println("Início: " + inicio);
//        do{
//            try{
//                Thread.sleep(100000);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//            fim = Instant.now();
//            duracao = Duration.between(inicio, fim);
//            System.out.println("Passaram: " +duracao.toMinutes() + " minutos");
//            System.out.println("Você tem: " + (minutos- duracao.toMinutes()) + " minutos para terminar");
//        }while (duracao.toMinutes() < minutos);
//        System.out.println("Acabou o tempo!");
//    }

//    public static void main(String[] args) {
//        Instant agora = Instant.now();
//        System.out.println(agora);
//    }

    public static void main(String[] args) {
        Instant inicio = Instant.now();
        rodaAlgoritmo();
        Instant fim = Instant.now();

        Duration duracao = Duration.between(inicio, fim);
        long duracaoEmMilissegundos = duracao.toMillis();
    }

    private static void rodaAlgoritmo(){}
}