package easy;

import java.util.LinkedHashMap;
import java.util.Map;

public class No496NextNum {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Map<Integer, Integer> numPos = new LinkedHashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            numPos.put(nums2[i], i);
        }
        for (int i = 0; i < nums1.length; i++) {
            int num = nums1[i];
            int index = numPos.get(num);
            boolean isFound = false;
            for (int j = index + 1; j < nums2.length; j++) {
                if (nums2[j] > num) {
                    result[i] = nums2[j];
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                result[i] = -1;
            }
        }
        return result;
    }
}
