package aula5.AtendimentoClienteProject;

public abstract class Fila {
    
    public abstract boolean enqueue(Cliente cliente);

    public abstract Cliente dequeue();

    public abstract boolean isFull();

    public abstract boolean isEmpty();

}
