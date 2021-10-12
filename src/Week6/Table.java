package Week6;

import java.util.Scanner;

public class Table {

    public static void main(String[] args) {
        int i,k;
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the number for the table");
        int n = SC.nextInt();
        for (i=1;i<=10;i++){
            k=n+1;
            System.out.println(n+"*" + i + "=" + k);
        }

    }
}
