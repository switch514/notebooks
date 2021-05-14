package patterns.behavior.vistor;

public class VisitorCTO implements IVisitor {
    @Override
    public void visitMember(EManager manager) {
        System.out.println("CTO Visit manage " + manager.getName() + "and say good job.");
    }

    @Override
    public void visitMember(EStaff staff) {
        System.out.println("CTO Visit staff " + staff.getName() + ",Bugs is " + staff.getBugs());
    }
}
