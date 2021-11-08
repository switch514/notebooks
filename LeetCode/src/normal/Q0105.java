package normal;

public class Q0105 {
    public boolean oneEditAway(String first, String second) {
        if (null == first || null == second) {
            return false;
        }
        if (Math.abs(first.length() - second.length()) > 1) {
            return false;
        }

        if (first.equals(second)) {
            return true;
        }

        int iFirst = 0;
        int iSecond = 0;
        int length = Math.max(first.length(), second.length());
        int deffCount=0;
        for(int i=0; i<length; i++){
            if(iFirst>=first.length()){
                iSecond++;
                continue;
            }
            if(iSecond>=second.length()){
                iFirst++;
                continue;
            }

            if(first.charAt(iFirst) == second.charAt(iSecond)){
                iFirst++;
                iSecond++;
            }
            else{
                deffCount++;
                if(deffCount>=2){
                    return false;
                }

                if(first.length()== second.length()){
                    iFirst++;
                    iSecond++;
                }
                else if (first.length() > second.length()) {
                    iFirst++;
                } else {
                    iSecond++;
                }
            }
        }


        return ((iFirst == first.length()) && (iSecond == second.length()) );
    }
}
