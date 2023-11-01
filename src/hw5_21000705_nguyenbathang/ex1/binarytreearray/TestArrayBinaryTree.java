package hw5_21000705_nguyenbathang.ex1.binarytreearray;

public class TestArrayBinaryTree {
    public static void main(String[] args) {
        ArrayBinaryTree<Integer, Integer> myTree = new ArrayBinaryTree<>();

        myTree.setRoot(1);

        myTree.setLeft(1,2);
        myTree.setRight(1,3);

        myTree.setLeft(2,2);
        myTree.setRight(2,6);

        myTree.setLeft(4,1);

        System.out.println("number child of root: " + myTree.numChildren(1));
        System.out.println("number child of left child fist: " + myTree.numChildren(2));

        System.out.println("parent of right child fist: " + myTree.parent(3));

        System.out.println("size of tree: " + myTree.size());
    }
}
