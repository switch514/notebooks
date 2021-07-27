package hard;

import java.util.Arrays;

public class No4MidNUm {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] newNums = Arrays.copyOf(nums1, nums1.length + nums2.length);
        System.arraycopy(nums2, 0, newNums, nums1.length, nums2.length);
        Arrays.sort(newNums);
        if(1==newNums.length){
            return newNums[0];
        }
        if(newNums.length%2==1){
            return newNums[newNums.length/2];
        }else{

            return (newNums[newNums.length/2] + newNums[newNums.length/2-1])/2d;
        }
    }
}
