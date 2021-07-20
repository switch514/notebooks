package easy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class No0102StrCheck {
    public boolean CheckPermutation(String s1, String s2) {
        if(null == s1 || null==s2){
            return false;
        }
        Map<Character, Integer> strMap1 = new HashMap<>();
        Map<Character, Integer> strMap2 = new HashMap<>();
        updateStrMap(s1, strMap1);
        updateStrMap(s2, strMap2);
        if (isMapEquals(strMap1,strMap2)){
            return true;
        }
        return false;
    }

    private boolean isMapEquals(Map<Character, Integer> strMap1, Map<Character, Integer> strMap2) {
        if(strMap1.size() != strMap2.size()){
            return false;
        }
        for(Map.Entry<Character,Integer> entry: strMap1.entrySet()){
            Character character = entry.getKey();
            if(!strMap2.containsKey(character)){
                return false;
            }
            if(!entry.getValue().equals(strMap2.get(character))){
                return false;
            }
        }
        return true;
    }

    private void updateStrMap(String s1, Map<Character, Integer> strMap) {
        char[] chars = s1.toCharArray();
        for(Character character:chars){
            strMap.put(character, strMap.getOrDefault(character,0)+1);
        }
    }
}
