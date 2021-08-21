package normal;

import java.util.ArrayList;
import java.util.List;

public class No433Compress {

    public int compress(char[] chars) {
        if (null == chars || 0 == chars.length) {
            return 0;
        }

        int count = 0;
        char current = chars[0];
        int tmpCount = 1;
        List<Character> result = new ArrayList<>();
        for (int i = 1; i < chars.length; i++) {
            char tmp = chars[i];
            if (tmp == current) {
                tmpCount++;
            } else {
                count = getCount(count, tmpCount, result, current);
                current = tmp;
                tmpCount = 1;
            }
        }
        count = getCount(count, tmpCount, result, current);
        updateInput(result, chars);
        return count;
    }

    private void updateInput(List<Character> result, char[] chars) {
        for (int i = 0; i < result.size(); i++) {
            chars[i] = result.get(i);
        }
    }

    private int getCount(int count, int tmpCount, List<Character> result, char current) {
        if (tmpCount == 1) {
            count++;
            result.add(current);
        } else {
            count++;
            result.add(current);
            updateResultCount(result, tmpCount);
            while (tmpCount != 0) {
                tmpCount = tmpCount / 10;
                count++;
            }
        }
        return count;
    }

    private void updateResultCount(List<Character> result, int tmpCount) {
        char[] nums = Integer.toString(tmpCount).toCharArray();
        for (char c : nums) {
            result.add(c);
        }
    }


}
