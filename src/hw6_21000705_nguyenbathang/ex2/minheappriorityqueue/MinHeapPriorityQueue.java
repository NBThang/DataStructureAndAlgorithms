package hw6_21000705_nguyenbathang.ex2.minheappriorityqueue;

import hw6_21000705_nguyenbathang.ex1.interface_ex1.Entry;

import java.util.Arrays;
public class MinHeapPriorityQueue<K extends Comparable ,E> extends SortedArrayPriorityQueue<K, E> {
    private ArrEntry<K ,E>[] heapPQ;
    private int n ;
    private int defaultsize = 1000;

    public MinHeapPriorityQueue() {
        this.heapPQ = (ArrEntry<K, E>[]) new ArrEntry[defaultsize];
        this.n = 0;
    }

    protected void upHeap(int i){
        int parent = (i - 1) / 2;
        while (i > 0 && heapPQ[i].getKey().compareTo(heapPQ[parent].getKey()) < 0) {
            swapByIndex(i, parent);
            i = parent;
            parent = (i - 1) / 2;
        }
    }
    protected void downHeap(int i){
        while (true) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int smallest = i;
            if (left < size() && heapPQ[left].getKey().compareTo(heapPQ[smallest].getKey()) < 0) {
                smallest = left;
            }
            if (right < size() && heapPQ[right].getKey().compareTo(heapPQ[smallest].getKey()) < 0) {
                smallest = right;
            }
            if (smallest == i) {
                break;
            }
            swapByIndex(i, smallest);
            i = smallest;
        }
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
        if(isEmpty()){
            heapPQ[0] = (ArrEntry<K ,E>) entry;
            n++;
            return;
        }
        if (n >= heapPQ.length) {
            heapPQ = Arrays.copyOf(heapPQ, heapPQ.length * 2);
        }

        heapPQ[n] = (ArrEntry<K, E>) entry;
        n++;

        upHeap(size() - 1);
    }

    @Override
    public void insert(K k, E e) {
        insert(new ArrEntry<>(k ,e));
    }

    @Override
    public Entry<K, E> removeMin() {
        if (isEmpty()) {
            return null;
        }

        ArrEntry<K, E> min = heapPQ[0];

        if (n > 0) {
            heapPQ[0] = heapPQ[n - 1];
            downHeap(0);
        }

        heapPQ[n] = null;
        n--;

        return min;
    }

    @Override
    public Entry<K, E> min() {
        return heapPQ[1];
    }

    private void swapByIndex(int i, int j) {
        ArrEntry temp = heapPQ[i];
        heapPQ[i] = heapPQ[j];
        heapPQ[j] = temp;
    }
}
