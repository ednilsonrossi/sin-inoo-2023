package ExercicioFixacao2.ProjetoCrescimentoPopulacional;

public class Cidade {
    private double populacaoAtual;
    private double crescimentoPopulacional;

    
    public Cidade(double populacaoAtual, double crescimentoPopulacional) {
        this.populacaoAtual = populacaoAtual;
        this.crescimentoPopulacional = crescimentoPopulacional;
    }


    public double getPopulacaoAtual() {
        return populacaoAtual;
    }

    public double getCrescimentoPopulacional() {
        return crescimentoPopulacional;
    }

    public void setCrescimentoPopulacional(double crescimentoPopulacional) {
        this.crescimentoPopulacional = crescimentoPopulacional;
    }

    public void aumentarPopulacao(){
        populacaoAtual += populacaoAtual * crescimentoPopulacional / 100;
    }    
}
