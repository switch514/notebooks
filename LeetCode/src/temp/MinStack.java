package temp;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack = new Stack();
    private Stack<Integer> minStack = new Stack();
    int min = Integer.MAX_VALUE;

    public MinStack() {

    }

    public void push(int x) {
        stack.push(x);
        if(x<min){
            minStack.push(x);
            min = x;
        }else {
            minStack.push(min);
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
        if(minStack.isEmpty()){
            min = Integer.MAX_VALUE;
        }else{
            min = minStack.peek();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
