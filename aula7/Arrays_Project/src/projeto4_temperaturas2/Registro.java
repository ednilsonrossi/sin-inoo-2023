package projeto4_temperaturas2;

public class Registro {
    private int dia;
    private double minima;
    private double maxima;

    public Registro(int dia, double minima, double maxima) {
        this.dia = dia;
        this.minima = minima;
        this.maxima = maxima;
    }

    public int getDia() {
        return dia;
    }

    public double getMinima() {
        return minima;
    }

    public double getMaxima() {
        return maxima;
    }

    public double getMedia(){
        return (minima + maxima) / 2;
    }

    @Override
    public String toString() {
        return "Registro [dia=" + dia + ", minima=" + minima + ", maxima=" + maxima + ", media=" + getMedia() + "]";
    }
    
}
