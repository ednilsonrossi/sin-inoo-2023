package aula5.AtendimentoClienteProject;

import javax.swing.JOptionPane;

public class ClienteCode {

    public static final String TITULO = "Controle de Atendimento INOO";

    public static void main(String[] args) {

        ControleAtendimento controle = new ControleAtendimento();
        String saida = "";
        int opcao;

        do{
            opcao = menu();
            switch(opcao){
                case 1:
                    saida = controle.gerarSenha(false);
                    break;

                case 2:
                    saida = controle.gerarSenha(true);
                    break;
                
                case 3:
                    Guiche guiche = lerGuiche();
                    saida = controle.chamarSenha(guiche);
                    break;

                default:
                    saida = "Obrigado por utilizar um sistema INOO";
            }
            mostraMensagem(saida);
        }while(opcao != 0);

    }


    public static int menu(){
        Object menuOpcoes[] = {"Nova senha normal", "Nova senha preferencial", "Chamar senha", "Encerrar o sistema"};
        String resposta;

        resposta = (String) JOptionPane.showInputDialog(null, 
            "Selecione uma opção no menu.",
            TITULO,
            JOptionPane.QUESTION_MESSAGE,
            null,
            menuOpcoes,
            menuOpcoes[3]
        );

        if(resposta.equals(menuOpcoes[0])){
            return 1;
        }else if(resposta.equals(menuOpcoes[1])){
            return 2;
        }else if(resposta.equals(menuOpcoes[2])){
            return 3;
        }else{
            return 0;
        }
    }

    public static Guiche lerGuiche(){
        String entrada;

        entrada = JOptionPane.showInputDialog(null, 
            "Número go Guichê:",
            TITULO,
            JOptionPane.QUESTION_MESSAGE);

        int numero = Integer.parseInt(entrada);

        int tipo = JOptionPane.showConfirmDialog(null,
            "É um guichê de atendimento preferencial/",
            TITULO,
            JOptionPane.YES_NO_OPTION);

        if(tipo == 0){
            return new GuichePreferencial(numero);
        }else{
            return new Guiche(numero);
        }
    }

    public static void mostraMensagem(String mensagem){
        JOptionPane.showMessageDialog(null, 
            mensagem, 
            TITULO,
            JOptionPane.INFORMATION_MESSAGE);
    }
}
