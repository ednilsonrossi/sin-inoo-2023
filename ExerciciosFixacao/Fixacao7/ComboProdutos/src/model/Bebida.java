package model;

public class Bebida implements Produto{
    private String nome;
    private TipoBebida tipo;
    private double preco;

    public Bebida(String nome, TipoBebida tipo, double preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
