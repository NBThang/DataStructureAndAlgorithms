package hw5_21000705_nguyenbathang.ex2.expressionform;

import hw5_21000705_nguyenbathang.ex1.binarytreelinked.LinkedBinaryTree;
import hw5_21000705_nguyenbathang.ex2.expressiontree.ExpressionTree;

public class TestEx2b {
    public static void main(String[] args) {
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

        ExpressionsMath tree = new ExpressionsMath(treeExpressionMath);

            System.out.println("print prefix");
            tree.printPrefix();
            System.out.println();

            System.out.println("print infix");
            tree.printInfix();
            System.out.println();

            System.out.println("print postfic");
            tree.printPostfix();
            System.out.println();
    }
}
