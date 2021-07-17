package easy;

public class No42SubArraySum {
    public static int maxSubArray(int[] nums) {
        int []subSum = new int[nums.length];
        subSum[0] = nums[0];
        int maxSum = subSum[0];
        for(int i=1;i<nums.length;++i){
            int currentNum = nums[i];
            subSum[i] = Math.max(currentNum + subSum[i-1], currentNum);
            maxSum = Math.max(subSum[i], maxSum);
        }

        return maxSum;
    }
}
