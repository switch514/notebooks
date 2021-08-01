package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class No1337Kweak {
    public int[] kWeakestRows(int[][] mat, int k) {
        if(null == mat || 0==mat.length || k>mat.length){
            return new int[0];
        }
        Map<Integer, List<Integer>> lineMap = new TreeMap<>();
        for(int i=0; i< mat.length; i++){
            int [] line = mat[i];
            int fight = getFight(line);
            List<Integer> lineNum = lineMap.getOrDefault(fight, new ArrayList<>());
            lineNum.add(i);
            lineMap.put(fight, lineNum);
        }

        int [] result = new int[k];
        int index = 0;
        for(Map.Entry<Integer,List<Integer>> entry: lineMap.entrySet()){
            for(int lineNum: entry.getValue()) {
                result[index] = lineNum;
                index++;
                if(index == k){
                    break;
                }
            }
            if(index == k){
                break;
            }
        }


        return result;
    }

    private int getFight(int[] line) {
        if(0== line.length){
            return 0;
        }
        int fight =0;
        for (int i: line){
            if(i>0){
                fight++;
            }
        }
        return fight;
    }
}
