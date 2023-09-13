package aula4.ContaBancariaProject;

public class ClienteCode2 {
    public static void main(String[] args) {
        Corrente conta = new Corrente("Caua", "1234", 10, 100);

        System.out.println(conta.toString());
        
        conta.debito(1000);
        System.out.println(conta.toString());

        conta.credito(500);
        System.out.println(conta.toString());

        conta.debito(200);
        System.out.println(conta.toString());

        conta.cobrarTarifa();
        System.out.println(conta.toString());

        conta.debito(390);
        System.out.println(conta.toString());

        conta.cobrarTarifa();
        System.out.println(conta.toString());

        conta.debito(1000);
        System.out.println(conta.toString());

        conta.cobrarTarifa();
        System.out.println(conta.toString());

        conta.credito(1000);
        System.out.println(conta.toString());
        
    }
}
