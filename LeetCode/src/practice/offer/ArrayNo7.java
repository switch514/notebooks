package practice.offer;

import java.util.Arrays;

public class ArrayNo7 {
    /**
     * 输入: [0,1,0,3,12]
     * 输出: [1,3,12,0,0]
     *
     * @param nums
     */
    public static void moveZeroes(int[] nums) {

        int nIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                while ((nIndex <= nums.length - 1) && nums[nIndex] == 0) {
                    nIndex++;
                }
                if ((nIndex > nums.length - 1)) {
                    return;
                }
                nums[i] = nums[nIndex];
                nums[nIndex] = 0;
            }
            nIndex++;
        }
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{0, 1, 0, 3, 12};
        moveZeroes(array1);
        System.out.println(Arrays.toString(array1));
        array1 = new int[]{1, 0, 1};
        moveZeroes(array1);
    }
}
