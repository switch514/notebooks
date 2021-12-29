package practice.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayNo5 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            return new int[0];
        }
        if (0 == nums1.length || 0 == nums2.length) {
            return new int[0];
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int index1 = 0;
        int index2 = 0;
        List<Integer> result = new ArrayList<>();

        while (index1<nums1.length && index2<nums2.length) {
            if (nums1[index1] == nums2[index2]){
                result.add(nums1[index1]);
                index1++;
                index2++;
            }else if(nums1[index1] > nums2[index2]){
                index2++;
            }else{
                index1++;
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }


}
