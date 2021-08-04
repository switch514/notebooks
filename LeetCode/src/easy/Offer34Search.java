package easy;

public class Offer34Search {
    public int search(int[] nums, int target) {
        int count=0;
        boolean isFound = false;
        for(int num:nums){
            if(target == num){
                isFound = true;
                count++;
            }else{
                if(isFound){
                    break;
                }
            }
        }
        return count;
    }

    public int searchBin(int[] nums, int target){
        if(null == nums || nums.length==0){
            return 0;
        }

        int left =0;
        int right = nums.length-1;
        int mid = 0;
        while(left<right){
            mid = (right+left+1)/2;
            if(nums[mid] > target){
                right = mid-1;
            }else if(nums[mid] < target){
                left = mid;
            }else{
                left = mid;
                break;
            }
        }
        int count =0;
        right=left+1;
        while(left>=0 && nums[left]==target){
            count++;
            left--;
        }
        while(right<nums.length && nums[right]==target){
            count++;
            right++;
        }
        return count;

    }


}
