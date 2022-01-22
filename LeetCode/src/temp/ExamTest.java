package temp;

import common.ListNode;
import common.TestUtils;
import common.TreeNode;

import java.util.*;

public class ExamTest {
    private static final Character X = 'X';
    private static final Character O = 'O';
    private int maxCount = 1;

    public static int findNumberOfLIS(int[] nums) {
        List<String> numList = new ArrayList<>();
        int maxLength = 1;

        StringBuilder bd = new StringBuilder();
        bd.append(nums[0]);
        numList.add(bd.toString());
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                bd.append(nums[i]);
            } else {
                int length = bd.length();
                if (length > maxLength) {
                    numList.clear();
                    numList.add(bd.toString());
                    maxLength = length;
                } else if (length == maxLength) {
                    numList.add(bd.toString());
                }
                bd = new StringBuilder();
                bd.append(nums[i]);
            }
        }
        return numList.size();
    }

    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode newHead = list1;
        ListNode temp = newHead;
        ListNode list2Tail = list2;
        while (list2Tail.next != null) {
            list2Tail = list2Tail.next;
        }
        ListNode beforeANode = temp;
        ListNode afterBNode = temp;
        int index = 0;
        while (temp.next != null) {
            if (index == a - 1) {
                beforeANode = temp;
            }
            if (index == b) {
                afterBNode = temp.next;
                break;
            }
            temp = temp.next;
            index++;
        }

        beforeANode.next = list2;
        list2Tail.next = afterBNode;

        return newHead;
    }

    public static void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++) {
            int[] temp = matrix[matrix.length - 1 - i];
            matrix[matrix.length - 1 - i] = matrix[i];
            matrix[i] = temp;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static boolean isPalindrome(ListNode head) {
        List<Integer> nums = new ArrayList<>();
        while (head != null) {
            nums.add(head.val);
            head = head.next;
        }
        for (int i = 0; i < nums.size() / 2; i++) {
            if (!nums.get(i).equals(nums.get(nums.size() - 1 - i))) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        isPalindrome(TestUtils.getListLink(new int[]{-129, -129}));
    }

    public boolean validTicTacToe(String[] board) {
        if (null == board || board.length == 0) {
            return false;
        }

        if (3 != board.length) {
            return false;
        }

        for (int i = 0; i < 3; i++) {
            if (3 != board[i].length()) {
                return false;
            }
        }

        Map<Character, Integer> charCount = new HashMap<>();
        String full = "";
        boolean xxxFlag = false;
        boolean oooFlag = false;
        for (int row = 0; row < 3; row++) {
            full = full + board[row];
            if ("XXX".equals(board[row])) {
                xxxFlag = true;
            }
            if ("OOO".equals(board[row])) {
                oooFlag = true;
            }
            for (int col = 0; col < 3; col++) {
                Character c = board[row].charAt(col);
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
                if (0 == row) {
                    StringBuilder bd = new StringBuilder();
                    bd.append(board[row].charAt(col)).append(board[row + 1].charAt(col)).append(board[row + 2].charAt(col));
                    if ("XXX".equals(bd.toString())) {
                        xxxFlag = true;
                    }
                    if ("OOO".equals(bd.toString())) {
                        oooFlag = true;
                    }
                }
            }
        }

        int xCount = charCount.getOrDefault(X, 0);
        int OCount = charCount.getOrDefault(O, 0);
        if (xCount < OCount || (xCount - OCount) > 1) {
            return false;
        }

        if (xxxFlag && oooFlag) {
            return false;
        }

        return !full.equals("XOXOXOXOX") && !full.equals("OXOXOXOXO");
    }

    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> upperList = new ArrayList<>();
        List<Integer> lowerList = new ArrayList<>();
        resultList.add(upperList);
        resultList.add(lowerList);

        for (int i = 0; i < colsum.length; i++) {
            if (colsum[i] == 0) {
                upperList.add(0);
                lowerList.add(0);
            }
            if (colsum[i] == 2) {
                upperList.add(1);
                lowerList.add(1);
                upper--;
                lower--;
            }
            if (colsum[i] == 1) {
                if (upper >= lower) {
                    upperList.add(1);
                    lowerList.add(0);
                    upper--;
                } else {
                    upperList.add(0);
                    lowerList.add(1);
                    lower--;
                }
            }

            if (upper < 0 || lower < 0) {
                return new ArrayList<>();
            }
        }

        if (!(upper == 0 && lower == 0)) {
            return new ArrayList<>();
        }

        return resultList;
    }

    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int result = 1;
        dp[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }

            result = Math.max(dp[i], result);

        }
        return result;
    }

    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        List<Integer> result = new ArrayList<>();
        int[] leftCount = new int[security.length];
        int[] rightCount = new int[security.length];

        for (int i = 1; i < security.length; i++) {
            if (security[i] > security[i - 1]) {
                leftCount[i] = 0;
            } else {
                leftCount[i] = leftCount[i - 1] + 1;
            }
        }

        for (int i = security.length - 2; i >= 0; i--) {
            if (security[i] > security[i + 1]) {
                rightCount[i] = 0;
            } else {
                rightCount[i] = rightCount[i + 1] + 1;
            }
        }

        for (int i = time; i < security.length - time; i++) {
            if (leftCount[i] >= time && rightCount[i] >= time) {
                result.add(i);
            }
        }

        return result;
    }

    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> valCount = new HashMap<>();
        countNode(root, valCount);

        List<Integer> resultList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : valCount.entrySet()) {
            if (maxCount == entry.getValue()) {
                resultList.add(entry.getKey());
            }
        }
        return resultList.stream().mapToInt((i) -> Integer.valueOf(i)).toArray();
    }

    private void countNode(TreeNode node, HashMap<Integer, Integer> valCount) {
        if (null == node) {
            return;
        }
        int count = valCount.getOrDefault(node.val, 0) + 1;
        valCount.put(node.val, count);
        if (count > maxCount) {
            maxCount = count;
        }
        countNode(node.left, valCount);
        countNode(node.right, valCount);
    }

    public void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for (int i : rows) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = 0;
            }
        }
        for (int j : cols) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][j] = 0;
            }
        }
    }

    public boolean isFlipedString(String s1, String s2) {
        return (s1 + s1).contains(s2);
    }

    public int kthToLast(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.val;
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode tail = head;
        int addOn = 0;
        while (l1 != null || l2 != null) {
            int v1 = l1 == null ? 0 : l1.val;
            int v2 = l2 == null ? 0 : l2.val;

            int val = v1 + v2 + addOn;
            if (val >= 10) {
                addOn = 1;
                val = val % 10;
            } else {
                addOn = 0;
            }
            tail.next = new ListNode(val);
            tail = tail.next;
            if (null != l1) l1 = l1.next;
            if (null != l2) l2 = l2.next;
        }
        if (1 == addOn) {
            tail.next = new ListNode(1);
            tail = tail.next;
        }

        return head.next;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            if (a == null) {
                a = headB;
            } else {
                a = a.next;
            }

            if (b == null) {
                b = headA;
            } else {
                b = b.next;
            }
        }
        return a;
    }

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> nodes = new HashSet<>();
        while (head != null) {
            if (nodes.contains(head)) {
                return head;
            } else {
                nodes.add(head);
            }
            head = head.next;
        }

        return null;
    }



}
