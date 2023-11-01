package hw5_21000705_nguyenbathang.ex2.expressiontree;

import hw5_21000705_nguyenbathang.ex1.binarytreelinked.LinkedBinaryTree;

public class TestEx2a {
    public static void main(String[] args) {
        ExpressionTree<Integer> expressionTree = new ExpressionTree<>();

        LinkedBinaryTree.Node root = expressionTree.addRoot(1);

        LinkedBinaryTree.Node leftChil1 = expressionTree.addLeft(root, 2);
        LinkedBinaryTree.Node rightChild1 = expressionTree.addRight(root, 3);

        LinkedBinaryTree.Node leftChil2 = expressionTree.addLeft(leftChil1, 4);
        LinkedBinaryTree.Node rightChild2 = expressionTree.addRight(leftChil1, 5);

        LinkedBinaryTree.Node leftChil3 = expressionTree.addLeft(rightChild1, 6);
        LinkedBinaryTree.Node rightChild3 = expressionTree.addRight(rightChild1, 7);

        System.out.println("Preorder");
        expressionTree.preorderPrint(root);
        System.out.println();

        System.out.println("Inorder");
        expressionTree.inorderPrint(root);
        System.out.println();

        System.out.println("Postorder");
        expressionTree.postorderPrint(root);
        System.out.println();
    }
}
