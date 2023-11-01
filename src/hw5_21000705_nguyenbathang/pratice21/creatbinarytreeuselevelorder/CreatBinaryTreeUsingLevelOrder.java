package hw5_21000705_nguyenbathang.pratice21.creatbinarytreeuselevelorder;

public class CreatBinaryTreeUsingLevelOrder {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    Node root;
    public Node createrBinaryTree(int[] array ,int i){
        if(array == null || array.length == 0 || i < 0){
            return null;
        }
        Node root = null;
        if(i < array.length){
            root = new Node(array[i]);

            root.left = createrBinaryTree(array ,2 * i + 1);

            root.right = createrBinaryTree(array , 2 * i + 2);
        }
        return root;

    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 11};
        CreatBinaryTreeUsingLevelOrder tree = new CreatBinaryTreeUsingLevelOrder();
        tree.root = tree.createrBinaryTree(array ,0);
        System.out.println("Pre order travels binary tree : ");
        tree.preOrder(tree.root);
    }
}
