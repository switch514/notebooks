package practice.offer;

import java.util.HashMap;
import java.util.Map;

public class ArrayNo8 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numMap = new HashMap<>();
        for(int i=0; i< nums.length; i++){
            int num = nums[i];
            if(numMap.containsKey(num)){
                return new int[] {i, numMap.get(num)};
            }else{
                numMap.put(target - num, i);
            }
        }
        return new int[0];
    }
}
