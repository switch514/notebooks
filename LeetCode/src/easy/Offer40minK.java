package easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Offer40minK {
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] result = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    /**
     * 大根堆
     *
     * @param arr
     * @param k
     * @return
     */
    public int[] getLeastNumbers2(int[] arr, int k) {
        if (null == arr || k > arr.length || k == 0) {
            return new int[0];
        }

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2, o1);
            }
        });
        for (int i = 0; i < k; i++) {
            queue.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if (queue.peek() > arr[i]) {
                queue.poll();
                queue.offer(arr[i]);
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = queue.poll();
        }
        return result;
    }

    /**
     * 快速排序
     *
     * @param arr
     * @param k
     * @return
     */
    public int[] getLeastNumbers3(int[] arr, int k) {
        if (null == arr || k > arr.length || k == 0) {
            return new int[0];
        }

        quickSortK(arr, 0, arr.length-1,k);
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    private void quickSortK(int[] arr, int left, int right, int k) {
        if (left > right) {
            return;
        }
        int i = left;
        int j = right;
        int val = arr[i];
        while (i < j) {
            while (i < j && arr[j] > val) {
                j--;
            }
            if (i < j) {
                arr[i] = arr[j];
                i++;
            }
            while (i < j && arr[i] < val) {
                i++;
            }
            if (i < j) {
                arr[j] = arr[i];
                j--;
            }
        }
        arr[i] = val;
        if(i==k){
            return;
        }else if(i>k){
            quickSortK(arr, left, i-1, k);
        }else{
            quickSortK(arr, i+1, right, k);
        }
    }

    private void quickSort(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }
        int i = left;
        int j = right;
        int val = arr[i];
        while (i < j) {
            while (i < j && arr[j] > val) {
                j--;
            }
            if (i < j) {
                arr[i] = arr[j];
                i++;
            }
            while (i < j && arr[i] < val) {
                i++;
            }
            if (i < j) {
                arr[j] = arr[i];
                j--;
            }
        }
        arr[i] = val;

        quickSort(arr, left, i - 1);
        quickSort(arr, i + 1, right);
    }

}
