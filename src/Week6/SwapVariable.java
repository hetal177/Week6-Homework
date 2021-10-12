package Week6;

public class SwapVariable {

    public static void main(String[] args) {
        int a, b, swap; // swap is third temporary variable
        a = 10;
        b = 20;
        System.out.println("Before swapping : a,b = " + a + "," + +b);

       swap = a;
        a = b;
        b= swap;
        System.out.println("After swapping : a,b = " + a + "," + +b);

    }
}
