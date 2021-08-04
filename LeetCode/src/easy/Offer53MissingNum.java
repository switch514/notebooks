package easy;

public class Offer53MissingNum {
    public int missingNumber(int[] nums) {

        for (int i = 0; i < nums.length + 1; i++) {
            if (i >= nums.length || nums[i] != i) {
                return i;
            }

        }
        return 0;
    }

    public int missingNumber2(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left < right) {
            mid = (right + left + 1) / 2;
            if (nums[mid] > mid) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        if (nums[left] == left) {
            return left + 1;
        } else {
            return left;
        }
    }
}
