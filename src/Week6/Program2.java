package Week6;

public class Program2 {
    static int a = 10;
    static int b = 20;


    public static void main(String[] args) {
        System.out.println(Program2.a);
        System.out.println(Program2.b);
        myMethod();
    }

    public static void myMethod() {
        System.out.println(a);
        System.out.println(b);

    }
}