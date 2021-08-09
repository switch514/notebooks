package easy;

import java.util.HashSet;
import java.util.Set;

public class Offer61Poker {
    public boolean isStraight(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Set<Integer> repeat = new HashSet<>();
        //int zeroCount = 0;
        for (int num : nums) {
            if (num == 0) {
                //zeroCount++;
                continue;
            } else {
                if(repeat.contains(num)){
                    return false;
                }
                repeat.add(num);
                min = Math.min(min, num);
                max = Math.max(max, num);
            }
        }
        if (max - min >=5) {
            return false;
        } else {
            return true;
        }

    }
}
