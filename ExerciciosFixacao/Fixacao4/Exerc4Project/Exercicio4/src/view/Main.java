package view;

import model.Animal;
import model.Cachorro;
import model.Gato;

public class Main {
    public static void main(String[] args) {
        Animal animais[] = new Animal[3];

        animais[0] = new Cachorro("Snoopy");
        animais[1] = new Gato("Garfield");
        animais[2] = new Gato("Manda-Chuva");

        for(Animal a : animais){
            System.out.println(a.emiteSom());
        }
    }
}