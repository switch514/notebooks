package normal;

import java.util.HashSet;
import java.util.Set;

public class Offer38SortStr {
    public String[] permutation(String s) {
        if (null == s || s.length() == 0) {
            return new String[0];
        }
        char[] chars = s.toCharArray();
        Set<String> result = new HashSet<>();
        boolean[] visited = new boolean[s.length()];
        StringBuilder sb = new StringBuilder();
        dfs(chars, visited, result, sb);
        return result.toArray(new String[result.size()]);
    }

    private void dfs(char[] chars, boolean[] visited, Set<String> result, StringBuilder sb) {
        if (sb.length() == chars.length) {
            result.add(sb.toString());
            return;
        }
        for (int i = 0; i < chars.length; i++) {
            if (visited[i]) {
                continue;
            } else {
                sb.append(chars[i]);
                visited[i] = true;
                dfs(chars, visited, result, sb);
                sb.deleteCharAt(sb.length()-1);
                visited[i] = false;
            }
        }
    }
}
