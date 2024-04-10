import java.util.Scanner;
public class Odd {
    public static void Even(int num) {
             if(num%2==0)
                 System.out.println("Given number is an even number");
              else
                System.out.println("Given number is an odd number");    
                }
             public static void main(String[] args) {
                Scanner sc =new Scanner(System.in);
                System.out.println("enter the number:");
               int num =sc.nextInt();
                Even(num);
            }
    
}
