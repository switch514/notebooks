package patterns.behavior.command;

public class CommandB implements ICommand {
    private ReceiverB receiverB = new ReceiverB();

    @Override
    public void action() {
        receiverB.action();
    }
}
