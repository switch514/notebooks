package patterns.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String [] args){
        StaticProxy proxy = new StaticProxy(new RealSubject());
        proxy.preOperation();
        proxy.operation();

        //dynamic
        RealSubject subject = new RealSubject();
        // 方法1 适用定义好的动态代理类
        DynamicProxy dynamicProxy = new DynamicProxy(subject);
        ISubject sj = (ISubject) Proxy.newProxyInstance(subject.getClass().getClassLoader(), new Class[]{ISubject.class}, dynamicProxy);
        sj.operation();

        // 方法2 匿名内部类，减少类的数量
        ISubject sj2 = (ISubject) Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //add action
                System.out.println("add by dynamic proxy");
                return method.invoke(subject, args);
            }
        });
        sj2.operation();
        sj2.operation2();

    }
}
