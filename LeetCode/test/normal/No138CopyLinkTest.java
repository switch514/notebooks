package normal;

import org.junit.Test;

import static org.junit.Assert.*;

public class No138CopyLinkTest {

    @Test
    public void copyRandomList() {
        No138CopyLink.Node head = new No138CopyLink.Node(4);
        No138CopyLink.Node tail = new No138CopyLink.Node(3);
        head.next = tail;
        head.random = head;

        new No138CopyLink().copyRandomList(head);
    }
}