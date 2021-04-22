package patterns.creational.singleton;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton(){

    }

    /**
     * 线程不安全
     * @return
     */
    public static LazySingleton getInstance(){
        if (null == instance){
            instance = new LazySingleton();
        }
        return instance;
    }

}
