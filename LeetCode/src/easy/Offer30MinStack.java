package easy;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class Offer30MinStack {
    public Offer30MinStack() {

    }

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int x) {
        stack.push(x);
        if(0 == minStack.size()){
            minStack.push(x);
        }else{
            minStack.push(minStack.peek()>x? x: minStack.peek());
        }
    }

    public void pop() {
        int current = stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
