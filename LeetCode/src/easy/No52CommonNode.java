package easy;

import java.util.ArrayList;
import java.util.List;

public class No52CommonNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        List<ListNode> aList = new ArrayList<>();
        ListNode node = headA;
        while(node != null){
            aList.add(node);
            node = node.next;
        }
        node = headB;
        while(node !=null){
            if(aList.contains(node)){
                return node;
            }
            else{
                node = node.next;
            }
        }
        return null;
    }


      public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
}
