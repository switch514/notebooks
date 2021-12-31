package practice.offer;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableAndFuture {
    public static void main(String[] args) {
        Callable<Integer> call = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(2000);
                return 1;
            }
        };

        FutureTask ft = new FutureTask(call);

        Thread t = new Thread(ft);
        t.start();
        while (true) {
            if (ft.isDone()) {
                try {
                    System.out.println(ft.get());
                    break;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("not ready");
            }
        }

    }
}
