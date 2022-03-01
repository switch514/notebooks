package temp;

import common.ListNode;

import java.util.*;

public class TestClas {



    public static String longestPalindrome(String s) {
        if (null == s || 0 == s.length()) {
            return "";
        }
        if (1 == s.length()) {
            return s;
        }

        String longestStr = s.substring(0, 1);

        char[] chars = s.toCharArray();
        for (int i = 1; i < s.length(); i++) {
            StringBuilder bd = new StringBuilder();
            bd.append(chars[i]);
            int left = i - 1;
            int right = i + 1;

            while (left >= 0 && chars[left] == chars[i]) {
                bd.insert(0, chars[left]);
                left--;
            }

            while (right < s.length() && chars[right] == chars[i]) {
                bd.append(chars[right]);
                right++;
            }

            while (left >= 0 && right < s.length() && chars[right] == chars[left]) {
                bd.insert(0, chars[left]);
                bd.append(chars[right]);
                left--;
                right++;
            }

            if (bd.length() > longestStr.length()) {
                longestStr = bd.toString();
            }
        }

        return longestStr;

    }

    public static int lengthOfLongestSubstring(String s) {
        if (null == s || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> charPosMap = new HashMap<>(26);
        int left = 0;
        int length = 1;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (charPosMap.containsKey(c)) {
                left = Math.max(left, charPosMap.get(c) + 1);
            }
            charPosMap.put(c, right);

            length = Math.max(length, right - left + 1);
        }
        return length;
    }

    public static void main(String[] args) {
//        System.out.println(longestPalindrome("12AABBAADCA"));
//        System.out.println(longestPalindrome("12AABbBAADCA"));
//        System.out.println(lengthOfLongestSubstring("abba"));
//        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(letterCombinations("23").toString());
    }

    private static Map<Character, char[]> keys = new HashMap<>();

    static {
        keys.put('2', new char[]{'a', 'b', 'c'});
        keys.put('3', new char[]{'d', 'e', 'f'});
        keys.put('4', new char[]{'g', 'h', 'i'});
        keys.put('5', new char[]{'j', 'k', 'l'});
        keys.put('6', new char[]{'m', 'n', 'o'});
        keys.put('7', new char[]{'p', 'q', 'r'});
        keys.put('8', new char[]{'t', 'u', 'v'});
        keys.put('9', new char[]{'w', 'x', 'y', 'z'});
    }

    public static List<String> letterCombinations(String digits) {
        if (null == digits || 0== digits.length()){
            return new ArrayList<>();
        }

        List<String> result = new ArrayList<>();
        backtract(keys, result, new StringBuilder(), 0, digits);
        return result;
    }

    private static void backtract(Map<Character, char[]> keys, List<String> result, StringBuilder sb, int index, String digits) {
        if (sb.length() == digits.length()) {
            result.add(sb.toString());
            return;
        }
        char c = digits.charAt(index);
        char[] chars = keys.get(c);
        for (int i = 0; i < chars.length; i++) {
            sb.append(chars[i]);
            backtract(keys, result, sb, index + 1, digits);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(null == head){
            return null;
        }
        ListNode newHead = new ListNode(0);
        newHead.next = head;

        ListNode fast = newHead;
        ListNode slow = newHead;
        for(int i= 0;i<n;i++){
            fast = fast.next;
        }

        while(null != fast.next){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return newHead.next;
    }

}
