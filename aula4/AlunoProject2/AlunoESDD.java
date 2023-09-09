package aula4.AlunoProject2;


public class AlunoESDD extends Aluno{
    
    private double avaliacao3;
    private double notaFinal;

    public AlunoESDD(String nome, double avaliacao1, double avaliacao2, double avaliacao3) {
        super(nome, avaliacao1, avaliacao2);
        setAvaliacao3(avaliacao3);
        notaFinal = -1;
    }

    public double getAvaliacao3() {
        return avaliacao3;
    }

    public void setAvaliacao3(double avaliacao3) {
        this.avaliacao3 = avaliacao3 >= 0 && avaliacao3 <= 10 ? avaliacao3 : 0;
    }

    private void calcularNotaFinal(){
        if(getIfa() == -1)
            notaFinal = (getAvaliacao1() + getAvaliacao2() + avaliacao3) / 3;
    }

    @Override
    public void setIfa(double ifa){
        super.setIfa(ifa);
        if(getIfa() > getNcc()){
            notaFinal = getIfa();
        }
    }

    @Override
    public double getNcc() {
        calcularNotaFinal();
        return notaFinal;
    }
    
    @Override
    public String toString(){
        calcularNotaFinal();
        String string = String.format("Aluno: %s, Avaliação 1: %.2f, Avaliação 2: %.2f, Avaliação 3: %.2f, NCC: %.2f, ", 
            getNome(),
            getAvaliacao1(),
            getAvaliacao2(),
            getAvaliacao3(),
            getNcc());
        if(podeFazerIfa() && getIfa() != -1){
            string += String.format("IFA: %.2f, ", getIfa());
        }
        string += "Situação: " + getSituacao();
        return string;
    }
    
}
