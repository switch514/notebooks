package hard;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Offer41Mid {
    private PriorityQueue<Integer> bigQueue;
    private PriorityQueue<Integer> smallQueue;

    public Offer41Mid() {
        smallQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        bigQueue = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if(bigQueue.size() == smallQueue.size()){
            bigQueue.add(num);
            smallQueue.add(bigQueue.poll());
        }else{
            smallQueue.add(num);
            bigQueue.add(smallQueue.poll());
        }
    }

    public double findMedian() {
        if (bigQueue.size() == smallQueue.size()) {
            return getMidAvgNum();
        } else {
            return getMidNum();
        }
    }

    private double getMidAvgNum() {
        Integer n1 = bigQueue.peek();
        Integer n2 = smallQueue.peek();

        return (n1 + n2) / 2d;

    }

    private double getMidNum() {
        return smallQueue.peek();
    }
}
