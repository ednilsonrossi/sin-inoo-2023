package model.jogadores;

import model.coisas.Coisa;
import model.coisas.Papel;
import model.coisas.Pedra;
import model.coisas.Tesousa;

import java.util.Random;

public class Bot extends Jogador{

    public Bot() {
        super();
        defineCoisa();
    }

    @Override
    public String getNome() {
        return "Bot " + toString();
    }

    @Override
    public void setCoisa(int nCoisa) {
        defineCoisa();
    }

    private void defineCoisa(){
        Random random = new Random();
        switch (random.nextInt(3) + 1){
            case PAPEL:
                mCoisa = new Papel();
                break;
            case PEDRA:
                mCoisa = new Pedra();
                break;
            case TESOURA:
                mCoisa = new Tesousa();
        }
    }
}
