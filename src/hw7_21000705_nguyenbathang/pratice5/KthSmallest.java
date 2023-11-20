package hw7_21000705_nguyenbathang.pratice5;

import hw5_21000705_nguyenbathang.ex1.binarytreelinked.LinkedBinaryTree;
import hw7_21000705_nguyenbathang.ex2.binarysearchtree.BinarySearchTree;

import java.util.Scanner;

public class KthSmallest {
    public static void main(String[] args) {
        BinarySearchTree<Integer, Integer> bst = new BinarySearchTree<>();
        LinkedBinaryTree.Node root = bst.addRoot(5);
        bst.insert(1, root);
        bst.insert(6, root);
        bst.insert(0, root);
        bst.insert(3, root);
        bst.insert(7, root);
        bst.insert(2, root);
        bst.insert(4, root);

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the k: ");
        int k = scanner.nextInt();

        int min = 0;

        for (int i = 1; i <= k; i++) {
            min = (int) bst.findMin(root).getElement();
            bst.deleteNode(min, root);
        }

        System.out.println(min);
    }
}
