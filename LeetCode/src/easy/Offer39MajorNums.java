package easy;

import java.util.HashMap;
import java.util.Map;

public class Offer39MajorNums {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int num : nums) {
            numMap.put(num, numMap.getOrDefault(num, 0) + 1);
            if (numMap.get(num) > (nums.length / 2)) {
                return num;
            }
        }
        return 0;
    }

    public int moreCount(int[] nums) {
        int count = 0;
        int major = 0;
        for (int num : nums) {
            if (count == 0) {
                major = num;
                count++;
            } else {
                if (num == major) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        return major;
    }
}
