package normal;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class No1109BookFlightTest {

    @Test
    public void corpFlightBookings() {
        int [][] data = new int[][]{{1,2,10},{2,3,20},{2,5,25}};
        System.out.println(Arrays.toString(new No1109BookFlight().corpFlightBookings(data,5)));
    }
}