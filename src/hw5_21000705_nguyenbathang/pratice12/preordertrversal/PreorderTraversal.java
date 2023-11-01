package hw5_21000705_nguyenbathang.pratice12.preordertrversal;

import hw5_21000705_nguyenbathang.ex1.binarytreelinked.LinkedBinaryTree;

public class PreorderTraversal {
    public PreorderTraversal() {

    }
    public void preorderTraversal(LinkedBinaryTree.Node root) {
        if(root != null){
            System.out.print(root.getElement() + " ");
            preorderTraversal(root.getLeft());
            preorderTraversal(root.getRight());
        }
    }
}
