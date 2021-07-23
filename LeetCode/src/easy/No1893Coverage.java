package easy;

import java.util.HashMap;
import java.util.Map;

public class No1893Coverage {

    public boolean isCovered(int[][] ranges, int left, int right) {
        Map<Integer, Boolean> coveredMap = new HashMap<>();
        for(int i= left; i<=right ;i++){
            coveredMap.put(i,false);
        }
        for(int [] range: ranges){
            for(int j = range[0]; j<=range[range.length-1]; j++){
                if (coveredMap.containsKey(j)){
                    coveredMap.put(j,true);
                }
            }
        }
        return !coveredMap.values().contains(false);
    }
}
