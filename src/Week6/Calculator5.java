package Week6;

import java.util.Scanner;

public class Calculator5 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);

        System.out.println("Enter first number");
        int a1 = myobj.nextInt(); // 1st int input

        System.out.println("Enter second number");
        int a2 = myobj.nextInt(); // 2nd int input

        Calculator5 cal = new Calculator5(); // obj created for calling static and instance method
        System.out.println("Addition");// tried to do statment prient as "Addition of a1 and a2 : ans << but couldn't
        cal.addition(a1, a2);
        System.out.println("Subtraction");
        cal.subtraction(a1,a2);
        System.out.println("multiplication");
        multiplication(a1,a2);
        System.out.println("division");
        division(a1,a2);
    }

    public void addition(int a1, int a2) {

        System.out.println(a1 + a2);
    }

    public void subtraction(int a1, int a2) {

        System.out.println(a1 - a2);
    }

    public static void multiplication(int a1, int a2) {
        System.out.println(a1 * a2);

    }

    public static void division(int a1, int a2) {
        System.out.println(a1 / a2);

    }

}