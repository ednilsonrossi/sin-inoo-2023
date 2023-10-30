package model.coin;

public class Cinquenta extends Moeda{
    @Override
    public double getValue() {
        return 0.50;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof Cinquenta){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "R$ 0.50";
    }    
}
