package normal;

import java.util.Arrays;

public class No611TriangleCount {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int result=0;
        for(int i=nums.length-1; i>=0; i--){
            int left=0;
            int right = i-1;
            while(left<right){
                if(nums[left] + nums[right] > nums[i]){
                    result = result + (right - left);
                    right--;
                }else{
                    left++;
                }
            }
        }
        return result;
    }
}
