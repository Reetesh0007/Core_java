import java.util.Scanner;

public class Switch {
    public static void week(int x) {
    switch (x) {
        case 0:
        System.out.println("Sunday");
             break;
        case 1:
        System.out.println("Monday");
            break;
        case 2:
        System.out.println("Tuesday");
            break;
        case 3:
        System.out.println("wednesday");
            break;
        case 4:
        System.out.println("Thursday");
            break;
        case 5:
        System.out.println("Friday");
            break;
        case 6:
        System.out.println("Saturday");
            break;     
        default:
            break;
    }
  }
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the value of x:");
    int x= sc.nextInt();
    week(x);
  }

}
