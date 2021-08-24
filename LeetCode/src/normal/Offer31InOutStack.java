package normal;

import java.util.Stack;

public class Offer31InOutStack {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int index=0;
        for(int num: pushed){
            stack.push(num);
            while(!stack.isEmpty() && stack.peek() == popped[index] && index<popped.length){
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();
    }
}
