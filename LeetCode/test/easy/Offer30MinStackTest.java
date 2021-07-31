package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class Offer30MinStackTest {

    @Test
    public void testMinStack(){
        Offer30MinStack stack = new Offer30MinStack();
        stack.push(5);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.min());
        stack.pop();
        stack.pop();
        System.out.println(stack.top());
        System.out.println(stack.min());
    }

}