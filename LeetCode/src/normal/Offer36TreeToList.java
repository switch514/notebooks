package normal;

import common.Node;

public class Offer36TreeToList {
    Node head = null;
    Node pre = null;

    public Node treeToDoublyList(Node root) {
        if(null == root){
            return null;
        }
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    private void dfs(Node root) {
        if(null == root){
            return;
        }
        dfs(root.left);
        if(head == null || head.val > root.val){
            head = root;
        }

        if(pre == null){
            pre = root;
        }else{
            pre.right = root;
            root.left = pre;
            pre = root;
        }

        dfs(root.right);
    }
}
