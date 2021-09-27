package normal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Offer56Counts {
    public int[] singleNumbers(int[] nums) {
        if (nums.length <= 2) {
            return nums;
        }

        Arrays.sort(nums);
        int[] res = new int[2];
        int index = 0;
        int count = 1;

        if (nums[0] != nums[1]) {
            res[index++] = nums[0];
        }
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] && nums[i - 1] != nums[i - 2]) {
                res[index++] = nums[i - 1];
            }
            if ((i == nums.length - 1) && nums[i] != nums[i - 1]) {
                res[index++] = nums[i];
            }
        }
        return res;
    }

    public int[] singleNumbers2(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            if (numSet.contains(num)) {
                numSet.remove(num);
            } else {
                numSet.add(num);
            }
        }

        int[] res = new int[2];
        Integer[] arrays = numSet.toArray(new Integer[0]);
        for (int i = 0; i < 2; i++) {
            res[i] = arrays[i];
        }
        return res;
    }

    /**
     * 求异或 标准算法
     *
     * @param nums
     * @return
     */
    public int[] singleNumbers3(int[] nums) {
        int twoSum = 0;
        for (int num : nums) {
            twoSum = twoSum ^ num;
        }

        int div = 1;
        while ((div & twoSum) == 0) {
            div = div << 1;
        }
        int[] res = new int[2];
        for (int num : nums) {
            if ((num & div) == 0) {
                res[0] = res[0] ^ num;
            } else {
                res[1] = res[1] ^ num;
            }
        }
        return res;
    }

    /**
     * 在一个数组 nums 中除一个数字只出现一次之外，其他数字都出现了三次。请找出那个只出现一次的数字。
     *
     * @param nums
     * @return
     */
    public int singleNumberII(int[] nums) {
        int[] numBits = new int[32];
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                if ((num >> i & 1) == 1) {
                    numBits[i]++;
                }
            }
        }

        int res=0;
        for(int i=31; i>=0;i--){
            res = res <<1;
            if(numBits[i] %3==1){
                res = res | 1;
            }
        }
        return res;
    }
}
