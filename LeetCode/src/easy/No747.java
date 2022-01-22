package easy;

import common.Node;
import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class No747 {
    public int dominantIndex(int[] nums) {
        if (null == nums || 0 == nums.length) {
            return -1;
        }
        if (1 == nums.length) {
            return 0;
        }

        int maxIndex = 0;
        int max = nums[0];
        int small = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                small = max;
                max = nums[i];
                maxIndex = i;
            } else {
                small = Math.max(small, nums[i]);
            }
        }
        if (small != 0) {
            if (max / small >= 2) {
                return maxIndex;
            } else {
                return -1;
            }
        } else {
            return maxIndex;
        }
    }


//    public int maxAreaOfIsland(int[][] grid) {
//
//    }

    public String customSortString(String order, String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> orderMap = new LinkedHashMap<>();
        for (char c : order.toCharArray()) {
            orderMap.put(c, 0);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (orderMap.containsKey(c)) {
                orderMap.put(c, orderMap.get(c) + 1);
            } else {
                sb.append(c);
            }
        }

        for (Map.Entry<Character, Integer> entry : orderMap.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            while (count > 0) {
                sb.append(c);
                count--;
            }
        }

        return sb.toString();
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<TreeNode> nodes = new ArrayList<>();
        if (null == root) {
            return result;
        }
        nodes.add(root);
        printLevel(nodes, result, 0);
        return result;
    }

    private void printLevel(List<TreeNode> nodes, List<List<Integer>> result, int index) {
        List<Integer> levelResult = new ArrayList<>();
        List<TreeNode> nodesLevel = new ArrayList<>();
        if (index % 2 == 0) {
            for (TreeNode node : nodes) {
                levelResult.add(node.val);
                if (null != node.left) {
                    nodesLevel.add(node.left);
                }
                if (null != node.right) {
                    nodesLevel.add(node.right);
                }
            }
        }else{
            for (int i=nodes.size()-1; i>=0; i--) {
                levelResult.add(nodes.get(i).val);
                if (null != nodes.get(i).right) {
                    nodesLevel.add(nodes.get(i).right);
                }
                if (null != nodes.get(i).left) {
                    nodesLevel.add(nodes.get(i).left);
                }
            }
        }
        result.add(levelResult);
        if (nodesLevel.size() > 0) {
            index++;
            printLevel(nodesLevel, result, index);
        }
    }

    private Node head;
    private Node pre;
    public Node treeToDoublyList(Node root) {
        dfs(root);
        pre.right = head;
        head.left = pre;
        return head;
    }

    private void dfs(Node node) {
        if(null == node){
            return;
        }
        dfs(node.left);
        if(null == head || null == pre){
            head = node;
            pre = node;
        }else{
            pre.right = node;
            node.left = pre;
            pre = node;
        }


        dfs(node.right);
    }
}
