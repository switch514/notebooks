package normal;

import java.util.HashMap;
import java.util.Map;

public class No138CopyLink {
    public Node copyRandomList(Node head) {
        if(null == head){
            return null;
        }
        Node newHead = new Node(head.val);
        Node newTail = newHead;
        Map<Node, Node> nodeMap = new HashMap<>();
        nodeMap.put(head, newHead);
        Node tmp = head;
        while (null != tmp.next) {
            Node next = new Node(tmp.next.val);
            newTail.next = next;
            tmp = tmp.next;
            nodeMap.put(tmp, next);
            newTail = newTail.next;
        }
        tmp = newHead;
        while (null != head) {
            if (null != head.random) {
                tmp.random = nodeMap.get(head.random);
            }
            tmp = tmp.next;
            head = head.next;
        }

        return newHead;
    }

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
