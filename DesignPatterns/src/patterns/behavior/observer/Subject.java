package patterns.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> obs = new ArrayList<>();

    public void addOb(Observer o){
        obs.add(o);
    }

    public void notifyObs(){
        for (Observer o: obs){
            o.response();
        }
    }
}
