package normal;

import java.util.HashMap;
import java.util.Map;

public class NumArray {

    private Map<Integer,Integer> arrayMap = new HashMap<>();

    public NumArray(int[] nums) {
        if(null == nums){
            return ;
        }
        for(int i = 0; i<nums.length; i++){
            arrayMap.put(i,nums[i]);
        }
    }

    public void update(int index, int val) {
        if(arrayMap.containsKey(index)){
            arrayMap.put(index,val);
        }
    }

    public int sumRange(int left, int right) {
        int sum=0;
        for(int j=left; j<=right; j++){
            sum+=arrayMap.get(j);
        }
        return sum;
    }

}
