package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class No551TimeTest {

    @Test
    public void checkRecord() {
        System.out.println(new No551Time().checkRecord("PPALLP"));
        System.out.println(new No551Time().checkRecord("PPALLL"));
    }
}