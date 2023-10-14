package aula5.SalarioFuncionarioProject.model;

public class FuncionarioCLT implements IFuncionario{
    
    private double salarioMensal;

    public FuncionarioCLT(double salario) {
        this.salarioMensal = salario;
    }

    @Override
    public double getSalario() {
        return this.salarioMensal;
    }

}
