package normal;

import org.junit.Test;

import static org.junit.Assert.*;

public class No36ValidSudoukuTest {

    @Test
    public void isValidSudoku() {
        char[][] data = new char[][]{{'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};
        System.out.println(new No36ValidSudouku().isValidSudoku(data));
    }
}