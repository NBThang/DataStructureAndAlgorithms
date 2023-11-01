package hw5_21000705_nguyenbathang.ex1.printmytree;

import hw5_21000705_nguyenbathang.ex1.binarytreearray.ArrayBinaryTree;
import hw5_21000705_nguyenbathang.ex1.binarytreelinked.LinkedBinaryTree;

public class TestPrintTree {
    public static void main(String[] args) {
        printLinkedListTree();

//        printArrayTree();
    }

    public static void printLinkedListTree() {
        LinkedBinaryTree<Integer , LinkedBinaryTree.Node> myTreeUssingLinked = new LinkedBinaryTree<>();
        LinkedBinaryTree.Node<Integer> root = myTreeUssingLinked.addRoot(1);

        LinkedBinaryTree.Node<Integer> leftChild1 = myTreeUssingLinked.addLeft(root, 5);
        LinkedBinaryTree.Node<Integer> rightChild1 = myTreeUssingLinked.addRight(root, 3);

        LinkedBinaryTree.Node<Integer> leftChild2 = myTreeUssingLinked.addLeft(leftChild1,8);
        LinkedBinaryTree.Node<Integer> rightChild2 = myTreeUssingLinked.addRight(leftChild1, 6);

        LinkedBinaryTree.Node<Integer> leftChild3 = myTreeUssingLinked.addLeft(rightChild1,2);
        LinkedBinaryTree.Node<Integer> rightChild3 = myTreeUssingLinked.addRight(rightChild1, 7);

        PrintBinaryTree printTree = new PrintBinaryTree();

        printTree.exportDataToFile("BinaryTree use LinkedList");
        printTree.LinkedListTree(myTreeUssingLinked, myTreeUssingLinked.root(), "");
    }

    public static void printArrayTree() {
        ArrayBinaryTree<Integer, Integer> myTreeUssingArray = new ArrayBinaryTree<>();

        myTreeUssingArray.setRoot(1);

        myTreeUssingArray.setLeft(1, 3);
        myTreeUssingArray.setRight(1,5);

        myTreeUssingArray.setLeft(2,7);
        myTreeUssingArray.setRight(2,2);

        myTreeUssingArray.setLeft(3,6);
        myTreeUssingArray.setRight(3,8);

        PrintBinaryTree printTree = new PrintBinaryTree();

        printTree.exportDataToFile("BinaryTree use Array");
        printTree.ArrayTree(myTreeUssingArray, myTreeUssingArray.root(), " ");
    }
}
