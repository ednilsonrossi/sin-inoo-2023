package aula4.AlunoProject2;

public class Aluno {
    private String nome;
    private double avaliacao1;
    private double avaliacao2;
    private double ncc;
    private double ifa;


    public Aluno(String nome, double avaliacao1, double avaliacao2) {
        setNome(nome);
        setAvaliacao1(avaliacao1);
        setAvaliacao2(avaliacao2);
        this.ncc = -1;
        this.ifa = -1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public double getAvaliacao1() {
        return avaliacao1;
    }

    public void setAvaliacao1(double avaliacao1) {
        if(avaliacao1 >= 0 && avaliacao1 <= 10)
            this.avaliacao1 = avaliacao1;
        else
            this.avaliacao1 = 0;
    }

    public double getAvaliacao2() {
        return avaliacao2;
    }

    public void setAvaliacao2(double avaliacao2) {
        this.avaliacao2 = avaliacao2 >= 0 && avaliacao2 <= 10 ? avaliacao2 : 0;
    }

    public double getNcc() {
        calcularNotaFinal();
        return ncc;
    }

    public double getIfa() {
        return ifa;
    }

    public void setIfa(double ifa) {
        if(podeFazerIfa()){
            this.ifa = ifa >= 0 && ifa <= 10 ? ifa : -1;
            if(ifa > ncc){
                ncc = ifa;
            }
        }
    }

    public boolean podeFazerIfa(){
        if(ifa != -1)
            return true;
        else{
            if(getNcc() == -1){
                calcularNotaFinal();
            }
            if(getNcc() >= 4 && getNcc() < 6){
                return true;
            }
        }
        return false;
    }

    public String getSituacao(){
        String string;

        if(getNcc() >= 6){
            string = "Aprovado";
        }else if(podeFazerIfa() && ifa == -1){
            string = "Instrumento Final de Avaliação";
        }else{
            string = "Reprovado";
        }

        return string;
    }

    @Override
    public String toString(){
        calcularNotaFinal();
        String string = String.format("Aluno: %s, Avaliação 1: %.2f, Avaliação 2: %.2f, NCC: %.2f, ", 
            nome,
            avaliacao1,
            avaliacao2,
            ncc);
        if(podeFazerIfa() && ifa != -1){
            string += String.format("IFA: %.2f, ", ifa);
        }
        string += "Situação: " + getSituacao();
        return string;
    }

    private void calcularNotaFinal(){
        if(ifa == -1)
            ncc = (avaliacao1 + avaliacao2) / 2;
    }    
}
