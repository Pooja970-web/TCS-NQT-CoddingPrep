import java.util.*;

public class CountEvenandOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int even = 0, odd = 0;

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();

            if(num % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}