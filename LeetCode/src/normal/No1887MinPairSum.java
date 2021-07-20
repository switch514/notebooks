package normal;

import java.util.Arrays;

public class No1887MinPairSum {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        for (int i=0; i<nums.length; ++i){
            max = Math.max(nums[i]+nums[nums.length-i-1],max);
        }
        return max;
    }
}
