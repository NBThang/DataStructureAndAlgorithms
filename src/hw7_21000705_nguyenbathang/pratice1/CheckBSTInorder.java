package hw7_21000705_nguyenbathang.pratice1;

public class CheckBSTInorder {
    public static boolean isBSTInorder(int[] arr) {
        return isBSTInorder(arr, 0, arr.length - 1);
    }

    private static boolean isBSTInorder(int[] arr, int start, int end) {
        if (start >= end)
            return true;

        int root = arr[start];

        int index = start + 1;
        while (index <= end && arr[index] < root) {
            index++;
        }

        for (int i = index; i <= end; i++) {
            if (arr[i] < root) {
                return false;
            }
        }

        boolean left = isBSTInorder(arr, start + 1, index - 1);
        boolean right = isBSTInorder(arr, index, end);

        return left && right;
    }
}
