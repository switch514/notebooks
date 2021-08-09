package easy;

public class Offer58ReverseWords {
    public String reverseWords(String s) {
        if (null == s) {
            return "";
        }
        s = s.trim();
        String[] strs = s.split("\\s+");

        StringBuilder res = new StringBuilder();
        for (int i = strs.length - 1; i >= 0; i--) {
            res.append(strs[i]);
            res.append(" ");
        }
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }

    public String reverseLeftWords(String s, int n) {
        if(n>s.length()){
            return s;
        }
        return s.substring(n, s.length()) + s.substring(0,n);
    }
}
