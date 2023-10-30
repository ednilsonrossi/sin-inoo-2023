package model.coin;

public class UmReal extends Moeda{
    @Override
    public double getValue() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof UmReal){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "R$ 1.00";
    }
    
}