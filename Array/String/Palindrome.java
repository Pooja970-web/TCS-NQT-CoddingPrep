import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter a string to check if it is a palindrome:");
        String str = sc.nextLine();
        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--){
            rev += str.charAt(i);
        }

        if(str.equals(rev))
            System.out.println("Given string is a palindrome");
        else
            System.out.println("Given string is not a palindrome");
    }
}