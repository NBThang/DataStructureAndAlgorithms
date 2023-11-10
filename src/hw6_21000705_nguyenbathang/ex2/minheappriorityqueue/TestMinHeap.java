package hw6_21000705_nguyenbathang.ex2.minheappriorityqueue;

public class TestMinHeap {
    public static void main(String[] args) {
        MinHeapPriorityQueue<Integer, Integer> minHeapPriorityQueue = new MinHeapPriorityQueue<>();
        minHeapPriorityQueue.insert(1, 3);
        minHeapPriorityQueue.insert(2, 5);
        minHeapPriorityQueue.insert(3, 7);
        minHeapPriorityQueue.insert(4, 2);
        minHeapPriorityQueue.insert(5, 4);

//        minHeapPriorityQueue.print();

        minHeapPriorityQueue.upHeap(3);

//        minHeapPriorityQueue.print();
    }
}
