package hw5_21000705_nguyenbathang.ex2.expressiontree;

import hw5_21000705_nguyenbathang.ex1.binarytreelinked.LinkedBinaryTree;

public class ExpressionTree<E> extends LinkedBinaryTree {
    public void preorderPrint(Node<E> p) {
        // pre - order traversal of tree with root p

        if (p == null) {
            return;
        }

        System.out.print(p.getElement() + " ");
        preorderPrint(p.getLeft());
        preorderPrint(p.getRight());
    }

    public void inorderPrint(Node<E> p) {
        //in - order traversal of tree with root p

        if (p == null) {
            return;
        }

        inorderPrint(p.getLeft());
        System.out.print(p.getElement() + " ");
        inorderPrint(p.getRight());
    }

    public void postorderPrint(Node<E> p) {
        // post - order traversal of tree with root p
        if (p == null) {
            return;
        }

        postorderPrint(p.getLeft());
        postorderPrint(p.getRight());
        System.out.print(p.getElement() + " ");
    }
}
