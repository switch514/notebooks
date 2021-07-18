package normal;

import java.util.*;

public class No1002GroupWords {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> resultList = new ArrayList<>();
        Map<String,List<String>> resultMap = new HashMap<>();
        for(String str:strs){
            String key = getKey(str);
            if(resultMap.containsKey(key)){
                resultMap.get(key).add(str);
            }else{
                resultMap.put(key, new ArrayList<String>() {{
                    add(str);
                }});
            }
        }
        updateResultList(resultList, resultMap);

        return resultList;
    }

    private static void updateResultList(List<List<String>> resultList, Map<String, List<String>> resultMap) {
        for(Map.Entry<String, List<String>> entry: resultMap.entrySet()){
            resultList.add(entry.getValue());
        }
    }

    private static String getKey(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return Arrays.toString(chars);
    }
}
