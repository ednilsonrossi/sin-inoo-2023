import java.time.*;

public class Main {
    public static void main(String[] args) {
        ZoneId saoPaulo = ZoneId.of("America/Sao_Paulo");
        ZoneId dubai = ZoneId.of("Asia/Dubai");

        LocalDateTime emSP = LocalDateTime.of(2023, Month.DECEMBER, 6, 13, 15);
        LocalDateTime emDB = LocalDateTime.of(2023, Month.DECEMBER, 8, 0, 5);

        ZonedDateTime saidaSP = ZonedDateTime.of(emSP, saoPaulo);
        ZonedDateTime chegadaDB = ZonedDateTime.of(emDB, dubai);

        Duration duracao = Duration.between(saidaSP, chegadaDB);
        System.out.println("Duração GOL: " + duracao);

        emSP = LocalDateTime.of(2023, Month.DECEMBER, 6, 18, 5);
        emDB = LocalDateTime.of(2023, Month.DECEMBER, 7, 23, 35);

        saidaSP = ZonedDateTime.of(emSP, saoPaulo);
        chegadaDB = ZonedDateTime.of(emDB, dubai);

        duracao = Duration.between(saidaSP, chegadaDB);
        System.out.println("Duração GOL: " + duracao);
    }
}