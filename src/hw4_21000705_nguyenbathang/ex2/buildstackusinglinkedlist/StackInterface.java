package hw4_21000705_nguyenbathang.ex2.buildstackusinglinkedlist;

public interface StackInterface<E> extends Iterable<E> {
    public void push(E element) throws IllegalAccessException;
    public E pop() throws IllegalAccessException;
    public boolean isEmpty();
    public E top() throws IllegalAccessException;
}
