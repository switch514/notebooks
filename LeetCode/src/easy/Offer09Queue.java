package easy;

import java.util.Stack;

public class Offer09Queue {

    public Offer09Queue() {

    }
    private Stack<Integer> instack = new Stack<>();
    private Stack<Integer> outstack = new Stack<>();
    public void appendTail(int value) {
        instack.push(value);
    }

    public int deleteHead() {
        if (outstack.isEmpty()) {
            while (!instack.isEmpty()) {
                outstack.push(instack.pop());
            }
        }
        if(outstack.isEmpty()){
            return -1;
        }
        return outstack.pop();
    }
}
