import java.util.Scanner;
public class Fun_mul {
    public static int calculateProduct(int A, int B) {
        int Product = A*B;
        return Product;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of A:");
        int A =sc.nextInt();
        System.out.println("Enter the value of B:");
        int B =sc.nextInt();
          
        int Product = calculateProduct(A,B);
        System.out.println("Product of two nuumbers is : "+Product);
    }
}
