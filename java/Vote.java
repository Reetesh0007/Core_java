import java.util.Scanner;
public class Vote {
    public static void eligible(int age) {
          if(age >= 18){
         System.out.println("Yes, You are adult" );  
         }
         else{
             System.out.println("Not Adult");
         }
         }
         public static void main(String[] args) {
             Scanner sc= new Scanner(System.in);
             System.out.println("enter your age:");
             int age = sc.nextInt();
             eligible(age);
         }
}
