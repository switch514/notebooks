package normal;

public class Offer12Matrix {
    private final char tmp = '#';

    public boolean exist(char[][] board, String word) {
        if (null == board || 0 == board.length) {
            return false;
        }

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (existWord(row, col, board, word.toCharArray(), 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean existWord(int row, int col, char[][] board, char[] chars, int index) {
        if (row > board.length - 1 || col > board[0].length - 1 || row < 0 || col < 0) {
            return false;
        }
        if (!(board[row][col] == chars[index])) {
            return false;
        }
        if (index == chars.length - 1) {
            return true;
        }

        board[row][col] = tmp;

        boolean res = existWord(row + 1, col, board, chars, index + 1) || existWord(row, col + 1, board, chars, index + 1)
                || existWord(row - 1, col, board, chars, index + 1) || existWord(row, col - 1, board, chars, index + 1);
        board[row][col] = chars[index];
        return res;
    }
}
