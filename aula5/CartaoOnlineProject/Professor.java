public class Professor extends CartaoWeb{
    
    private String mensagem;

    public Professor(String destinatario, String remetente) {
        super(destinatario, remetente);
        mensagem = "Educar é ser um artesão da personalidade, um poeta da inteligência, um semeador de ideias. (Augusto Cury)\n Feliz dia dos professores.";
    }

    @Override
    public String getMensagem() {
        return mensagem;
    }
}
