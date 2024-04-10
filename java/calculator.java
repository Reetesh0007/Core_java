import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        
    
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the value of A:");
    int A= sc.nextInt();
    System.out.println("Enter the value of B:");
    int B= sc.nextInt();

    System.out.println("Enter choice:");
    int choice =sc.nextInt();
    switch(choice){
        case 1: System.out.println(A+B);
        break;
        case 2: System.out.println(A-B);
        break;
        case 3: System.out.println(A*B);
        break;
        case 4: if(B==0){
            System.out.println("Invalid Division");

        }else{
            System.out.println(A/B);
        }
        break;
        case 5 : if(B==0){
            System.out.println("Invalid Division");
        }else{
         System.out.println(A%B);
        }
        break;
        default:System.out.println("Invalid Choice");
    }

}
}