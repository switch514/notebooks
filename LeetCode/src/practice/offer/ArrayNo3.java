package practice.offer;

import java.util.Arrays;

public class ArrayNo3 {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int [] temp = new int[k];
        System.arraycopy(nums,nums.length-k, temp, 0, k);
        System.arraycopy(nums, 0, nums, k, nums.length-k);
        System.arraycopy(temp, 0, nums, 0, k);
    }

    public static void main(String[] args) {
        int [] nums = new int []{1,2,3,4,5,6,7};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}
