package patterns.behavior.momento;

public class MementoTest {
    public static void main(String [] args) {
        Originator originator = new Originator();
        originator.setState("ON");
        System.out.println(originator.getState());
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        originator.setState("OFF");
        System.out.println(originator.getState());
        originator.restore(caretaker.getMemento());
        System.out.println(originator.getState());

    }

}
