package hw5_21000705_nguyenbathang.pratice1.inordertraversal;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the size: ");
        int size = scanner.nextInt();

        int[] array = inputArray(size, scanner);

        // creat tree from array
        BinaryTree mytree = new BinaryTree();
        mytree = creatTree(array);

        // print tree ussing inorder algorithm
        System.out.println("inorder travarsal");
        mytree.inOrderTraversal();
    }

    public static BinaryTree creatTree(int[] arr) {
        BinaryTree myTree = new BinaryTree();

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
