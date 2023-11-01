package hw5_21000705_nguyenbathang.pratice12.preordertrversal;

import hw5_21000705_nguyenbathang.ex1.binarytreelinked.LinkedBinaryTree;

public class TestPreorderTraversal {
    public static void main(String[] args) {
        LinkedBinaryTree<Integer, LinkedBinaryTree.Node> myTree = new LinkedBinaryTree<>();

        // creat tree
        LinkedBinaryTree.Node root = myTree.addRoot(1);

        LinkedBinaryTree.Node leftChild1 = myTree.addLeft(root, 4);

        LinkedBinaryTree.Node leftChile2 = myTree.addLeft(leftChild1, 4);
        LinkedBinaryTree.Node righiChild2 = myTree.addRight(leftChild1, 2);

        //                  1
        //                /
        //               4
        //             /   \
        //            4     2


        // print tree ussing preorder alorithms
        PreorderTraversal preorder = new PreorderTraversal();
        preorder.preorderTraversal(myTree.root());
    }
}
