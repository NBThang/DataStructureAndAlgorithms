package hw5_21000705_nguyenbathang.pratice2.hightoftree;

import hw5_21000705_nguyenbathang.ex1.binarytreelinked.LinkedBinaryTree;

public class TestCountHightTree {
    public static void main(String[] args) {
        LinkedBinaryTree<Integer, LinkedBinaryTree.Node> myTree = new LinkedBinaryTree<>();

        // creat tree
        LinkedBinaryTree.Node root = myTree.addRoot(2); // root (A)

        LinkedBinaryTree.Node lefttChild1 = myTree.addLeft(root, 2); // left child of root (B)
        LinkedBinaryTree.Node rightChild1 = myTree.addRight(root, 1); // right child of root (C)


        LinkedBinaryTree.Node leftChild2 = myTree.addLeft(rightChild1, 3); // left child of C (C)

        LinkedBinaryTree.Node leftChild3 = myTree.addLeft(leftChild2, 4); // left child of D (E)

        //               A
        //              / \
        //             B   C
        //                /
        //               D
        //              /
        //             E

        HightOfBinaryTree countHight = new HightOfBinaryTree(myTree);

        int hight = countHight.getHight();
        System.out.println("height of tree is: " + hight);
    }
}
