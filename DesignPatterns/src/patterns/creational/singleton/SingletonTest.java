package patterns.creational.singleton;

public class SingletonTest {
    public static void main(String args[]){
        EnumSingleton.INSTANCE.use();
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
        System.out.println(Integer.MAX_VALUE);

        Integer a = 0b0111111111111111111111111111111;
        System.out.println(a);
    }
}
