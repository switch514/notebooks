package patterns.behavior.state;

public class StateEnd extends State{
    public StateEnd(){
        this.state="end";
    }

    @Override
    public void handle(StateContext context) {

            System.out.println("end");

    }
}
