package normal;

import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class No1209DeleteSubString {
    public String removeDuplicates(String s, int k) {
        Map<String, Integer> charMap = new TreeMap<>();
        char[] chars = s.toCharArray();
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(chars[0], 1));
        for (int i =1; i< chars.length ; i++){
            if(stack.isEmpty() || stack.peek().character!= chars[i]){
                stack.push(new Pair(chars[i], 1));
            }
            else{
                stack.peek().count ++ ;
                if(k == stack.peek().count){
                    stack.pop();
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        while (stack.size()>0){
            Pair pair = stack.pop();
            for(int i=0; i< pair.count; i++){
                sb.append(pair.character);
            }
        }
        return sb.reverse().toString();
    }

    public class Pair{
        public Character character;
        public int count;

        public Pair(Character c, int count){
            this.character =c;
            this.count = count;
        }
    }
}
