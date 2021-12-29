package practice.offer;

import java.util.Locale;

public class StringNo1 {
    public static boolean isPalindrome(String s) {
        if(null == s || s.length()==0){
            return true;
        }
        s = s.toLowerCase();

        int left =0;
        int right = s.length()-1;

        while(left<= right){
            char cL = s.charAt(left);
            char cR = s.charAt(right);
            if(!Character.isLetterOrDigit(cL)){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(cR)){
                right--;
                continue;
            }
            if(!(cL == cR)){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
    }
}
