package hw5_21000705_nguyenbathang.pratice1.coutleaves;

import java.util.Scanner;

public class TestCountLeavesBinaryTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the size: ");
        int size = scanner.nextInt();

        int[] array = inputArray(size, scanner);

        // creat tree from array
        BinarySearchTree mytree = new BinarySearchTree();
        mytree = creatTree(array);

        // count leaves of tree

        int numLeaves = mytree.countLeaves();
        System.out.print("number leaves of tree is: " + numLeaves);
    }

    public static BinarySearchTree creatTree(int[] arr) {
        BinarySearchTree myTree = new BinarySearchTree();

        for (int i = 0; i < arr.length; i++) {
            myTree.insert(arr[i]);
        }

        return myTree;
    }

    public static int[] inputArray(int size, Scanner scanner) {
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }
}
