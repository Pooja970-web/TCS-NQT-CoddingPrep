public class BuySell {
    public static void main(String[] args) {
        
        int[] prices = {7, 1, 5, 3, 6, 4};

        int ans = 0;
        int min_element = prices[0];

        for(int i = 0; i < prices.length; i++){
            min_element = Math.min(min_element, prices[i]);
            int profit = prices[i] - min_element;
            ans = Math.max(ans, profit);
        }

        System.out.println(ans);
    }
}