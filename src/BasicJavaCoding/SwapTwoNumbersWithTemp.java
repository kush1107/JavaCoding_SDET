package BasicJavaCoding;

public class SwapTwoNumbersWithTemp {

    public static void main(String[] args) {
        int a = 5, b = 10;

        System.out.println("Before swapping: num1 = " + a + ", num2 = " + b);

        // Swapping using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: num1 = " + a + ", num2 = " + b);
    }
}
