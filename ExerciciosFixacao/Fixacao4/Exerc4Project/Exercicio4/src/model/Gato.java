package model;

public class Gato extends Animal{

    public Gato(String nome) {
        super(nome);
    }

    public String mia(){
        return "miau";
    }

    @Override
    public String emiteSom() {
        return mia();
    }
}
