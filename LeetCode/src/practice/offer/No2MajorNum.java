package practice.offer;

import java.util.Arrays;

public class No2MajorNum {
    /**
     * nlogn
     *
     * @param nums
     * @return
     */
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public static int majorityElementMore(int[] nums) {
        int major = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {

            if (major == nums[i]) {
                count++;
            } else {
                count--;
            }

            if (0 == count) {
                major = nums[i];
                count = 1;
            }
        }
        return major;
    }

    public static void main(String[] args) {
        System.out.println(majorityElementMore(new int[]{1, 3, 2, 2, 1, 3, 3}));
    }
}
