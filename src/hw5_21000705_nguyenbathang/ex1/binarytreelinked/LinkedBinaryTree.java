package hw5_21000705_nguyenbathang.ex1.binarytreelinked;

public class LinkedBinaryTree<E, T> implements BinaryTreeInterface<T> {

    public static class Node<E> {
        private E element; // an element stored at this node
        private Node<E> parent; // a reference to the parent node (if any)
        private Node<E> left; // a reference to the left child
        private Node<E> right; // a reference to the right child

        // Constructs a node with the given element and neighbors.
        public Node(E e, Node<E> above, Node<E> leftChild, Node<E> rightChild) {
            // Todo
            element = e;
            parent = above;
            left = leftChild;
            right = rightChild;
        }

        public E getElement() {
            return this.element;
        }

        public Node<E> getLeft() {
            return this.left;
        }

        public  Node getRight() {
            return this.right;
        }

    }

    private Node<E> root;
    private int size = 0;

    @Override
    public T root() {
        if (isEmpty()) {
            return null;
        }
        return (T) root;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public int numChildren(T p) {
        Node<E> node = (Node<E>) p;
        int countChild = 0;
        if (node.left != null) {
            countChild++;
        }
        if (node.right != null) {
            countChild++;
        }
        return countChild;
    }

    @Override
    public T parent(T p) {
        Node<E> node = (Node<E>) p;
        if (node.parent == null) {
            return null;
        }
        return (T) node.parent;
    }

    @Override
    public T left(T p) {
        Node<E> node = (Node<E>) p;
        if (node.left == null) {
            return null;
        }
        return (T) node.left;
    }

    @Override
    public T right(T p) {
        Node<E> node = (Node<E>) p;
        if (node.right == null) {
            return null;
        }
        return (T) node.right;

    }

    @Override
    public T sibling(T p) {
        Node<E> node = (Node<E>) p;
        Node<E> parent = node.parent;
        if (parent == null) {
            return null;
        }
        if (parent.left == node) {
            return (T) parent.right;
        } else {
            return (T) parent.left;
        }
    }


    // update methods
    public Node<E> addRoot(E element) {
        // Add element to root of an empty tree
        if (!isEmpty()) {
            throw new IllegalStateException("The tree is not empty.");
        }
        Node<E> node = new Node<>(element, null, null, null);
        if (isEmpty()) {
            root = node;
            size++;
            return root;
        }
        return null;
    }

    public Node<E> addLeft(Node p, E element) {
        // Add element to left child node of p if empty
        if (p.left != null) {
            throw new IllegalArgumentException("Left child exist already");
        }
        Node<E> childLeft = new Node<>(element, p, null, null);
        p.left = childLeft;
        size++;
        return childLeft;
    }

    public Node<E> addRight(Node p, E element) {
        // Add element to right child node of p if empty
        if (p.right != null) {
            throw new IllegalArgumentException("Right child exist already");
        }
        Node<E> childRight = new Node<>(element, p, null, null);
        p.right = childRight;
        size++;
        return childRight;

    }

    public void set(Node p, E element) {
        // set element to node p
        p.element = element;
    }

}