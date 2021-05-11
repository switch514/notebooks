package patterns.structural.composite.clear;

public interface IComponentClear {
     public void add(IComponentClear com);
     public void remove(IComponentClear com);
     public IComponentClear getChild(int i);
     void operation();
}
