package aula3.ProjetoContaBancaria2;

public class ContaBancaria {
    private String titular;
    private double saldo;

    /*
    public ContaBancaria(){
        saldo = 0f;
        titular = "Harry";
    }
    */

    public ContaBancaria(String argTitular){
        saldo = 0f;
        titular = argTitular;
    }

    public boolean saque(double valor){
        if(saldo >= valor && valor >= 0){
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void deposito(double valor){
        if(valor >= 0){
            saldo += valor;
        }
    }

    public String imprime(){
        return "Titular: " + titular + "  Saldo bancário: R$ " + saldo; 
    }
}
