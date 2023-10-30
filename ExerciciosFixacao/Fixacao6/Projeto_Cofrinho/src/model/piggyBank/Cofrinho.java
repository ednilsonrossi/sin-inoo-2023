package model.piggyBank;

import java.util.List;

import model.coin.*;

import java.util.ArrayList;

public class Cofrinho implements ICofrinho {
    
    private List<Moeda> moedas;

    public Cofrinho(){
        moedas = new ArrayList<>(100);
    }

    @Override
    public void insereMoeda(Moeda coin) {
        if(coin != null){
            moedas.add(coin);
        }
    }

    @Override
    public int quantasMoedas(Moeda coin) {
        int counter = 0;
        if(coin != null){
            for (Moeda moeda : moedas) {
                if(moeda.equals(coin))
                    counter += 1;
            }
        }
        return counter;
    }

    @Override
    public int quantidadeMoedas() {
        return moedas.size();
    }

    @Override
    public Montinhos quebrarCofrinho() {
        Montinhos montinhos = new Montinhos();
        ArrayList<Moeda> todas = new ArrayList<>();
        todas.add(new Um() );
        todas.add(new Cinco() );
        todas.add(new Dez() );
        todas.add(new VinteCinco() );
        todas.add(new Cinquenta() );
        todas.add(new UmReal());

        for (Moeda moeda : todas) {
            montinhos.add(new Montinho(moeda, quantasMoedas(moeda)));
        }

        return montinhos;
    }

    @Override
    public double totalCofrinho() {
        double sum = 0;
        ArrayList<Moeda> todas = new ArrayList<>();
        todas.add(new Um() );
        todas.add(new Cinco() );
        todas.add(new Dez() );
        todas.add(new VinteCinco() );
        todas.add(new Cinquenta() );
        todas.add(new UmReal());

        for(Moeda m: todas){
            sum += quantasMoedas(m) * m.getValue();
        }
        
        return sum;
    }

    
}
