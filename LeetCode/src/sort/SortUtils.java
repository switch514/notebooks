package sort;

import common.TreeNode;

import java.util.Calendar;

public class SortUtils implements SortFunctions {


    public static int[] getTestData(int size) {
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = (int) (Math.random() * 1000);
        }

        return data;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        SortUtils utils = new SortUtils();


        utils.sort(utils.getTestData(30000), "bubble");
        utils.sort(utils.getTestData(30000), "select");
        utils.sort(utils.getTestData(30000), "insert");
        utils.sort(utils.getTestData(30000), "shell");
        utils.sort(utils.getTestData(30000), "heap");
        utils.sort(utils.getTestData(30000), "quick");
        utils.sort(utils.getTestData(30000), "merge");
    }

    public void bubbleSort(int[] nums) {
        long timeStart = Calendar.getInstance().getTimeInMillis();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        long timeEnd = Calendar.getInstance().getTimeInMillis();
    }

    public void selectionSort(int[] nums) {
        long timeStart = Calendar.getInstance().getTimeInMillis();
        for (int i = 0; i < nums.length; i++) {
            int index = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[index]) {
                    index = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }

    }

    public void insertionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            while (j > 0 && j < nums.length) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j, j - 1);
                }
                j--;
            }
        }
    }

    public void shellSort(int[] nums) {
        int step = nums.length / 2;
        while (step >= 1) {
            for (int i = 0; i <= nums.length - step; i += step) {
                int j = i + step;
                while (j - step >= 0 && j < nums.length) {
                    if (nums[j] < nums[j - step]) {
                        swap(nums, j, j - step);
                    }
                    j -= step;
                }
            }
            step = step / 2;
        }
    }

    public void heapSort(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            maxHeap(nums, i);
            swap(nums, i, 0);
        }
    }

    private void maxHeap(int[] nums, int i) {
        for (int parent = (i - 1) / 2; parent >= 0; parent--) {
            int leftChild = parent * 2 + 1;
            int rightChild = parent * 2 + 2;
            if ((rightChild <= i) && (nums[rightChild] > nums[leftChild])) {
                if (nums[parent] < nums[rightChild]) {
                    swap(nums, parent, rightChild);
                }
            } else {
                if (nums[parent] < nums[leftChild]) {
                    swap(nums, parent, leftChild);
                }
            }
        }
    }

    public void quickSort(int[] nums) {
        quickSubSort(nums, 0, nums.length - 1);
    }

    private void quickSubSort(int[] nums, int low, int hight) {
        if (low >= hight) {
            return;
        }

        int left = low;
        int right = hight;

        int base = nums[left];
        while (left < right) {
            while ((left < right) && nums[right] >= base) {
                right--;
            }
            nums[left] = nums[right];
            while ((left < right) && nums[left] <= base) {
                left++;
            }
            nums[right] = nums[left];
        }
        nums[left] = base;
        quickSubSort(nums, low, left - 1);
        quickSubSort(nums, left + 1, hight);
    }

    public void mergeSort(int[] nums) {
        int[] temp = new int[nums.length];
        mergeSubSort(nums, 0, nums.length - 1, temp);
    }

    private void mergeSubSort(int[] nums, int low, int high, int[] temp) {
        if (low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;
        mergeSubSort(nums, low, mid, temp);
        mergeSubSort(nums, mid + 1, high, temp);
        mergeResult(nums, low, mid, high, temp);

    }

    private void mergeResult(int[] nums, int low, int mid, int high, int[] temp) {
        for (int k = low; k <= high; k++) {
            temp[k] = nums[k];
        }
        int left = low;
        int right = mid + 1;
        for (int k = low; k <= high; k++) {
            if (left > mid) {
                nums[k] = temp[right++];
            } else if (right > high) {
                nums[k] = temp[left++];
            } else if (temp[left] > temp[right]) {
                nums[k] = temp[right++];
            } else {
                nums[k] = temp[left++];
            }
        }

    }

    @Override
    public void sort(int[] nums, String type) {
        long timeStart = Calendar.getInstance().getTimeInMillis();

        if (type.equals("bubble")) {
            bubbleSort(nums);
        }
        if (type.equals("select")) {
            selectionSort(nums);
        }
        if (type.equals("insert")) {
            insertionSort(nums);
        }
        if (type.equals("shell")) {
            shellSort(nums);
        }
        if (type.equals("heap")) {
            heapSort(nums);
        }
        if (type.equals("quick")) {
            quickSort(nums);
        }
        if (type.equals("merge")) {
            mergeSort(nums);
        }

        long timeEnd = Calendar.getInstance().getTimeInMillis();
        System.out.println(type + " sort cost " + (timeEnd - timeStart) + "ms");
        //System.out.println(Arrays.toString(nums));
        System.out.println("Check result " + check(nums));
    }

    private boolean check(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public boolean isBalanced(TreeNode root) {
        if (null == root) {
            return true;
        }
        int depthLeft = getDepth(root.left, 0);
        int depthRight = getDepth(root.right, 0);
        if (Math.abs(depthLeft - depthRight) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int getDepth(TreeNode node, int depth) {
        if (null == node) {
            return depth;
        }

        return Math.max(getDepth(node.left, depth + 1), getDepth(node.right, depth + 1));
    }
}
