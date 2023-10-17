package hw4_21000705_nguyenbathang.pratice3.deletemid;

import java.util.Scanner;
import java.util.Stack;

public class TestDeleteMid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size: ");
        int size = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < size; i++) {
            int temp = sc.nextInt();
            stack.push(temp);
        }

        System.out.println("before delete");
        printStack(stack);

        DeleteMidStack deleteMidStack = new DeleteMidStack();
        deleteMidStack.deleteMid(stack, size);

        System.out.println("after delete");
        printStack(stack);
    }

    public static void printStack(Stack<Integer> stack) {
        for (int element : stack) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
