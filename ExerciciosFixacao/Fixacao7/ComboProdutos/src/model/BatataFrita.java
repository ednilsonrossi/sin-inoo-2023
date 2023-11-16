package model;

public class BatataFrita implements Produto{
    private TamanhoBatata tamanho;

    public BatataFrita(TamanhoBatata tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String getNome() {
        return "Batata " + tamanho.toString();
    }

    @Override
    public double getPreco() {
        switch (tamanho){
            case PEQUENA: return 5;
            case MEDIA: return 10;
            case GRANDE: return 15;
            default: return 0;
        }
    }
}
