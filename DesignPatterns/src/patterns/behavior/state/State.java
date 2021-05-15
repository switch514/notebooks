package patterns.behavior.state;

public abstract class State {
    public String state;
    public abstract void handle(StateContext context);
}
