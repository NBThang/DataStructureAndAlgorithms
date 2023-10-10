package hw3_21000705_nguyenbathang.ex2.simplearraylist;

import java.util.Iterator;

public class SimpleArrayList<T> implements ListInterface<T>{
    private T[] array;
    private int n = 0;
    private int defaultSize = 100;

    public SimpleArrayList() {
        array = (T[]) new Object[defaultSize];
    }

    public SimpleArrayList(int capacity) {
        array = (T[]) new Object[capacity];
    }
    @Override
    public void add(T data) {
        if (array.length == n) {
            enlarge();
        }

        array[n] = data;
        n++;
    }

    @Override
    public T get(int i) {
        if (i < 0 || i >= n) {
            throw new IndexOutOfBoundsException();
        } else {
            return array[i];
        }
    }

    @Override
    public void set(int i, T data) {
        if (i < 0 || i >= n) {
            throw new IndexOutOfBoundsException();
        } else {
            array[i] = data;
        }
    }

    @Override
    public void remove(T data) {
        int indexRemove = 0;
        for (int i = 0; i < n; i ++) {
            if (array[i].equals(data)) {
                removeByIndex(i);
            }
        }
    }

    private void removeByIndex(int index) {
        if (index < 0 || index >= n) {
            throw new IndexOutOfBoundsException();
        }

        for (int i = index; i < n - 1; i++) {
            array[i] = array[i + 1];
        }
        array[n - 1] = null;
        n--;
    }

    @Override
    public boolean isContain(T data) {
        for (int i = 0; i < n; i++) {
            if (array[i].equals(data)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < n;
            }

            @Override
            public T next() {
                return array[currentIndex++];
            }
        };
    }

    public void enlarge() {
        T[] tempArray = (T[]) new Object[array.length *2];
        System.arraycopy(array, 0, tempArray,0,array.length);
        array = tempArray;
    }
}
