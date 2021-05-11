package patterns.structural.composite.safe;

import java.util.ArrayList;
import java.util.List;

public class CompositeSafe implements IComponentSafe {
    private List<IComponentSafe> leafs = new ArrayList<>();
    private String name;
    public CompositeSafe(String name) {
        this.name=name;
    }

    public void add(IComponentSafe com){
        leafs.add(com);
    }

    public void remove(IComponentSafe com){
        leafs.remove(com);
    }

    public IComponentSafe getChild(int i){
        return leafs.get(i);
    }


    @Override
    public void operation() {
        System.out.println("composite visited " + name);
        for(IComponentSafe com:leafs){
            com.operation();
        }
    }
}
