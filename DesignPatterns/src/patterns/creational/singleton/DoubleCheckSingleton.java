package patterns.creational.singleton;

public class DoubleCheckSingleton {
    private volatile static DoubleCheckSingleton instance; //防止重排序

    private  DoubleCheckSingleton(){};

    public static DoubleCheckSingleton getInstance(){
        if(null == instance){
            synchronized (DoubleCheckSingleton.class){
                if(null == instance){
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

}
