package easy;

import com.sun.javafx.binding.StringFormatter;

public class No0103ReplaceSpace {
    public String replaceSpaces(String S, int length) {
        if(null == S){
            return getSpaceString("", length);
        }
        return S.substring(0,length).replace(" ", "%20");
    }

    private String getSpaceString(String str, int length){
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        for(int i=0;i<length;i++){
            sb.append("%20");
        }
        return sb.toString();
    }
}
