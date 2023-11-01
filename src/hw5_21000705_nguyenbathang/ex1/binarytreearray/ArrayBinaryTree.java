package hw5_21000705_nguyenbathang.ex1.binarytreearray;

public class ArrayBinaryTree <E,T> implements BinaryTreeInterface<T>{
    private E[] array;
    private int n = 0;
    private int defaultsize = 100;
    public ArrayBinaryTree() {
        array = (E[]) new Object[defaultsize];
    }

    public void setRoot(E element) {
        array[1] = element;
        n++;
    }

    public void setLeft(int p, E element) {
        int leftChildIndex = 2 * p;
        if (leftChildIndex >= array.length) {
            upSizeArray();
        }
        array[leftChildIndex] = element;
        n++;
    }

    public void setRight(int p, E element) {
        int rightChildIndex = (2 * p) + 1;

        if (rightChildIndex >= array.length) {
            upSizeArray();
        }

        array[rightChildIndex] = element;
        n++;
    }

    @Override
    public T root() {
        if (isEmpty()) {
            return null;
        }
        return (T) array[1];
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
    public int numChildren(T p) {
        int coutChild = 0;
        if (left(p) != null) {
            coutChild++;
        }

        if (right(p) != null) {
            coutChild++;
        }

        return coutChild;
    }

    @Override
    public T parent(T p) {
        int index = (int) p;
        if (index > array.length || index <= 0) {
            return null;
        }
        int parentIndex = index / 2;

        return (T) array[parentIndex];
    }

    @Override
    public T left(T p) {
        int index = (int) p;
        if (index > array.length || index <= 0) {
            return null;
        }
        int leftChildIndex = 2 * index;

        if (leftChildIndex >= array.length || array[leftChildIndex] == null) {
            return null;
        }
        return (T) array[leftChildIndex];
    }

    @Override
    public T right(T p) {
        int index = (int) p;
        if (index > array.length || index <= 0) {
            return null;
        }
        int rightChildIndex = (2 * index) + 1;

        if (rightChildIndex >= array.length || array[rightChildIndex] == null) {
            return null;
        }
        return (T) array[rightChildIndex];
    }

    @Override
    public T sibling(T p) {
        int index = (int) p;
        if(index >= array.length || index == 0){
            return null;
        }

        if (index % 2 == 0) {
            return (T) array[index + 1];
        }
        return (T) array[index - 1];
    }

    private void upSizeArray() {
        E[] newArray = (E[]) new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    public int getIndexLeftChild(T p) {
        int index = (int) p;
        if (index > array.length || index <= 0) {
            return -1;
        }
        int leftChildIndex = 2 * index;

        if (leftChildIndex >= array.length || array[leftChildIndex] == null) {
            return -1;
        }
        return leftChildIndex;
    }

    public int getIndexRightChild(T p) {
        int index = (int) p;
        if (index > array.length || index <= 0) {
            return -1;
        }
        int rightChildIndex = (2 * index) + 1;

        if (rightChildIndex >= array.length || array[rightChildIndex] == null) {
            return -1;
        }
        return rightChildIndex;
    }
}
