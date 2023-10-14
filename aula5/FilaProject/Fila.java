package aula5.FilaProject;


public interface Fila {
    
    public abstract boolean enqueue(Cliente cliente);

    Cliente dequeue();

    boolean isFull();

    boolean isEmpty();

}
