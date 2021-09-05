package normal;

public class Offer44GetN {
    public int findNthDigit(int n) {
        if (n <= 9) {
            return n;
        }

        int digit = 1;
        long numUnit = 9l;
        long tens = 1;
        long count = 0l;
        while (n > numUnit) {
            count += numUnit;
            digit++;
            tens = tens * 10l;
            numUnit = 9l * digit * tens;
        }

        long number = tens + (n - 1 - count) / digit;

        char res = String.valueOf(number).charAt((int) ((n - 1 - count) % digit));
        return Integer.parseInt(String.valueOf(res));
    }
}
