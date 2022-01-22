package temp;

import common.ListNode;

import java.util.*;

public class SortedStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> temp = new Stack<>();

    public SortedStack() {

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length == 0 || nums[0] > 0) {
            return result;
        }
        for (int k = 0; k < nums.length - 2; k++) {
            if (k >= 1 && nums[k] == nums[k - 1]) {
                continue;
            }
            int left = k + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[k] + nums[left] + nums[right];
                if (sum < 0) {
                    left++;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                }
                if (sum > 0) {
                    right--;
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
                if (sum == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[k]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    result.add(temp);

                    left++;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    right--;
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
    }

    public static boolean isValid(String s) {
        if (null == s || s.length() <= 1) {
            return false;
        }
        Map<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put(']', '[');
        mapping.put('}', '{');
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (mapping.values().contains(c)) {
                stack.push(c);
            } else {

                if (!stack.isEmpty() && mapping.get(c) == stack.peek()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (null == lists || 0 == lists.length) {
            return null;
        }

        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return Integer.compare(o1.val, o2.val);
            }
        });

        for (int i = 0; i < lists.length; i++) {
            ListNode head = lists[i];
            while (null != head) {
                pq.add(head);
                head = head.next;
            }
        }

        ListNode preHead = new ListNode(0);
        ListNode tail = preHead;
        while (!pq.isEmpty()) {
            tail.next = pq.poll();
            tail = tail.next;
        }
        tail.next = null;
        return preHead.next;
    }

    public static int search(int[] nums, int target) {
        if (null == nums || 0 == nums.length) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            //右半部分有序
            if (nums[mid] < nums[right]) {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (nums[mid] > target && target >= nums[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(val);
        } else {
            if (val <= stack.peek()) {
                stack.push(val);
            } else {
                while (!stack.isEmpty() && stack.peek() < val) {
                    temp.push(stack.pop());
                }
                stack.push(val);
                while (!temp.isEmpty()) {
                    stack.push(temp.pop());
                }
            }
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }

    public int peek() {
        if (!stack.isEmpty()) {
            return stack.peek();
        } else {
            return -1;
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public boolean isPalindrome(int x) {
        String intStr = String.valueOf(x);
        StringBuilder bd = new StringBuilder(intStr);
        return bd.reverse().toString().equals(intStr);

    }

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int contain = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, contain);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
