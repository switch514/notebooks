package patterns.behavior.command;

public class CommandA implements ICommand {
    private ReceiverA receiverA = new ReceiverA();

    @Override
    public void action() {
        receiverA.action();
    }
}
