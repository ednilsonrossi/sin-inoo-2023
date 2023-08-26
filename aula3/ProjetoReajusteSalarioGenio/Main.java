package aula3.ProjetoReajusteSalarioGenio;

public class Main {
    
    public static void main(String[] args) {
        Funcionario func;

        //Instanciar um funcionário
        func = new Funcionario("Augusto", 1000);

        //define reajuste de 12% no salário
        func.setReajuste(12);

        /** Como imprimir os dados do funcionário sendo que
         * o encapsulamento da classe não permite acesso aos
         * atributos?
         */

        System.out.printf("Funcionário...........: %s\n", func.getNome());
        System.out.printf("Salário (reajustado)..: R$ %.2f\n", func.getSalarioAtual());
        System.out.printf("Salário (reajustado)..: R$ %.2f\n", func.getSalarioAtual());
        System.out.printf("Salário (reajustado)..: R$ %.2f\n", func.getSalarioAtual());
        System.out.printf("Salário (antigo)......: R$ %.2f\n", func.getSalarioAntigo());
        System.out.printf("Valor último resajuste: R$ %.2f\n\n", func.getValorAumento());
    }
}
