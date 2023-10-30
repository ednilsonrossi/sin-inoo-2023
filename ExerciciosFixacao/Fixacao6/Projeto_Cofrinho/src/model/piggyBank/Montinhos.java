package model.piggyBank;

import java.util.ArrayList;
import java.util.List;
import model.coin.Moeda;

public class Montinhos {

    private List<Montinho> montinhos;
    
    public Montinhos(){
        montinhos = new ArrayList<>(6);
    }

    /**
     * Adiciona um novo montinho, contudo não é permitido criar montinhos de moedas já 
     * definidas no Montinhos, ou seja, existe apenas um montinho para o mesmo tipo 
     * de moeda.
     * @param montinho
     * @return
     */
    public boolean add(Montinho montinho){
        if(montinhos.contains(montinho)){
            return false;
        }else{
            return montinhos.add(montinho);
        }
    }

    /**
     * Retorna o montinho do tipo de moeda passada como argumento.
     * @param coin
     * @return
     */
    public Montinho get(Moeda coin){
        Montinho monte = null;
        for (Montinho montinho : montinhos) {
            if(montinho.getCoin().equals(coin)){
                monte = montinho;
            }
        }
        return monte;
    }
}
