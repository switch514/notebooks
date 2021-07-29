package normal;

public class Offer16Me {
    public double myPow(double x, int n) {
//        if (0 == n || x==1) {
//            return 1d;
//        }
//        if (1 == n) {
//            return x;
//        }
//        if (-1 == n) {
//            return 1 / x;
//        }
//        double result = 1.0;
//        int t = n>0?n:-n;
//        while (t != 0) {
//            if ((t & 1) == 1) {
//                result = result * x;
//            }
//            x = x * x;
//            t = t >> 1;
//        }
//        if (n > 0) {
//            return result;
//        } else {
//            return 1 / result;
//        }
        if (0 == n) {
            return 1;
        } else if (n < 0) {
            return 1 / (x * myPow(x, -n - 1));
        } else if (n % 2 == 1) {
            return (x * myPow(x, n - 1));
        } else {
            return myPow(x * x, n / 2);
        }
    }
}
