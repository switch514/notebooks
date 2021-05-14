package patterns.behavior.iterator;

public interface IStaffSet {
    void add(Staff s);
    void remove(Staff s);
    IStaffIterator getIterator(String gender);
}
