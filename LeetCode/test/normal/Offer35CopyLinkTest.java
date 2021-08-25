package normal;

import common.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class Offer35CopyLinkTest {

    @Test
    public void copyRandomList() {
        Node head = new Node(4);
        Node tail = new Node(3);
        head.next = tail;
        head.random = head;
        tail.random = head;

        new Offer35CopyLink().copyRandomList(head);
    }
}