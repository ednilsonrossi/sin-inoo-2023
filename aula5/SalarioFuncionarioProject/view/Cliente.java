package aula5.SalarioFuncionarioProject.view;

import aula5.SalarioFuncionarioProject.model.FuncionarioCLT;
import aula5.SalarioFuncionarioProject.model.FuncionarioHorista;
import aula5.SalarioFuncionarioProject.model.IFuncionario;

public class Cliente {
    
    public static void main(String[] args) {
        
        IFuncionario f1 = new FuncionarioCLT(1000);
        IFuncionario f2 = new FuncionarioHorista(40, 25);

        FuncionarioCLT f3 = new FuncionarioCLT(2000);
        FuncionarioHorista f4 = new FuncionarioHorista(10, 32);

        System.out.println("Salario: " + f1.getSalario());
        System.out.println("Salario: " + f2.getSalario());
        System.out.println("Salario: " + f3.getSalario());
        System.out.println("Salario: " + f4.getSalario());
    }
}
