package patterns.behavior.chain;

public class HandlerC implements IHandler{
    @Override
    public IHandler getNext() {
        return null;
    }

    @Override
    public void handle(String info) {
        System.out.println(info +" Step 3 finished. ");
    }
}
