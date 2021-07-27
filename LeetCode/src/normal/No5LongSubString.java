package normal;

public class No5LongSubString {
    public String longestPalindrome(String s) {
        if (null == s || s.length() == 0) {
            return "";
        }

        char[] chars = s.toCharArray();
        if (s.length() == 1) {
            return String.valueOf(chars[0]);
        }
        String subStr = String.valueOf(chars[0]);
        for (int i = 0; i < chars.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(chars[i]);
            int left = i - 1;
            int right = i + 1;
            while (left >= 0 && chars[left] == chars[i]) {
                sb.insert(0, chars[left]);
                left--;
            }
            while (right < chars.length && chars[right] == chars[i]) {
                sb.append(chars[right]);
                right++;
            }
            while ((left >= 0 && right < chars.length) && (chars[left] == chars[right])) {
                sb.insert(0, chars[left]);
                sb.append(chars[right]);
                right++;
                left--;
            }
            if (sb.length() > subStr.length()) {
                subStr = sb.toString();
            }
        }

        return subStr;
    }
}
