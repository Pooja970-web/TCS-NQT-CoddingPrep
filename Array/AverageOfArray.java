import java.util.*;

public class AverageOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += arr[i];
        }

        double avg = (double) sum / n;

        System.out.println("Average of array elements is: " + avg);
    }
}