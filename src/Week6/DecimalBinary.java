package Week6;

import java.util.Scanner;

public class DecimalBinary {


    public static void main(String[] args) {
      DecimalBinary obj = new DecimalBinary(); // Instance to static calling  by object

        obj.Binary();

    }

    public void Binary() {
        int x= 5; // int used for decimal input
        Scanner input = new Scanner(System.in);
        System.out.println("Input first binary number: 5"); //5
        System.out.print("Binary number is : "); // print used to print results in same line
        System.out.println(Integer.toBinaryString(5));


    }
}