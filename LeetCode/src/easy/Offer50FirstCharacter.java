package easy;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Offer50FirstCharacter {
    public char firstUniqChar(String s) {
        Map<Character, Integer> charMap = new LinkedHashMap<>();
        for(Character c: s.toCharArray()){
            charMap.put(c, charMap.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character, Integer> entry: charMap.entrySet()){
            if(1 == entry.getValue()){
                return entry.getKey();
            }
        }

        return ' ';
    }
}
