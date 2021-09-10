package normal;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Offer49Ugly {
    public int nthUglyNumber(int n) {
        if(n==1){
            return 1;
        }
        int [] nums = new int []{2,3,5};
        Set<Long> uglys = new HashSet<>();
        PriorityQueue<Long> queue = new PriorityQueue();
        queue.add(1l);
        int index=0;
        for(int i=0; i<n; i++){
            long min = queue.poll();
            if(i==(n-1)){
                return (int) min;
            }

            for(int num:nums){
                long ugly = num * min;
                if(!uglys.contains(ugly)){
                    uglys.add(ugly);
                    queue.add(ugly);
                }
            }
        }
        return 0;
    }


    public int nthUglyNumber2(int n) {
        int index2=1;
        int index3=1;
        int index5=1;
        int [] dp = new int [n+1];
        dp[1] = 1;
        for(int i=2; i<n+1;i++){
            int ugly2 = dp[index2] * 2;
            int ugly3 = dp[index3] * 3;
            int ugly5 = dp[index5] * 5;
            int min = Math.min(Math.min(ugly2,ugly3),ugly5);
            dp[i] = min;
            if(ugly2==min) index2++;
            if(ugly3==min) index3++;
            if(ugly5==min) index5++;
        }
        return dp[n];
    }
}
