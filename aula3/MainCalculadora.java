package aula3;

public class MainCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Soma...: " + calc.soma(5, 7));
        System.out.println("Produto: " + calc.multiplicacao(5, 7));
    }
}
