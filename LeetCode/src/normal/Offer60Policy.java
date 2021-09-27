package normal;

import java.util.Arrays;

public class Offer60Policy {
    public double[] dicesProbability(int n) {
        double[] res = new double[6];
        Arrays.fill(res, 1d / 6d);
        for (int i = 2; i <= n; i++) {
            double[] tmp = new double[6 * i - i + 1];
            for (int j = 0; j < res.length; j++) {
                for (int k = 0; k < 6; k++) {
                    tmp[j + k] = tmp[j + k] + res[j] * 1 / 6;
                }
            }
            res = tmp;
        }

        return res;
    }
}
