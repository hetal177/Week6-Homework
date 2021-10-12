package Week6;

public class AreaPerimeter {
    public static void main(String[] args) {
        Ap();


    }

    public static void Ap() {

        final double w = 5.6;
        final double h = 8.5;

        double perimeter = 2 * (h + w);

        double area = w * h;


        System.out.printf("Area is %.1f * %.1f = %.2f \n ", w, h, area); // ? 1f
        System.out.printf( "Perimeter is 2*(%.1f + %.1f) = %.2f \n", h, w, perimeter);
    }


}



