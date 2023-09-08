package ExercicioFixacao2.ProjetoConcurso;

import javax.swing.JOptionPane;

public class Concurso {
    
    public static void main(String[] args) {
        
        Candidato c1, c2, c3;
        Candidato primeiro, segundo, terceiro;

        c1 = leituraCandidato();
        c2 = leituraCandidato();
        c3 = leituraCandidato();

        if(c1.getNotaFinal() > c2.getNotaFinal() && c1.getNotaFinal() > c3.getNotaFinal()){
            primeiro = c1;
        }else if(c2.getNotaFinal() > c3.getNotaFinal()){
            primeiro = c2;
        }else{
            primeiro = c3;
        }

        if(c1.getNotaFinal() < c2.getNotaFinal() && c1.getNotaFinal() < c3.getNotaFinal()){
            terceiro = c1;
        }else if(c2.getNotaFinal() < c3.getNotaFinal()){
            terceiro = c2;
        }else{
            terceiro = c3;
        }

        if(c1 != primeiro && c1 != terceiro){
            segundo = c1;
        }else if(c2 != primeiro && c2 != terceiro){
            segundo = c2;
        }else{
            segundo = c3;
        }

        String output = "1º " + primeiro.toString() + "\n";
        output += "2º " + segundo.toString() + "\n";
        output += "3º " + terceiro.toString() + "\n";
        JOptionPane.showMessageDialog(null, output, "Classificação", 2);
    }

    public static Candidato leituraCandidato(){
        String nome, nota, titulo = "Sistema de Concurso";
        int n1, n2, n3;

        do{
            nome = JOptionPane.showInputDialog(null, "Nome do candidato:", titulo, 3);
        }while(nome.isEmpty());
        
        nota = JOptionPane.showInputDialog(null, "Nota fase teórica:", titulo, 3);
        n1 = Integer.valueOf(nota);

        nota = JOptionPane.showInputDialog(null, "Nota fase prática:", titulo, 3);
        n2 = Integer.valueOf(nota);

        nota = JOptionPane.showInputDialog(null, "Nota fase de entrevista:", titulo, 3);
        n3 = Integer.valueOf(nota);

        return new Candidato(nome, n1, n2, n3);
    }
}
