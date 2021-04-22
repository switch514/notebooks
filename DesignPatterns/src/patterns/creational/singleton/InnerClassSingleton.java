package patterns.creational.singleton;

public class InnerClassSingleton {
    private InnerClassSingleton(){};

    /**
     * 只有第一次调用getInstance方法时，虚拟机才加载 Inner 并初始化instance ，只有一个线程可以获得对象的初始化锁，其他线程无法进行初始化，保证对象的唯一性
     * @return
     */
    public static InnerClassSingleton getInstance(){
        return Inner.instance;
    }

    private static class Inner{
        private static final InnerClassSingleton instance = new InnerClassSingleton();
    }
}
