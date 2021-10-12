package Week6;

import java.util.Scanner;

public class UpperToLower {
    private static Scanner SC;

    public static void main(String[] args) {
        UpperToLower obj = new UpperToLower();
        obj.upper();
    }

    public void upper() {
        String Uppercase;
        SC = new Scanner(System.in);


        Scanner input = new Scanner(System.in);
        System.out.println(" Input string");

        Uppercase = SC.nextLine();
        String uppercase1 = Uppercase.toLowerCase();

        System.out.println("lower case string = " + uppercase1);

    }
}
