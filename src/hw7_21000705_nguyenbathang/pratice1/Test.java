package hw7_21000705_nguyenbathang.pratice1;

public class Test {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 10, 12, 15, 17};

        CheckBSTInorder check = new CheckBSTInorder();

        if (check.isBSTInorder(arr)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
