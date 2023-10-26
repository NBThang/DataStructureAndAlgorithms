package hw5_21000705_nguyenbathang.ex1.binarytreearray;

public class ArrayBinaryTree <E,T> implements BinaryTreeInterface<T>{
    private E[] array;
    private int n = 0;
    private int defaultsize = 100;
    public ArrayBinaryTree() {
        array = (E[]) new Object[defaultsize];
    }

    public void setRoot(E element) {
        array[0] = element;
        n++;
    }

    public void setLeft(int p, E element) {
        int leftChildIndex = (2 * p) + 1;
        if (leftChildIndex >= array.length) {
            // Increase the size of the array before adding element
            resizeArray();
        }
        array[leftChildIndex] = element;
        n++;
    }

    public void setRight(int p, E element) {
        int rightChildIndex = (2 * p) + 2;
        if (rightChildIndex >= array.length) {
            // Increase the size of the array before adding element
            resizeArray();
        }
        array[rightChildIndex] = element;
        n++;
    }

    @Override
    public T root() {
        if (isEmpty()) {
            return null;
        }
        return (T) array[0];
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
        int index = getIndex(p);
        if (index == -1) {
            return -1; // Element not found
        }
        int numChildren = 0;
        int leftChildIndex = (2 * index) + 1;
        int rightChildIndex = (2 * index) + 2;
        if (leftChildIndex < n && array[leftChildIndex] != null) {
            numChildren++;
        }
        if (rightChildIndex < n && array[rightChildIndex] != null) {
            numChildren++;
        }
        return numChildren;
    }

    @Override
    public T parent(T p) {
        int index = getIndex(p);
        if (index == -1) {
            return null; // Element not found
        }
        int parentIndex = (index - 1) / 2;
        if (parentIndex < 0 || parentIndex >= n) {
            return null; // Element is root or invalid index
        }
        return (T) array[parentIndex];
    }

    @Override
    public T left(T p) {
        int index = getIndex(p);
        if (index == -1) {
            return null; // Element not found
        }
        int leftChildIndex = (2 * index) + 1;
        if (leftChildIndex >= n || array[leftChildIndex] == null) {
            return null; // Left child does not exist
        }
        return (T) array[leftChildIndex];
    }

    @Override
    public T right(T p) {
        int index = getIndex(p);
        if (index == -1) {
            return null; // Element not found
        }
        int leftChildIndex = (2 * index) + 1;
        if (leftChildIndex >= n || array[leftChildIndex] == null) {
            return null; // Left child does not exist
        }
        return (T) array[leftChildIndex];
    }

    @Override
    public T sibling(T p) {
        int index = getIndex(p);
        if (index == -1) {
            return null; // Element not found
        }
        int siblingIndex;
        if (index % 2 == 0) { // Current element is a right child
            siblingIndex = index - 1;
        } else { // Current element is a left child
            siblingIndex = index + 1;
        }
        if (siblingIndex < 0 || siblingIndex >= n || array[siblingIndex] == null) {
            return null; // Sibling does not exist
        }
        return (T) array[siblingIndex];
    }
    private int getIndex(T element) {
        for (int i = 0; i < n; i++) {
            if (element.equals(array[i])) {
                return i;
            }
        }
        return -1; // Element not found
    }

    private void resizeArray() {
        E[] newArray = (E[]) new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }
}
