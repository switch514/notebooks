package patterns.behavior.vistor;

public interface IVisitor {
    public void visitMember(EManager manager);
    public void visitMember(EStaff staff);
}
