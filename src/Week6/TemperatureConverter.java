package Week6;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a degree in Fahrenheit");
        double Fahrenheit = input.nextDouble();
        double celsius = ((5 * (Fahrenheit - 32.0)) / 9.0);
        System.out.println(Fahrenheit + " degree Fahrenheit is equal to " + celsius + "in celsius");
    }

}
