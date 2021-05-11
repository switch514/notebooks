package patterns.structural.adapter;

public class Adaptee implements IOriginalInterface {
    public void requestOriginal(){
        System.out.println("call original request");
    }
}
