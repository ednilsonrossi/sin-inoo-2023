package projeto5;

public class Main {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;

        for(int i : array) sum += i;
        System.out.println("Soma: " + sum);
    }
}
