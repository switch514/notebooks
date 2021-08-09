package easy;

import java.util.*;

public class No263Ugly {
    public boolean isUgly(int n) {
        if (n == 1) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        if (n % 2 == 0) {
            return isUgly(n / 2);
        }
        if (n % 5 == 0) {
            return isUgly(n / 5);
        }
        if (n % 3 == 0) {
            return isUgly(n / 3);
        }
        return false;
    }

    public int nthUglyNumber(int n) {
        Set<Long> uglys = new TreeSet<>();
        PriorityQueue<Long> pq = new PriorityQueue<>();
        int[] nums = new int[]{2, 3, 5};
        uglys.add(1l);
        pq.add(1l);
        for(int i=1;i<=n;i++){
            long min = pq.poll();
            if (i == n) return (int)min;
            for(int num : nums){
                long res = num*min;
                if(!uglys.contains(res)){
                    uglys.add(num*min);
                    pq.add(res);
                }
            }
        }

        return -1;
    }

    public int nthUglyNumber2(int n) {
        int[] nums = new int[]{2, 3, 5};
        int[] result = new int[n+1];
        result[1] =1;
        int index2=1;
        int index3=1;
        int index5=1;
        for(int i=2;i<=n;i++){
            int num2 = result[index2] * 2 ;
            int num3 = result[index3] * 3;
            int num5 = result[index5] * 5 ;
            int min = Math.min(Math.min(num2,num3),num5);
            result[i] = min;
            if(num2==min){
                index2++;
            }
            if(num3==min){
                index3++;
            }
            if(num5==min){
                index5++;
            }
        }

        return result[n];
    }


    public int nthSuperUglyNumber(int n, int[] primes) {
        int [] result = new int[n+1];
        int [] primeIndexs = new int[primes.length];
        int [] primeSum = new int[primes.length];
        for(int i=0; i<primeIndexs.length; i++){
            primeIndexs[i] = 1;
        }
        result[1] = 1;
        for(int i=2; i<=n; i++){
            int minPrimeSum = Integer.MAX_VALUE;
            for(int j=0; j< primeIndexs.length; j++){
                primeSum[j] = result[primeIndexs[j]] * primes[j];
                minPrimeSum = Math.min(minPrimeSum, primeSum[j]);
            }
            result[i] = minPrimeSum;
            for(int j=0; j< primeIndexs.length; j++){
                if(minPrimeSum==primeSum[j]){
                    primeIndexs[j] ++;
                }
            }
        }
        return result[n];
    }
}
