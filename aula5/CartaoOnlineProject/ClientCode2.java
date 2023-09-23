import javax.swing.JOptionPane;

public class ClientCode2 {
    public static void main(String[] args) {
        CartaoWeb cartoes[] = new CartaoWeb[5];

        String titulo = "Sistema Cartões";
        Object tiposCartoes[] = {"Namorados", "Natal", "Professores"};
        String tipo, remetente, destinatario;
        int continuar, i;

        do{
            //Leitura dos 5 cartões
            for(i = 0; i != 5; i++){
                tipo = (String) JOptionPane.showInputDialog(null, "Qual cartão deseja criar?", titulo, JOptionPane.QUESTION_MESSAGE, null, tiposCartoes, "Namorados");
                remetente = JOptionPane.showInputDialog(null, "Nome do remetente", titulo, JOptionPane.QUESTION_MESSAGE);
                destinatario = JOptionPane.showInputDialog(null, "Nome do destinatário", titulo, JOptionPane.QUESTION_MESSAGE);

                if(tipo.equals("Namorados")){
                    cartoes[i] = new DiaDosNamorados(destinatario, remetente);
                }else if(tipo.equals("Natal")){
                    cartoes[i] = new Natal(destinatario, remetente);
                }else if(tipo.equals("Professores")){
                    cartoes[i] = new Professor(destinatario, remetente);
                }
            }

            //Apresentar os 5 cartões
            for(i = 0; i != 5; i++){
                JOptionPane.showMessageDialog(null, 
                cartoes[i].showMessage(), titulo, JOptionPane.INFORMATION_MESSAGE);
            }

            continuar = JOptionPane.showConfirmDialog(null, "Continuar a leitura de cartões?", titulo, JOptionPane.YES_NO_OPTION);
        }while(continuar == 0); 
    }
}
