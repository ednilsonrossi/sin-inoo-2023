package aula5.DialogosProject;

import javax.swing.JOptionPane;

public class Entrada2 {
    public static void main(String[] args) {
        String answer;
        String msg = "Qual a melhor aula da semana?";
        String title = "Java";

        answer = JOptionPane.showInputDialog(null, 
        msg,
        title,
        JOptionPane.QUESTION_MESSAGE);

        System.out.println(answer);
    }
}
