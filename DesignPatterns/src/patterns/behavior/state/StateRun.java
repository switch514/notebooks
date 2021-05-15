package patterns.behavior.state;

public class StateRun extends State{
    public StateRun(){
        this.state = "run";
    }

    @Override
    public void handle(StateContext context) {
        if(context.getState().state.equals(this.state)){
            System.out.println("running...");
            context.setState(new StateEnd());
            context.handle();
        }
        else{
            System.out.println("unknown state.");
        }
    }
}
