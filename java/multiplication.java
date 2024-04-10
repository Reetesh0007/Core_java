import java.util.Scanner;
public class multiplication {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number:");
    int A= sc.nextInt();
    System.out.println("Enter the second number:");
    int B = sc.nextInt();
    int Addition=A+B;
    int Subtraction = A-B;
    int Multiplication = A*B;
    int Division= A/B;
    int Remainder =A%B;
    System.out.println("Additon of two numbers is :"+Addition);
    System.out.println("Subtraction of two numbers is:"+Subtraction);
    System.out.println("Multiplication of two numbers is:"+Multiplication);
    System.out.println("Division of two numbers is:"+Division);
    System.out.println("Remainder:"+Remainder);
}
}
