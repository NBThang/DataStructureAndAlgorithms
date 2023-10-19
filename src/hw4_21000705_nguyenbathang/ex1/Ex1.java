package hw4_21000705_nguyenbathang.ex1;

import java.util.Stack;

public class Ex1 {

    public static Stack stackName(String fullName){
        Stack<Character > stack = new Stack<>();
        for (int i = 0; i < fullName.length(); i++) {
            if (i % 2 == 0) {
                stack.push(fullName.charAt(i));
            }
            if (i % 3 == 0) {
                stack.pop();
            }
        }
        return stack;
    }

    public static void print(Stack<Character> stack){

        for(Character ch : stack){
            System.out.print(ch + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack<Character> stack= new Stack<>();
        stack = stackName("nguyenbathang");
        print(stack);
    }
}
