package normal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Offer45MinNUm {
    public String minNumber(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = o1.toString();
                String s2 = o2.toString();
                BigDecimal n1 = new BigDecimal(s1 + s2);
                BigDecimal n2 = new BigDecimal(s2 + s1);
                return n1.compareTo(n2);
            }
        });
        for (int num : nums) {
            queue.add(num);
        }

        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            sb.append(queue.poll());
        }
        return sb.toString();
    }

    public String minNumber2(int[] nums) {
        String [] strs= new String[nums.length];
        for(int i=0;i<nums.length; i++){
            strs[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strs,(x,y) -> (x+y).compareTo(y+x) );

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<nums.length; i++) {
            sb.append(strs[i]);
        }
        return sb.toString();
    }

}
