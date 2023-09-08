package aula3.ExercicioAvaliativo1.Triangulo_Project;

public class Triangulo {

    private float lado1, lado2, lado3;

    public Triangulo(float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public boolean isTriangulo(){
        if(lado1 + lado2 > lado3){
            if(lado2 + lado3 > lado1){
                if(lado1 + lado3 > lado2){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isEquilatero(){
        return lado1 == lado2 && lado2 == lado3;
    }

    public boolean isIsosceles(){
        return lado1 == lado2 || lado1 == lado3 || lado2 == lado3;
    }

    public boolean isEscaleno(){
        return lado1 != lado2 && lado2 != lado3 && lado1 != lado3;
    }

    public String getTipo(){
        String answer = "Triângulo ";
        if(isEquilatero()){
            answer += "Equilátero";
        }else if(isEscaleno()){
            answer += "Escaleno";
        }else if(isIsosceles()){
            answer += "Isosceles";
        }
        if(!isTriangulo()){
            answer = "Não forma um triângulo";
        }

        return answer;
    }
}