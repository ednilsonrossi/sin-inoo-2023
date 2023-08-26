package aula3.ProjetoReajusteSalarioGenio;

public class Funcionario {
    
    private String nome;
    private double salarioAtual;
    private double salarioAntigo;
    private int reajuste;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        if(salario <= 0){
            this.salarioAtual = 0;
        }else{
            this.salarioAtual = salario;
        }
        this.salarioAntigo = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioAtual() {
        salarioAntigo = salarioAtual;
        salarioAtual *= 1 + (reajuste / 100.0);
        return salarioAtual;
    }

    public void setSalarioAtual(double salarioAtual) {
        if(salarioAtual >= 0)
            this.salarioAtual = salarioAtual;
    }

    public double getSalarioAntigo() {
        return salarioAntigo;
    }

    public double getValorAumento() {
        return salarioAtual - salarioAntigo;
    }

    public int getReajuste() {
        return reajuste;
    }

    public void setReajuste(int reajuste) {
        this.reajuste = reajuste;
    }

    
}