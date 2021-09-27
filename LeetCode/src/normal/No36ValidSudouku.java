package normal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class No36ValidSudouku {
    public boolean isValidSudoku(char[][] board) {
        if (board == null || board.length == 0) {
            return false;
        }

        Map<Integer, Set<Character>> columnMap = new HashMap<>();
        Map<Integer, Set<Character>> rowMap = new HashMap<>();
        Map<Integer, Set<Character>> netMap = new HashMap<>();
        for (int iRow = 0; iRow < board.length; iRow++) {
            for (int iCol = 0; iCol < board[0].length; iCol++) {
                char c = board[iRow][iCol];
                if (c == '.') {
                    continue;
                }

                Set<Character> rowSet = rowMap.getOrDefault(iRow, new HashSet<>());
                if (rowSet.contains(c)) {
                    return false;
                } else {
                    rowSet.add(c);
                    rowMap.put(iRow, rowSet);
                }

                Set<Character> colSet = columnMap.getOrDefault(iCol, new HashSet<>());
                if (colSet.contains(c)) {
                    return false;
                } else {
                    colSet.add(c);
                    columnMap.put(iCol, colSet);
                }

                int netIndex = (iRow / 3) * 3 + iCol / 3;
                Set<Character> netSet = netMap.getOrDefault(netIndex, new HashSet<>());
                if (netSet.contains(c)) {
                    return false;
                } else {
                    netSet.add(c);
                    netMap.put(netIndex, netSet);
                }
            }
        }
        return true;
    }
}
