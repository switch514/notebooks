package easy;

import java.util.Arrays;

public class No0109StringFlip {
    public boolean isFlipedString(String s1, String s2) {
        if(null == s1 || null == s2){
            return false;
        }
        if(s1.length() != s2.length()){
            return false;
        }

//        char[] chars1 = s1.toCharArray();
//        char[] chars2 = s2.toCharArray();
//        Arrays.sort(chars1);
//        Arrays.sort(chars2);
//        for(int i=0; i< chars1.length; i++){
//            if(chars1[i] != chars2[i]){
//                return false;
//            }
//        }
        if((s2 + s2).contains(s1)) {
            return true;
        }
        return  false;
    }
}
