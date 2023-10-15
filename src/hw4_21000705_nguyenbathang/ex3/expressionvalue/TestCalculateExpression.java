package hw4_21000705_nguyenbathang.ex3.expressionvalue;

import hw4_21000705_nguyenbathang.ex3.checkvalidbracket.CheckValidBracket;

import java.util.Scanner;

public class TestCalculateExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckValidBracket checkValidBracket = new CheckValidBracket();
        ExpressionValue expressionValue = new ExpressionValue();

        System.out.print("enter the expression: ");
        String expression = scanner.nextLine();
        if (checkValidBracket.checkBracket(expression)) {
            int resuil = expressionValue.calculateExpressionValue(expression);
            System.out.println(expression + " = " + resuil);
            // – Input: (1+((2+3)*(8*5)))
            //– Output: 201
            // – Input: (5-(8-4)*(2-3))+(8/4)
            //– Output: −13
        } else {
            System.out.println("invalid expression!");
        }
    }
}
