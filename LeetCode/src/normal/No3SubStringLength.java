package normal;

import java.util.HashMap;
import java.util.Map;

public class No3SubStringLength {

    public int lengthOfLongestSubstring(String s) {
        if (0 == s.length()) {
            return 0;
        }
        Map<Character, Integer> characterMap = new HashMap<>(26);
        char[] chars = s.toCharArray();
        int left = 0;
        int right = 0;
        int length = 1;
        for (; right < chars.length; right++) {
            if (characterMap.containsKey(chars[right])) {
                left = Math.max(left, characterMap.get(chars[right]) + 1);
                //characterMap.remove(chars[right]);
            }
            characterMap.put(chars[right], right);
            length = Math.max(length, right - left + 1);
        }
        return length;
    }

}
