package 栈和队列;

import java.util.Arrays;

public class MyStack {
    private int[] elem;
    private int usedSize;

    private static final int DEFAULT_CAPACITY = 10;
    public MyStack() {
        this.elem = new int[DEFAULT_CAPACITY];
    }

    public void push(int val) {
        if (isFull()) {
            elem = Arrays.copyOf(elem, elem.length*2);
        }
        this.elem[this.usedSize] = val;
        this.usedSize++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyException();
        }
        usedSize--;
        return this.elem[usedSize];
    }

    public int peek() {
        return this.elem[usedSize-1];
    }

    public boolean isEmpty() {
        return this.usedSize == 0;
    }

    private boolean isFull() {
        return this.usedSize == elem.length;
    }
}
