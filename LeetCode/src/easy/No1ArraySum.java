package easy;

import java.util.HashMap;
import java.util.Map;

public class No1ArraySum {
    public static int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; ++i) {
//            for (int j = i + 1; j < nums.length; ++j) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
        Map<Integer,Integer> posMap = new HashMap<Integer,Integer>();
        for(int i =0 ; i<nums.length; i ++){
            if(posMap.containsKey(target - nums[i])){
                return new int[]{posMap.get(target - nums[i]),i};
            }else{
                posMap.put(nums[i],i);
            }
        }
        return new int[0];
    }
}
