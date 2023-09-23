package aula5.DialogosProject;

import javax.swing.JOptionPane;

public class Option {
    public static void main(String[] args) {
        int answer;
        String msg = "Você gosta da aula de Orientação a Objetos?";
        String title = "Aula de OO";

        Object opcoes[] = {"Sim, eu gosto.", "Sim, adoro!", "Melhor não opinar."};

        answer = JOptionPane.showOptionDialog(null,
        msg,
        title,
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        opcoes,
        opcoes[1]);

        System.out.printf("Opção: %s\n", answer);
    }
}
