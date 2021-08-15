package normal;

import org.junit.Test;

import static org.junit.Assert.*;

public class Offer12MatrixTest {

    @Test
    public void exist() {
        System.out.println(new Offer12Matrix().exist(new char[][]{{'C','A','A'},{'A','A','A'},{'B','C','D'}},"AAB"));
        System.out.println(new Offer12Matrix().exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"ABCCED"));
        System.out.println(new Offer12Matrix().exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"ABACCED"));
    }
}