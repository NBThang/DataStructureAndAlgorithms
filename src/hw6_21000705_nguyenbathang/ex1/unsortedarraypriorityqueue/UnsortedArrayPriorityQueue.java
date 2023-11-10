package hw6_21000705_nguyenbathang.ex1.unsortedarraypriorityqueue;

import hw6_21000705_nguyenbathang.ex1.interface_ex1.Entry;
import hw6_21000705_nguyenbathang.ex1.interface_ex1.PriorityQueueInterface;

public class UnsortedArrayPriorityQueue <K extends  Comparable<K>, E> implements PriorityQueueInterface<K, E> {

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
    private int n = 0;
    private int defaultsize = 1000;

    public UnsortedArrayPriorityQueue() {
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
        array[n] = (ArrEntry<K, E>) entry;
        n++;
    }

    @Override
    public void insert(K k, E e) {
        insert(new ArrEntry<>(k, e));
    }

    @Override
    public Entry removeMin() {
        if (isEmpty()) {
            return null;
        }

        // find min index
        int minIdx = 0;
        for (int i = 1; i < n; i++) {
            if (array[i].getKey().compareTo(array[minIdx].getKey()) < 0) {
                minIdx = i;
            }
        }

        // remove
        Entry<K, E> entry = array[minIdx];
        array[minIdx] = array[n - 1];
        array[n - 1] = null;
        n--;

        return entry;
    }

    @Override
    public Entry min() {
        if (isEmpty()) {
            return null;
        }

        int minIdx = 0;
        for (int i = 1; i < n; i++) {
            if (array[i].getKey().compareTo(array[minIdx].getKey()) < 0) {
                minIdx = i;
            }
        }

        return array[minIdx];
    }
}
