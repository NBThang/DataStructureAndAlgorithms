package hw4_21000705_nguyenbathang.ex3.expressionvalue;

import java.util.Stack;

public class ExpressionValue {
    public static String convertToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if (Character.isDigit(c)) {
                postfix.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (isOperator(c)) {
                while (!stack.isEmpty() && stack.peek() != '(' && hasHigherPrecedence(stack.peek(), c)) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop();
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private static boolean hasHigherPrecedence(char op1, char op2) {
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
            return true;
        }
        return false;
    }

    public int calculateExpressionValue(String expression) {
        Stack<Integer> resuil = new Stack<>();
        String postfix = convertToPostfix(expression);
        for (int i = 0; i< postfix.length(); i++) {
            if(Character.isDigit(postfix.charAt(i))) {
                resuil.push(postfix.charAt(i) - '0');
            } else {
                if (postfix.charAt(i) == '+') {
                    int temp1 = resuil.pop();
                    int temp2 = resuil.pop();
                    int sum = temp1 + temp2;
                    resuil.push(sum);
                } else if (postfix.charAt(i) == '-') {
                    int temp1 = resuil.pop();
                    int temp2 = resuil.pop();
                    int sub = temp2 - temp1;
                    resuil.push(sub);
                } else if (postfix.charAt(i) == '*') {
                    int temp1 = resuil.pop();
                    int temp2 = resuil.pop();
                    int multy = temp1 * temp2;
                    resuil.push(multy);
                } else if (postfix.charAt(i) == '/') {
                    int temp1 = resuil.pop();
                    int temp2 = resuil.pop();
                    int div = temp2 / temp1;
                    resuil.push(div);
                }
            }
        }
        return resuil.pop();
    }
}
