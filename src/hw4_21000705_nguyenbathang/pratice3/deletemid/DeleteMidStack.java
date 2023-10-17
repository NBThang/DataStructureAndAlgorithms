package hw4_21000705_nguyenbathang.pratice3.deletemid;

import java.util.Stack;

public class DeleteMidStack {
    public void deleteMid(Stack<Integer> stack, int size) {
        Stack<Integer> newStack = new Stack<>();
        int mid = size / 2;
        for (int i = 0; i < mid; i++) {
            newStack.push(stack.pop());
        }

        stack.pop();

        while (!newStack.isEmpty()) {
            stack.push(newStack.pop());
        }
    }
}
