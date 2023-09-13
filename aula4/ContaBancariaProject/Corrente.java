package aula4.ContaBancariaProject;

public class Corrente extends Conta{
    
    private double custoPacote;
    private double limite;
    private boolean bloqueada;
    
    public Corrente(String titular, String cpfTitular, double custoPacote, double limite) {
        super(titular, cpfTitular);
        this.custoPacote = custoPacote;
        this.limite = limite;
        this.bloqueada = false;
    }

    public double getCustoPacote() {
        return custoPacote;
    }

    public void setCustoPacote(double custoPacote) {
        this.custoPacote = custoPacote;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void cobrarTarifa(){
        if(getSaldo() + getLimite() < custoPacote ){
            bloqueada = true;
            setSaldo(getSaldo() - custoPacote);
        }
        debito(custoPacote);
    }

    @Override
    protected void debito(double valor) {
        if(valor >= 0){
            if(getSaldo() + getLimite() >= valor){
                super.debito(valor);
            }
        }
    }

    @Override
    protected void credito(double valor) {
        super.credito(valor);
        if(bloqueada){
            if(getSaldo() >= 0){
                bloqueada = false;
            }
        }
    }

    @Override
    public String toString() {
        if(bloqueada){
            return super.toString() + " CONTA BLOQUEADA";
        }
        return super.toString();
    }

}
