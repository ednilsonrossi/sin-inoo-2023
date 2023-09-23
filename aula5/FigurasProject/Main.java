package aula5.FigurasProject;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        Figura figura;
        String string;
        double value1, value2;

        do{
            string = lerTipoFigura();

            if(string.equals("Circulo")){
                value1 = lerInformacao("Digite o raio: ");
                figura = new Circulo(value1);
            }else if(string.equals("Quadrado")){
                value1 = lerInformacao("Digite o valor do lado: ");
                figura = new Quadrado(value1);
            }else{
                value1 = lerInformacao("Digite altura: ");
                value2 = lerInformacao("Digite largura:");
                figura = new Retangulo(value1, value2);
            }

            string = String.format("Figura é: %s\nÁrea: %f\nPerímetro: %f\n", 
            figura.toString(),
            figura.getArea(),
            figura.getPerimetro());

            JOptionPane.showMessageDialog(null, string, "Figuras em OO", JOptionPane.PLAIN_MESSAGE);

        }while(JOptionPane.showConfirmDialog(null, "Inserir nova figura?", "Quer continuar?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION);
    }

    public static double lerInformacao(String msg){
        String answer;
        String title = "Figuras em Orientação a Objetos";
        answer = JOptionPane.showInputDialog(null, 
        msg, 
        title, 
        JOptionPane.QUESTION_MESSAGE);

        double resultado = Double.parseDouble(answer);

        return resultado;
    }

    public static String lerTipoFigura(){
        Object tipos[] = {"Circulo", "Quadrado", "Retangulo"};

        String answer;
        String msg = "Qual a figura que deseja criar?";
        String title = "Figuras em Orientação a Objetos";

        answer = (String) JOptionPane.showInputDialog(null,
        msg,
        title,
        JOptionPane.QUESTION_MESSAGE,
        null,
        tipos,
        tipos[0]);

        return answer;
    }


}
