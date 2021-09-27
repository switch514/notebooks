package normal;

public class Offer64SumShort {
    public int sumNums(int n) {
        int res = n;
        boolean flag = (n>0) && (res += sumNums(n-1))>0;
        return res;
    }
}
