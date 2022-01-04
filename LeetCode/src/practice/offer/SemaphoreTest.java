package practice.offer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;

public class SemaphoreTest {
    public static Semaphore semaphore = new Semaphore(3);

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(10);
        for(int i=0;i<10;i++){
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread-" + Thread.currentThread().getName() + " Start");
                    try {
                        semaphore.acquire();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread-" + Thread.currentThread().getName() + " running");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread-" + Thread.currentThread().getName() + " end");
                    semaphore.release();

                }
            });
        }
    }
}
