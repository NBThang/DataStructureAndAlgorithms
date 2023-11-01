package hw5_21000705_nguyenbathang.pratice2.hightoftree;

import hw5_21000705_nguyenbathang.ex1.binarytreelinked.LinkedBinaryTree;

public class HightOfBinaryTree {
    LinkedBinaryTree<Integer, LinkedBinaryTree.Node> tree;
    public HightOfBinaryTree(LinkedBinaryTree tree) {
        this.tree = tree;
    }

    public int getHight() {
        return heightRecursive(tree.root());
    }

    private int heightRecursive(LinkedBinaryTree.Node node){
        if (node == null) {
            return 0;
        }

        int leftHeight = heightRecursive(node.getLeft());
        int rightHeight = heightRecursive(node.getRight());

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
