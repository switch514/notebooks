package normal;

import org.junit.Test;

import static org.junit.Assert.*;

public class No13RobotTest {

    @Test
    public void movingCount() {
        System.out.println(new No13Robot().movingCountDfs(16,8,4));
        System.out.println(new No13Robot().movingCountDfs(3,1,0));
    }
}