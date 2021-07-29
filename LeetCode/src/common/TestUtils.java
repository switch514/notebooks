package common;

public class TestUtils {
    public static ListNode getListLink(int[] vals) {
        ListNode head = new ListNode(vals[0]);
        ListNode tail = head;

        for (int i = 1; i < vals.length; i++) {
            tail.next = new ListNode(vals[i]);
            tail = tail.next;
        }
        return head;
    }

    public static TreeNode getTreeNode(Integer[] integers) {
        TreeNode node = createBinaryTreeByArray(integers, 0);
        return node;
    }

    private static TreeNode createBinaryTreeByArray(Integer[] array, int index) {
        TreeNode tn = null;
        if (index < array.length) {
            Integer value = array[index];
            if(value !=null) {
                tn = new TreeNode(value);
                tn.left = createBinaryTreeByArray(array, 2 * index + 1);
                tn.right = createBinaryTreeByArray(array, 2 * index + 2);
            }
            return tn;
        }
        return tn;
    }

    public static void PrintLink(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (null!=head){
            sb.append(head.val).append("-");
            head = head.next;
        }
        System.out.println(sb.toString());
    }
}
