package BasicJavaCoding;

public class SwapTwoNumbersWithoutTemp {
    public static void main(String[] args) {
        int a = 6, b = 106;

        System.out.println("Before swapping: a = " + a + ", b = " + b);
        // Swapping without using a temporary variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
