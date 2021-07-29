package easy;

public class Offer17PrintN {
    public int[] printNumbers(int n) {
        StringBuilder bd = new StringBuilder();
        bd.append(1);
        for(int i=0;i<n;i++){
            bd.append(0);
        }
        int num = Integer.parseInt(bd.toString());
        int [] arrays = new int[num-1];
        for(int i=1;i<num;i++){
            arrays[i-1]=i;
        }
        return arrays;
    }
}
