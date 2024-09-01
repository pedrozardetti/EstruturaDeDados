package br.com.tad.PilhaEstatica;

public class Stack<T> {
    private T[] stack;
    private int topo;

    public Stack(int maxSize) {
        this.stack = (T[]) new Object[maxSize];
        this.topo = -1;
    }

    public Stack() {
        this.stack = (T[]) new Object[5];
    }

    public boolean isEmpty() {
        if (topo == -1) {
            return true;
        }

        return false;
    }

    private boolean isFull() {
        if (topo == stack.length - 1) {
            return true;
        }

        return false;
    }

    public void push(T element) {
        if (isFull()) {
            grow();
        }
        topo++;
        stack[topo] = element;

    }

    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return stack[topo];
        }
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        } else {
            T elemento;
            elemento = stack[topo];
            topo--;
            return elemento;
        }

    }

    public String toString() {
        StringBuilder aux = new StringBuilder();


        aux.append("[");
        for (int i = 0; i < topo; i++) {
            aux.append(stack[i]);

            if (i < topo) {
                aux.append(", ");
            }
        }
        aux.append("]");
        return aux.toString();
    }

    public void grow() {
        T[] newStack = (T[]) new Object[stack.length * 2];
        for (int i = 0; i < topo; i++) {
            newStack[i] = stack[i];

        }


        stack = newStack;
    }
}
