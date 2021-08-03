package normal;

public class No581SubArray {

    public int findUnsortedSubarray(int[] nums) {
        if (null == nums || nums.length == 0) {
            return 0;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int left=0;
        int right=0;
        for(int i=0; i< nums.length; i++){
            if (nums[i]<max){
                right =i;
            }
            max = Math.max(max,nums[i]);

            if(nums[nums.length - i -1]>min){
                left=nums.length - i -1;
            }
            min = Math.min(nums[nums.length - i -1],min);
        }
        return left == right? 0: right - left +1;
    }
}
