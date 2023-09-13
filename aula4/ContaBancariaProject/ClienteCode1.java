package aula4.ContaBancariaProject;

public class ClienteCode1 {
    public static void main(String[] args) {
        /*
         * Nesse exemplo faz-se a instância e manipulação de classe Conta.
         */

        Conta conta = new Conta("Caua", "1234");

        System.out.println(conta.toString());
        
        conta.debito(1000);
        System.out.println(conta.toString());

        conta.credito(500);
        System.out.println(conta.toString());

        conta.debito(200);
        System.out.println(conta.toString());
    }
}
