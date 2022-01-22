package temp;

import common.ListNode;
import common.TestUtils;
import common.TreeNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Tencent {

    public static ListNode rotateRight(ListNode head, int k) {
        if (null == head || 0 == k || head.next == null) {
            return head;
        }


        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            temp = temp.next;
            length++;
        }
        int offset = k % length;
        if (0 == offset) {
            return head;
        }


        ListNode fast = head;
        for (int i = 0; i < offset; i++) {
            if (fast.next != null) {
                fast = fast.next;
            } else {
                fast = head;
            }
        }

        ListNode slow = head;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        ListNode newHead = slow.next;
        slow.next = null;
        fast.next = head;

        return newHead;
    }

    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int[] dp = new int[prices.length];
        dp[0] = 0;
        for (int i = 1; i < prices.length; i++) {
            int n = prices[i];
            if (n < min) {
                min = n;
                dp[i] = dp[i - 1];
            } else {
                dp[i] = Math.max(dp[i - 1], n - min);
            }
        }
        return dp[prices.length - 1];
    }

    public static void main(String[] args) {
//        System.out.println(new Tencent().findKthLargest2(new int[]{3, 2, 1, 5, 6, 4}, 2));
//        System.out.println(new Tencent().findKthLargest2(new int[]{2, 1}, 2));
        System.out.println(new Tencent().kthSmallest(TestUtils.getTreeNode(new Integer[]{3, 1, 4, null, 2}), 1));
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        int length = nums.length;
        boolean[] used = new boolean[length];
        search(used, nums, result, new ArrayList<Integer>());
        return result;
    }

    private void search(boolean[] used, int[] nums, List<List<Integer>> result, ArrayList<Integer> temp) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                temp.add(nums[i]);
                used[i] = true;
                search(used, nums, result, temp);
                used[i] = false;
                temp.remove(temp.size() - 1);
            }
        }
    }

    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        int result = nums[0];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (dp[i - 1] > 0) {
                dp[i] = dp[i - 1] + nums[i];
            } else {
                dp[i] = nums[i];
            }
            result = Math.max(dp[i], result);
        }

        return result;
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        if (null == matrix || 0 == matrix.length) {
            return null;
        }

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        List<Integer> result = new ArrayList<>();
        while (true) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            if (top > bottom) {
                break;
            }

            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            if (right < left) {
                break;
            }

            for (int i = right; i >= left; i--) {
                result.add(matrix[bottom][i]);
            }
            bottom--;
            if (bottom < top) {
                break;
            }

            for (int i = bottom; i >= top; i--) {
                result.add(matrix[i][left]);
            }
            left++;
            if (left > right) {
                break;
            }
        }
        return result;
    }

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        List<Integer> result = new ArrayList<>();
        int value = 1;
        while (true) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = value++;
            }
            top++;
            if (top > bottom) {
                break;
            }

            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;
            if (right < left) {
                break;
            }

            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = value++;
            }
            bottom--;
            if (bottom < top) {
                break;
            }

            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = value++;
            }
            left++;
            if (left > right) {
                break;
            }
        }
        return matrix;

    }

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
            for (int j = 0; j < n; j++) {
                dp[0][j] = 1;
                if (i >= 1 && j >= 1) {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                }
            }
        }

        return dp[m - 1][n - 1];
    }

    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int count = 0; count <= nums.length; count++) {
            List<Integer> temp = new ArrayList<>();
            boolean[] used = new boolean[nums.length];
            backtrack(0, count, nums, temp, used, result);
        }

        return result;
    }

    private void backtrack(int start, int count, int[] nums, List<Integer> temp, boolean[] used, List<List<Integer>> result) {
        if (temp.size() == count) {
            result.add(new ArrayList<>(temp));
        }
        for (int i = start; i < nums.length; i++) {
            if (!used[i]) {
                temp.add(nums[i]);
                used[i] = true;
                backtrack(i + 1, count, nums, temp, used, result);
                used[i] = false;
                temp.remove(temp.size() - 1);
            }
        }

    }

    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        int length = (int) Math.pow(2, n);
        for (int i = 0; i < length; i++) {
            int code = i ^ (i >> 1);
            result.add(code);
        }
        return result;
    }

    public int maxDepth(TreeNode root) {
        int[] maxDep = new int[1];
        dfs(1, root, maxDep);
        return maxDep[0];
    }

    private void dfs(int depth, TreeNode root, int[] maxDep) {
        if (null == root) {
            return;
        }

        if (root.left == null && root.right == null) {
            maxDep[0] = Math.max(maxDep[0], depth);
        }

        dfs(depth + 1, root.left, maxDep);
        dfs(depth + 1, root.right, maxDep);
    }

    public int maxPathSum(TreeNode root) {
        int[] maxSum = new int[1];
        maxSum[0] = root.val;
        dfsSum(root, maxSum);
        return maxSum[0];
    }

    private int dfsSum(TreeNode root, int[] maxSum) {
        if (null == root) {
            return 0;
        }

        int leftVal = Math.max(dfsSum(root.left, maxSum), 0);
        int rightVal = Math.max(dfsSum(root.right, maxSum), 0);

        int sum = root.val + leftVal + rightVal;
        maxSum[0] = Math.max(sum, maxSum[0]);

        return root.val + Math.max(leftVal, rightVal);
    }

    public boolean hasCycle(ListNode head) {
        if (null == head) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (null != fast.next && null != fast.next.next && null != slow.next) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public ListNode detectCycle(ListNode head) {
        if (null == head || head.next == head) {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        boolean hasCircle = false;
        while (null != fast.next && null != fast.next.next && null != slow.next) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                hasCircle = true;
                break;
            }
        }
        if (!hasCircle) {
            return null;
        }

        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }

    public ListNode sortList(ListNode head) {
        if (null == head) {
            return null;
        }
        if (head.next == head) {
            head.next = null;
            return head;
        }
        PriorityQueue<ListNode> pq = new PriorityQueue(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                ListNode ob1 = (ListNode) o1;
                ListNode ob2 = (ListNode) o2;

                return Integer.compare(ob1.val, ob2.val);
            }
        });
        ListNode temp = head;
        while (temp != null) {
            pq.offer(temp);
            temp = temp.next;
        }

        ListNode newHead = pq.poll();
        temp = newHead;
        while (!pq.isEmpty()) {
            temp.next = pq.poll();
            temp = temp.next;
        }
        temp.next = null;
        return newHead;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (null == headA || null == headB) {
            return null;
        }

        ListNode i1 = headA;
        ListNode i2 = headB;
        while (i1 != i2) {
            i1 = i1 == null ? headB : i1.next;
            i2 = i2 == null ? headA : i2.next;
        }
        return i1;
    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    public int findKthLargest(int[] nums, int k) {
        int result = nums[0];
        for (int i = nums.length - 1; i >= nums.length - k; i--) {
            if (i > 0) {
                maxHeap(nums, i);
                swap(nums, 0, i);
            }
        }
        return nums[nums.length - k];
    }

    private void maxHeap(int[] nums, int i) {
        for (int parent = (i - 1) / 2; parent >= 0; parent--) {
            int leftChild = 2 * parent + 1;
            int rightChild = 2 * parent + 2;
            if ((rightChild <= i)) {
                if (nums[rightChild] >= nums[leftChild] && nums[rightChild] > nums[parent]) {
                    swap(nums, rightChild, parent);
                }
                if (nums[leftChild] >= nums[rightChild] && nums[leftChild] > nums[parent]) {
                    swap(nums, leftChild, parent);
                }
            } else {
                if (nums[leftChild] > nums[parent]) {
                    swap(nums, leftChild, parent);
                }
            }
        }
    }

    private void swap(int[] nums, int index, int index2) {
        int temp = nums[index];
        nums[index] = nums[index2];
        nums[index2] = temp;
    }

    public int findKthLargest2(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0; i < nums.length; i++) {
            pq.offer(nums[i]);
        }
        for (int i = k; i > 1; i--) {
            pq.poll();
        }
        return pq.peek();
    }

    public int kthSmallest(TreeNode root, int k) {
        int[] result = new int[1];
        int[] count = new int[1];
        midOrder(root, count, k, result);

        return result[0];
    }

    private void midOrder(TreeNode root, int[] count, int k, int[] result) {
        if (null == root) {
            return;
        }
        midOrder(root.left, count, k, result);
        count[0]++;
        if (count[0] == k) {
            result[0] = root.val;
            return;
        }

        midOrder(root.right, count, k, result);

    }

    public boolean isPowerOfTwo(int n) {

        while (n > 1) {
            if (1 == n % 2) {
                return false;
            }
            n = n / 2;
        }
        return n == 1;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q) {
            return root;
        }

        if (root.val < p.val && root.val < q.val) {
            if (null != root.right) {
                return lowestCommonAncestor(root.right, p, q);
            }
        }
        if (root.val > p.val && root.val > q.val) {
            if (null != root.left) {
                return lowestCommonAncestor(root.left, p, q);
            }
        }
        return root;
    }

    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q) {
            return root;
        }
        if (null == root) {
            return null;
        }

        TreeNode lSon = lowestCommonAncestor2(root.left, p, q);
        TreeNode rSon = lowestCommonAncestor2(root.right, p, q);

        if (null != lSon && null != rSon) {
            return root;
        }
        if (null == lSon && null != rSon) {
            return rSon;
        }
        if (null != lSon && null == rSon) {
            return lSon;
        }

        return null;
    }

    public void deleteNode(ListNode node) {
        node.next = node.next.next;
        node = node.next;
    }

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] leftMul = new int[nums.length];
        leftMul[0] = 1;
        int mul = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            int num = nums[i];
            mul = mul * num;
            leftMul[i + 1] = mul;
        }
        int rightMul = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];
            result[i] = leftMul[i] * rightMul;
            rightMul = rightMul * num;
        }
        return result;
    }

    public boolean canWinNim(int n) {
        return n%4==0;
    }

    public String reverseWords(String s) {
        String [] strs = s.split(" ");

        StringBuilder bd = new StringBuilder();

        for(String str : strs) {
            StringBuilder temp = new StringBuilder(str);
            bd.append(temp.reverse().toString()).append(" ");
        }
        return bd.deleteCharAt( bd.length()-1).toString();

    }
}
