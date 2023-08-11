package aula3.ProjetoContaBancaria2;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaHarry = new ContaBancaria("Harry");
        ContaBancaria contaHermione = new ContaBancaria("Hermione");

        System.out.println(contaHarry.imprime());
        System.out.println(contaHermione.imprime());

        System.out.println("Harry solicita saque de R$ 100");
        contaHarry.saque(100f);
        System.out.println(contaHarry.imprime());

        System.out.println("Harry solicita saque de R$ 100");
        contaHarry.saque(100f);
        System.out.println(contaHarry.imprime());

        System.out.println("Hermione solicita saque de R$ -100");
        contaHermione.saque(-100f);
        System.out.println(contaHermione.imprime());
    }
}
