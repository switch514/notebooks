package normal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class No373 {
    public static void main(String[] args) {
        new No373().kSmallestPairs(new int[]{1, 2, 4, 5, 6}, new int[]{3, 5, 7, 9}, 3);
    }

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<List<Integer>> squeue = new PriorityQueue(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                List<Integer> l1 = (List<Integer>) o1;
                List<Integer> l2 = (List<Integer>) o2;
                return compareList(l1, l2);
            }
        });

        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            for (int j = 0; j < Math.min(nums2.length, k); j++) {
                List<Integer> pair = new ArrayList<>();
                pair.add(nums1[i]);
                pair.add(nums2[j]);
                if (squeue.size() < k) {
                    squeue.add(pair);
                } else if (compareList(pair, squeue.peek()) > 0) {
                    squeue.poll();
                    squeue.add(pair);
                }else {
                    continue;
                }
            }
        }
        List<List<Integer>> kSmallestPairs = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            if (!squeue.isEmpty()) {
                kSmallestPairs.add(squeue.poll());
            } else {
                break;
            }
        }
        return kSmallestPairs;
    }

    private int compareList(List<Integer> l1, List<Integer> l2) {
        if (l1.get(0) + l1.get(1) <= l2.get(0) + l2.get(1)) {
            return 1;
        } else {
            return -1;
        }
    }


    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int []dp = new int[nums.length];
        dp[0]= nums[0];
        for(int i=1; i< nums.length; i++){
            if(dp[i-1]<0){
                dp[i] = nums[i];
            }else{
                dp[i] = dp[i-1] + nums[i];
            }
            max = Math.max(dp[i], max);
        }
        return max;
    }

    public int translateNum(int num) {
        String str = String.valueOf(num);
        int [] dp = new int [str.length()+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<=str.length(); i++){
            int n = Integer.parseInt(str.substring(i-2,i));
            if(n>=10 && n<=25){
                dp[i] = dp[i-1] + dp[i-2];
            }else{
                dp[i] = dp[i-1];
            }
        }

        return dp[str.length()];
    }


    public int maxValue(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;


        int [][]dp = new int[row+1][col+1];

        for(int i=1; i<= row; i++){
            for(int j=1; j<=col; j++){
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) + grid[i-1][j-1];
            }
        }

        return dp[row][col];
    }
}
