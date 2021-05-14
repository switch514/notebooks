package patterns.behavior.vistor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStruct {
    private List<IElement> memberList = new ArrayList<>();
    public void addMember(IElement element){
        memberList.add(element);
    }

    public void accept(IVisitor visitor){
        for (IElement element: memberList){
            element.accept(visitor);
        }
    }
}
