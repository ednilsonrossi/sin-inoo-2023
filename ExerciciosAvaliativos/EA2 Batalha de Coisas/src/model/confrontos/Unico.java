package model.confrontos;

import model.jogadores.Jogador;

public class Unico implements Confronto{

    private Jogador jogador1;
    private Jogador jogador2;

    public Unico(Jogador jogador1, Jogador jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

    @Override
    public Jogador getVencedor() {
        switch (jogador1.getCoisa().batalha(jogador2.getCoisa())){
            case EMPATE:
                return null;
            case VITORIA:
                jogador1.pontuar();
                return jogador1;
            case DERROTA:
                jogador2.pontuar();
                return jogador2;
        }
        return null;
    }
}
