package aula3.ExercicioAvaliativo1.Triangulo_Project;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b, c;
        Triangulo obj;

        for(int control = 0; control != 5; control += 1){
            System.out.println("Digite os valores dos 3 lados do triângulo: ");
            a = scanner.nextFloat();
            b = scanner.nextFloat();
            c = scanner.nextFloat();

            obj = new Triangulo(a, b, c);
            System.out.println(obj.getTipo());
        }
    }
}
