package hw5_21000705_nguyenbathang.ex2.expressionform;

import hw5_21000705_nguyenbathang.ex1.binarytreelinked.LinkedBinaryTree;
import hw5_21000705_nguyenbathang.ex2.expressiontree.ExpressionTree;

public class ExpressionsMath {
    private ExpressionTree<String> tree;
    public ExpressionsMath(ExpressionTree tree) {
        if (isExpressionMathTree((LinkedBinaryTree.Node) tree.root())) {
            this.tree = tree;
        } else {
            this.tree = null;
        }
    }

    private boolean isOperator(String str) {
        String[] operators = {"+", "-", "*", "/"};
        for (String operator : operators) {
            if (operator.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private boolean isExpressionMathTree(LinkedBinaryTree.Node node) {
        if (node == null) {
            return true;
        }

        if (!(node.getElement() instanceof String)) {
            return false;
        }

        if (node.getLeft() == null && node.getLeft() == null) {
            return !isOperator((String) node.getElement());
        }

        if (isOperator((String) node.getElement())) {
            return isExpressionMathTree(node.getLeft()) && isExpressionMathTree(node.getRight());
        }

        return false;
    }
    public void printInfix() {
        if (this.tree == null) {
            System.out.println("tre is not expression math tree");
            return;
        }

        LinkedBinaryTree.Node<String> root = (LinkedBinaryTree.Node) tree.root();
        tree.inorderPrint(root);
    }

    public void printPrefix() {
        if (this.tree == null) {
            System.out.println("tre is not expression math tree");
            return;
        }

        LinkedBinaryTree.Node<String> root = (LinkedBinaryTree.Node) tree.root();
        tree.preorderPrint(root);
    }

    public void printPostfix() {
        if (this.tree == null) {
            System.out.println("tre is not expression math tree");
            return;
        }

        LinkedBinaryTree.Node<String> root = (LinkedBinaryTree.Node) tree.root();
        tree.postorderPrint(root);
    }
}
