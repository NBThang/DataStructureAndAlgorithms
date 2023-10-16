package hw4_21000705_nguyenbathang.practice1.reverse;

import java.util.Stack;

// 13
public class ReverseString {
    public String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        StringBuilder reverse = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            reverse.append(stack.pop());
        }

        return reverse.toString();
    }
}
