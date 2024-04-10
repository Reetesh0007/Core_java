import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        // int  marks[] = new int[3];
            // int marks[] ={97,98,95};
        // marks[0] = 97;
        // marks[1] = 98;
        // marks[2] = 95;
        // for(int i=0;i<3;i++){
        //     System.out.println(marks[i]);
        // }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n =sc.nextInt();

        int numbers[] = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            numbers[i] =sc.nextInt();
        }
        System.out.println("Enter key : ");
        int x = sc.nextInt();
        
        for(int i=0;i<n;i++){
            if(numbers[i]==x){
                System.out.println("x is  found at index : " + i);
            }
           
        }
        System.out.println("Not Found.");
    }
}
