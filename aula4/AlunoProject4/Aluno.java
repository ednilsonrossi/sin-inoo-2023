package aula4.AlunoProject4;

public abstract class Aluno {
    private String nome;
    private int prontuario;
    private double ncc;
    private double ifa;

    public Aluno(String nome, int prontuario) {
        setNome(nome);        
        this.prontuario = prontuario;
        ncc = -1;
        ifa = -1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public int getProntuario() {
        return prontuario;
    }

    public void setProntuario(int prontuario) {
        this.prontuario = prontuario;
    }

    public double getNcc() {
        return ncc;
    }

    protected void setNcc(double ncc) {
        this.ncc = notaValida(ncc) ? ncc : -1;
    }

    public double getIfa() {
        return ifa;
    }

    public void setIfa(double ifa) {
        this.ifa = notaValida(ifa) ? ifa : -1;
        if(getIfa() > getNcc()){
            setNcc(ifa);
        }
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

    public abstract void calcularNcc();

    protected boolean notaValida(double nota){
        return nota >= 0 && nota <= 10;
    }

    @Override
    public String toString(){
        String string;
        string = String.format("%s, NCC: %.2f, ", getNome(), getNcc());
        if(podeFazerIfa() && getIfa() != -1){
            string += String.format("IFA: %.2f, ", getIfa());
        }
        string += String.format("Situação: %s.", getSituacao());
        return string;
    }
}
