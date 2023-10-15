package hw4_21000705_nguyenbathang.ex3.checkvalidbracket;

public class TestCheckValidBracket {
    public static void main(String[] args) {
        CheckValidBracket check = new CheckValidBracket();
        System.out.println(check.checkBracket("(a − b) ∗ (c + d)")); // true
        System.out.println(check.checkBracket("(10 + 8)/((5 − 2) ∗ 17)")); // true

        System.out.println(check.checkBracket("(a + b) ∗ c − d)")); // false
        System.out.println(check.checkBracket("(10 − 8/((2 + 5) ∗ 17)")); // false
        System.out.println(check.checkBracket(")u − v) ∗ (m + n)")); // false
    }
}
