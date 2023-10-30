package projeto6;

public class Main {

    public static double media(double v1, double v2, double v3){
        return (v1 + v2 + v3) / 3;
    }

    public static double media(double v1, double v2, double v3, double v4){
        return (v1 + v2 + v3 + v4) / 4;
    }

    public static void main(String[] args) {
        System.out.println("Média: "+ media(2, 4, 6, 8));
    }
}
