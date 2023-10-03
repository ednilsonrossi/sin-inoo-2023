package aula5.AtendimentoClienteProject;

public class Cliente {

    private static int ultima_senha = 0;

    private int senha;
    private boolean ehPrioritario;


    public Cliente(){
        updateUltimaSenha();
        senha = ultima_senha;
        ehPrioritario = false;
    }

    public Cliente(boolean ehPrioritario){
        updateUltimaSenha();
        senha = ultima_senha;
        this.ehPrioritario = ehPrioritario;
    }

    private void updateUltimaSenha(){
        ultima_senha += 1;
    }

    public int getSenha(){
        return senha;
    }

    public boolean isPrioritario(){
        return ehPrioritario;
    }

    @Override
    public String toString() {
        String msg;
        if(ehPrioritario){
            msg = "P-"; 
        }else{
            msg = "C-";
        }
        if(senha < 10){
            msg += "00" + getSenha();
        }else{
            if(senha < 100){
                msg += "0" + getSenha();
            }
        }
        return msg;
    }
    
}
