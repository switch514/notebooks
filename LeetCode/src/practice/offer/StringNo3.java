package practice.offer;

import java.math.BigDecimal;
import java.util.*;

public class StringNo3 {
    public int reverse(int x) {
        try {
            if (x < 0) {
                return 0 - Integer.parseInt(new StringBuilder(String.valueOf(0 - x)).reverse().toString());
            } else {
                return Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString());
            }
        }catch (NumberFormatException e){
            return 0;
        }
    }

    public static int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            char c = chars[i];
            if(s.indexOf(c) == s.lastIndexOf(c)){
                return i;
            }
        }

        return -1;
    }

    public boolean isAnagram(String s, String t) {
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();
        Arrays.sort(charsS);
        Arrays.sort(charsT);

        return Arrays.equals(charsS, charsT);
    }

    public static int myAtoi(String s) {
        if(null == s){
            return 0;
        }

        s = s.trim();
        if(s.length()==0){
            return 0;
        }


        boolean containsFlay = (s.charAt(0) == '-') || (s.charAt(0) == '+');
        StringBuilder bd = new StringBuilder();
        int index = containsFlay? 1:0;
        while(index< s.length()){
            char c = s.charAt(index);
            if(Character.isDigit(c)){
                bd.append(c);
            }else{
                break;
            }
            index++;
        }

        try {
            BigDecimal result = (s.charAt(0) == '-') ?new BigDecimal("-" + bd.toString()) : new BigDecimal(bd.toString());
            if (result.compareTo(new BigDecimal(Integer.MIN_VALUE))<0) {
                return Integer.MIN_VALUE;
            }
            if (result.compareTo(new BigDecimal(Integer.MAX_VALUE))>0) {
                return Integer.MAX_VALUE;
            }
            return result.intValue();
        }catch (NumberFormatException e){
            return 0;
        }
    }

    public static int strStr(String haystack, String needle) {
        if(null == needle || needle.length()==0 || needle.equals(haystack)){
            return 0;
        }
        if(needle.length() > haystack.length()){
            return -1;
        }

        for(int i=0; i<=haystack.length() - needle.length(); i++){
            String sub = haystack.substring(i, i+needle.length());
            if(needle.equals(sub)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("abc", "c"));
    }
}
