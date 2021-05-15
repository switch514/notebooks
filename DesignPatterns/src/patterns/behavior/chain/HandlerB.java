package patterns.behavior.chain;

public class HandlerB implements IHandler{
    @Override
    public IHandler getNext() {
        return new HandlerC();
    }

    @Override
    public void handle(String info) {
        System.out.println(info +" Step 2 finished. ");
        getNext().handle(info);
    }
}
