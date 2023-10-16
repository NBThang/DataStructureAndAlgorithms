package hw4_21000705_nguyenbathang.ex4.queuearray;

public interface QueueInterface<E> extends Iterable<E> {
    public void enqueue(E element) throws IllegalAccessException;
    public E dequeue() throws IllegalAccessException;
    public boolean isEmpty();
}
