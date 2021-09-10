package normal;

import java.util.HashMap;
import java.util.Map;

public class Offer48LongSubStr {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int left = 0;
        int right = 0;
        int maxLength = 1;
        Map<Character, Integer> charIndexMap = new HashMap<>();
        char[] chars = s.toCharArray();
        while (right < s.length()) {
            char c = chars[right];
            if (charIndexMap.containsKey(c)) {
                left = Math.max(left, charIndexMap.get(c) + 1);
            }
            charIndexMap.put(c, right);
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }
}
