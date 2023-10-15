package hw4_21000705_nguyenbathang.ex3.checkvalidbracket;

import java.util.Stack;

public class CheckValidBracket {
    public CheckValidBracket() {

    }
    public boolean checkBracket(String expression) {
        Stack<Character> stackBracket = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char temp = expression.charAt(i);
            if (temp == '(' || temp == '[' || temp == '{') {
                stackBracket.push(temp);
            }
            if (temp == ')' || temp == ']' || temp == '}') {
                if (stackBracket.isEmpty()) {
                    return false;
                } else if (isMatching(stackBracket.pop(), temp)) {
                    continue;
                } else {
                    return false;
                }
            }
        }

        return stackBracket.isEmpty();
    }

    public static boolean isMatching(char open, char close) {
        return (open == '(' & close ==')') ||
                (open == '[' & close == ']') ||
                (open == '{' & close == '}');
    }
}
