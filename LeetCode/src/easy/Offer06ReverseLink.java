package easy;

import common.ListNode;

import java.util.Stack;

public class Offer06ReverseLink {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while(head != null){
            stack.push(head.val);
            head=head.next;
        }
        int [] result = new int[stack.size()];
        int i=0;
        while(!stack.isEmpty()){
            result[i] = stack.pop();
            i++;
        }
        return result;
    }

}
