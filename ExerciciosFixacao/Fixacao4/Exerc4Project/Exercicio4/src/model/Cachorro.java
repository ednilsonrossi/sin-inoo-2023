package model;

public class Cachorro extends Animal{

    public Cachorro(String nome) {
        super(nome);
    }

    public String late(){
        return "Au Au";
    }

    @Override
    public String emiteSom() {
        return late();
    }
}
