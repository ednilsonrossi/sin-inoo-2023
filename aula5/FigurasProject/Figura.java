package aula5.FigurasProject;

public abstract class Figura {
    
    private String cor;
    private boolean preenchido;

    public abstract double getArea();

    public abstract double getPerimetro();

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isPreenchido() {
        return preenchido;
    }

    public void setPreenchido(boolean preenchido) {
        this.preenchido = preenchido;
    }
}
