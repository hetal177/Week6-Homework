package Week6;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic(); //obc calling
        obj.Method();
    }

    public void Method() {
        int a = 125;
        int b = 24;

        int add = a + b;
        int mul = a * b;
        int sub = a - b;
        int div = a/b;
        int remainder = a % b;
        Scanner input = new Scanner(System.in);
        System.out.println("Input first number : " );
        System.out.println(a);
        System.out.println("Input second number : " );
       // System.out.println/(  \n);// << how to create space
        System.out.println(b);
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(remainder);
    }
}
