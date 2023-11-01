package model.queue;

public interface IFila<T> {
    
    boolean enqueue(T element);

    T dequeue();

    boolean isEmpty();

    boolean isFull();
}
