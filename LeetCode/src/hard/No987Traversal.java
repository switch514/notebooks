package hard;

import common.TreeNode;

import java.util.*;

public class No987Traversal {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer, Map<Integer, List<Integer>>> colMap = new TreeMap<>();

        traversalTree(root, 0, 0, colMap);

        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, Map<Integer, List<Integer>>> entry : colMap.entrySet()) {
            Map<Integer, List<Integer>> values = entry.getValue();
            List<Integer> tempList = new ArrayList<>();
            for (Map.Entry<Integer, List<Integer>> entryV : values.entrySet()) {
                List<Integer> valueList = entryV.getValue();
                Collections.sort(valueList);
                tempList.addAll(valueList);
            }
            result.add(tempList);
        }
        return result;
    }

    private void traversalTree(TreeNode root, int row, int col, Map<Integer, Map<Integer, List<Integer>>> colMap) {
        if (null == root) {
            return;
        }
        Map<Integer, List<Integer>> colValueMap = colMap.getOrDefault(col, new TreeMap<>());
        List<Integer> values = colValueMap.getOrDefault(row, new ArrayList<>());
        values.add(root.val);
        colValueMap.put(row, values);
        colMap.put(col, colValueMap);

        traversalTree(root.left, row + 1, col - 1, colMap);
        traversalTree(root.right, row + 1, col + 1, colMap);
    }
}
