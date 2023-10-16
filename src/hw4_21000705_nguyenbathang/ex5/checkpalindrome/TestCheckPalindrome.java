package hw4_21000705_nguyenbathang.ex5.checkpalindrome;

public class TestCheckPalindrome {
    public static void main(String[] args) {
        CheckPalindrome check = new CheckPalindrome();
        System.out.println("1881 is palindrome? " + check.isPalindrome("1881"));
        System.out.println("aaqquqqaa is palindrome? " + check.isPalindrome("aaqquqqaa"));
        System.out.println("My Gym is palindrome? " + check.isPalindrome("My Gym"));
        System.out.println("ThAng is palindrome? " + check.isPalindrome("ThAng"));
    }
}
