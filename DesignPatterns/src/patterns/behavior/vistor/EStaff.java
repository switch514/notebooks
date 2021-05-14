package patterns.behavior.vistor;

public class EStaff implements IElement {
    private String name;

    private String otTime;
    private String bugs;

    public EStaff(String name, String otTime, String bugs){
        this.bugs=bugs;
        this.name=name;
        this.otTime=otTime;

    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitMember(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtTime() {
        return otTime;
    }

    public void setOtTime(String otTime) {
        this.otTime = otTime;
    }

    public String getBugs() {
        return bugs;
    }

    public void setBugs(String bugs) {
        this.bugs = bugs;
    }
}
