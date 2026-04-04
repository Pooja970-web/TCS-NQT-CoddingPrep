public class MovesZeroAtTheEnd {
    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};

        int j = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        // Correct way to print array
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}