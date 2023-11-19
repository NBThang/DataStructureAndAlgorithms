package hw7_21000705_nguyenbathang.ex2.binarysearchtree;

import hw5_21000705_nguyenbathang.ex1.binarytreelinked.LinkedBinaryTree;

public class TestBST {
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

        System.out.println("size = " + bst.size());

        System.out.println("min = " + bst.findMin(root).getElement());

        System.out.println("find 1 : " + bst.search(1, root));
        System.out.println("find 8 : " + bst.search(8, root));

        bst.deleteNode(7, root);
    }
}
