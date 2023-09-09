package aula4.AlunoProject4;

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

    @Override
    public void calcularNcc(){
        double c;
        c = ( projeto * pesoProjeto + prova * pesoProva ) / (pesoProjeto + pesoProva);
        if(getIfa() == -1)
            setNcc( c );
    }
    
    @Override
    public double getNcc(){
        calcularNcc();
        return super.getNcc();
    }

    @Override
    public String toString(){
        String string = "Aluno EDA: " + super.toString();
        return string;
    }
}
