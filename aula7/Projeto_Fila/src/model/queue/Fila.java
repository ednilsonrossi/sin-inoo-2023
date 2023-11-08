package model.queue;

import java.util.ArrayList;
import java.util.List;

public class Fila<T> implements IFila<T> {
    
    private List<T> elements;

    public Fila(){
        this(0);
    }

    public Fila(int initialSize){
        if(initialSize > 0)
            elements = new ArrayList<>(initialSize);
        else
            elements = new ArrayList<>();
    }

    @Override
    public T dequeue() {
        return elements.remove(0);
    }

    @Override
    public boolean enqueue(T element) {
        if(element != null){
            return elements.add(element);
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
