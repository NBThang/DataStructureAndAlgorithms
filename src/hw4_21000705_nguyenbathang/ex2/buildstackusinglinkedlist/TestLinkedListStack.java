package hw4_21000705_nguyenbathang.ex2.buildstackusinglinkedlist;

import hw4_21000705_nguyenbathang.ex2.buildstackusingarray.BuildStackUsingArray;

import java.util.Iterator;

public class TestLinkedListStack {
    public static void main(String[] args) {
        LinkedListStack<Integer> myStack = new LinkedListStack<>();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);

        printStack(myStack); // 50 40 30 20 10
        System.out.println(myStack.isEmpty()); // false

        System.out.println(myStack.pop()); // 50
        System.out.println(myStack.pop()); // 40
        System.out.println(myStack.pop());// 30
        printStack(myStack); // 20 10
        System.out.println(myStack.pop()); // 20
        System.out.println(myStack.pop()); // 10

        System.out.println(myStack.isEmpty()); // true
    }
    public static void printStack(LinkedListStack myStack) {
        Iterator<Integer> iterator = myStack.iterator();
        System.out.println("My Stack");
        while (iterator.hasNext()) {
            int element = iterator.next();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
