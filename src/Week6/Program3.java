package Week6;

public class Program3 {

    int a = 10;
    static int c = 20;

    public static void main(String[] hetal) {

        Program3 obj = new Program3();
        obj.test();
        //System.out.println(c);
        myMethod();
    }

    public void test() {
        //instance area
        System.out.println(a);// direct calling
        Program3 obj1 = new Program3();
        System.out.println(Program3.c); // calling by class
    }

    public static void myMethod() {
        System.out.println(c);// direct calling
        Program3 obj2 = new Program3();
        System.out.println(obj2.a);


    }
}
