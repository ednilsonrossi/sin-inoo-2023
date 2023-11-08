package model.confrontos;

import model.coisas.Coisa;
import model.jogadores.Jogador;

public class MelhorDe3 implements Confronto{

    private Jogador jogador1;
    private Jogador jogador2;
    int jogos;

    public MelhorDe3(Jogador jogador1, Jogador jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        jogos = 0;
        batalhar();
    }

    public boolean partidaFechada(){
        return jogos == 3;
    }

    public void novaBatalha(int coisaJogador1, int coisaJogador2){
        jogador1.setCoisa(coisaJogador1);
        jogador2.setCoisa(coisaJogador2);
        batalhar();
    }

    public String getParcial(){
        return "Jogador 1: " + jogador1.getPontos() + " x Jogador 2: " + jogador2.getPontos();
    }

    @Override
    public Jogador getVencedor() {
        if(partidaFechada()){
            if(jogador1.getPontos() == jogador2.getPontos()){
                return null;
            }else{
                if(jogador1.getPontos() > jogador2.getPontos()){
                    return jogador1;
                }else{
                    return jogador2;
                }
            }
        }
        return null;
    }

    private void batalhar(){
        jogos += 1;
        switch (jogador1.getCoisa().batalha(jogador2.getCoisa())){
            case VITORIA:
                jogador1.pontuar();
                break;
            case DERROTA:
                jogador2.pontuar();
                break;
            case EMPATE:
                jogador1.pontuar();
                jogador2.pontuar();
        }
    }

}
