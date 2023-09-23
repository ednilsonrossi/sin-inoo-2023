package aula5.FigurasProject;

public class Quadrado extends Figura{
    
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
        setCor("BRANCA");
        setPreenchido(false);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public double getPerimetro() {
        return 4 * lado;
    }

    @Override
    public String toString() {
        return "Quadrado [lado=" + lado + "]";
    }   
}
