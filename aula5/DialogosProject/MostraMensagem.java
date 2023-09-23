package aula5.DialogosProject;

import javax.swing.JOptionPane;

public class MostraMensagem {
    public static void main(String[] args) {
        String titulo = "Aula de Java";
        String mensagem = "Essa aula é de Orientação a Objetos.";

        JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.QUESTION_MESSAGE);
    }
}
