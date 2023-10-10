package hw2_21000705_nguyenbathang.evaluatesort;

public class AlgorithmsSort {
    public AlgorithmsSort(){

    }

    static private int countCompareQuickSort = 0;
    static private int countSwapQuickSort = 0;

    static private int countCompareMergeSort = 0;
    static private int countSwapMergeSort = 0;

    public int[] bubleSort(int[] array) {
        int[] cloneArray = array.clone();
        for (int i = 0; i < cloneArray.length; i++) {
            for (int j = 1; j < cloneArray.length - i; j++) {
                if (cloneArray[j-1] > cloneArray[j]) {
                    int temp = cloneArray[j-1];
                    cloneArray[j-1] = cloneArray[j];
                    cloneArray[j] = temp;
                }
            }
        }

        return cloneArray;
    }

    public void bubleSortPrintAfterEachLoop(int[] array) {
        int[] cloneArray = array.clone();
        int countCompare = 0;
        int countSwap = 0;

        for (int i = 0; i < cloneArray.length; i++) {
            for (int j = 1; j < cloneArray.length - i; j++) {
                if (cloneArray[j-1] > cloneArray[j]) {
                    int temp = cloneArray[j-1];
                    cloneArray[j-1] = cloneArray[j];
                    cloneArray[j] = temp;
                    countSwap++;
                }
                countCompare++;
                print(cloneArray);
                System.out.println();
            }
            print(cloneArray);
            System.out.println();
        }
        System.out.println("comparison number using buble sort is: " + countCompare);

        System.out.println("number of swap using buble is: " + countSwap);
    }

    public int[] selectionSort(int[] array) {
        int[] cloneArray = array.clone();
        for (int i = cloneArray.length - 1; i >= 1; i--) {
            int maxIndex = i;
            for (int j =0; j < i; j++) {
                if (cloneArray[j] > cloneArray[maxIndex]) {
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                int temp = cloneArray[maxIndex];
                cloneArray[maxIndex] = cloneArray[i];
                cloneArray[i] = temp;
            }
        }
        return cloneArray;
    }

    public void selectionSortPrintAfterLoop(int[] array) {
        int[] cloneArray = array.clone();
        int countCompare = 0;
        int countSwap = 0;

        for (int i = cloneArray.length - 1; i >= 1; i--) {
            int maxIndex = i;
            for (int j = 0; j < i; j++) {
                if (cloneArray[j] > cloneArray[maxIndex]) {
                    maxIndex = j;
                }
                countCompare++;
            }

            if (maxIndex != i) {
                int temp = cloneArray[maxIndex];
                cloneArray[maxIndex] = cloneArray[i];
                cloneArray[i] = temp;
                countSwap++;
                countCompare++;
            }

            print(cloneArray);
            System.out.println();
        }

        System.out.println("comparison number using seletion sort is: " + countCompare);

        System.out.println("number of swap using selection is: " + countSwap);
    }

    public int[] insertionSort(int[] array) {
        int[] cloneArray = array.clone();
        for (int i = 1; i < cloneArray.length; i++) {
            int next = cloneArray[i];
            int j;

            for (j = i - 1; j >= 0 && cloneArray[j] > next; j--) {
                cloneArray[j+1] = cloneArray[j];
            }
            cloneArray[j+1] = next;
        }
        return cloneArray;
    }

    public void insertionSortPrintAfterLoop(int[] array) {
        int n = array.length;
        int countCompare = 0;
        int countSwap = 0;

        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                countCompare++;
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
                countSwap++;
            }

            print(array);
            System.out.println();
        }


        System.out.println("comparison number using insertion sort is: " + countCompare);

        System.out.println("number of swap using insertion is: " + countSwap);

    }

    public int[] quickSort(int array[], int low, int high) {
        int[] cloneArray = array.clone();
        if (low < high) {

            int pi = partition(array, low, high);

            quickSort(cloneArray, low, pi - 1);
            quickSort(cloneArray, pi + 1, high);
        }
        return cloneArray;
    }

    public void getCountCompareAndSwapQuickSort() {
        System.out.println("comparison number using quick sort is: " + countCompareQuickSort);
        System.out.println("number of swap using quick sort is: " + countSwapQuickSort);
    }

    public void quickSortWithCount(int[] arr, int low, int high) {

        if (low < high) {
            int pivot = partitionWithCount(arr, low, high);
            quickSortWithCount(arr, low, pivot - 1);
            quickSortWithCount(arr, pivot + 1, high);
        }

    }

    public static int partitionWithCount(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            countCompareQuickSort++;
            if (arr[j] <= pivot) {
                i++;
                countSwapQuickSort++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }


        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        countSwapQuickSort++;

        return i + 1;
    }


    public int[] mergeSort(int array[], int left, int right) {
        int[] cloneArray = array.clone();
        if (left < right) {
            // Find the middle point
            int mid = (left + right) / 2;

            // Sort first and second halves
            mergeSort(cloneArray, left, mid);
            mergeSort(cloneArray, mid + 1, right);

            // Merge the sorted halves
            merge(cloneArray, left, mid, right);
        }
        return cloneArray;
    }

    public void mergeSortWithCount(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSortWithCount(arr, left, mid);
            mergeSortWithCount(arr, mid + 1, right);
            mergeWithCount(arr, left, mid, right);
        }
    }

    public void getCountCompareAndSwapMergeSort() {
        System.out.println("comparison number using merge sort is: " + countCompareMergeSort);
        System.out.println("number of swap using merge sort is: " + countSwapMergeSort);
    }


    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void merge(int array[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = array[left + i];
        }
        for (int j = 0; j < n2; ++j){
            R[j] = array[mid + 1 + j];
        }

        int i = 0, j = 0;

        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            }
            else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }



    public static void mergeWithCount(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            countCompareMergeSort++;
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
                countSwapMergeSort++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    public static void print(int[] a) {
        for (int temp : a) {
            System.out.print(temp + " ");
        }
    }

}
