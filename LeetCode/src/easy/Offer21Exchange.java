package easy;

public class Offer21Exchange {
    public int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (left < nums.length && isOdd(nums[left])) {
                left++;
            }
            while (right > 0 && !isOdd(nums[right])) {
                right--;
            }
            if (left >= right) {
                break;
            }
            int tmp = nums[right];
            nums[right] = nums[left];
            nums[left] = tmp;
        }
        return nums;
    }

    private boolean isOdd(int num) {
        return (num &1) == 1;
    }
}
