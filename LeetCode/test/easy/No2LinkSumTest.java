package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class No2LinkSumTest {

    public No2LinkSum.ListNode getLink(int [] nums){
        No2LinkSum.ListNode head = null; No2LinkSum.ListNode tail = null;
        head = tail = new No2LinkSum.ListNode(nums[0]);
        head.next = tail;
        for(int i=1;i<nums.length;i++){
            tail.next = new No2LinkSum.ListNode(nums[i]);
            tail = tail.next;
        }
        if(head == tail){
            head.next = null;
        }
        return head;
    }

    @Test
    public void addTwoNumbers() {
        //l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        No2LinkSum.ListNode l1 = getLink(new int[] {9,9,9,9,9,9,9});
        No2LinkSum.ListNode l2 = getLink(new int[] {9,9,9,9});
        No2LinkSum.ListNode lr = No2LinkSum.addTwoNumbers(l1, l2);

        assertEquals(8,lr.val);
        assertEquals(9,lr.next.val);
        assertEquals(9,lr.next.next.val);
        assertEquals(9,lr.next.next.next.val);
        assertEquals(0,lr.next.next.next.next.val);
        assertEquals(0,lr.next.next.next.next.next.val);
        assertEquals(0,lr.next.next.next.next.next.next.val);
        assertEquals(1,lr.next.next.next.next.next.next.next.val);

        No2LinkSum.ListNode l3 = getLink(new int[] {5});
        No2LinkSum.ListNode l4 = getLink(new int[] {5});
        No2LinkSum.ListNode lr2 = No2LinkSum.addTwoNumbers(l3, l4);
        assertEquals(0,lr2.val);
        assertEquals(1,lr2.next.val);
    }
}