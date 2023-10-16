package hw4_21000705_nguyenbathang.ex5.checkpalindrome;

import hw4_21000705_nguyenbathang.ex2.buildstackusinglinkedlist.LinkedListStack;
import hw4_21000705_nguyenbathang.ex4.queuelinkedstructure.QueueLinkedStructure;

public class CheckPalindrome {
    public boolean isPalindrome(String str) {
        QueueLinkedStructure<Character> queueString = new QueueLinkedStructure<>();
        LinkedListStack<Character> stackString = new LinkedListStack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                queueString.enqueue(str.toLowerCase().charAt(i));
                stackString.push(str.toLowerCase().charAt(i));
            }
        }

        for (int i = 0; i < queueString.getSize(); i++) {
            if (!queueString.dequeue().equals(stackString.pop())) {
                return false;
            }
        }
        return true;
    }
}
