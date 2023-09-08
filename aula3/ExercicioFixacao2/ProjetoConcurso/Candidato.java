package ExercicioFixacao2.ProjetoConcurso;

public class Candidato {
    private String nome;
    private int teorica;
    private int pratica;
    private int entrevista;

    public Candidato(String nome) {
        if(nome != null){
            this.nome = nome;
        }
        teorica = 0;
        pratica = 0;
        entrevista = 0;
    }

    public Candidato(String nome, int teorica, int pratica, int entrevista) {
        this.nome = nome;
        setTeorica(teorica);
        setPratica(pratica);
        setEntrevista(entrevista);
    }

    public int getTeorica() {
        return teorica;
    }

    public void setTeorica(int teorica) {
        this.teorica = isNotaValida(teorica) ? teorica : 0;
    }

    public int getPratica() {
        return pratica;
    }

    public void setPratica(int pratica) {
        this.pratica = isNotaValida(pratica) ? pratica : 0;
    }

    public int getEntrevista() {
        return entrevista;
    }

    public void setEntrevista(int entrevista) {
        this.entrevista = isNotaValida(entrevista) ? entrevista : 0;
    }

    public double getNotaFinal(){
        return teorica * 0.3 + pratica * 0.4 + entrevista * 0.3;
    }

    @Override
    public String toString() {
        return String.format("%s - Nota Final: %.2f. {Teorica: %d, Pratica: %d, Enttrevista: %d}", nome, getNotaFinal(), teorica, pratica, entrevista); 
    }

    private boolean isNotaValida(int nota){
        return nota >= 0 && nota <= 100;
    }    

    
}
