package normal;

import java.util.Calendar;
import java.util.Map;
import java.util.TreeMap;

public class No731Calendar {
    Map<Integer,Integer> rangeMap = new TreeMap<>();

    public No731Calendar() {

    }

    public boolean book(int start, int end) {
        rangeMap.put(start, rangeMap.getOrDefault(start, 0) +1);
        rangeMap.put(end, rangeMap.getOrDefault(end, 0) -1);
        int active = 0;
        for (int count : rangeMap.values()){
            active = active + count;
            if(active >=3){
                rangeMap.put(start, rangeMap.get(start) -1);
                rangeMap.put(end, rangeMap.get(end) +1);
                if(0 == rangeMap.get(start)){
                    rangeMap.remove(start);
                }
                return false;
            }
        }
        return true;
    }
}
