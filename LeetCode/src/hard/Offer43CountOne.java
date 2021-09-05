package hard;

public class Offer43CountOne {
    public int countDigitOne(int n) {
        int result = 0;
        int high = n / 10;
        int cur = n % 10;
        int low = 0;
        int digit = 1;
        while (high != 0 || cur != 0) {
            if (cur == 0) {
                result = result + high * digit;
            } else if (cur == 1) {
                result = result + high * digit + low + 1;
            } else {
                result = result + (high + 1) * digit;
            }
            cur = high % 10;
            high = high / 10;
            digit = digit * 10;
            low = n % digit;
        }
        return result;
    }
}
