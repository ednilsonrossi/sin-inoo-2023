package Aula6.FilaObjectProject.model;

public class FilaCircular implements IFila{

    private Object elements[];
    private int startPosition;
    private int endPosition;
    private int maxSize;
    private int size;
    
    public FilaCircular(){
        maxSize = DEFAULT_MAXSIZE;
        init();
    }

    public FilaCircular(int size){
        this.maxSize = size > 0 ? size : DEFAULT_MAXSIZE;
        init();
    }

    private void init(){
        elements = new Object[maxSize];
        startPosition = -1;
        endPosition = -1;
        size = 0;
    }

    @Override
    public Object dequeue() {
        Object element = null;
        if(!isEmpty()){
            if(startPosition == maxSize - 1){
                startPosition = 0;
            }else{
                startPosition += 1;
            }
            element = elements[startPosition];
            size -= 1;
        }
        return element;
    }

    @Override
    public boolean enqueue(Object element) {
        boolean result = false;
        if(element != null && !isFull()){
            if(endPosition == maxSize - 1){
                endPosition = 0;
            }else{
                endPosition += 1;
            }
            elements[endPosition] = element;
            size += 1;
            result = true;
        }
        return result;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == maxSize;
    }
}
