package model.Conjunto;

public class ArrayConjunto<T> implements IConjunto<T>{
    
    private static final int DEFAULT_SIZE = 5;
    private Object elements[];
    private int maxSize;
    private int size;

    public ArrayConjunto(){
        this.maxSize = DEFAULT_SIZE;
        init();
    }

    public ArrayConjunto(int initialValue){
        if(initialValue > 0){
            this.maxSize = initialValue;
        }else{
            this.maxSize = DEFAULT_SIZE;
        }
        init();
    }

    @Override
    public boolean add(T item) {
        boolean answer = false;
        if(item != null){
            if(size == maxSize){
                duplicateArray();
            }
            elements[size] = item;
            size += 1;
            answer = true;
        }
        return answer;
    }

    @Override
    public void clear() {
        for(int i=0; i < size; i++){
            elements[i] = null;
        }
        size = 0;
    }

    @Override
    public boolean contais(T item) {
        boolean exists = false;
        for(int i = 0; i < size && !exists; i++){
            if(elements[i].equals(item)){
                exists = true;
            }
        }
        return exists;
    }

    @Override
    public T get(int position) {
        Object item = null;
        if(position >= 0 && position < size){
            item = elements[position];
        }
        return (T) item;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T remove(int position) {
        Object item = null;
        if(position >= 0 && position < size){
            item = elements[position];
            deleteAt(position);
        }
        return (T) item;
    }

    @Override
    public boolean remove(T item) {
        int position = getPosition(item);
        if(position == -1){
            return false;
        }else{
            deleteAt(position);
            return true;
        }
    }

    @Override
    public int size() {
        return size;
    }

    private void init(){
        elements = new Object[maxSize];
        size = 0;
    }

    private void duplicateArray(){
        Object new_array[] = new Object[maxSize * 2];
        for(int i = 0; i < maxSize; i++){
            new_array[i] = elements[i];
        }
        maxSize *= 2;
        elements = new_array;
    }

    private int getPosition(T item){
        int position = -1;
        for(int i = 0; i < size && position == -1; i++){
            if(elements[i].equals(item)){
                position = i;
            }
        }
        return position;
    }

    private void deleteAt(int position){
        for(int i=position; i != size - 1; i++){
            elements[i] = elements[i+1];
        }
        size -= 1;
    }
}
