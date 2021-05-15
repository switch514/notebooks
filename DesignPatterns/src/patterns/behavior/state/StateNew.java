package patterns.behavior.state;

public class StateNew extends State{
    public StateNew(){
        this.state = "new";
    }

    @Override
    public void handle(StateContext context) {
        if(context.getState().state.equals(this.state)){
            System.out.println("ready to running.");
            context.setState(new StateRun());
            context.handle();
        }
        else{
            System.out.println("unknown state.");
        }
    }
}
