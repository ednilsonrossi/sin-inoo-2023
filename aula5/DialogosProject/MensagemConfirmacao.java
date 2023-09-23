package aula5.DialogosProject;

import javax.swing.JOptionPane;

public class MensagemConfirmacao {
    public static void main(String[] args) {
        int answer;
        String msg = "Você gosta da aula de Orientação a Objetos?";
        String title = "Aula de Java";

        do{
            answer = JOptionPane.showConfirmDialog(null, msg);
        }while(answer != 2);
        // 0 -> Sim
        // 1 -> Não
        // 2 -> Cancelar
    }
}
