import java.util.Scanner;
public class Leap {
    public static void leap(int year) {
            if((year%4 == 0 && year%100 != 0 ) || ( year%400 == 0))
              System.out.println("Leap Year");
            else
              System.out.println("Not leap year");
         }
             public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter an year:");
             int year =sc.nextInt();
             leap(year);
         }
}
