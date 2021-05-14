package patterns.behavior.vistor;

public interface IElement {
    public void accept(IVisitor visitor);
}
