package easy;

import common.ListNode;

import java.util.HashSet;
import java.util.Set;

public class No0201RemoveNodes {


    public ListNode removeDuplicateNodes(ListNode head) {
        if(null == head){
            return null;
        }
        ListNode newHead = new ListNode(head.val);

        Set<Integer> nodeSet = new HashSet<>();
        nodeSet.add(head.val);
        ListNode tail = newHead;
        while(head != null){
            if(!nodeSet.contains(head.val)) {
                nodeSet.add(head.val);
                tail.next = new ListNode(head.val);
                tail = tail.next;
            }
            head = head.next;
        }

        return newHead;
    }
}
