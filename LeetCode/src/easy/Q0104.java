package easy;

import java.util.HashMap;
import java.util.Map;

public class Q0104 {
    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        int count =0;
        for (int charNum: countMap.values()){
            if(charNum%2==1){
                count++;
                if(count==2){
                    return false;
                }
            }
        }
        return true;
    }
}
