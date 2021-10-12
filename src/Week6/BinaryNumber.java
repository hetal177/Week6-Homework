package Week6;

import java.util.Scanner;

public class BinaryNumber {


    public static void main(String[] args) {
        BinaryNumber obj = new BinaryNumber();

        obj.Binary();

    }

    public void Binary() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first binary number: "); //10 as string not int
        String a = input.next();
        System.out.println("Input Second binary number: "); //11
        String b = input.next();
        int n1 = Integer.parseInt(a, 2);// get converted in binary code with base 2
        int n2 = Integer.parseInt(b, 2);
        int n3 = n1 + n2;
       // System.out.println(n3); < print as int : 5  which is = 101 binary code
        System.out.println("sum of two binary numbers: " + Integer.toBinaryString(n3));//101
        // this function convert binary code to string so its doesnt get printed as 5 as integer


    }

}
