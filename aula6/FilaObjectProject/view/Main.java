package Aula6.FilaObjectProject.view;

import Aula6.FilaObjectProject.model.FilaCircular;

public class Main {
    public static void main(String[] args) {
        FilaCircular fila = new FilaCircular();

        fila.enqueue("Sou uma String");
        fila.enqueue(10);
        fila.enqueue(10.4);
        fila.enqueue(new Main());
        
    }
}
