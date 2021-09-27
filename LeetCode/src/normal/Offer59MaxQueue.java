package normal;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Offer59MaxQueue {
    private Deque<Integer> max = new LinkedList<>();
    private Queue<Integer> queue = new LinkedList<>();

    public Offer59MaxQueue() {

    }

    public int max_value() {
        if(max.isEmpty()){
            return -1;
        }
        return max.peek();
    }

    public void push_back(int value) {
        queue.offer(value);
        while(!max.isEmpty() && max.peekLast()<value){
            max.pollLast();
        }
        max.offer(value);
    }

    public int pop_front() {
        if(queue.isEmpty()){
            return -1;
        }else{
            int val = queue.poll();
            if(val==max.peek()){
                max.pop();
            }

            return val;
        }
    }
}
