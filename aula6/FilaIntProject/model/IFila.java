package Aula6.FilaIntProject.model;

public interface IFila {
    int DEFAULT_MAXSIZE = 100;

    boolean isFull();

    boolean isEmpty();

    boolean enqueue(Integer element);

    Integer dequeue();
}
