import java.util.Scanner;
public class string_build {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Cheeku");
        System.out.println(sb);
    //    char at index 0
        System.out.println(sb.charAt(0));

    //  set char at index 0
    sb.setCharAt(0, 'P');
    System.out.println(sb);

    sb.insert(1, 'r');
    System.out.println(sb);
    // delete extra 'n'
    sb.delete(1,3);
    System.out.println(sb);
    // append
    sb.append("S"); // str = str+"S";
    sb.append("i");
    sb.append("n");
    sb.append("g");
    sb.append("h");
    System.out.println(sb);
    System.out.println(sb.length());

    }
}
