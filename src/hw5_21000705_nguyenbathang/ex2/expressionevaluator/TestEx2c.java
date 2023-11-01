package hw5_21000705_nguyenbathang.ex2.expressionevaluator;

import hw5_21000705_nguyenbathang.ex1.binarytreelinked.LinkedBinaryTree;
import hw5_21000705_nguyenbathang.ex2.expressionform.ExpressionsMath;
import hw5_21000705_nguyenbathang.ex2.expressiontree.ExpressionTree;

public class TestEx2c {
    public static void main(String[] args) {
        // creat tree expression math
        ExpressionTree<String> treeExpressionMath = new ExpressionTree<>();

        LinkedBinaryTree.Node root = treeExpressionMath.addRoot("*");

        LinkedBinaryTree.Node leftChild = treeExpressionMath.addLeft(root, "+");
        LinkedBinaryTree.Node rightChild = treeExpressionMath.addRight(root, "-");

        LinkedBinaryTree.Node leftChild1 = treeExpressionMath.addLeft(leftChild, "/");
        LinkedBinaryTree.Node rightChild1 = treeExpressionMath.addRight(leftChild, "2");

        LinkedBinaryTree.Node leftChild2 = treeExpressionMath.addLeft(rightChild, "7");
        LinkedBinaryTree.Node rightChild2 = treeExpressionMath.addRight(rightChild, "4");

        LinkedBinaryTree.Node leftChild3 = treeExpressionMath.addLeft(leftChild1, "6");
        LinkedBinaryTree.Node rightChild3 = treeExpressionMath.addRight(leftChild1, "3");

        ExpressionEvaluator tree = new ExpressionEvaluator(treeExpressionMath);

        String postfix = tree.convertToPostfix(root);

        int resuil = tree.calculateExpressionValue(postfix);

        System.out.println("resuil of expression math tree is: " + resuil);
    }
}
