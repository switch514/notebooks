package easy;

import java.util.Arrays;

public class No7Reverse {
    public static int reverse(int x) {
        boolean isLessZero = false;
        if (x<0){
            x = 0 - x;
            isLessZero = true;
        }

        try {
            if(isLessZero){
                return 0 - Integer.parseInt(new StringBuilder(Integer.toString(x)).reverse().toString());
            }
            return Integer.parseInt(new StringBuilder(Integer.toString(x)).reverse().toString());
        }catch (Exception e){

        }
        return 0;
    }
}
