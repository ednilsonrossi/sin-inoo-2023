package model.coisas;

public class Papel extends Coisa{
    @Override
    public ResultadoBatalha batalha(Coisa desafiante) {
        if (desafiante instanceof Papel)
            return ResultadoBatalha.EMPATE;
        else if (desafiante instanceof Tesousa)
            return ResultadoBatalha.DERROTA;
        else
            return ResultadoBatalha.VITORIA;
    }
}
