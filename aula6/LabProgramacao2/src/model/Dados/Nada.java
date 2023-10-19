package model.Dados;

public class Nada {
    private static int numero_nada = 0;

    private int numero;

    public Nada(){
        numero_nada += 1;
        this.numero = numero_nada;
    }

    public Nada(int numero){
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Nada [numero=" + numero + "]";
    }

    @Override
    public boolean equals(Object obj) {
        boolean iguais = false;
        if(obj instanceof Nada){
            iguais = numero == ((Nada) obj).numero;
        }
        return iguais;
    }
}
