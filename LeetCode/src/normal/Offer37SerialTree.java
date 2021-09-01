package normal;

import common.TreeNode;

public class Offer37SerialTree {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        dfs(root, sb);
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private void dfs(TreeNode node, StringBuilder sb) {

        if (null == node) {
            sb.append(",");
            return;
        } else {
            sb.append(node.val);
            sb.append(",");
        }
        dfs(node.left, sb);
        dfs(node.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] datas = data.split(",");
        return bfs(datas, new int[]{0});
    }

    private TreeNode bfs(String[] data, int [] index) {
        if (index[0] >= data.length) {
            return null;
        }
        String c = data[index[0]];
        if ("".equals(c)) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(c));
        index[0]++;
        node.left = bfs(data, index);
        index[0]++;
        node.right = bfs(data, index);
        return node;
    }
}
