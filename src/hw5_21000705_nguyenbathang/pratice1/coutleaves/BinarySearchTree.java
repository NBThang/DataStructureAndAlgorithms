package hw5_21000705_nguyenbathang.pratice1.coutleaves;

public class BinarySearchTree {
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

    public BinarySearchTree() {
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

    public int countLeaves() {
        return countLeavesRecursive(root);
    }

    private int countLeavesRecursive(Node node) {
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null) {
            return 1;
        }

        int leftCount = countLeavesRecursive(node.left);
        int rightCount = countLeavesRecursive(node.right);

        return leftCount + rightCount;
    }
}
