package aula4.ContaBancariaProject;

public class RDB extends Investimento{

    public RDB(String titular, String cpfTitular, double taxaDeJurosAnual) {
        super(titular, cpfTitular, taxaDeJurosAnual);
    }

    public void aplicarJuros(){
        double txDia = getTaxaDeJurosAnual() / 365;
        setSaldo(getSaldo() * (1+txDia) ) ;
    }
    
}
