package aula4.AlunoProject3;

public class AlunoEDA extends Aluno{
    private double prova;
    private double projeto;
    private int pesoProva;
    private int pesoProjeto;

    public AlunoEDA(String nome, int prontuario, double prova, int pesoProva, double projeto, int pesoProjeto){
        super(nome, prontuario);
        this.prova = prova;
        this.projeto = projeto;
        this.pesoProva = pesoProva;
        this.pesoProjeto = pesoProjeto;
    }

    public double getProva() {
        return prova;
    }

    public void setProva(double prova) {
        this.prova = prova;
    }

    public double getProjeto() {
        return projeto;
    }

    public void setProjeto(double projeto) {
        this.projeto = projeto;
    }

    public int getPesoProva() {
        return pesoProva;
    }

    public void setPesoProva(int pesoProva) {
        this.pesoProva = pesoProva;
    }

    public int getPesoProjeto() {
        return pesoProjeto;
    }

    public void setPesoProjeto(int pesoProjeto) {
        this.pesoProjeto = pesoProjeto;
    }

    public void calcularNcc(){
        double c;
        c = ( projeto * pesoProjeto + prova * pesoProva ) / (pesoProjeto + pesoProva);
        if(getIfa() == -1)
            setNcc( c );
    }
    
    public boolean podeFazerIfa(){
        if(getIfa() != -1){
            return true;
        }else{
            if(getNcc() == -1){
                calcularNcc();
            }
            if(getNcc() >= 4 && getNcc() < 6){
                return true;
            }
        }
        return false;
    }

    public String getSituacao(){
        if(getNcc() >= 6){
            return "aprovado".toUpperCase();
        }else if(podeFazerIfa() && getIfa() == -1){
            return "instrumento final de avaliação".toUpperCase();
        }else{
            return "reprovado".toUpperCase();
        }
    }

    @Override
    public double getNcc(){
        calcularNcc();
        return super.getNcc();
    }

    @Override
    public String toString(){
        String string;
        string = String.format("Aluno EDA: %s, NCC: %.2f, ", getNome(), getNcc());
        if(podeFazerIfa() && getIfa() != -1){
            string += String.format("IFA: %.2f, ", getIfa());
        }
        string += String.format("Situação: %s.", getSituacao());
        return string;
    }
}
