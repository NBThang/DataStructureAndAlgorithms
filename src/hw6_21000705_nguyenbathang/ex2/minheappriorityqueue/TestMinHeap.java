package hw6_21000705_nguyenbathang.ex2.minheappriorityqueue;

public class TestMinHeap {
    public static void main(String[] args) {
        SortedArrayPriorityQueue<Integer, String> minHeapPriorityQueue = new MinHeapPriorityQueue<>();
        minHeapPriorityQueue.insert(1, "thang");
        minHeapPriorityQueue.insert(7, "tuan");
        minHeapPriorityQueue.insert(2, "lam");
        minHeapPriorityQueue.insert(9, "hoang");
        minHeapPriorityQueue.insert(4, "tien");
        minHeapPriorityQueue.insert(6, "an");

        System.out.println("size = " + minHeapPriorityQueue.size());

        System.out.println("remove min : " + minHeapPriorityQueue.removeMin().getValue());

        System.out.println("after remove min");

        System.out.println("size = " + minHeapPriorityQueue.size());
        System.out.println("min = " + minHeapPriorityQueue.min().getValue());
    }
}
