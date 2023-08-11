package aula3.ProjetoContaBancaria;

public class ContaBancaria {
    public String titular;
    public double saldo;

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
