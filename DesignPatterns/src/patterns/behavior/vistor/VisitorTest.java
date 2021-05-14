package patterns.behavior.vistor;

public class VisitorTest {
    public static void main(String[] args) {
        ObjectStruct company = new ObjectStruct();
        company.addMember(new EManager("Chris.Wu","10","100M"));
        company.addMember(new EManager("Chris.J","12","20M"));
        company.addMember(new EStaff("Lao Li","10","32"));
        company.addMember(new EStaff("Lao Wang","35","80"));

        IVisitor ceo = new VisitorCEO();
        IVisitor cto = new VisitorCTO();

        company.accept(ceo);
        company.accept(cto);
    }
}
