package aula3.ExercicioAvaliativo1.USMoney_Project;

public class Main {
    public static void main(String[] args) {
        USMoney valor1, valor2, soma;
		
		valor1 = new USMoney(10, 0);
		valor2 = new USMoney(3, 0);
		
		soma = valor1.plus(valor2);
		
		System.out.println(soma.toString());
    }
}
