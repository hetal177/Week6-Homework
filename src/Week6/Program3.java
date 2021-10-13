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
       //program 3 obj1 = new Program3();
        System.out.println(Program3.c); // calling by class name
    }

    public static void myMethod() {

        System.out.println(c);// direct calling//20
        Program3 obj2 = new Program3();
        obj2.a=10;
        System.out.println(obj2.a);//10



    }
}
