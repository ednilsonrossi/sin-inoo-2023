package aula5.SalarioFuncionarioProject.model;

public class FuncionarioHorista implements IFuncionario{

    private int horasTrabalhadas;
    private double valorHora;
    
    public FuncionarioHorista(int horasTrabalhadas, double valorHora) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double getSalario() {
        return horasTrabalhadas * valorHora;
    }
    
}
