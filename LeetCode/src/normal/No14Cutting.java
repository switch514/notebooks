package normal;

public class No14Cutting {
    public int cuttingRope(int n) {

        if (n <= 3) {
            return n - 1;
        }
        int div = n / 3;
        int add = n % 3;
        if (0 == add) {
            return (int) Math.pow(3, div);
        } else if (1 == add) {
            return (int) Math.pow(3, div - 1) * 4;
        } else {
            return (int) Math.pow(3, div) * 2;
        }
    }

    public int cuttingRope2(int n) {
        if (n <= 3) {
            return n - 1;
        }
        int div = n / 3;
        int add = n % 3;
        long result = 1;
        for (int i = 0; i < div-1 ; i++) {
            result = result * 3 % 1000000007;
        }
        if (1 == add) {
            return (int) (result * 4 % 1000000007);
        } else {
            if (2 == add) {
                return (int) (result * 3 * 2 % 1000000007);
            } else {
                return (int) (result * 3 % 1000000007);
            }
        }

    }
}
