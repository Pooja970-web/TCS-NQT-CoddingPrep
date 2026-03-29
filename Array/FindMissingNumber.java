import java.util.*;
//Fid the missing number in the array of size n-1 containing numbers from 1 to n
public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] arr = new int[n - 1];

        for(int i = 0; i < n - 1; i++){
            arr[i] = sc.nextInt();
        }

        int total = n * (n + 1) / 2;
        int sum = 0;

        for(int i = 0; i < n - 1; i++){
            sum += arr[i];
        }

        System.out.println("The missing number is: " + (total - sum));
    }
}