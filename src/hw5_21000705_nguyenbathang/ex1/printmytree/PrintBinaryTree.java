package hw5_21000705_nguyenbathang.ex1.printmytree;

import hw5_21000705_nguyenbathang.ex1.binarytreearray.ArrayBinaryTree;
import hw5_21000705_nguyenbathang.ex1.binarytreelinked.LinkedBinaryTree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PrintBinaryTree {
    public static void main(String[] args) throws IOException {
        //in ra cây linkedlist
//        exportDataToFile("BinaryTree use LinkedList");
//        LinkedListTree(linkedTree, linkedTree.root(), "");
        //in ra cây array
//        exportDataToFile("BinaryTree use Array");
//        ArrayTree(myTreeUsingAray, myTreeUsingAray.root(), "");
    }

    public void LinkedListTree(LinkedBinaryTree<Integer, LinkedBinaryTree.Node> linkedTree, LinkedBinaryTree.Node node, String space){
        // nếu node k có child thì exit
        if ( node == null)
        {
            return;
        }
        //duyệt node trái
        LinkedListTree(linkedTree, linkedTree.left(node), space + "  ");

        String data = space + String.valueOf(node.getElement());
        exportDataToFile(data);
        //duyệt node phải
        LinkedListTree(linkedTree, linkedTree.right(node), space + "  ");
    }

    public void ArrayTree(ArrayBinaryTree<Integer, Integer> arrayTree, Integer node, String space){
        // nếu node k có child thì exit
        if ( node == null) return;
        //duyệt node trái
        ArrayTree(arrayTree, arrayTree.getIndexLeftChild(node), space + "  ");

        String data = space + String.valueOf(node);
        exportDataToFile(data);
        //duyệt node phải
        ArrayTree(arrayTree, arrayTree.getIndexRightChild(node), space + "  ");
    }

    // mở file output.txt và in String data vào file
    public static void exportDataToFile(String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true))) {
            writer.write(data);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}