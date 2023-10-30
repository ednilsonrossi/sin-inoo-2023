package projeto6;

public class Main2 {

    public static double media(double values[]){
        double sum = 0;
        for(double value : values){
            sum += value;
        }
        return sum / values.length;
    }

    public static void main(String[] args) {
        double array[] = {2.5, 4.5};
        System.out.println("Média: "+ media(array));
    }
}
