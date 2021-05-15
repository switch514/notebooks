package patterns.behavior.chain;

public interface IHandler {
    IHandler getNext();

    void handle(String info);
}
