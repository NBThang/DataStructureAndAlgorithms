package hw4_21000705_nguyenbathang.ex2.buildstackusingarray;

import java.util.Iterator;

public class BuildStackUsingArray<E> implements StackInterface<E>{
    private static final int CAPACITY = 1000;
    private E[] data;
    private int indexTop = -1;
    public BuildStackUsingArray() {
        data = (E[]) new Object[CAPACITY];
    }
    @Override
    public void push(E element) throws IllegalAccessException {
        if (indexTop == CAPACITY - 1) {
            throw new IllegalAccessException("stack full");
        }
        data[++indexTop] = element;
    }

    @Override
    public E pop() throws IllegalAccessException {
        if (isEmpty()) {
            throw new IllegalAccessException("stack null");
        }
        E answer = data[indexTop];
        data[indexTop] = null;
        indexTop--;
        return answer;
    }

    @Override
    public boolean isEmpty() {
        return indexTop == -1;
    }

    @Override
    public E top() throws IllegalAccessException {
        if (isEmpty()) {
            throw new IllegalAccessException("stack null");
        }
        return data[indexTop];
    }

    @Override
    public Iterator iterator() {
        return new StackIterator();
    }
    private class StackIterator implements Iterator<E> {
        private int index;

        public StackIterator() {
            index = indexTop;
        }

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public E next() {
            return data[index--];
        }
    }
}
