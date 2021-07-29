package easy;

import common.ListNode;

public class Offer25MergeLink {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        if (null == l1 && null == l2) {
            return null;
        }
        ListNode tail = head;
        while (null != l1 || null != l2) {
            if(null == l1){
                tail.next = l2;
                tail = tail.next;
                break;
            }
            if(null == l2){
                tail.next = l1;
                tail = tail.next;
                break;
            }
            if(l1.val > l2.val){
                tail.next = l2;
                tail = tail.next;
                l2 = l2.next;
            }else{
                tail.next = l1;
                tail = tail.next;
                l1 = l1.next;
            }
        }

        return head.next;
    }
}
