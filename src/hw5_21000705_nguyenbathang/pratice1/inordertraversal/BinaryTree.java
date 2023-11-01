package hw5_21000705_nguyenbathang.pratice1.inordertraversal;

public class BinaryTree {
    private class Node {
        int element;
        Node left;
        Node right;

        public Node(int element) {
            this.element = element;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    private Node insertRecursive(Node current, int element) {
        if (current == null) {
            return new Node(element);
        }

        if (element < current.element) {
            current.left = insertRecursive(current.left, element);
        } else if (element > current.element) {
            current.right = insertRecursive(current.right, element);
        }

        return current;
    }

    public void insert(int element) {
        this.root = insertRecursive(root, element);
    }

    public void inOrderTraversal() {
        inOrderTraversalRecursive(root);
    }

    private void inOrderTraversalRecursive(Node node) {
        if (node != null) {
            inOrderTraversalRecursive(node.left);
            System.out.print(node.element + " ");
            inOrderTraversalRecursive(node.right);
        }
    }
}
