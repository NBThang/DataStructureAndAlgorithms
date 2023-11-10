package hw6_21000705_nguyenbathang.ex2.minheappriorityqueue;

import hw6_21000705_nguyenbathang.ex1.interface_ex1.Entry;
import hw6_21000705_nguyenbathang.ex1.sortedarraypriorityqueue.SortedArrayPriorityQueue;

public class MinHeapPriorityQueue <K extends Comparable<K>, E> extends SortedArrayPriorityQueue<K, E> {
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
    private ArrEntry<K, E>[] heapPQ;
    private int defaultsize = 1000;

    public MinHeapPriorityQueue() {
        this.heapPQ = new ArrEntry[defaultsize];
    }

    @Override
    public void insert(Entry entry) {
        if (isEmpty()) {
            return;
        }

        

    }
    protected void upHeap(int index){
        int parent = (index - 1) / 2;
        while (index > 0 & heapPQ[index].getKey().compareTo(heapPQ[parent].getKey()) > 0) {
            swap(index, parent);
            index = parent;
            parent = (index - 1) / 2;
        }
    }

//    protected void downHeap(){
//
//    }
    private void swap(int idx1, int idx2) {
        ArrEntry<K, E> temp = heapPQ[idx1];
        heapPQ[idx1] = heapPQ[idx2];
        heapPQ[idx2] = temp;
    }

    public void print() {
        for (int i = 0; i < this.size(); i++) {
            System.out.print(heapPQ[i].getValue() + " ");
        }
        System.out.println();
    }
}
