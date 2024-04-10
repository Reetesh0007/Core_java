import java.util.Scanner;
public class Divide {
    public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number:");
    int numerator =sc.nextInt();
    System.out.println("Enter the second number:");
    int denominator =sc.nextInt();

   if(denominator != 0){
   int result = numerator/denominator;
    System.out.println("The result of division is:"+result);
   }
   else
   System.out.println("Can not Divide by zero");
}
}