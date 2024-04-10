import java.util.Scanner;
public class Fun_sum {
    public static int calculatesum(int A, int B ) {
       int  sum = A+B;
       return sum;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of A:");
        int A =sc.nextInt();
        System.out.println("Enter the value of B:");
        int B =sc.nextInt();

        int sum =calculatesum(A,B);
        System.out.println("Sum of two numbers is: "+sum);

    }
}
