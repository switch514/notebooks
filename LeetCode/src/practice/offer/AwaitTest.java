package practice.offer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AwaitTest {
    private static Lock lock = new ReentrantLock();
    private static Condition condition = lock.newCondition();
    private static Queue<Integer> queue = new LinkedList();
    private static boolean flag = false;

    public static void main(String[] args) {
        Thread t1 = new Thread(new Producer());
        Thread t2 = new Thread(new Consumer());

        t1.start();
        t2.start();
    }

    public static class Producer implements Runnable {
        @Override
        public void run() {
            lock.lock();
            try {
                while (true) {
                    if (!flag) {
                        for (int i = 0; i < 5; i++) {
                            queue.offer(i);
                        }
                        this.wait();
                        flag = true;
                        System.out.println("Ready");
                        condition.await();
                    }
                    condition.signalAll();
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

    public static class Consumer implements Runnable {

        @Override
        public void run() {
            lock.lock();
            try {
                while (true) {
                    if (flag) {
                        while (!queue.isEmpty()) {
                            System.out.println(queue.poll());
                        }
                        flag = false;
                        condition.signalAll();
                    }
                    condition.await();
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}
