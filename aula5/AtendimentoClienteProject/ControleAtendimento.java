package aula5.AtendimentoClienteProject;

public class ControleAtendimento {

    private Fila filaNormal;
    private Fila filaPrioritaria;

    
    public ControleAtendimento(){
        filaNormal = new FilaCircular(100);
        filaPrioritaria = new FilaCircular();
    }

    
    public String gerarSenha(boolean preferencial){
        String msg;
        Cliente c = new Cliente(preferencial);
        if(c.isPrioritario()){
            if(filaPrioritaria.enqueue(c)){
                msg = "Senha: " + c.toString();
            }else{
                msg = "Não há espaço na fila preferencial. Volte mais tarde.";
            }
        }else{
            if(filaNormal.enqueue(c)){
                msg = "Senha: " + c.toString();
            }else{
                msg = "Não há espaço na fila normal. Volte mais tarde.";
            }
        }
        return msg;
    }


    public String chamarSenha(Guiche guiche){
        String msg;
        Cliente c = null;
        if(guiche instanceof GuichePreferencial){
            c = filaPrioritaria.dequeue();
        }
        if(c == null){
            c = filaNormal.dequeue();
        }
        if(c == null){
            msg = "Não existem clientes na fila.";
        }else{
            msg = String.format("Senha: %s\ndirija-se ao\n Guichê n.º %d", c.toString(), guiche.getNumero());
        }
        return msg;
    }
}
