package hw6_21000705_nguyenbathang.ex1.sortedarraypriorityqueue;

import hw6_21000705_nguyenbathang.ex1.interface_ex1.Entry;
import hw6_21000705_nguyenbathang.ex1.interface_ex1.PriorityQueueInterface;


public class SortedArrayPriorityQueue <K extends  Comparable<K>, E> implements PriorityQueueInterface<K, E> {
    protected class ArrEntry<K, E> implements Entry<K, E> {
        K key;
        E element;
        public ArrEntry (K k, E e) {
            this.key = k;
            this.element = e;
        }

        @Override
        public K getKey() {
            return this.key;
        }

        @Override
        public E getValue() {
            return this.element;
        }
    }

    private ArrEntry<K, E> [] array;
    private int n;
    private int defaultsize = 1000;

    public SortedArrayPriorityQueue() {
        array = new ArrEntry[defaultsize];
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
    public void insert(Entry entry) {
        int i = n-1;
        // find index
        while (i >= 0 && array[i].getKey().compareTo((K) entry.getKey()) > 0) {
            array[i+1] = array[i];
            i--;
        }

        // insert entry
        array[i+1] = (ArrEntry<K, E>) entry;
        n++;
    }

    @Override
    public void insert(K k, E e) {
        insert(new ArrEntry(k, e));
    }

    @Override
    public Entry removeMin() {
        if (isEmpty()) {
            return null;
        }

        Entry<K, E> min = array[0];

        for (int i = 1; i < n; i++) {
            array[i-1] = array[i];
        }
        n--;

        return min;
    }

    @Override
    public Entry min() {
        if (isEmpty()) {
            return null;
        }

        return array[0];
    }
}
