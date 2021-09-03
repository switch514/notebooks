package normal;

import java.util.Comparator;
import java.util.PriorityQueue;

public class No1714SmallestK {
    public int[] smallestK(int[] arr, int k) {
        if(k<=0 || arr ==null || arr.length==0){
            return new int[0];
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        for(int num:arr){
            if(queue.size()<k){
                queue.add(num);
            }
            else{
                if(num < queue.peek()){
                    queue.poll();
                    queue.add(num);
                }else{
                    continue;
                }
            }
        }

        int[] res = new int [k];
        for(int i=0; i< k; i++){
            res[i] = queue.poll();
        }

        return res;
    }
}
