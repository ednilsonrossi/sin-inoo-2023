/**
 * CartaoWeb
 */
public abstract class CartaoWeb {

    private String destinatario;
    private String remetente;

    public CartaoWeb(String destinatario, String remetente){
        this.destinatario = destinatario;
        this.remetente = remetente;
    }

    public String showMessage(){
        String txt = destinatario + ", \n";
        txt += getMensagem() + "\n";
        txt += remetente + ".";
        return txt;
    }

    public abstract String getMensagem();
    
}