package normal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No0804SubSets {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result= new ArrayList<>();
        result.add(new ArrayList<>());
        for(int i=0; i < nums.length ; i++){
            for(int j = 0, k=result.size(); j<k; j++) {
                List<Integer> oneResult = new ArrayList<>(result.get(j));
                oneResult.add(nums[i]);
                result.add(oneResult);
            }
        }
        return result;
    }
}
