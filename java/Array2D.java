import java.util.Scanner;
public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns: ");
        int rows =sc.nextInt();
        int cols = sc.nextInt();
        System.out.println("Enter the elements of array:");
        int [][] numbers = new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print( "Output Array is : " + numbers[i][j]+ " ");

            }
            System.out.println();
        }
    }
}
