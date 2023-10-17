package hw4_21000705_nguyenbathang.practice1.dec2bin;

import java.util.Stack;

public class Dec2Bin {
    public String DecToBin(int number) {
        Stack<Integer> stackBin = new Stack<>();
        while (number > 0) {
            stackBin.push(number%2);
            number = number/2;
        }
        StringBuilder sb = new StringBuilder();

        while(!stackBin.isEmpty()) {
            sb.append(stackBin.pop());
        }

        return sb.toString();
    }

}
