package hw7_21000705_nguyenbathang.ex1.searcharray;

import java.util.Arrays;

public class SearchElementInArray<T extends Comparable> {
    public boolean linearSearch(T[] array, T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(element) == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean binarySearchSortedArray(T[] array, T element) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (right - left) / 2;

            if (array[mid].compareTo(element) == 0) {
                return true;
            }

            if (element.compareTo(array[mid]) > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public boolean binarySearchUnSortedArray(T[] array, T element) {
        Arrays.sort(array);

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (right - left) / 2;

            if (array[mid].compareTo(element) == 0) {
                return true;
            }

            if (element.compareTo(array[mid]) > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}