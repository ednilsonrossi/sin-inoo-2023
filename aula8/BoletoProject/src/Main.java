import model.Boleto;

import java.time.*;

public class Main {
//    public static void main(String[] args) {
//        long barras = 95550000035000L;
//        System.out.println("Barras: " + barras);
//        mostraDetalhes(new Boleto(barras));
//
//        barras = 73640000035000L;
//        System.out.println("Barras: " + barras);
//        mostraDetalhes(new Boleto(barras));
//    }

    private static void mostraDetalhes(Boleto blto){
        System.out.println("BOLETO:");
        System.out.println("Valor: R$ " + blto.getValor());
        System.out.println("Vencimento: " + blto.getDataVencimento());
        System.out.println("Vencimento: " + blto.getVencimento());
        System.out.println("----");
        System.out.println("Hoje: " + LocalDate.now());
        System.out.printf("Vencido à %d dias\n", blto.diasAtraso());
        System.out.println("#############################");
    }

//    public static void main(String[] args) {
//        LocalDate hoje = LocalDate.now();
//        System.out.println("Hoje: " + hoje);
//
//        LocalDate uncleBob = LocalDate.of(1952, Month.DECEMBER, 5);
//        System.out.println("Nascimento Uncle Bob: " + uncleBob);
//    }

//    public static void main(String[] args) {
//        LocalDate homemNoEspaco = LocalDate.of(1961, Month.APRIL, 12);
//        LocalDate homemNaLua = LocalDate.of(1969, Month.MAY, 25);
//
//        Period periodo = Period.between(homemNoEspaco, homemNaLua);
//
//        System.out.printf("%d anos, %d meses e %d dias\n",
//                periodo.getYears(),
//                periodo.getMonths(),
//                periodo.getDays());
//
//    }

    public static void main(String[] args) {
        LocalTime inicioAula = LocalTime.of(19, 0);
        LocalTime fimAula = LocalTime.of(22,35);

        Duration duracao = Duration.between(inicioAula, fimAula);

        System.out.println("Inicio...........: " + inicioAula);
        System.out.println("Final............: " + fimAula);
        System.out.println("Duração (minutos): " + duracao.toMinutes());
        System.out.println("Duração (horas)..: " + duracao.toHours());
        System.out.println("Duração (horas)..: " + duracao);
    }
}