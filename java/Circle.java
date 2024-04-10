import java.util.Scanner;
public class Circle {
    public static double circumference(double r) {
        double pi= 3.14 ;
         double C =2*pi*r;
         return C;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double r =sc.nextDouble();
        
        double Result =Math.round(circumference(r)*1000)/1000.0;
        System.out.println("Circumference of the circle is :" +Result);

    }
}
