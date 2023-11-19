package hw7_21000705_nguyenbathang.ex2.binarysearchtree;

import hw5_21000705_nguyenbathang.ex1.binarytreelinked.LinkedBinaryTree;

public class BinarySearchTree<E extends Comparable, T> extends LinkedBinaryTree<E, T> {
//    private int size = 0;
    @Override
    public Node<E> addLeft(Node p, E element) {
        return null;
    }

    @Override
    public Node<E> addRight(Node p, E element) {
        return null;
    }

//    @Override
//    public int size() {
//        return this.size;
//    }

    public void insert(E element, Node<E> root) {
        Node<E> newNode = new Node<>(element, null, null, null);
        if(root == null) {
            root = newNode;
        } else {
            Node<E> temp = root;
            while (true) {
                if (element.compareTo(temp.getElement()) > 0) {
                    if (temp.getRight() == null) {
                        temp.setRight(newNode);
                        upSize();
                        break;
                    } else {
                        temp = temp.getRight();
                    }
                } else { // element < temp.element
                    if (temp.getLeft() == null) {
                        temp.setLeft(newNode);
                        upSize();
                        break;
                    } else {
                        temp = temp.getLeft();
                    }
                }
            }
        }
    }

    public Node<E> findMin(Node<E> node) {
        if (node == null) {
            return null;
        }
        while (node.getLeft() != null) {
            node = node.getLeft();
        }

        return node;
    }

    public boolean search(E element, Node<E> node) {
        if (node == null) {
            return false;
        }

        if (node.getElement().compareTo(element) == 0) {
            return true;
        }

        if (element.compareTo(node.getElement()) < 0) {
            return search(element, node.getLeft());
        }

        return search(element, node.getRight());
    }

    public Node<E> deleteNode(E element, Node<E> root) {
        if (root == null) {
            return null;
        }

        if (element.compareTo(root.getElement()) < 0) {
            root.setLeft(deleteNode(element, root.getLeft()));
        } else if (element.compareTo(root.getElement()) > 0) {
            root.setRight(deleteNode(element, root.getRight()));
        } else {
            // th1: root is leaf
            if (root.getLeft() == null & root.getRight() == null) {
                return null;
            }

            // th2_1: root only have one child right
            if (root.getRight() != null & root.getLeft() == null) {
                return root.getRight();
            }

            // th2_2: root only have one chile left
            if (root.getLeft() != null & root.getRight() == null) {
                return root.getLeft();
            }

            // th3: root have 2 chile
            Node<E> leftModeNode = findLeftModeNode(root.getRight());
            root.setElement(leftModeNode.getElement());
            root.setRight(deleteNode(leftModeNode.getElement(), root.getRight()));
        }
        downSize();
        return root;
    }

    private Node<E> findLeftModeNode(Node<E> root) {
        if (root == null) {
            return null;
        }

        Node<E> leftModeNode = root;
        while (root.getLeft() != null) {
            leftModeNode = leftModeNode.getLeft();
        }
        return leftModeNode;
    }
}
