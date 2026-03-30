import java.util.*;

public class MaxDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int maxDiff = 0;

        for(int i = 1; i < n; i++){
            if(arr[i] - min > maxDiff){
                maxDiff = arr[i] - min;
            }

            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Maximum difference: " + maxDiff);
    }
}