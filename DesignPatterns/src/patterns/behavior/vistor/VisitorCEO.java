package patterns.behavior.vistor;

public class VisitorCEO implements IVisitor{
    @Override
    public void visitMember(EManager manager) {
        System.out.println("CEO Visit manage "+ manager.getName()+ ",Profit is "+manager.getProfit());
    }

    @Override
    public void visitMember(EStaff staff) {
        System.out.println("CEO Visit staff " +staff.getName()+",OT Time is " + staff.getOtTime());
    }
}
