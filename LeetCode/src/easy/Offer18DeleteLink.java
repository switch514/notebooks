package easy;

import common.ListNode;

public class Offer18DeleteLink {
    public ListNode deleteNode(ListNode head, int val) {
        if(val == head.val){
            return head.next;
        }

        ListNode tmp = head;
        while(null != tmp.next){
            if (val == tmp.next.val){
                tmp.next = tmp.next.next;
                break;
            }
            tmp = tmp.next;
        }
        return head;
    }
}
