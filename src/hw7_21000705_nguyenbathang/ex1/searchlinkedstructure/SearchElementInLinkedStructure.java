package hw7_21000705_nguyenbathang.ex1.searchlinkedstructure;

import hw3_21000705_nguyenbathang.ex3.simplelinkedlist.SimpleLinkedList;

public class SearchElementInLinkedStructure<T extends Comparable> {
    //    private SimpleLinkedList linkedList;
//
//    public SearchElementInLinkedStructure(SimpleLinkedList simpleLinkedList) {
//        this.linkedList = simpleLinkedList;
//    }
    public boolean linearSearch(SimpleLinkedList<T> linkedList, T element) {
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).compareTo(element) == 0) {
                return true;
            }
        }

        return false;
    }

    public boolean binarySearchInSortLinkedList(SimpleLinkedList<T> simpleLinkedLis, T element) {
        int left = 0;
        int right = simpleLinkedLis.size() - 1;

        while (left <= right) {
            int mid = (right - left) / 2;

            if (simpleLinkedLis.get(mid).compareTo(element) == 0) {
                return true;
            }

            if (element.compareTo(simpleLinkedLis.get(mid)) > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public boolean binarySearchInUnSortLinkedList(SimpleLinkedList<T> simpleLinkedLis, T element) {
        sortLinkedList(simpleLinkedLis);
        int left = 0;
        int right = simpleLinkedLis.size() - 1;

        while (left <= right) {
            int mid = (right - left) / 2;

            if (simpleLinkedLis.get(mid).compareTo(element) == 0) {
                return true;
            }

            if (element.compareTo(simpleLinkedLis.get(mid)) > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    private void sortLinkedList(SimpleLinkedList<T> simpleLinkedList) {
        for (int i = 0; i < simpleLinkedList.size() - 1; i++) {
            if (simpleLinkedList.get(i).compareTo(simpleLinkedList.get(i + 1)) > 0) {
                T temp = simpleLinkedList.get(i);
                simpleLinkedList.set(i, simpleLinkedList.get(i + 1));
                simpleLinkedList.set(i + 1, temp);
            }
        }
    }
}