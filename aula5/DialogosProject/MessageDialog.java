package aula5.DialogosProject;

import javax.swing.JOptionPane;

public class MessageDialog {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, 
        "Mensagem simples.");

        JOptionPane.showMessageDialog(null, 
        "Mensagem sem icone ao lado", 
        "Aqui é somente texto", 
        JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(null, 
        "Mensagem Completa", 
        "Completa tem título!", 
        JOptionPane.WARNING_MESSAGE);
    }
}
