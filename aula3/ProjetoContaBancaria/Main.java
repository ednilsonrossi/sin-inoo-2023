package aula3.ProjetoContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaHarry = new ContaBancaria();
        contaHarry.titular = "Harry Potter";
        contaHarry.saldo = 0;

        ContaBancaria contaHermione = new ContaBancaria();
        contaHermione.titular = "Hermione";
        contaHermione.saldo = 1000;

        System.out.println(contaHarry.imprime());
        System.out.println(contaHermione.imprime());

        System.out.println("Harry solicita saque de R$ 100");
        contaHarry.saque(100f);
        System.out.println(contaHarry.imprime());

        System.out.println("Harry solicita saque de R$ 100");
        contaHarry.saldo = 10000f;
        contaHarry.saque(100f);
        System.out.println(contaHarry.imprime());

        System.out.println("Hermione solicita saque de R$ -100");
        contaHermione.saldo -= -100f;
        System.out.println(contaHermione.imprime());
    }
}
