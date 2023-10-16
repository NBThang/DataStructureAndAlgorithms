package hw4_21000705_nguyenbathang.practice1.rotate;

import hw4_21000705_nguyenbathang.ex4.queuelinkedstructure.QueueLinkedStructure;

public class Rotate {
    public int[] rotateArray(int[] array, int k) {
        QueueLinkedStructure<Integer> queue = new QueueLinkedStructure<>();
        for (int i = 0; i < array.length; i++) {
            queue.enqueue(array[i]);
        }

        for (int i = 0; i < k; i++) {
            queue.enqueue(queue.dequeue());
        }

        int[] newArray = new int[array.length];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = queue.dequeue();
        }

        return newArray;
    }
}
