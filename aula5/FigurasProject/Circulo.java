package aula5.FigurasProject;

public class Circulo extends Figura{
    
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
        setPreenchido(false);
        setCor("BRANCA");
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String toString() {
        return "Circulo [raio=" + raio + "]";
    }
}
