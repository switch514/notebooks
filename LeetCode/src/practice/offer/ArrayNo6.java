package practice.offer;

import java.util.Arrays;

public class ArrayNo6 {
    public static int[] plusOne(int[] digits) {
        if (null == digits || 0 == digits.length) {
            return new int[0];
        }

        if (9 != digits[digits.length - 1]) {
            digits[digits.length - 1]++;
            return digits;
        }

        digits[digits.length - 1] = 0;
        boolean shift = true;
        for (int i = digits.length - 2; i >= 0; i--) {
            int num = digits[i];
            if (num == 9 && shift) {
                digits[i] = 0;
                shift = true;
            } else if (shift) {
                digits[i]++;
                return digits;
            } else {
                return digits;
            }
        }
        int[] result = new int[digits.length + 1];
        System.arraycopy(digits, 0, result, 1, digits.length);
        result[0] = 1;

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9})));
    }
}
