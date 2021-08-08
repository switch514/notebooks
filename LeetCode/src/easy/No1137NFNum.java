package easy;

public class No1137NFNum {

    public int tribonacci(int n) {
        if(0==n){
            return 0;
        }
        if(1==n || 2==n){
            return 1;
        }

        int [] tns = new int [n+1];
        tns[0] = 0;
        tns[1] = 1;
        tns[2] = 1;
        int tn=0;
        for (int i=3; i<=n;i++){
            tns[i] = tns[i-1] + tns[i-2] + tns[i-3];
        }
        return tns[n];
    }
}
