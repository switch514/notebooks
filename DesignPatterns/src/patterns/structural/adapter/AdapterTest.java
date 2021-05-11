package patterns.structural.adapter;

public class AdapterTest {
    public static void main(String [] args){
        ITargetInterface target = new ClassAdapter();
        target.requestTarget();

        ITargetInterface target2 = new ObjectAdapter();
        target2.requestTarget();

        System.out.println("multi direction.");
        MultiDirectionAdapter multiAdapter = new MultiDirectionAdapter();
        multiAdapter.requestOriginal();
        multiAdapter.requestTarget();
    }
}
