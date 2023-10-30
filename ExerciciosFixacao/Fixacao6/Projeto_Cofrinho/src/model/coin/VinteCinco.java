package model.coin;

public class VinteCinco extends Moeda{
    @Override
    public double getValue() {
        return 0.25;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof VinteCinco){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "R$ 0.25";
    }    
}
