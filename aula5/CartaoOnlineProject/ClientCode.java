import javax.swing.JOptionPane;

public class ClientCode {
    public static void main(String[] args) {

        DiaDosNamorados namorados[] = new DiaDosNamorados[5];
        Natal natal[] = new Natal[5];
        Professor professor[] = new Professor[5];

        String titulo = "Sistema Cartões";
        Object tiposCartoes[] = {"Namorados", "Natal", "Professores"};
        String tipo, remetente, destinatario;

        int cNamorados, cNatal, cProfessor;
        int continuar, i;

        cNamorados = 0;
        cNatal = 0;
        cProfessor = 0;

        do{
            //Leitura dos 5 cartões
            for(i = 0; i != 5; i++){
                tipo = (String) JOptionPane.showInputDialog(null, "Qual cartão deseja criar?", titulo, JOptionPane.QUESTION_MESSAGE, null, tiposCartoes, "Namorados");
                remetente = JOptionPane.showInputDialog(null, "Nome do remetente", titulo, JOptionPane.QUESTION_MESSAGE);
                destinatario = JOptionPane.showInputDialog(null, "Nome do destinatário", titulo, JOptionPane.QUESTION_MESSAGE);

                if(tipo.equals("Namorados")){
                    namorados[cNamorados] = new DiaDosNamorados(destinatario, remetente);
                    cNamorados += 1;
                }else if(tipo.equals("Natal")){
                    natal[cNatal] = new Natal(destinatario, remetente);
                    cNatal += 1;
                }else if(tipo.equals("Professores")){
                    professor[cProfessor] = new Professor(destinatario, remetente);
                    cProfessor += 1;
                }
            }

            //Apresentar os 5 cartões
            i = 0;
            while(i < cNamorados){
                JOptionPane.showMessageDialog(null, namorados[i].showMessage(), titulo, JOptionPane.INFORMATION_MESSAGE);
                namorados[i] = null;
                i++;
            }
            cNamorados = 0;

            i = 0;
            while(i < cNatal){
                JOptionPane.showMessageDialog(null, natal[i].showMessage(), titulo, JOptionPane.INFORMATION_MESSAGE);
                natal[i] = null;
                i++;
            }
            cNatal = 0;
            
            i = 0;
            while(i < cProfessor){
                JOptionPane.showMessageDialog(null, professor[i].showMessage(), titulo, JOptionPane.INFORMATION_MESSAGE);
                professor[i] = null;
                i++;
            }
            cProfessor = 0;

            continuar = JOptionPane.showConfirmDialog(null, "Continuar a leitura de cartões?", titulo, JOptionPane.YES_NO_OPTION);
        }while(continuar == 0); 
    }
}
