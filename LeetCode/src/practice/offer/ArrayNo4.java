package practice.offer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayNo4 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int i=0; i< nums.length; i++){
            if(!numSet.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
