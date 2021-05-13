package patterns.behavior.command;

public class Invoker {
    public static void main(String [] args){
        CommandA commandA = new CommandA();
        commandA.action();

        CommandB commandB = new CommandB();
        commandB.action();
    }
}
