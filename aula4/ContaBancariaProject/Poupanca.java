package aula4.ContaBancariaProject;

public class Poupanca extends Investimento{
    
    public Poupanca(String titular, String cpfTitular, double taxaDeJurosAnual) {
        super(titular, cpfTitular, taxaDeJurosAnual);
    }

    public void aplicarJuros(){
        double txMes = getTaxaDeJurosAnual() / 12;
        setSaldo(getSaldo() * (1+txMes) ) ;
    }

}
