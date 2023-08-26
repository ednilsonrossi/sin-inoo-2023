package aula3.ProjetoReajusteSalario;

public class Funcionario {
    
    private String nome;
    private double salarioAtual;
    private double salarioAntigo;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        if(salario <= 0){
            this.salarioAtual = 0;
        }else{
            this.salarioAtual = salario;
        }
        this.salarioAntigo = 0;
    }

    public void realizarReajuste(int reajuste){
        salarioAntigo = salarioAtual;
        salarioAtual *= 1 + (reajuste / 100.0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioAtual() {
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
}