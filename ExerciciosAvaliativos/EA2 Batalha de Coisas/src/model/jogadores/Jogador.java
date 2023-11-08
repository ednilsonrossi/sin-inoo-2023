package model.jogadores;

import model.coisas.Coisa;
import model.coisas.Papel;
import model.coisas.Pedra;
import model.coisas.Tesousa;

public abstract class Jogador {
    //Atributos são de interface são sempre public static final.
    public static final int PEDRA = 1;
    public static final int PAPEL = 2;
    public static final int TESOURA = 3;

    protected Coisa mCoisa;
    protected int pontos;

    public Jogador() {
        this.pontos = 0;
    }

    public abstract String getNome();

    public Coisa getCoisa(){
        return mCoisa;
    }

    public void setCoisa(Coisa coisa){
        this.mCoisa = coisa;
    }

    public void setCoisa(int nCoisa){
        defineCoisa(nCoisa);
    }

    public void pontuar(){
        pontos += 1;
    }

    public int getPontos(){
        return pontos;
    }

    private void defineCoisa(int coisa){
        switch (coisa){
            case PAPEL:
                mCoisa = new Papel();
                break;
            case PEDRA:
                mCoisa = new Pedra();
                break;
            case TESOURA:
                mCoisa = new Tesousa();
                break;
            default:
                mCoisa = null;
        }
    }
}
