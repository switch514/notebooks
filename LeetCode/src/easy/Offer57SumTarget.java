package easy;

import java.util.ArrayList;
import java.util.List;

public class Offer57SumTarget {
    public int[][] findContinuousSequence(int target) {
        List<int[]> result = new ArrayList<>();


        int max = (target + 1) / 2;
        int left = 1, right = 2;
        int sum = left + right;
        while (right <= max) {
            if (sum == target) {
                addResult(result, left, right);
                sum = sum - left;
                left++;
            } else if (sum < target) {
                right++;
                sum = sum + right;
            } else {
                sum = sum - left;
                left++;
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    private void addResult(List<int[]> result, int left, int right) {
        int[] res = new int[right - left + 1];
        int index = 0;
        for (int i = left; i <= right; i++) {
            res[index++] = i;
        }
        result.add(res);
    }

}
