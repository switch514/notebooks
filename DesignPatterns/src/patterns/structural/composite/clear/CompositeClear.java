package patterns.structural.composite.clear;

import java.util.ArrayList;
import java.util.List;

public class CompositeClear implements IComponentClear {
    private String name;
    private List<IComponentClear> leafs = new ArrayList();

    public CompositeClear(String name) {
        this.name=name;
    }

    @Override
    public void add(IComponentClear com) {
        leafs.add(com);
    }

    @Override
    public void remove(IComponentClear com) {
        leafs.remove(com);
    }

    @Override
    public IComponentClear getChild(int i) {
        return leafs.get(i);
    }

    @Override
    public void operation() {
        System.out.println("Composite visited " + name);
        for(IComponentClear com:leafs){
            com.operation();
        }
    }
}
