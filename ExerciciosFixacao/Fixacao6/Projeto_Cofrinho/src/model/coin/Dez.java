package model.coin;

public class Dez extends Moeda{
    @Override
    public double getValue() {
        return 0.10;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof Dez){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "R$ 0.10";
    }    
}
