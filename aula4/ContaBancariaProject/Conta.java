package aula4.ContaBancariaProject;

/**
 * Conta
 */
public class Conta {

    private String titular;
    private String cpfTitular;
    private double saldo;

    public Conta(String titular, String cpfTitular){
        this.titular = titular;
        this.cpfTitular = cpfTitular;
        saldo = 0;
    }

    public String getTitular() {
        return titular;
    }

    public String getCpfTitular() {
        return cpfTitular;
    }

    public void setCpfTitular(String cpfTitular) {
        this.cpfTitular = cpfTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Titular: " + titular + " CPF: " + cpfTitular + " Saldo: R$ " + saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected void credito(double valor){
        if(valor >= 0){
            this.saldo += valor;
        }
    }

    protected void debito(double valor){
        if(valor >= 0){
            this.saldo -= valor;
        }
    }
    
    
}