package aula4.ContaBancariaProject;

public class Investimento extends Conta{
    private double taxaDeJurosAnual;

    public Investimento(String titular, String cpfTitular, double taxaDeJurosAnual) {
        super(titular, cpfTitular);
        setTaxaDeJurosAnual(taxaDeJurosAnual);
    }

    public double getTaxaDeJurosAnual() {
        return taxaDeJurosAnual;
    }

    public void setTaxaDeJurosAnual(double taxaDeJurosAnual) {
        this.taxaDeJurosAnual = taxaDeJurosAnual < 0 ? 0 : taxaDeJurosAnual/100.0;
    }

    @Override
    protected void debito(double valor) {
        if(getSaldo() >= valor){
            super.debito(valor);
        }
    }
    
}
