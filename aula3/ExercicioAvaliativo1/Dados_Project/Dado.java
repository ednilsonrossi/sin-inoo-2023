package aula3.ExercicioAvaliativo1.Dados_Project;

import java.util.Random;

public class Dado {
    
    private int face;
    private Random random;

    public Dado(){
        random = new Random();
        sortear();
    }

    private void sortear(){
        face = random.nextInt(6) + 1;
    }    

    public int getFace(){
        return face;
    }

    public void jogar(){
        sortear();
    }
}
