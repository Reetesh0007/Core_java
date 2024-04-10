import java.util.Scanner;
public class Greater {
    public static void Larger (int A , int B) {
        if(A==B){
            System.out.println("Both are equal.");
        }
        else if(A>B){
            System.out.println("A is greater than B.");
        }
        else{
            System.out.println("B is greater.");
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of A:");
        int A =sc.nextInt();
        System.out.println("Enter the value of B:");
        int B =sc.nextInt();

        Larger(A,B);

    }
}
