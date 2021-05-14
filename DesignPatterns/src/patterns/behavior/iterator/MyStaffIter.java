package patterns.behavior.iterator;

import java.util.List;

public class MyStaffIter implements IStaffIterator {
    private List<Staff> staffs;
    private int index;

    public MyStaffIter(List<Staff> staffs) {
        this.staffs = staffs;
        this.index = 0;
    }

    @Override
    public Staff first() {
        return staffs.get(0);
    }

    @Override
    public Staff next() {
        return staffs.get(index++);
    }

    @Override
    public boolean hasNext() {
        return index < staffs.size();
    }
}
