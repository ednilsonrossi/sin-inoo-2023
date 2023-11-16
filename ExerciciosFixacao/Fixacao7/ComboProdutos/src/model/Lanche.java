package model;

public class Lanche implements Produto{
    private String nome;
    private double valor;

    public Lanche(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return valor;
    }
}
