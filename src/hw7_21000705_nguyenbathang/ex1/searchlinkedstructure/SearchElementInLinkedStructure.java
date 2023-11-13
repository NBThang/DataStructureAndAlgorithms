package hw7_21000705_nguyenbathang.ex1.searchlinkedstructure;

import hw3_21000705_nguyenbathang.ex3.simplelinkedlist.SimpleLinkedList;

public class SearchElementInLinkedStructure<T extends Comparable> {
    private SimpleLinkedList linkedList;

    public SearchElementInLinkedStructure(SimpleLinkedList simpleLinkedList) {
        this.linkedList = simpleLinkedList;
    }
    public boolean linearSearch(SimpleLinkedList<T> linkedList, T element) {
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).compareTo(element) == 0) {
                return true;
            }
        }

        return false;
    }
}
