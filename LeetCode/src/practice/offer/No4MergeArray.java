package practice.offer;

import java.util.Arrays;

public class No4MergeArray {
    //nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2,0,nums1,m, nums2.length);
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int [] nums1 = new int []{1,2,3,0,0,0};
        int [] nums2 = new int []{2,5,6};
        merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));

        nums1 = new int []{2,0};
        nums2 = new int []{1};
        merge(nums1,1,nums2,1);
        System.out.println(Arrays.toString(nums1));
    }
}
