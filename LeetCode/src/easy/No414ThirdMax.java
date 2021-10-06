package easy;

import java.util.*;

public class No414ThirdMax {
    public int thirdMax(int[] nums) {
        if (null == nums || nums.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            if (!set.contains(n)) {
                set.add(n);
            }
        }
        List<Integer> list = Arrays.asList(set.toArray(new Integer[0]));
        Collections.sort(list);
        return list.size() >= 3 ? list.get(list.size() - 3) : list.get(list.size() - 1);
    }
}
