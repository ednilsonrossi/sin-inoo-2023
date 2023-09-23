package aula5.DialogosProject;

import javax.swing.JOptionPane;

public class Entrada {
    public static void main(String[] args) {
        String answer;
        String msg = "Qual a melhor aula da semana?";
        String textoInicial = "Java";

        do{
            answer = JOptionPane.showInputDialog(null, msg, textoInicial);
        }while(!answer.equals("Java"));
    }
}
