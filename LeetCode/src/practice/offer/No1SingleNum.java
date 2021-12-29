package practice.offer;

public class No1SingleNum {
    public static int singleNumber(int[] nums) {
        int result=0;
        for(int i : nums){
            result = result ^ i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int []{4,1,2,1,2}));
        System.out.println(singleNumber(new int []{1,1,2,3,2}));
    }
}
