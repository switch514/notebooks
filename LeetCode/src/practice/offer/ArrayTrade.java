package practice.offer;

public class ArrayTrade {

    public static int maxProfit(int[] prices) {
        int profit = 0;
        int low = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int p = prices[i] - low;
            if (p > 0) {
                profit += p;
            }
            low = prices[i];

        }
        return profit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{1, 2, 3, 4, 5}));
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

}
