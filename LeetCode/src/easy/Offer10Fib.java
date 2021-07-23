package easy;

public class Offer10Fib {
    public int fib(int n) {
        if( n== 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        int result = 0;
        int dpA = 0;
        int dpB = 1;
        for(int i =2; i<= n; i++){
            result = (dpA + dpB) % 1000000007;
            dpA = dpB;
            dpB = result;
        }
        return result;
    }
}
