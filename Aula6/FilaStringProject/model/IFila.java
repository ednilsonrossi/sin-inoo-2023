package Aula6.FilaStringProject.model;

public interface IFila {
    int DEFAULT_MAXSIZE = 100;

    boolean isFull();

    boolean isEmpty();

    boolean enqueue(String element);

    String dequeue();
}
