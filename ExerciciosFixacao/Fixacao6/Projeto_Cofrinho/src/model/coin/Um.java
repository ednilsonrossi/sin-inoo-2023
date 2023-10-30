package model.coin;

public class Um extends Moeda {

    @Override
    public double getValue() {
        return 0.01;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof Um){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "R$ 0.01";
    }
}
