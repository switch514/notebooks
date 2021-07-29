package easy;

import common.ListNode;

import java.util.Stack;

public class Offer24ReversLink {
    public ListNode reverseList(ListNode head) {
        if(null == head){
            return null;
        }
        Stack<ListNode> nodeStack = new Stack<>();
        ListNode tmp = head;
        while(tmp !=null){
            nodeStack.push(tmp);
            tmp = tmp.next;
        }
        ListNode newHead = nodeStack.pop();
        ListNode tail  = newHead;
        while(!nodeStack.isEmpty()){
            tail.next = nodeStack.pop();
            tail = tail.next;
        }
        tail.next=null;
        return newHead;
    }

    public ListNode reverseList2(ListNode head) {
        if(null == head){
            return null;
        }
        ListNode newHead = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = newHead;
            newHead = cur;
            cur = next;
        }
        return newHead;
    }
}
