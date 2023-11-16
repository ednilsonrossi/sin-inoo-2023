import model.Polpa;
import model.Suco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Suco suco;

        System.out.println("Preço polpa principal");
        double pPrincipal = scanner.nextDouble();

        System.out.println("Preço polpa complementar");
        double pComplementar = scanner.nextDouble();

        suco = new Suco(new Polpa(pPrincipal), new Polpa(pComplementar));

        System.out.printf("Valor de venda: R$ %d.00\n", suco.getValorVenda());
        System.out.printf("%s de R$ %.2f\n", suco.getLucro()>=0? "Lucro" : "Prejuízo", suco.getLucro());

    }
}