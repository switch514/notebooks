package hard;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Offer59MaxSlid {
    private Queue<Integer> queue = new LinkedList();
    private Deque<Integer> max = new LinkedList();

    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null || nums.length==0){
            return new int[0];
        }
        int[] result = new int[nums.length - k + 1];
        int right = k - 1;

        for (int i = 0; i <= right; i++) {
            queue.offer(nums[i]);
            addMax(max, nums[i]);
        }

        int index = 0;
        result[index++] = max.peek();
        right++;

        while (right <= nums.length - 1) {
            queue.offer(nums[right]);
            int num = queue.poll();
            if (max.peek() == num) {
                max.poll();
            }
            addMax(max, nums[right]);
            result[index++] = max.peek();
            right++;
        }
        return result;
    }

    private void addMax(Deque<Integer> max, int num) {

        while (!max.isEmpty() && max.peekLast() < num) {
            max.pollLast();
        }
        max.offer(num);
    }
}
