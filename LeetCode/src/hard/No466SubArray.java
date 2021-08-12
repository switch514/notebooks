package hard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class No466SubArray {

    public int numberOfArithmeticSlices(int[] nums) {
        if (null == nums || 3 > nums.length) {
            return 0;
        }

        Map<Long, Integer>[] dps = new HashMap[nums.length];
        for(int i=0;i<nums.length;i++){
            dps[i] = new HashMap<>();
        }


        int result = 0;
        for (int i = 1; i < nums.length; i++) {

            for (int j = 0; j < i; j++) {
                long diff = (long)nums[i] - (long)nums[j];
                dps[i].put(diff, dps[i].getOrDefault(diff, 0) + 1 + dps[j].getOrDefault(diff,0));
                if(dps[j].containsKey(diff)){
                    result = result+dps[j].get(diff);
                }
            }
        }

        return result;
    }
}
