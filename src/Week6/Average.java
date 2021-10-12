package Week6;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // scanner for input from console

        System.out.println("Input first number");
        float n1 = input.nextFloat();// take float value1 in

        System.out.println("Input Second number");
        float n2 = input.nextFloat();

        System.out.println("Input third number");
        float n3 = input.nextFloat();

        System.out.println("Average of three number = " + (n1+n2+n3)/3);

    }

}
