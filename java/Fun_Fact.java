import java.util.Scanner;
public class Fun_Fact {
    public static void Factorial(int x) {
        
        if(x<0){
            System.out.println("invalid number");
            return;
        }
        int factorial =1;
        for(int i=x;i>=1;i--){
             factorial = factorial* i;
        }
        System.out.println(factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int x = sc.nextInt();

        Factorial(x);
    }
}
