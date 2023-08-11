package aula3;

public class Calculadora {
    
    public int soma(int arg1, int arg2){
        return arg1 + arg2;
    }

    public int multiplicacao(int arg1, int arg2){
        return sucessiveSum(arg1, arg2);
    }

    private int sucessiveSum(int base, int multiplier){
        int result = base;
        for(int i=1; i != multiplier; i++){
            result += base;
        }
        return result;
    }

    /*
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Soma...: " + calc.soma(5, 7));
        System.out.println("Produto: " + calc.multiplicacao(5, 7));
    }
    */
}
