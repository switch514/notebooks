package patterns.behavior.momento;

public class Originator {
    private String state;
    private String uselessInfo;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        Memento memento = new Memento();
        memento.setState(this.state);
        return memento;
    }

    public void restore(Memento memento){
        setState(memento.getState());
    }
}
