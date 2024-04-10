import java.util.Scanner;
public class Search {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the rows and columns :");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int numbers[][] = new int[rows][cols];

        System.out.println("Enter array elements : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j] =sc.nextInt();
            }
        }
        System.out.println("Enter the key :");
        int x = sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(numbers[i][j] == x){
                    System.out.println("x found at location (" + i + " ," + j + ")");
                }
                
            }
        }
       
            System.out.println("Not Found.");
        
    }
    
}
