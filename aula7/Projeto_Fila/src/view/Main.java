package view;

import model.queue.Fila;
import model.queue.IFila;

public class Main {
    
    public static void main(String[] args) {
        IFila<Integer> inteiros = new Fila<>(5);

        System.out.println(inteiros.enqueue(5));
        System.out.println(inteiros.enqueue(10));
        System.out.println(inteiros.enqueue(15));
        System.out.println(inteiros.enqueue(20));
        System.out.println(inteiros.enqueue(25));
        System.out.println(inteiros.enqueue(30));
        System.out.println("Dequeue: " + inteiros.dequeue());
        System.out.println(inteiros.enqueue(35));
        System.out.println("Dequeue: " + inteiros.dequeue());
        System.out.println("Dequeue: " + inteiros.dequeue());
        System.out.println("Dequeue: " + inteiros.dequeue());
    }
}
