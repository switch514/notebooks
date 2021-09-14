package normal;

import java.util.*;

public class No524MatchWords {
    private String longest="";
    public String findLongestWord(String s, List<String> dictionary) {
        Map<String, Integer> wordMap = new TreeMap<>();
        for (String str : dictionary) {
            wordMap.put(str, 0);
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            char c = chars[i];
            updateMap(c,i==s.length()-1, wordMap);
        }
        return longest;
    }

    private void updateMap(char c, boolean finish, Map<String, Integer> wordMap) {
        Set<String> keys = new HashSet(wordMap.keySet());
        for (String key : keys) {
            int index = wordMap.get(key);
            if(index<key.length()){
                if (key.charAt(index) == c) {
                    if (index == key.length() - 1){
                        longest = isMatch(key) ? longest: key;
                    }
                    wordMap.put(key, index + 1);
                }
            }else{
                wordMap.remove(key);
            }
        }
    }

    private boolean isMatch(String key) {
        if (longest.length() > key.length()){
            return true;
        }
        if(longest.length()==key.length()){
            return  key.compareTo(longest) >=0? true: false;
        }
        return false;
    }
}
