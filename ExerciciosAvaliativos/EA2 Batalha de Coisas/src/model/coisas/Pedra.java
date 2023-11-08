package model.coisas;

public class Pedra extends Coisa{

    @Override
    public ResultadoBatalha batalha(Coisa desafiante) {
        if(desafiante instanceof Pedra){
            return ResultadoBatalha.EMPATE;
        }else{
            if(desafiante instanceof Papel){
                return ResultadoBatalha.DERROTA;
            }else{
                return ResultadoBatalha.VITORIA;
            }
        }
    }
}
