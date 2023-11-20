package hw7_21000705_nguyenbathang.pratice7;

import hw5_21000705_nguyenbathang.ex1.binarytreelinked.LinkedBinaryTree;
import hw7_21000705_nguyenbathang.ex2.binarysearchtree.BinarySearchTree;

public class MinInBST {
    public static void main(String[] args) {
        BinarySearchTree<Integer, Integer> bst = new BinarySearchTree<>();
        LinkedBinaryTree.Node root = bst.addRoot(5);
        bst.insert(1, root);
        bst.insert(6, root);
        bst.insert(0, root);
        bst.insert(3, root);
        bst.insert(7, root);
        bst.insert(2, root);
        bst.insert(4, root);

        System.out.println("min in BST = " + bst.findMin(root));
    }

}
