package model.jogadores;

import model.coisas.Coisa;
import model.coisas.Papel;
import model.coisas.Pedra;
import model.coisas.Tesousa;

public class Humano extends Jogador{

    private String nome;

    public Humano(String nome, int coisa) {
        super();
        this.nome = nome;
        setCoisa(coisa);
    }

    @Override
    public String getNome() {
        return nome;
    }
}
