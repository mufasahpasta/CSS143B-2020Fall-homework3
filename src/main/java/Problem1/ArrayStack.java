package Problem1;

public class ArrayStack<T> implements Stack<T> {
    // do not change member variables
    private T[] data;
    private int size;

    private ArrayStack() {
    }

    public ArrayStack(int capacity) {
        data = (T[]) new Object[capacity];
        size = 0;
    }

    @Override
    public boolean push(T val) {
        // homework
        if (size < data.length) {
            data[size] = val;
            size++;
            return true;
        }
        return false;
    }

    @Override
    public T pop() {
        T val = null;   // place holder
        if (size != 0) {
            val = data[size - 1];
            data[size - 1] = null;
            size--;
        }
        return val;
    }

    @Override
    public T peek() {
        T val = null;   // place holder
        if (size != 0) {
            val = data[size - 1];
        }
        return val;   // place holder
    }

    @Override
    public int size() {
        return size;
    }
}
