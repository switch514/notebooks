package patterns.behavior.state;

public class StateContext {
    private State state = new StateNew();

    public State getState(){
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void handle(){
        System.out.println("Start to change state.");
        this.state.handle(this);
    }
}
