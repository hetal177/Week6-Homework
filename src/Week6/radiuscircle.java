package Week6;

import java.util.Scanner;

public class radiuscircle {
    public static void main(String[] args) {

        //double radius, area;
        Scanner input = new Scanner(System.in);
        System.out.println("enter radius value");
        double radius = input.nextDouble();
        //input.close(); ??
        double area = Math.PI * radius * radius;

        System.out.println("Area = " +  area);
    }


}
