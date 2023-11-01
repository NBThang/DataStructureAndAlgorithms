package hw5_21000705_nguyenbathang.ex2.expressionevaluator;

import hw5_21000705_nguyenbathang.ex1.binarytreelinked.LinkedBinaryTree;
import hw5_21000705_nguyenbathang.ex2.expressiontree.ExpressionTree;

import java.util.Stack;

public class ExpressionEvaluator {
   private ExpressionTree<String> tree;
   public ExpressionEvaluator(ExpressionTree tree) {
      if (isExpressionMathTree((LinkedBinaryTree.Node) tree.root())) {
         this.tree = tree;
      } else {
         this.tree = null;
      }
   }

   private boolean isOperator(String str) {
      String[] operators = {"+", "-", "*", "/"};
      for (String operator : operators) {
         if (operator.equals(str)) {
            return true;
         }
      }
      return false;
   }

   private boolean isExpressionMathTree(LinkedBinaryTree.Node node) {
      if (node == null) {
         return true;
      }

      if (!(node.getElement() instanceof String)) {
         return false;
      }

      if (node.getLeft() == null && node.getLeft() == null) {
         return !isOperator((String) node.getElement());
      }

      if (isOperator((String) node.getElement())) {
         return isExpressionMathTree(node.getLeft()) && isExpressionMathTree(node.getRight());
      }

      return false;
   }

   public static String convertToPostfix(LinkedBinaryTree.Node root) {
      if (root == null) {
         return "";
      }

      StringBuilder result = new StringBuilder();
      Stack<String> stack = new Stack<>();

      convertToPostfixRec(root, stack, result);

      return result.toString().trim();
   }

   private static void convertToPostfixRec(LinkedBinaryTree.Node node, Stack<String> stack, StringBuilder result) {
      if (node == null) {
         return;
      }

      convertToPostfixRec(node.getLeft(), stack, result);
      convertToPostfixRec(node.getRight(), stack, result);

      result.append(node.getElement()).append(" ");
   }
   public int calculateExpressionValue(String postfix) {
      Stack<Integer> resuil = new Stack<>();

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
