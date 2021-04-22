package patterns.creational.singleton;

public enum EnumSingleton {
    //默认枚举实例的创建是线程安全的，并且在任何情况下都是单例。实际上
    //    枚举类隐藏了私有的构造器。
    //    枚举类的域 是相应类型的一个实例对象
    INSTANCE;

    public void use(){
        System.out.println("use Enum");
    }
}
