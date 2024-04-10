import java.util.Scanner;
public class Functions {
    public static void printMyName(Strings name) {
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any name:");
        Strings name =sc.next();

        printMyName(name);
    }
}
