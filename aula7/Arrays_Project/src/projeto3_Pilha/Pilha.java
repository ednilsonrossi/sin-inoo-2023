package projeto3_Pilha;

public class Pilha<T> {
    private final int DEFAULT_SIZE = 5;
    private Object elements[];
    private int top;

    public Pilha(int size){
        if(size < 1){
            size = DEFAULT_SIZE;
        }
        elements = new Object[size];
        top = 0;
    }

    public boolean isFull(){
        return top == elements.length;
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public boolean enqueue(T item){
        if(item != null){
            if(!isFull()){
                elements[top] = item;
                top += 1;
                return true;
            }
        }
        return false;
    }

    public T dequeue(){
        Object item = null;
        if(!isEmpty()){
            top -= 1;
            item = elements[top];
        }
        return (T) item;
    }

    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<>(3);
        pilha.enqueue("String 1");
        pilha.enqueue("String 2");
        pilha.enqueue("String 3");

        while(!pilha.isEmpty()){
            System.out.println(pilha.dequeue());
        }
    }
}
