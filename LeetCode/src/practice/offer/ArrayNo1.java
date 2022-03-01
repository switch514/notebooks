package practice.offer;

import java.util.Arrays;

public class ArrayNo1 {
    public static int removeDuplicates(int[] nums) {
        if(null == nums || 0== nums.length){
            return 0;
        }
        int index = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] == nums[i]){
                continue;
            }else{
                index++;
                nums[index] = nums[i];
            }
        }
        return index+1;
    }

    public static void main(String[] args) {

        int [] nums = new int [] {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
