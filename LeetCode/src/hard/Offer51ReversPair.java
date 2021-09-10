package hard;

public class Offer51ReversPair {
    private int pairCount = 0;

    public int reversePairs(int[] nums) {
        int[] temp = new int[nums.length];
        merge(0, nums.length - 1, nums, temp);
        return pairCount;
    }

    private void merge(int left, int right, int[] nums, int[] temp) {
        if (left < right) {
            int mid = (right - left) / 2 + left;
            merge(left, mid, nums, temp);
            merge(mid + 1, right, nums, temp);
            mergeSort(left, mid, right, nums, temp);
        }
    }

    private void mergeSort(int left, int mid, int right, int[] nums, int[] temp) {
        int tempIndex = 0;
        int lIndex = left;
        int rIndex = mid + 1;
        while (lIndex <= mid && rIndex <= right) {
            if (nums[lIndex] <= nums[rIndex]) {
                temp[tempIndex] = nums[lIndex];
                tempIndex++;
                lIndex++;
            } else {
                temp[tempIndex] = nums[rIndex];
                tempIndex++;
                rIndex++;
                pairCount = pairCount + (mid - lIndex + 1);
            }
        }

        while (lIndex <= mid) {
            temp[tempIndex] = nums[lIndex];
            tempIndex++;
            lIndex++;
        }

        while (rIndex <= right) {
            temp[tempIndex] = nums[rIndex];
            tempIndex++;
            rIndex++;

        }

        for (int i = 0; i < tempIndex; i++) {
            nums[i + left] = temp[i];
        }

    }


}
