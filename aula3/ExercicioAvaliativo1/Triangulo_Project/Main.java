package aula3.ExercicioAvaliativo1.Triangulo_Project;

import java.util.Scanner;

public class Main {
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
            if(obj.isTriangulo()){
                if(obj.isEquilatero()){
                    System.out.println("Triângulo Equilátero.");;
                } else if(obj.isIsosceles()){
                    System.out.println("Triângulo Isosceles.");
                } else if(obj.isEscaleno()){
                    System.out.println("Triângulo Escaleno");
                }
            }else{
                System.out.println("Dados não formam triângulo.");
            }
        }
    }
}
