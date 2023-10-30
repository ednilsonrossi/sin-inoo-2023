package projeto6;

public class Main3 {
    
    public static double media(double... values){
        double sum = 0;
        for(double value : values){
            sum += value;
        }
        return sum / values.length;
    }

    public static void main(String[] args) {
        
        System.out.println("Média: "+ media(2.5, 3, 4,9));
    }
}
