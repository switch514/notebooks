package easy;

public class No0106CompressStr {
    public String compressString(String S) {
        if(null == S || S.length()==0){
            return S;
        }

        StringBuilder bd = new StringBuilder();
        int count = 1;
        char[] charArray = S.toCharArray();
        bd.append(charArray[0]);
        for (int i = 1; i < charArray.length; i++) {
            char c = bd.charAt(bd.length() - 1);
            if (c == charArray[i]) {
                count++;
            } else {
                bd.append(count);
                bd.append(charArray[i]);
                count = 1;
            }
        }

        bd.append(count);
        return bd.length()>=S.length()?S:bd.toString();
}
}
