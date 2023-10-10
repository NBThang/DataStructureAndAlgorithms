package hw2_21000705_nguyenbathang.sortalltype;

public class Sort {
    public static void main(String[] args) {
        Integer[] integerArray = {1,2,5,7,9,2,4,11,10,8};
        SortGeneric<Integer> sortInteger = new SortGeneric<>();
        System.out.println("befor sort array integer");
        sortInteger.printArray(integerArray);
        sortInteger.bubbleSort(integerArray);
        System.out.println("after sort array integer");
        sortInteger.printArray(integerArray);

        System.out.println();

        Double[] doublesArray = {1.4 ,2.7, 5.4, 7.0, 9.1, 2.2, 4.6, 11.3, 10.8,8.11};
        SortGeneric<Double> sortDouble = new SortGeneric<>();
        System.out.println("befor sort array double");
        sortDouble.printArray(doublesArray);
        sortDouble.bubbleSort(doublesArray);
        System.out.println("after sort array double");
        sortDouble.printArray(doublesArray);

    }
}
