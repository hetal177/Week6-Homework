package Week6;

public class Program4 {
    int a = 10;//instance variable
    int b =20; //instance variable
    static int c = 30;//static variable
    static int d = 40;//  static variable


    public static void main(String[] args) {
// instance calling in static method
        Program4 method = new Program4();
        method.test();

//static to static  calling
        myMethod();
    }

    public void test() {
        //instance area
        System.out.println(a);//10
        System.out.println(b);//20
        Program4 obj = new Program4();
        System.out.println(obj.c);//30
        Program4 obj1 = new Program4();
        System.out.println(obj1.d);//40
    }

    public static void myMethod() {
        System.out.println(c);// direct calling//30
        System.out.println(d);//40
        Program4 obj3 = new Program4();
        Program4 obj4 = new Program4();
        System.out.println(obj3.a);//10
        System.out.println(obj4.b);//20
    }
}

