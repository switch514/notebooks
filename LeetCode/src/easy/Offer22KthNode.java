package easy;

import common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Offer22KthNode {
    public ListNode getKthFromEnd(ListNode head, int k) {
        List<ListNode> nodeList = new ArrayList<>();
        ListNode tmp = head;
        while (tmp != null) {
            nodeList.add(tmp);
            tmp = tmp.next;
        }
        if (k > nodeList.size()) {
            return null;
        }
        return nodeList.get(nodeList.size() - k);
    }

    public ListNode getKthFromEnd2(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        while (k > 0) {
            fast = fast.next;
            k--;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
