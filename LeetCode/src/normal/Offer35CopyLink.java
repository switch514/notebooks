package normal;

import common.Node;

import java.util.HashMap;
import java.util.Map;

public class Offer35CopyLink {
    public Node copyRandomList(Node head) {
        if(null == head){
            return null;
        }
        Node newHead = new Node(head.val);
        Node tail = newHead;
        Map<Node, Node> nodeMap = new HashMap<>();
        newHead.random = head.random;
        nodeMap.put(head, newHead);

        Node tmp = head;
        while (tmp.next != null) {
            tail.next = new Node(tmp.next.val);
            tail.next.random = tmp.next.random;
            nodeMap.put(tmp.next, tail.next);
            tail = tail.next;
            tmp = tmp.next;
        }

        tail = newHead;
        while (tail != null) {
            if (null != tail.random) {
                tail.random = nodeMap.get(tail.random);
            }
            tail = tail.next;
        }

        return newHead;
    }
}
