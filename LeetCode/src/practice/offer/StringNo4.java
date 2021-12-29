package practice.offer;

import java.util.ArrayList;
import java.util.List;

public class StringNo4 {
    public static String countAndSay(int n) {
        String result = "1";
        for (int i = 1; i < n; i++) {
            result = countNum(result);
        }
        return result;
    }

    private static String countNum(String result) {
        List<String> groups = getGroup(result);
        StringBuilder sb = new StringBuilder();
        for (String group : groups) {
            sb.append(group.split("_")[1]);
            sb.append(group.split("_")[0]);
        }
        return sb.toString();
    }

    private static List<String> getGroup(String result) {
        char[] chars = result.toCharArray();
        List<String> groups = new ArrayList<>();
        char curr = chars[0];
        int count = 1;
        groups.add(curr + "_" + count);
        for (int i = 1; i < chars.length; i++) {
            char c = chars[i];
            if (curr == c) {
                count++;
                groups.remove(groups.size() - 1);
                groups.add(c + "_" + count);
            } else {
                curr = c;
                count = 1;
                groups.add(c + "_" + count);
            }
        }


        return groups;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(1));
        System.out.println(countAndSay(2));
        System.out.println(countAndSay(3));
        System.out.println(countAndSay(4));
        System.out.println(countAndSay(5));
        System.out.println(countAndSay(6));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (null == strs || 0 == strs.length) {
            return "";
        }
        String pre = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length() - 1);
                if ("".equals(pre)) {
                    return "";
                }
            }
        }
        return pre;
    }
}
