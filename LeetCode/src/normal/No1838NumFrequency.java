package normal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class No1838NumFrequency {
    public static int maxFrequency(int[] nums, int k) {
        //nums = [1,2,4], k = 5
//        Map<Integer, Integer> sizeMap = new HashMap<>();
//        for (int i = 0; i < nums.length; ++i) {
//            sizeMap.put(nums[i], sizeMap.getOrDefault(nums[i], 0) + 1);
//        }
//
//        Integer[] distinctNums = (Integer[]) sizeMap.keySet().toArray(new Integer[sizeMap.size()]);
//        Arrays.sort(distinctNums);
//        int freq = 1;
//        for (int i = 1; i < distinctNums.length; i++) {
//            int total = k;
//            int numi = distinctNums[i];
//            int count = sizeMap.get(numi);
//            for(int j=i-1; j>=0; j--){
//                if(total>(distinctNums[j+1] - distinctNums[j])) {
//                    int numjCount = Math.min(total / (numi - distinctNums[j]), sizeMap.get(distinctNums[j]));
//                    total = total - (numi - distinctNums[j]) * numjCount;
//                    count = count + numjCount;
//                }else{
//                    break;
//                }
//            }
//            freq = Math.max(freq, count);
//        }

        Arrays.sort(nums);
        int left = 0;
        int right = 1;
        int sum = 0;
        int result = 1;
        while(right< nums.length){
            sum = sum + (nums[right] - nums[right -1]) * (right -left);
            while(sum > k){
                sum = sum - (nums[right] - nums[left]);
                left++;
            }

            result = Math.max(result, right-left+1);
            right ++;
        }
        return result;
    }
}
