package hw1_21000705_nguyenbathang.reverse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 1.26
public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the input: ");
        String str = scanner.nextLine();

        String strReverse = reverseString(str);
        System.out.println(strReverse);

    }
    public static String reverseString(String str){
        List<Character> listChar = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            listChar.add(str.charAt(i));
        }
        reverseList(listChar);
        return listToString(listChar);
    }

    public static void reverseList(List<Character> list) {
        int from = 0;
        int to = list.size() - 1;

        while (from < to) {
            char temp = list.get(from);
            list.set(from, list.get(to));
            list.set(to, temp);

            from++;
            to--;
        }
    }

    public static String listToString(List<Character> list) {
        StringBuilder builder = new StringBuilder();

        for (char c : list) {
            builder.append(c);
        }

        return builder.toString();
    }
}
