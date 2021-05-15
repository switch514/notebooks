package patterns.behavior.chain;

public class HandlerA implements IHandler{
    @Override
    public IHandler getNext() {
        return new HandlerB();
    }

    @Override
    public void handle(String info) {
        System.out.println(info +" Step 1 finished. ");
        getNext().handle(info);
    }
}
