package model.piggyBank;

import java.util.ArrayList;
import java.util.List;
import model.coin.Moeda;

public class Montinhos {

    private List<Montinho> montinhos;
    
    public Montinhos(){
        montinhos = new ArrayList<>(6);
    }

    public boolean add(Montinho montinho){
        if(montinhos.contains(montinho)){
            return false;
        }else{
            return montinhos.add(montinho);
        }
    }

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
