import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int A = sc.nextInt();
        int i=1;
        while(i<=10){
            int table = A*i; 
            i++;
            System.out.println("Table of the given number is :"+table);
          
        }
    }
}
