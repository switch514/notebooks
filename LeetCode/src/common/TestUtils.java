package common;

public class TestUtils {
    public static ListNode getListLink (int [] vals){
        ListNode head = new ListNode(vals[0]);
        ListNode tail = head;

        for(int i=1;i< vals.length; i++){
            tail.next = new ListNode(vals[i]);
            tail = tail.next;
        }
        return head;
    }
}
