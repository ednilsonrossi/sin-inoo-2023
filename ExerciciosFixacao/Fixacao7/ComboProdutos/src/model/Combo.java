package model;

public class Combo implements Produto{
    private Bebida bebida;
    private Lanche lanche;
    private BatataFrita batata;

    public Combo(Bebida bebida, Lanche lanche, BatataFrita batata) {
        this.bebida = bebida;
        this.lanche = lanche;
        this.batata = batata;
    }

    @Override
    public String getNome() {
        return "Combo";
    }

    @Override
    public double getPreco() {
        double sum = bebida.getPreco() + batata.getPreco() + lanche.getPreco();
        return sum * 0.85;
    }
}
