package model.piggyBank;

import model.coin.Moeda;

public class Montinho {
    private Moeda coin;
    private int quantity;
    
    public Montinho(Moeda coin, int quantity){
        this.coin = coin;
        this.quantity = quantity;
    }

    public Moeda getCoin() {
        return coin;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof Montinho){
                Montinho other = (Montinho) obj;
                if(this.coin.equals(other.coin)){
                    return true;
                }
            }
        }
        return false;
    }
}
