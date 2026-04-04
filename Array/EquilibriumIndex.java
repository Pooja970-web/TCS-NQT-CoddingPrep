public class EquilibriumIndex {

    public static void main(String[] args) {

        int arr[] = {1, 3, 5, 2, 2};

        int totalSum = 0;

        for (int sum : arr) {
            totalSum += sum;
        }

        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {

            totalSum -= arr[i]; // right sum

            if (leftSum == totalSum) {
                System.out.println("Equilibrium Index " + i);
                return;
            }

            leftSum += arr[i];
        }

        // ✅ only once, after loop
        System.out.println("No equilibrium index");
    }
}