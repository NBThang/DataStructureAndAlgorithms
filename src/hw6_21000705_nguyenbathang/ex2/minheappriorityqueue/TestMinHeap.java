package hw6_21000705_nguyenbathang.ex2.minheappriorityqueue;

public class TestMinHeap {
    public static void main(String[] args) {
        SortedArrayPriorityQueue minHeapPriorityQueue = new MinHeapPriorityQueue<Integer, Integer>();
        minHeapPriorityQueue.insert(1, 3);
        minHeapPriorityQueue.insert(7, 5);
        minHeapPriorityQueue.insert(2, 7);
        minHeapPriorityQueue.insert(9, 2);
        minHeapPriorityQueue.insert(4, 4);
        minHeapPriorityQueue.insert(6, 100);

        System.out.print("min = " + minHeapPriorityQueue.removeMin().getKey() + ":" + minHeapPriorityQueue.removeMin().getValue());

    }
}
