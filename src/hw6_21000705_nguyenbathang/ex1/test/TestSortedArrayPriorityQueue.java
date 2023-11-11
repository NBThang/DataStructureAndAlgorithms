package hw6_21000705_nguyenbathang.ex1.test;

import hw6_21000705_nguyenbathang.ex1.sortedarraypriorityqueue.SortedArrayPriorityQueue;

public class TestSortedArrayPriorityQueue {
    public static void main(String[] args) {
        SortedArrayPriorityQueue<Integer, Integer> priorityQueue = new SortedArrayPriorityQueue<>();

        priorityQueue.insert(1, 1);
        priorityQueue.insert(2,2);
        priorityQueue.insert(0,0);
        priorityQueue.insert(4,4);
        priorityQueue.insert(3,3);

        System.out.println("priority queue 1");
        System.out.println("size: " + priorityQueue.size());

        System.out.println("min = " + priorityQueue.min().getValue());

        System.out.println("Remove key min : " + priorityQueue.removeMin().getValue());
        System.out.println("size after remove: " + priorityQueue.size());

        System.out.println("after remove min = " + priorityQueue.min().getValue());

        System.out.println("-----------------------------------------------------------");

        System.out.println("priority queue 2");

        SortedArrayPriorityQueue priorityQueue2 = new SortedArrayPriorityQueue<>();

        Student student1 = new Student(7, "Tien");
        priorityQueue2.insert(student1.getScores(), student1.getName());

        Student student2 = new Student(9, "Tuan");
        priorityQueue2.insert(student2.getScores(), student2.getName());

        Student student3 = new Student(10, "Lam");
        priorityQueue2.insert(student3.getScores(), student3.getName());

        Student student4 = new Student(8, "Thang");
        priorityQueue2.insert(student4.getScores(), student4.getName());

        System.out.println("size: " + priorityQueue2.size());

        System.out.println("min = " + priorityQueue2.min().getValue());

        System.out.println("Remove key min : " + priorityQueue2.removeMin().getValue());
        System.out.println("size after remove: " + priorityQueue2.size());

        System.out.println("after remove min = " + priorityQueue2.min().getValue());
    }
}
