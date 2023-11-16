package model;

public class Suco {

    private Polpa principal;
    private Polpa complementar;
    private double custo;
    private double venda;

    public Suco(Polpa principal, Polpa complementar) {
        this.principal = principal;
        this.complementar = complementar;
        calcular();
    }

    public double getLucro(){
        return venda - custo;
    }

    public int getValorVenda(){
        return (int) Math.ceil(venda);
    }

    private void calcular(){
        custo = principal.getValor() * 2/3 + complementar.getValor() / 3;
        venda = custo * 1.35;
        if(venda > 20){
            venda = 20;
        }
    }

}
