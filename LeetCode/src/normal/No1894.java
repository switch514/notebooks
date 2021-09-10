package normal;

public class No1894 {
    public int chalkReplacer(int[] chalk, int k) {
        int length = chalk.length;
        long sum = 0;
        for (int i = 0; i < length; i++) {
            sum += chalk[i];
            if (sum > k) {
                return i;
            }
        }
        int left = (int) (k % sum);
        sum = 0;
        for (int i = 0; i < length; i++) {
            sum += chalk[i];
            if (sum > left) {
                return i;
            }
        }
        return 0;
    }
}
