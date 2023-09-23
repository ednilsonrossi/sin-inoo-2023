package aula5.DialogosProject;

import javax.swing.JOptionPane;

public class Entrada3 {
    public static void main(String[] args) {
        String answer;
        String msg = "Qual conteúdo mais simples da aula?";
        String title = "Aula de OO";

        Object opcoes[] = {"Encapsulamento", "Herança", "Polimorfismo", "Abstração"};

        answer = (String) JOptionPane.showInputDialog(null,
        msg,
        title,
        JOptionPane.QUESTION_MESSAGE,
        null,
        opcoes,
        opcoes[2]);

        System.out.printf("Opção: %s\n", answer);
    }
}
