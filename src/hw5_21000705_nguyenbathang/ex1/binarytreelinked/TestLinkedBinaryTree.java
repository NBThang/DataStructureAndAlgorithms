package hw5_21000705_nguyenbathang.ex1.binarytreelinked;

public class TestLinkedBinaryTree {
    public static void main(String[] args) {
        LinkedBinaryTree<Integer, LinkedBinaryTree.Node> mytree = new LinkedBinaryTree<>();

        LinkedBinaryTree.Node<Integer> root = mytree.addRoot(1);

        LinkedBinaryTree.Node<Integer> leftChild = mytree.addLeft(root, 2);
        LinkedBinaryTree.Node<Integer> rightChild = mytree.addRight(root, 3);

        LinkedBinaryTree.Node<Integer> leftChild1 = mytree.addLeft(leftChild, 10);



        System.out.println("Root: " + mytree.root().getElement());

        System.out.println("Left child of root: " + mytree.left(root).getElement());
        System.out.println("Right child of root: " + mytree.right(root).getElement());
        System.out.println("Sibling of right child: " + mytree.sibling(rightChild).getElement());
        System.out.println("Left child of left child: " + mytree.left(leftChild).getElement());
        System.out.println("Num child of root: " + mytree.numChildren(root));
        System.out.println("size of tree: " + mytree.size());

        mytree.set(leftChild, 4);
        mytree.set(rightChild, 5);

        System.out.println("---------");

        System.out.println("Left child of root: " + mytree.left(root).getElement());
        System.out.println("Right child of root: " + mytree.right(root).getElement());
        System.out.println("Sibling of left child: " + mytree.sibling(leftChild).getElement());
    }
}
