package HomeWorkGB;

import java.util.ArrayList;

public class MyQueue<T>{
    private ArrayList<T> arr = new ArrayList<T>(10);
    private int size = 0;

    public int length() {
        return size;
    }

    public void enqueue(T el) {
        if (size == arr.size()){
            ArrayList<T> arr2 = new ArrayList<T>(arr.size() + 10);
            arr2.addAll(0, arr);
            arr = arr2;
        }
        arr.add(size++, el);
    }

    public T dequeue() {
        return arr.remove(0);
    }
}
