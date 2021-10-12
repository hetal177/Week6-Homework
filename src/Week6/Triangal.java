package Week6;

import java.util.Scanner;

public class Triangal {
    public static void main(String[] args) {
        float l,b,area;
        Scanner input = new Scanner(System.in);
        System.out.println("input length");
        l = input.nextFloat();

        System.out.println("input base");
        b= input.nextFloat();

        area= (l*b)/2;
        System.out.println("Area of Triangle is = " +area);





    }
}
