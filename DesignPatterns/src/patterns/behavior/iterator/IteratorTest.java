package patterns.behavior.iterator;

public class IteratorTest {
    public static void main(String[] args) {
        MyStaffSet staffSet = new MyStaffSet();
        staffSet.add(new Staff("A","male"));
        staffSet.add(new Staff("B","male"));
        staffSet.add(new Staff("C","female"));
        staffSet.add(new Staff("D","female"));
        staffSet.add(new Staff("E","female"));

        IStaffIterator iterator = staffSet.getIterator("male");
        while (iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }

        iterator = staffSet.getIterator("female");
        while (iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }
    }
}
