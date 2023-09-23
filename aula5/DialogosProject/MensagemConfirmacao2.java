package aula5.DialogosProject;

import javax.swing.JOptionPane;

public class MensagemConfirmacao2 {
    public static void main(String[] args) {
        int answer;
        String msg = "Você gosta da aula de Orientação a Objetos?";
        String title = "Aula de Java";

        answer = JOptionPane.showConfirmDialog(
            null, msg, title,
            JOptionPane.YES_NO_CANCEL_OPTION);
        
        answer = JOptionPane.showConfirmDialog(
            null, msg, title,
            JOptionPane.YES_NO_OPTION);
        
        answer = JOptionPane.showConfirmDialog(
            null, msg, title,
            JOptionPane.YES_OPTION);
    }
}
