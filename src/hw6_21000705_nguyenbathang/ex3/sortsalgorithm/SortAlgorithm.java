package hw6_21000705_nguyenbathang.ex3.sortsalgorithm;

import hw6_21000705_nguyenbathang.ex2.minheappriorityqueue.MinHeapPriorityQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortAlgorithm<T extends Comparable<T>> {
    public void bubleSort(T[] arr) {
        int n = arr.length;
        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-i-1; j++) {
                if(arr[j].compareTo(arr[j+1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public void selectionSort(T[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIdx]) < 0) {
                    minIdx = j;
                }
            }
            T temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public void insertionSort(T[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            T key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public void quickSort(T[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static <T extends Comparable<T>> int partition(T[] arr, int low, int high) {
        T pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;

                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        T temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public void mergeSort(T[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static <T extends Comparable<T>> void merge(T[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        T[] L = Arrays.copyOfRange(arr, left, mid + 1);
        T[] R = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    public void heapSort(T[] arr) {
        MinHeapPriorityQueue<T, T> minHeapPriorityQueue = new MinHeapPriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            minHeapPriorityQueue.insert(arr[i], arr[i]);
        }

        List<T> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(minHeapPriorityQueue.removeMin().getValue());
        }

        arr = list.toArray(arr);
    }

    public void executionTimeBubleSort(T[] array) {
        long excutionTime = 0;
        for (int i = 0; i < 20; i++) {
            long startTime = System.nanoTime();
            bubleSort(array);
            long endTime = System.nanoTime();
            excutionTime = excutionTime + endTime - startTime;
        }

        System.out.println("excution time of buble sort with size = " + array.length + " is " + excutionTime/20 + " nanosecond");
    }

    public void executionTimeSelectionSort(T[] array) {
        long excutionTime = 0;
        for (int i = 0; i < 20; i++) {
            long startTime = System.nanoTime();
            selectionSort(array);
            long endTime = System.nanoTime();
            excutionTime = excutionTime + endTime - startTime;
        }
        System.out.println("excution time of selection sort with size = " + array.length + " is " + excutionTime/20 + " nanosecond");
    }

    public void executionTimeInsertSort(T[] array) {
        long excutionTime = 0;
        for (int i = 0; i < 20; i++) {
            long startTime = System.nanoTime();
            insertionSort(array);
            long endTime = System.nanoTime();
            excutionTime = excutionTime + endTime - startTime;
        }

        System.out.println("excution time of insertion sort with size = " + array.length + " is " + excutionTime/20 + " nanosecond");
    }

    public void executionTimeQuickSort(T[] array) {
        long excutionTime = 0;
        for (int i = 0; i < 20; i++) {
            long startTime = System.nanoTime();
            quickSort(array, 0, array.length - 1);
            long endTime = System.nanoTime();
            excutionTime =excutionTime + endTime - startTime;
        }
        System.out.println("excution time of quick sort with size = " + array.length + " is " + excutionTime/20 + " nanosecond");
    }

    public void executionTimeMergeSort(T[] array) {
        long excutionTime = 0;
        for (int i = 0; i < 20; i++) {
            long startTime = System.nanoTime();
            mergeSort(array, 0, array.length - 1);
            long endTime = System.nanoTime();
            excutionTime =excutionTime + endTime - startTime;
        }
        System.out.println("excution time of merge sort with size = " + array.length + " is " + excutionTime/20 + " nanosecond");
    }

    public void executionTimeHeapSort(T[] array) {
        long excutionTime = 0;
        for (int i = 0; i < 20; i++) {
            long startTime = System.nanoTime();
            heapSort(array);
            long endTime = System.nanoTime();
            excutionTime = excutionTime + endTime - startTime;
        }
        System.out.println("excution time of heap sort with size = " + array.length + " is " + excutionTime/20 + " nanosecond");
    }
}
