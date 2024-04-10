import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int A=sc.nextInt();
        boolean isPrime = true;

        
        if (A < 2) {
            isPrime = false;
        }

        
        for (int i = 2; i <= Math.sqrt(A); i++) {
            if (A % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(A + " is a prime number.");
        } else {
            System.out.println(A + " is not a prime number.");
        }
    }
}

