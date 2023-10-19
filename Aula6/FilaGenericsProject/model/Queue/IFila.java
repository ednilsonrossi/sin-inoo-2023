package Aula6.FilaGenericsProject.model.Queue;

public interface IFila<T> {
    int DEFAULT_MAXSIZE = 100;

    boolean isFull();

    boolean isEmpty();

    boolean enqueue(T element);

    T dequeue();
}
