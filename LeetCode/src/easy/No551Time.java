package easy;


public class No551Time {
    public boolean checkRecord(String s) {
        char[] statuss = s.toCharArray();

        int abCount=0;
        int lCount=0;
        for(char status:statuss){
            if('A' == status){
                abCount ++;
                lCount=0;
            }else if('L' == status){
                lCount++;
            }else{
                lCount=0;
            }

            if (check(abCount, lCount)) return false;
        }
        if (check(abCount, lCount)) return false;
        return true;
    }

    private boolean check(int abCount, int lCount) {
        if (abCount >= 2 || lCount >= 3) {
            return true;
        }
        return false;
    }
}
