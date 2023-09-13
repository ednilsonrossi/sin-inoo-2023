package aula4.ContaBancariaProject;

public class ClienteCode3 {
    public static void main(String[] args) {
        Poupanca poupanca = new Poupanca("Caio", "5678", 4.5);
        System.out.println(poupanca.toString());

        poupanca.credito(1000);
        System.out.println(poupanca.toString());

        poupanca.aplicarJuros();
        System.out.println(poupanca.toString());

        poupanca.debito(2000);
        System.out.println(poupanca.toString());

        poupanca.credito(500);
        System.out.println(poupanca.toString());

        poupanca.aplicarJuros();
        System.out.println(poupanca.toString());

        poupanca.aplicarJuros();
        System.out.println(poupanca.toString());

        RDB rdb = new RDB("Eduardo", "87654", 13.5);
        System.out.println(rdb.toString());

        rdb.debito(500);
        System.out.println(rdb.toString());

        rdb.credito(1000);
        System.out.println(rdb.toString());

        for(int i = 0; i != 30; i++){
            rdb.aplicarJuros();
        }
        System.out.println(rdb.toString());

        rdb.credito(500);
        System.out.println(rdb.toString());

        for(int i = 0; i != 30; i++){
            rdb.aplicarJuros();
        }
        System.out.println(rdb.toString());

    }
}
