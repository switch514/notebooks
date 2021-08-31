package normal;

import java.util.Map;
import java.util.TreeMap;

public class No1109BookFlight {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        if(bookings==null || bookings.length==0){
            return null;
        }

        int [] diff = new int[n+2];
        for(int i=0; i<bookings.length; i++){
            int [] booking = bookings[i];
            int left = booking[0];
            int right =booking[1];
            int count = booking[2];
            diff[left] = diff[left] + count;
            diff[right+1] = diff[right+1] - count;
        }

        for(int i=1;i<diff.length; i++){
            diff[i] = diff[i] + diff[i -1];
        }

        int [] result = new int[n];
        System.arraycopy(diff, 1, result,0,n);
        return result;
    }
}
