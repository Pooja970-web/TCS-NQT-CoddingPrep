public class Palindrome{
    //121=121
   public static void main(String[] args) {
        int n = 121, rev = 0, temp = n;

        while(n > 0){
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        if(temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}