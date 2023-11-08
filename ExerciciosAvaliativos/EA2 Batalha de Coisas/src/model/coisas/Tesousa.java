package model.coisas;

public class Tesousa extends Coisa{
    @Override
    public ResultadoBatalha batalha(Coisa desafiante) {
        if(desafiante instanceof Papel)
            return ResultadoBatalha.VITORIA;
        else if (desafiante instanceof Pedra)
            return ResultadoBatalha.DERROTA;
        else
            return ResultadoBatalha.EMPATE;
    }
}
