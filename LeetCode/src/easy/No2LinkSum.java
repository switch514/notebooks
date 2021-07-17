package easy;

public class No2LinkSum {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int addOne = 0;
        ListNode nodeHead = null, nodeTail = null;
        while (l1 != null || null != l2) {

            int l1Val = (null == l1) ? 0 : l1.val;
            int l2Val = (null == l2) ? 0 : l2.val;
            int sum = l1Val + l2Val + addOne;
            int val = sum % 10;
            if (sum >= 10) {
                addOne = 1;
            } else {
                addOne = 0;
            }

            if (null == nodeHead) {
                nodeHead = nodeTail = new ListNode(val);
                nodeHead.val = val;
                nodeHead.next = nodeTail;
            } else {
                nodeTail.next = new ListNode(val);
                nodeTail = nodeTail.next;
            }

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

        }
        if (addOne == 1) {
            nodeTail.next = new ListNode(1);
            nodeTail = nodeTail.next;
        }
        if(nodeHead == nodeTail){
            nodeHead.next = null;
        }

        return nodeHead;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
