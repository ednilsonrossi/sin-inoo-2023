package aula5.FigurasProject;

public class Retangulo extends Figura{

    private double altura;
    private double largura;

    public Retangulo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
        setPreenchido(true);
        setCor("PRETO");
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public double getArea() {
        return altura * largura;
    }

    @Override
    public double getPerimetro() {
        return 2 * (altura + largura);
    }

    @Override
    public String toString() {
        return "Retangulo [altura=" + altura + ", largura=" + largura + "]";
    }
}
