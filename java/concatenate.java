import java.util.Scanner;
public class concatenate {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your firstname : ");
       String firstname = sc.nextLine();
       System.out.println("Enter your lastname : ");
       String lastname = sc.nextLine();
// Concatenate   

       String fullname = firstname+ " " + lastname;
       System.out.println("Fullname is : " +fullname);
// Length 
       System.out.println(fullname.length());
//  charAt
       for(int i=0;i<fullname.length();i++){
        System.out.println(fullname.charAt(i));
}
// comparison
       if(firstname.compareTo(lastname) == 0){
        System.out.println("Equal");
}
else{
    System.out.println("Not equal.");
}

// substring
 String sentence = "My name is Reetesh.";
 String name = sentence.substring(11, sentence.length());
 System.out.println(name);

 String sentence1 = "ReeteshAarya";
 String name1 = sentence1.substring(7);
 System.out.println(name1);
    }

}
