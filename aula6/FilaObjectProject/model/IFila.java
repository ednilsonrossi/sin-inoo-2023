package Aula6.FilaObjectProject.model;

public interface IFila {
    int DEFAULT_MAXSIZE = 100;

    boolean isFull();

    boolean isEmpty();

    boolean enqueue(Object element);

    Object dequeue();
}
