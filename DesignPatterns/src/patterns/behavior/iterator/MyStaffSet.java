package patterns.behavior.iterator;

import java.util.*;

public class MyStaffSet implements IStaffSet {
    private Map<String, List<Staff>> staffMap = new HashMap<>();


    @Override
    public void add(Staff s) {
        staffMap.putIfAbsent(s.getGender(),new ArrayList<>());
        staffMap.get(s.getGender()).add(s);
    }

    @Override
    public void remove(Staff s) {
        if(staffMap.containsKey(s.getGender())){
            staffMap.get(s.getGender()).remove(s);
        }
    }

    @Override
    public IStaffIterator getIterator(String gender) {
        return new MyStaffIter(staffMap.get(gender));
    }
}
