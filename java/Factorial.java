import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int x = sc.nextInt();
        int factorial = 1;
        for(int i=1;i<=x;i++){
            factorial *= i;
        }
        System.out.println("Factorial of " + x + " is: " + factorial);

    }
}
