package easy;

public class Offer57TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int left =0;
        int right = nums.length-1;
        while(left<right){
            int mid = (left+right+1)/2;
            if(nums[mid] >= target){
                right = mid-1;
            }else{
                left = mid;
            }
        }
        left =0;
        boolean isFound = false;
        while (left<right){
            if((nums[left] + nums[right]) == target){
                isFound = true;
                break;
            }else if(nums[left] + nums[right] > target){
                right--;
            }else {
                left ++;
            }
        }
        if(!isFound){
            return new int[0];
        }

        return new int[]{nums[left] , nums[right]};
    }
}
