package normal;

import java.math.BigDecimal;

public class Offer67StrToInt {
    public int strToInt(String str) {
        if(null == str || str.trim().length()==0){
            return 0;
        }
        str = str.trim();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< str.length();i++){
            char c = str.charAt(i);
            if((('-' == c|| '+' ==c) && i==0) || (c>='0' && c<='9')){
                sb.append(c);
            }else{
                break;
            }
        }
        BigDecimal result = new BigDecimal(0);
        try {
            result = new BigDecimal(sb.toString());
        }catch (Exception e){
            return 0;
        }

        if(result.compareTo(BigDecimal.valueOf(Integer.MAX_VALUE))>0){
            return Integer.MAX_VALUE;
        }
        if(result.compareTo(BigDecimal.valueOf(Integer.MIN_VALUE))<0){
            return Integer.MIN_VALUE;
        }
        return result.intValue();
    }
}
