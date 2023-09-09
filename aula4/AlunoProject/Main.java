package aula4.AlunoProject;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        Aluno arrayAlunos[] = new Aluno[5];

        for(int i = 0; i != 5; i++){
            arrayAlunos[i] = lerAluno();
        }

        System.out.println("Alunos de IFA:");
        for(int i = 0; i != 5; i++){
            if(arrayAlunos[i].podeFazerIfa()){
                System.out.println(arrayAlunos[i].toString());
            }
        }

        JOptionPane.showConfirmDialog(null, "Vamos atualizar as notas dos IFA.", "Notas de IFA", 1);
        for(int i = 0; i != 5; i++){
            if(arrayAlunos[i].podeFazerIfa()){
                atualizarIfa(arrayAlunos[i]);
            }
        }

        System.out.println("Relatório final");
        for(int i = 0; i != 5; i++){
            System.out.println(arrayAlunos[i].toString());
        }

    }

    public static Aluno lerAluno(){
        String nome, n1, n2;
        double nota1, nota2;

        nome = JOptionPane.showInputDialog(null, "Nome do aluno:", "Calculo de notas", 2);
        n1 = JOptionPane.showInputDialog(null, "Avaliação 1", "Calculo de notas", 2);
        n2 = JOptionPane.showInputDialog(null, "Avaliação 2", "Calculo de notas", 2);

        nota1 = Double.parseDouble(n1);
        nota2 = Double.parseDouble(n2);

        return new Aluno(nome, nota1, nota2);
    }

    public static void atualizarIfa(Aluno aluno){
        String nota;
        double n;
        nota = JOptionPane.showInputDialog(null, "Instrumento Final de Avaliacao", "Atualizar " + aluno.getNome(), 2);
        n = Double.parseDouble(nota);
        aluno.setIfa(n);
    }
}
