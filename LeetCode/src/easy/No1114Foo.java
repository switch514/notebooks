package easy;

public class No1114Foo {
    private volatile Integer step = 0;

    public No1114Foo() {
    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        step++;
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        while(step != 1);
        printSecond.run();
        step++;
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        while(step !=2);
        printThird.run();
        step = 0;
    }
}
