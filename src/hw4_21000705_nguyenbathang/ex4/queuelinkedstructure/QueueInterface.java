package hw4_21000705_nguyenbathang.ex4.queuelinkedstructure;

public interface QueueInterface<E> extends Iterable<E> {
    public void enqueue(E element);
    public E dequeue() throws IllegalAccessException;
    public boolean isEmpty();
}
