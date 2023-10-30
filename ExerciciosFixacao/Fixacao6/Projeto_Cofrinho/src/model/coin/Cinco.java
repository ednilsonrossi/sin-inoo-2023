package model.coin;

public class Cinco extends Moeda{

    @Override
    public double getValue() {
        return 0.05;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof Cinco){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "R$ 0.05";
    }    
}
